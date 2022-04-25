package pm.pm_rsrhmngtmgr.intnmngtmgt.dao;

import dao.JdbcQueryDAO;
import dao.query.SqlQuery;
import dao.query.SqlQueryPage;
import exception.UserException;
import vo.ValueObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntnMngtMgtDAOImpl extends JdbcQueryDAO implements IntnMngtMgtDAO {
	
	private SqlQueryPage sqlPage;
	
	public void setSql(String path) {
	    this.sqlPage = getQueryPage(path);
    }
	
	public ValueObject getPatientInfo(ValueObject pVO) throws UserException { //ȯ����ȸ
		SqlQuery query = sqlPage.getQuery("getPatientInfo");
	    return executeQuery(query, pVO);	
	}
	
    public int insPatientInfo(ValueObject pVO) throws UserException { //ȯ���߰�
	        SqlQuery query = sqlPage.getQuery("insPatientInfo");
	        return executeUpdate(query, pVO);
    }
	
    public int setPatientInfo(ValueObject pVO) throws UserException { //ȯ�ڼ���
        SqlQuery query = sqlPage.getQuery("setPatientInfo");
        return executeUpdate(query, pVO);
    }

    public int delPatientInfo(ValueObject pVO) throws UserException { //ȯ�ڻ���
        SqlQuery query = sqlPage.getQuery("delPatientInfo");
        return executeUpdate(query, pVO);
    }
	
    public ValueObject getReservInfo(ValueObject pVO) throws UserException { //������ȸ
        SqlQuery query = sqlPage.getQuery("getReservInfo");
        return executeQuery(query, pVO);    
    }
    
    public ValueObject getDrInfo(ValueObject pVO) throws UserException { //�ǻ��޺���ȸ
        SqlQuery query = sqlPage.getQuery("getDrInfo");
        return executeQuery(query, pVO);    
    }

    public ValueObject getDeptInfo(ValueObject pVO) throws UserException { //�ǻ��޺���ȸ
        SqlQuery query = sqlPage.getQuery("getDeptInfo");
        return executeQuery(query, pVO);    
    }

    public int insReservInfo(ValueObject pVO) throws UserException { //�����߰�
        SqlQuery query = sqlPage.getQuery("insReservInfo");
        return executeUpdate(query, pVO);
    }
    
    public int insReservInsInfo(ValueObject pVO) throws UserException { //���ຸ�������߰�
        SqlQuery query = sqlPage.getQuery("insReservInsInfo");
        return executeUpdate(query, pVO);
    }
    
    public int insScriptInfo(ValueObject pVO) throws UserException { //�ܷ������ȸ
        SqlQuery query = sqlPage.getQuery("insScriptInfo");
        return executeUpdate(query, pVO);
    }
    
    public int insPaymentInfo(ValueObject pVO) throws UserException { //�����߰�
        SqlQuery query = sqlPage.getQuery("insPaymentInfo");
        return executeUpdate(query, pVO);
    }

    public int setReservInfo(ValueObject pVO) throws UserException { //�������
        SqlQuery query = sqlPage.getQuery("setReservInfo");
        return executeUpdate(query, pVO);
    }
    
    public int setReservInsInfo(ValueObject pVO) throws UserException { //���ຸ����������
        SqlQuery query = sqlPage.getQuery("setReservInsInfo");
        return executeUpdate(query, pVO);
    }
    
    public int delReservInfo(ValueObject pVO) throws UserException { //�������
        SqlQuery query = sqlPage.getQuery("delReservInfo");
        return executeUpdate(query, pVO);
    }

    public int delReservInsInfo(ValueObject pVO) throws UserException { //���ຸ����������
        SqlQuery query = sqlPage.getQuery("delReservInsInfo");
        return executeUpdate(query, pVO);
    }
    
    public int delScriptInfo(ValueObject pVO) throws UserException { //�ܷ���ϻ���
        SqlQuery query = sqlPage.getQuery("delScriptInfo");
        return executeUpdate(query, pVO);
    }
    
    public int delPaymentInfo(ValueObject pVO) throws UserException { //��������
        SqlQuery query = sqlPage.getQuery("delPaymentInfo");
        return executeUpdate(query, pVO);
    }
////////////////////////////////////////////////////////////////////////////////////////
    public ValueObject getNurseInfo(ValueObject pVO) throws UserException { //��ȣ��ȸ
        SqlQuery query = sqlPage.getQuery("getNurseInfo");
        return executeQuery(query, pVO);    
    }
    
    public int setNurseInfo(ValueObject pVO) throws UserException { //��ȣ����
        SqlQuery query = sqlPage.getQuery("setNurseInfo");
        return executeUpdate(query, pVO);
    }
////////////////////////////////////////////////////////////////////////////////////////    
    public ValueObject getExamInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("getExamInfo");
        return executeQuery(query, pVO);    
    }
    
    public ValueObject getExamPerpatInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("getExamPerpatInfo");
        return executeQuery(query, pVO);    
    }
////////////////////////////////////////////////////////////////////////////////////////
    public ValueObject getSpecPerexamInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("getSpecPerexamInfo");
        return executeQuery(query, pVO);    
    }
    
    public ValueObject getDiagSearchInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("getDiagSearchInfo");
        return executeQuery(query, pVO);    
    }
    
    public ValueObject getDiagInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("getDiagInfo");
        return executeQuery(query, pVO);    
    }
    
    public ValueObject getPresSearchInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("getPresSearchInfo");
        return executeQuery(query, pVO);    
    }
    
    public ValueObject getPresInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("getPresInfo");
        return executeQuery(query, pVO);    
    }
    
    public ValueObject getScriptInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("getScriptInfo");
        return executeQuery(query, pVO);    
    }
    
    public int insDiagInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("insDiagInfo");
        return executeUpdate(query, pVO);
    }
    
    public int insPresInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("insPresInfo");
        return executeUpdate(query, pVO);
    }
    
    public int setScriptInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("setScriptInfo");
        return executeUpdate(query, pVO);
    }
    
    public int delDiagInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("delDiagInfo");        
        return executeUpdate(query, pVO);
    }
    
    public int delPresInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("delPresInfo");
        return executeUpdate(query, pVO);
    }
    
    public int setPresComInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("setPresComInfo");
        return executeUpdate(query, pVO);
    }
////////////////////////////////////////////////////////////////////////////////
    public ValueObject getPaymentInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("getPaymentInfo");
        return executeQuery(query, pVO);    
    }
    
    public int setPaymentInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("setPaymentInfo");
        return executeUpdate(query, pVO);
    }
    
    public int setPaymentComInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("setPaymentComInfo");
        return executeUpdate(query, pVO);
    }
    
    public ValueObject getReceiptInfo(ValueObject pVO) throws UserException {
        SqlQuery query = sqlPage.getQuery("getReceiptInfo");
        return executeQuery(query, pVO);    
    }
}
