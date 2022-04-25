package pm.pm_rsrhmngtmgr.intnmngtmgt;

import common.Role;
import pm.pm_rsrhmngtmgr.intnmngtmgt.dao.IntnMngtMgtDAO;

import context.ContextAwareService;
import exception.UserException;
import util.DateHelper;
import util.StringHelper;
import vo.ValueObject;
import vo.ValueObjectAssembler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class IntnMngtMgtImpl extends ContextAwareService implements IntnMngtMgt {
	
    
	protected IntnMngtMgtDAO IntnDAO;	
	
	public void setDao(IntnMngtMgtDAO dao){
		this.IntnDAO = dao;
	}

	public ValueObject getPatientInfo(ValueObject pVO){ //ȯ����ȸ
		ValueObject getVO = IntnDAO.getPatientInfo(pVO);
        for(int i = 0; i < getVO.size(); i++){
            
            String patssn = getVO.getString(i, "pat_ssn"); //�ֹι�ȣ ���ڿ���ȯ
            int division = Integer.parseInt(patssn.substring(6,7)); //�ֹι�ȣ ���ڸ� ù��° ���ڷ� �ޱ�
            
            String patage = "";
            String now = DateHelper.getCurrentDateAsString(); //�������� ���ڿ��� �ޱ�
            String yy = patssn.substring(0, 2); //�ֹι�ȣ ��2�ڸ� ���ڿ��� �ޱ�
            if(division == 1 || division == 2 || division == 5 || division == 6){ //�ֹι�ȣ ���ڸ� 1,2,5,6 (2000�� ������)
                int birthyear = 1900 + Integer.parseInt(yy); //1900 + ���� ��ȯ�� �ֹι�ȣ �� 2�ڸ�
                int nowyear = Integer.parseInt(now.substring(0, 4)); //�������� �� 4�ڸ� �޾Ƽ� ���ڷ� ��ȯ
                int calresult = nowyear - birthyear; //�������� - �������
                patage = String.valueOf(calresult); //���̸� ���ڿ��� ��ȯ
                getVO.set(i, "pat_age", patage); //pat_age�� ���� set
                
            }else if(division == 3 || division == 4 || division == 7 || division == 8){ //�ֹι�ȣ ���ڸ� 3,4,7,8 (2000��� �������)
                int birthyear = 2000 + Integer.parseInt(yy); //2000 + ���� ��ȯ�� �ֹι�ȣ �� 2�ڸ�
                int nowyear = Integer.parseInt(now.substring(0, 4)); //�������� �� 4�ڸ� �޾Ƽ� ���ڷ� ��ȯ
                int calresult = nowyear - birthyear; //�������� - �������
                if(calresult >= 0){
                        
                        
                    patage = String.valueOf(calresult); //���̸� ���ڿ��� ��ȯ
                    getVO.set(i, "pat_age", patage); //pat_age�� ���� set
                }else{//���̰� ������ �ȴ�.
                    patage = String.valueOf(calresult); //���̸� ���ڿ��� ��ȯ
                    getVO.set(i, "pat_age", '?'); // ���� ?�� ǥ��
                }
                
            }else{// 1800������ �������� ����.����Ȯ�κҰ�
                getVO.set(i, "pat_age", '?'); // ���� ?�� ǥ��
            }
                /* �̻� ���� ���� */
            
            
            if(division == 1 || division == 3 || division == 5 || division == 7){ //�ֹι�ȣ ���ڸ����� 1,3,5,7�� ����(M)
                getVO.set(i, "pat_sex",'M');
            }
            else if(division == 2 || division == 4 || division == 6 || division == 8){ //�ֹι�ȣ ���ڸ����� 2,4,6,8�� ����(F)
                getVO.set(i, "pat_sex",'F');
            }
            else{ //���� Ȯ�κҰ�
                getVO.set(i, "pat_sex",'?');
            }
            /* �̻� ���� ���� */
//            
            if(division == 5 || division == 6 || division == 7 || division == 8){ //�ֹι�ȣ ���ڸ����� 5,6,7,8�� �ܱ���(Y)
                getVO.set(i, "pat_foreign_yn",'Y');
            }
            else{
                getVO.set(i, "pat_foreign_yn",'N');
            }
//            /* �̻� �ܱ������� ���� */
        }
		return getVO;
	}
	
    public void insPatientInfo(ValueObject pVO){ //ȯ���߰�
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.insPatientInfo(rowVO);
        }
    }
    
    public void setPatientInfo(ValueObject pVO){ //ȯ�ڼ���
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);  
            IntnDAO.setPatientInfo(rowVO);
        }
    }
    
    public void delPatientInfo(ValueObject pVO){ //ȯ�ڻ���
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);  
            IntnDAO.delPatientInfo(rowVO);
        }
    }
    
    //�̻� ȯ�ڸ�����
    
    
    public ValueObject getReservInfo(ValueObject pVO){ //������ȸ
        ValueObject getVO = IntnDAO.getReservInfo(pVO);
        return getVO;
    }
    
    public ValueObject getDrInfo(ValueObject pVO){ //�ǻ��޺���ȸ
        ValueObject getVO = IntnDAO.getDrInfo(pVO);
        return getVO;
    }

    public ValueObject getDeptInfo(ValueObject pVO){ //�ǻ��޺���ȸ
        ValueObject getVO = IntnDAO.getDeptInfo(pVO);
        return getVO;
    }
    
    public void insReservInfo(ValueObject pVO){ //�����߰�
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.insReservInfo(rowVO);
        }
    }
    
    public void insReservInsInfo(ValueObject pVO){ //���ຸ�������߰�
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.insReservInsInfo(rowVO);
        }
    }

    public void insScriptInfo(ValueObject pVO){ //�ܷ�����߰�
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.insScriptInfo(rowVO);
        }
    }
    
    public void insPaymentInfo(ValueObject pVO){ //�����߰�
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.insPaymentInfo(rowVO);
        }
    }

    
    public void setReservInfo(ValueObject pVO){ //�������
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.setReservInfo(rowVO);
        }
    }
    
    public void setReservInsInfo(ValueObject pVO){ //���ຸ����������
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.setReservInsInfo(rowVO);
        }
    }

    public void delReservInfo(ValueObject pVO){ //�������
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.delReservInfo(rowVO);
        }
    }
    
    public void delReservInsInfo(ValueObject pVO){ //���ຸ����������
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.delReservInsInfo(rowVO);
        }
    }

    public void delScriptInfo(ValueObject pVO){ //�ܷ���ϻ���
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.delScriptInfo(rowVO);
        }
    }
    
    public void delPaymentInfo(ValueObject pVO){ //��������
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.delPaymentInfo(rowVO);
        }
    }
    
    //�̻� �ܷ����
    
    public ValueObject getNurseInfo(ValueObject pVO){ //��ȣ��ȸ
        ValueObject getVO = IntnDAO.getNurseInfo(pVO);
        return getVO;
    }
    
    public void setNurseInfo(ValueObject pVO){ //��ȣ����
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.setNurseInfo(rowVO);
        }
    }
    
    //�̻� ��ȣ����
    
    public ValueObject getExamInfo(ValueObject pVO){
        ValueObject getVO = IntnDAO.getExamInfo(pVO);
        return getVO;
    }
    
    public ValueObject getExamPerpatInfo(ValueObject pVO){
        ValueObject getVO = IntnDAO.getExamPerpatInfo(pVO);
        return getVO;
    }

    public ValueObject getSpecPerexamInfo(ValueObject pVO){
        ValueObject getVO = IntnDAO.getSpecPerexamInfo(pVO);
        return getVO;
    }
    
    //�̻� �ܷ�����    
    
    public ValueObject getDiagSearchInfo(ValueObject pVO){
        ValueObject getVO = IntnDAO.getDiagSearchInfo(pVO);
        return getVO;
    }
    
    public ValueObject getDiagInfo(ValueObject pVO){
        ValueObject getVO = IntnDAO.getDiagInfo(pVO);
        return getVO;
    }
    
    public void insDiagInfo(ValueObject pVO){
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.insDiagInfo(rowVO);
        }
    }
    
    public void insPresInfo(ValueObject pVO){
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.insPresInfo(rowVO);
        }
    }
    
    public ValueObject getPresSearchInfo(ValueObject pVO){
        ValueObject getVO = IntnDAO.getPresSearchInfo(pVO);
        return getVO;
    }
    
    public ValueObject getPresInfo(ValueObject pVO){
        ValueObject getVO = IntnDAO.getPresInfo(pVO);
        return getVO;
    }
    
    public ValueObject getScriptInfo(ValueObject pVO){
        ValueObject getVO = IntnDAO.getScriptInfo(pVO);
        return getVO;
    }
    
    public void setScriptInfo(ValueObject pVO){
            ValueObject rowVO = pVO.getRowAsVo(0);
                IntnDAO.setScriptInfo(rowVO);
    }
    
    public void setPresComInfo(ValueObject pVO){
        ValueObject rowVO = pVO.getRowAsVo(0);
            IntnDAO.setPresComInfo(rowVO);
}
    
    //�̻� ����ó��ܷ����
    
    public ValueObject getPaymentInfo(ValueObject pVO){ //������ȸ
        ValueObject getVO = IntnDAO.getPaymentInfo(pVO);
        return getVO;
    }
    
    public void setPaymentInfo(ValueObject pVO){ //����
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.setPaymentInfo(rowVO);
        
            String paymthdid = rowVO.getString(i, "pay_mthd_id");
            if(paymthdid == "0" || paymthdid == "2" || paymthdid == "3"){
                rowVO.set(i, "cash_mthd_id", "2");
            }
        }
    }
    
    public void setPaymentComInfo(ValueObject pVO){ //�����Ϸ����
        for(int i = 0; i < pVO.size(); i++){
            ValueObject rowVO = pVO.getRowAsVo(i);
            IntnDAO.setPaymentComInfo(rowVO);
        }
    }
    
    public ValueObject getReceiptInfo(ValueObject pVO){ //�������ȸ
        ValueObject getVO = IntnDAO.getReceiptInfo(pVO);
        return getVO;
    }
  //�̻� ������
}
