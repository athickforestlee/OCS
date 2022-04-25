package pm.pm_rsrhmngtapp.intnmngt;

import exception.UserException;
import vo.ValueObjectAssembler;

public interface IntnMngt {
	
	ValueObjectAssembler reqGetPatientList(ValueObjectAssembler pVOs) throws UserException; //ȯ����ȸ
	
	ValueObjectAssembler reqInsPatientList(ValueObjectAssembler pVOs) throws UserException; //ȯ���߰�
	
	ValueObjectAssembler reqSetPatientList(ValueObjectAssembler pVOs) throws UserException; //ȯ�ڼ���
	
	ValueObjectAssembler reqDelPatientList(ValueObjectAssembler pVOs) throws UserException; //ȯ�ڻ���
	
	ValueObjectAssembler reqGetReservList(ValueObjectAssembler pVOs) throws UserException; //������ȸ
	
	ValueObjectAssembler reqGetDrList(ValueObjectAssembler pVOs) throws UserException; //�ǻ��޺���ȸ
	
	ValueObjectAssembler reqGetDeptList(ValueObjectAssembler pVOs) throws UserException; //������޺���ȸ

	ValueObjectAssembler reqInsReservList(ValueObjectAssembler pVOs) throws UserException; //�����߰�, ���ຸ�������߰�, �ܷ�����߰�, �����߰�
	
	ValueObjectAssembler reqSetReservList(ValueObjectAssembler pVOs) throws UserException; //�������, ���ຸ����������
	
    ValueObjectAssembler reqDelReservList(ValueObjectAssembler pVOs) throws UserException;//�������, ���ຸ����������, �ܷ���ϻ���, ��������
	
	ValueObjectAssembler reqGetNurseList(ValueObjectAssembler pVOs) throws UserException; //��ȣ��ȸ
	
    ValueObjectAssembler reqSetNurseList(ValueObjectAssembler pVOs) throws UserException; //��ȣ����
	
	ValueObjectAssembler reqGetExamList(ValueObjectAssembler pVOs) throws UserException;
	
	ValueObjectAssembler reqGetExamPerpatList(ValueObjectAssembler pVOs) throws UserException;

	ValueObjectAssembler reqGetSpecPerexamList(ValueObjectAssembler pVOs) throws UserException;
	
	ValueObjectAssembler reqGetDiagSearchList(ValueObjectAssembler pVOs) throws UserException;
	
	ValueObjectAssembler reqGetDiagList(ValueObjectAssembler pVOs) throws UserException;
	
    ValueObjectAssembler reqInsDiagList(ValueObjectAssembler pVOs) throws UserException;
	
	ValueObjectAssembler reqGetPresSearchList(ValueObjectAssembler pVOs) throws UserException;
	
	ValueObjectAssembler reqGetPresList(ValueObjectAssembler pVOs) throws UserException;
	
    ValueObjectAssembler reqInsPresList(ValueObjectAssembler pVOs) throws UserException;
	
	ValueObjectAssembler reqGetScriptList(ValueObjectAssembler pVOs) throws UserException;
	
	ValueObjectAssembler reqSetScriptList(ValueObjectAssembler pVOs) throws UserException;
	
	ValueObjectAssembler reqSetPresComList(ValueObjectAssembler pVOs) throws UserException;
	
	ValueObjectAssembler reqGetPaymentList(ValueObjectAssembler pVOs) throws UserException;
	
	ValueObjectAssembler reqSetPaymentList(ValueObjectAssembler pVOs) throws UserException;
	
	ValueObjectAssembler reqGetReceiptList(ValueObjectAssembler pVOs) throws UserException;
}
