package pm.pm_rsrhmngtmgr.intnmngtmgt.dao;

import exception.UserException;
import vo.ValueObject;

public interface IntnMngtMgtDAO {

	public ValueObject getPatientInfo(ValueObject pVO) throws UserException; //ȯ����ȸ
 
	int insPatientInfo(ValueObject pVO) throws UserException; //ȯ���߰�

	int setPatientInfo(ValueObject pVO) throws UserException; //ȯ�ڼ���
	
	int delPatientInfo(ValueObject pVO) throws UserException; //ȯ�ڻ���
	//�̻� ȯ�ڸ�����
	
	public ValueObject getReservInfo(ValueObject pVO) throws UserException; //������ȸ
	
	public ValueObject getDrInfo(ValueObject pVO) throws UserException; //�������޺���ȸ
	
	public ValueObject getDeptInfo(ValueObject pVO) throws UserException; //������޺���ȸ
	
	int insReservInfo(ValueObject pVO) throws UserException; //�����߰�

	int insReservInsInfo(ValueObject pVO) throws UserException; //���ຸ�������߰�
	
	int insScriptInfo(ValueObject pVO) throws UserException; //�ܷ�����߰�
	
	int insPaymentInfo(ValueObject pVO) throws UserException; //�����߰�
	
    int setReservInfo(ValueObject pVO) throws UserException; //�������
    
    int setReservInsInfo(ValueObject pVO) throws UserException; //���ຸ����������
    
    int delReservInfo(ValueObject pVO) throws UserException; //�������
    
    int delReservInsInfo(ValueObject pVO) throws UserException; //���ຸ����������
    
    int delScriptInfo(ValueObject pVO) throws UserException; //�ܷ���ϻ���
    
    int delPaymentInfo(ValueObject pVO) throws UserException; //��������
    
    //�̻� �ܷ����
    
    public ValueObject getNurseInfo(ValueObject pVO) throws UserException; //��ȣ��ȸ
    
    int setNurseInfo(ValueObject pVO) throws UserException; //��ȣ����
    
    //�̻� ��ȣȭ��
    
    public ValueObject getExamInfo(ValueObject pVO) throws UserException;
    
    public ValueObject getExamPerpatInfo(ValueObject pVO) throws UserException;
    
    //�̻� ������ȭ��
    
    public ValueObject getSpecPerexamInfo(ValueObject pVO) throws UserException;
    
    public ValueObject getDiagSearchInfo(ValueObject pVO) throws UserException;
    
    public ValueObject getDiagInfo(ValueObject pVO) throws UserException;

    public ValueObject getPresSearchInfo(ValueObject pVO) throws UserException;
    
    public ValueObject getPresInfo(ValueObject pVO) throws UserException;
    
    public ValueObject getScriptInfo(ValueObject pVO) throws UserException;
    
    int insDiagInfo(ValueObject pVO) throws UserException;

    int insPresInfo(ValueObject pVO) throws UserException;
    
    int setScriptInfo(ValueObject pVO) throws UserException;
    
    int delDiagInfo(ValueObject pVO) throws UserException;
    
    int delPresInfo(ValueObject pVO) throws UserException;
    
    int setPresComInfo(ValueObject pVO) throws UserException;
    
    //�̻� �ܷ����ȭ��
    
    public ValueObject getPaymentInfo(ValueObject pVO) throws UserException;
    
    int setPaymentInfo(ValueObject pVO) throws UserException;
    
    int setPaymentComInfo(ValueObject pVO) throws UserException;
    
    //�̻� ����ȭ��
    
    public ValueObject getReceiptInfo(ValueObject pVO) throws UserException;
    
    //�̻� ������ȭ��
}
