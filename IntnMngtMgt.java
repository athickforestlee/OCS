package pm.pm_rsrhmngtmgr.intnmngtmgt;

import exception.UserException;
import vo.ValueObject;
import vo.ValueObjectAssembler;

public interface IntnMngtMgt {

    ValueObject getPatientInfo(ValueObject pVO) throws UserException; //ȯ����ȸ
    
    void insPatientInfo(ValueObject pVO) throws UserException; //ȯ���߰�
    
    void setPatientInfo(ValueObject pVO) throws UserException; //ȯ�ڼ���
    
    void delPatientInfo(ValueObject pVO) throws UserException; //ȯ�ڻ���
    
    ValueObject getReservInfo(ValueObject pVO) throws UserException; //������ȸ

    ValueObject getDrInfo(ValueObject pVO) throws UserException; //�ǻ��޺���ȸ
    
    ValueObject getDeptInfo(ValueObject pVO) throws UserException; //�ǻ��޺���ȸ
    
    void insReservInfo(ValueObject pVO) throws UserException; //�����߰�
    
    void insReservInsInfo(ValueObject pVO) throws UserException; //���ຸ�������߰�
    
    void insScriptInfo(ValueObject pVO) throws UserException; //�ܷ�����߰�
    
    void insPaymentInfo(ValueObject pVO) throws UserException; //�����߰�
    
    void setReservInfo(ValueObject pVO) throws UserException; //�������
    
    void setReservInsInfo(ValueObject pVO) throws UserException; //���ຸ����������
    
    void delReservInfo(ValueObject pVO) throws UserException; //�������
    
    void delReservInsInfo(ValueObject pVO) throws UserException; //���ຸ����������
    
    void delScriptInfo(ValueObject pVO) throws UserException; //�ܷ���ϻ���
    
    void delPaymentInfo(ValueObject pVO) throws UserException; //��������
    
    ValueObject getNurseInfo(ValueObject pVO) throws UserException; //��ȣ��ȸ
    
    void setNurseInfo(ValueObject pVO) throws UserException; //��ȣ����
    
    ValueObject getExamInfo(ValueObject pVO) throws UserException;
    
    ValueObject getExamPerpatInfo(ValueObject pVO) throws UserException;
    
    ValueObject getSpecPerexamInfo(ValueObject pVO) throws UserException;
    
    ValueObject getDiagSearchInfo(ValueObject pVO) throws UserException;
    
    ValueObject getDiagInfo(ValueObject pVO) throws UserException;
    
    void insDiagInfo(ValueObject pVO) throws UserException;
    
    void insPresInfo(ValueObject pVO) throws UserException;
    
    ValueObject getPresSearchInfo(ValueObject pVO) throws UserException;
    
    ValueObject getPresInfo(ValueObject pVO) throws UserException;
    
    ValueObject getScriptInfo(ValueObject pVO) throws UserException;
    
    void setScriptInfo(ValueObject pVO) throws UserException;
    
    void setPresComInfo(ValueObject pVO) throws UserException;
    
    ValueObject getPaymentInfo(ValueObject pVO) throws UserException;
    
    void setPaymentInfo(ValueObject pVO) throws UserException;
    
    void setPaymentComInfo(ValueObject pVO) throws UserException;
    
    ValueObject getReceiptInfo(ValueObject pVO) throws UserException;
}
