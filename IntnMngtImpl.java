package pm.pm_rsrhmngtapp.intnmngt;

import pm.pm_rsrhmngtmgr.intnmngtmgt.IntnMngtMgt;

import context.ContextAwareService;
import exception.UserException;
import resources.Messages;
import vo.ValueObject;
import vo.ValueObjectAssembler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntnMngtImpl extends ContextAwareService implements IntnMngt {
	
    
	protected IntnMngtMgt intnMngtMgt;
		
	public void setIntnMngtMgt(IntnMngtMgt mgt) {		
		this.intnMngtMgt = mgt;
	}
	
	public ValueObjectAssembler reqGetPatientList(ValueObjectAssembler pVOs) throws UserException{ 
	    ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
	    ValueObject pVO=pVOs.get("req"); 
	    
        try {
            ValueObject getVO = intnMngtMgt.getPatientInfo(pVO); //ȯ����ȸ
            retVOs.set("ret", getVO);
            
//            ValueObject getVO2 = intnMngtMgt.getPatientInfo2(pVO);
//            retVOs.set("patient2", getVO2);
           }catch (UserException ex) {
           	setRollbackOnly();
           	throw (UserException) ex;
           } catch (Exception ex) {
           	setRollbackOnly();
           	throw new UserException("nu.error.90000", ex);
           }                  
            
        return retVOs;
	}
	
	public ValueObjectAssembler reqInsPatientList(ValueObjectAssembler pVOs) throws UserException{
        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
        ValueObject pVO=pVOs.get("req"); 
        
        try {

            intnMngtMgt.insPatientInfo(pVO); //ȯ���߰�
            
        } catch (UserException ex) {
            setRollbackOnly();
            throw (UserException) ex;
           } catch (Exception ex) {
            setRollbackOnly();
            throw new UserException("nu.error.90000", ex);
           }                  
            
        return retVOs;
    }
	
	public ValueObjectAssembler reqSetPatientList(ValueObjectAssembler pVOs) throws UserException{
        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
        ValueObject pVO=pVOs.get("req"); 
        
        try {

            intnMngtMgt.setPatientInfo(pVO); //ȯ�ڼ���
            
        } catch (UserException ex) {
            setRollbackOnly();
            throw (UserException) ex;
           } catch (Exception ex) {
            setRollbackOnly();
            throw new UserException("nu.error.90000", ex);
           }                  
            
        return retVOs;
    }
	
	public ValueObjectAssembler reqDelPatientList(ValueObjectAssembler pVOs) throws UserException{
        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
        ValueObject pVO=pVOs.get("req"); 
        
        try {

            intnMngtMgt.delPatientInfo(pVO); //ȯ�ڻ���
            
        } catch (UserException ex) {
            setRollbackOnly();
            throw (UserException) ex;
           } catch (Exception ex) {
            setRollbackOnly();
            throw new UserException("nu.error.90000", ex);
           }                  
            
        return retVOs;
    }
	
	//�̻� ȯ�ڸ�����
	
	public ValueObjectAssembler reqGetReservList(ValueObjectAssembler pVOs) throws UserException{
        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
        ValueObject pVO=pVOs.get("req"); 
        
        try {
            ValueObject getVO = intnMngtMgt.getReservInfo(pVO); //������ȸ
            retVOs.set("ret", getVO);
            
           }catch (UserException ex) {
            setRollbackOnly();
            throw (UserException) ex;
           } catch (Exception ex) {
            setRollbackOnly();
            throw new UserException("nu.error.90000", ex);
           }
           
        return retVOs;
    }
	
	public ValueObjectAssembler reqGetDrList(ValueObjectAssembler pVOs) throws UserException{////////
        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
        ValueObject pVO=pVOs.get("req"); 
        
        try {
            ValueObject getVO = intnMngtMgt.getDrInfo(pVO); //�ǻ��޺���ȸ
            retVOs.set("ret", getVO);
            
           }catch (UserException ex) {
            setRollbackOnly();
            throw (UserException) ex;
           } catch (Exception ex) {
            setRollbackOnly();
            throw new UserException("nu.error.90000", ex);
           }
           
        return retVOs;
    }
	
    public ValueObjectAssembler reqGetDeptList(ValueObjectAssembler pVOs) throws UserException{////////
        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
        ValueObject pVO=pVOs.get("req"); 
        
        try {
            ValueObject getVO = intnMngtMgt.getDeptInfo(pVO); //�ǻ��޺���ȸ
            retVOs.set("ret", getVO);
            
           }catch (UserException ex) {
            setRollbackOnly();
            throw (UserException) ex;
           } catch (Exception ex) {
            setRollbackOnly();
            throw new UserException("nu.error.90000", ex);
           }
           
        return retVOs;
    }
	   
	public ValueObjectAssembler reqInsReservList(ValueObjectAssembler pVOs) throws UserException{
        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
        ValueObject pVO=pVOs.get("req"); 
        
        try {

            intnMngtMgt.insReservInfo(pVO); //�����߰�
            
            intnMngtMgt.insReservInsInfo(pVO); //���ຸ�������߰�
            
            intnMngtMgt.insScriptInfo(pVO); //�ܷ�����߰�
            
            intnMngtMgt.insPaymentInfo(pVO); //�����߰�
            
        } catch (UserException ex) {
            setRollbackOnly();
            throw (UserException) ex;
           } catch (Exception ex) {
            setRollbackOnly();
            throw new UserException("nu.error.90000", ex);
           }
            
        return retVOs;
    }
	
	public ValueObjectAssembler reqSetReservList(ValueObjectAssembler pVOs) throws UserException{
        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
        ValueObject pVO=pVOs.get("req"); 
        
        try {

            intnMngtMgt.setReservInfo(pVO); //�������
            
            intnMngtMgt.setReservInsInfo(pVO); //���ຸ����������
            
        } catch (UserException ex) {
            setRollbackOnly();
            throw (UserException) ex;
           } catch (Exception ex) {
            setRollbackOnly();
            throw new UserException("nu.error.90000", ex);
           }
            
        return retVOs;
    }
	
	public ValueObjectAssembler reqDelReservList(ValueObjectAssembler pVOs) throws UserException{
        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
        ValueObject pVO=pVOs.get("req"); 
        
        try {

            intnMngtMgt.delReservInfo(pVO); //�������
            
            intnMngtMgt.delReservInsInfo(pVO); //���ຸ����������
            
            intnMngtMgt.delScriptInfo(pVO); //�ܷ���ϻ���
            
            intnMngtMgt.delPaymentInfo(pVO); //��������
            
        } catch (UserException ex) {
            setRollbackOnly();
            throw (UserException) ex;
           } catch (Exception ex) {
            setRollbackOnly();
            throw new UserException("nu.error.90000", ex);
           }
            
        return retVOs;
    }

/////////////�̻� �ܷ����
	
	   public ValueObjectAssembler reqGetNurseList(ValueObjectAssembler pVOs) throws UserException{
	        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
	        ValueObject pVO=pVOs.get("req"); 
	        
	        try {
	            ValueObject getVO = intnMngtMgt.getNurseInfo(pVO); //��ȣ��ȸ
	            retVOs.set("ret", getVO);
	            
	           }catch (UserException ex) {
	            setRollbackOnly();
	            throw (UserException) ex;
	           } catch (Exception ex) {
	            setRollbackOnly();
	            throw new UserException("nu.error.90000", ex);
	           }
	           
	        return retVOs;
	    }
	   
	    public ValueObjectAssembler reqSetNurseList(ValueObjectAssembler pVOs) throws UserException{
	        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
	        ValueObject pVO=pVOs.get("req"); 
	        
	        try {

	            intnMngtMgt.setNurseInfo(pVO); //��ȣ����
	            
	        } catch (UserException ex) {
	            setRollbackOnly();
	            throw (UserException) ex;
	           } catch (Exception ex) {
	            setRollbackOnly();
	            throw new UserException("nu.error.90000", ex);
	           }
	            
	        return retVOs;
	    }
	   
	   public ValueObjectAssembler reqGetExamList(ValueObjectAssembler pVOs) throws UserException{
	        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
	        ValueObject pVO=pVOs.get("req"); 
	        
	        try {
	            ValueObject getVO = intnMngtMgt.getExamInfo(pVO);
	            retVOs.set("ret", getVO);
	            
	           }catch (UserException ex) {
	            setRollbackOnly();
	            throw (UserException) ex;
	           } catch (Exception ex) {
	            setRollbackOnly();
	            throw new UserException("nu.error.90000", ex);
	           }
	           
	        return retVOs;
	    }
	   
	   public ValueObjectAssembler reqGetExamPerpatList(ValueObjectAssembler pVOs) throws UserException{
	        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
	        ValueObject pVO=pVOs.get("req"); 
	        
	        try {
	            ValueObject getVO = intnMngtMgt.getExamPerpatInfo(pVO);
	            retVOs.set("ret", getVO);
	            
	           }catch (UserException ex) {
	            setRollbackOnly();
	            throw (UserException) ex;
	           } catch (Exception ex) {
	            setRollbackOnly();
	            throw new UserException("nu.error.90000", ex);
	           }
	           
	        return retVOs;
	    }
	   
	   public ValueObjectAssembler reqGetSpecPerexamList(ValueObjectAssembler pVOs) throws UserException{
           ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
           ValueObject pVO=pVOs.get("req"); 
           
           try {
               ValueObject getVO = intnMngtMgt.getSpecPerexamInfo(pVO);
               retVOs.set("ret", getVO);
               
              }catch (UserException ex) {
               setRollbackOnly();
               throw (UserException) ex;
              } catch (Exception ex) {
               setRollbackOnly();
               throw new UserException("nu.error.90000", ex);
              }
              
           return retVOs;
       }
	   
	   public ValueObjectAssembler reqGetDiagSearchList(ValueObjectAssembler pVOs) throws UserException{
	        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
	        ValueObject pVO=pVOs.get("req"); 
	        
	        try {
	            ValueObject getVO = intnMngtMgt.getDiagSearchInfo(pVO);
	            retVOs.set("ret", getVO);
	            
	           }catch (UserException ex) {
	            setRollbackOnly();
	            throw (UserException) ex;
	           } catch (Exception ex) {
	            setRollbackOnly();
	            throw new UserException("nu.error.90000", ex);
	           }
	           
	        return retVOs;
	    }
	   
	   public ValueObjectAssembler reqGetDiagList(ValueObjectAssembler pVOs) throws UserException{
	        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
	        ValueObject pVO=pVOs.get("req"); 
	        
	        try {
	            ValueObject getVO = intnMngtMgt.getDiagInfo(pVO);
	            retVOs.set("ret", getVO);
	            
	           }catch (UserException ex) {
	            setRollbackOnly();
	            throw (UserException) ex;
	           } catch (Exception ex) {
	            setRollbackOnly();
	            throw new UserException("nu.error.90000", ex);
	           }
	           
	        return retVOs;
	    }
	   
       public ValueObjectAssembler reqInsDiagList(ValueObjectAssembler pVOs) throws UserException{
           ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
           ValueObject pVO=pVOs.get("req"); 
           
           try {

               intnMngtMgt.insDiagInfo(pVO);
               
           } catch (UserException ex) {
               setRollbackOnly();
               throw (UserException) ex;
              } catch (Exception ex) {
               setRollbackOnly();
               throw new UserException("nu.error.90000", ex);
              }                  
               
           return retVOs;
       }
       
       public ValueObjectAssembler reqInsPresList(ValueObjectAssembler pVOs) throws UserException{
           ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
           ValueObject pVO=pVOs.get("req"); 
           
           try {

               intnMngtMgt.insPresInfo(pVO);
               
           } catch (UserException ex) {
               setRollbackOnly();
               throw (UserException) ex;
              } catch (Exception ex) {
               setRollbackOnly();
               throw new UserException("nu.error.90000", ex);
              }                  
               
           return retVOs;
       }
	   
	   public ValueObjectAssembler reqGetPresSearchList(ValueObjectAssembler pVOs) throws UserException{
	        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
	        ValueObject pVO=pVOs.get("req"); 
	        
	        try {
	            ValueObject getVO = intnMngtMgt.getPresSearchInfo(pVO);
	            retVOs.set("ret", getVO);
	            
	           }catch (UserException ex) {
	            setRollbackOnly();
	            throw (UserException) ex;
	           } catch (Exception ex) {
	            setRollbackOnly();
	            throw new UserException("nu.error.90000", ex);
	           }
	           
	        return retVOs;
	    }
	   
	   public ValueObjectAssembler reqGetPresList(ValueObjectAssembler pVOs) throws UserException{
	        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
	        ValueObject pVO=pVOs.get("req"); 
	        
	        try {
	            ValueObject getVO = intnMngtMgt.getPresInfo(pVO);
	            retVOs.set("ret", getVO);
	            
	           }catch (UserException ex) {
	            setRollbackOnly();
	            throw (UserException) ex;
	           } catch (Exception ex) {
	            setRollbackOnly();
	            throw new UserException("nu.error.90000", ex);
	           }
	           
	        return retVOs;
	    }
	   
	   public ValueObjectAssembler reqGetScriptList(ValueObjectAssembler pVOs) throws UserException{
	        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
	        ValueObject pVO=pVOs.get("req"); 
	        
	        try {
	            ValueObject getVO = intnMngtMgt.getScriptInfo(pVO);
	            retVOs.set("ret", getVO);
	            
	           }catch (UserException ex) {
	            setRollbackOnly();
	            throw (UserException) ex;
	           } catch (Exception ex) {
	            setRollbackOnly();
	            throw new UserException("nu.error.90000", ex);
	           }
	           
	        return retVOs;
	    }
	   
	   public ValueObjectAssembler reqSetScriptList(ValueObjectAssembler pVOs) throws UserException{
	        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
	        ValueObject pVO=pVOs.get("req"); 
	        
	        try {

	            intnMngtMgt.setScriptInfo(pVO);
	            
	        } catch (UserException ex) {
	            setRollbackOnly();
	            throw (UserException) ex;
	           } catch (Exception ex) {
	            setRollbackOnly();
	            throw new UserException("nu.error.90000", ex);
	           }                  
	            
	        return retVOs;
	    }
	   
	   public ValueObjectAssembler reqSetPresComList(ValueObjectAssembler pVOs) throws UserException{
           ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
           ValueObject pVO=pVOs.get("req"); 
           
           try {

               intnMngtMgt.setPresComInfo(pVO);
               
           } catch (UserException ex) {
               setRollbackOnly();
               throw (UserException) ex;
              } catch (Exception ex) {
               setRollbackOnly();
               throw new UserException("nu.error.90000", ex);
              }                  
               
           return retVOs;
       }
	   
	   public ValueObjectAssembler reqGetPaymentList(ValueObjectAssembler pVOs) throws UserException{
           ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
           ValueObject pVO=pVOs.get("req"); 
           
           try {
               ValueObject getVO = intnMngtMgt.getPaymentInfo(pVO);
               retVOs.set("ret", getVO);
               
              }catch (UserException ex) {
               setRollbackOnly();
               throw (UserException) ex;
              } catch (Exception ex) {
               setRollbackOnly();
               throw new UserException("nu.error.90000", ex);
              }
              
           return retVOs;
       }
	   
	   public ValueObjectAssembler reqSetPaymentList(ValueObjectAssembler pVOs) throws UserException{
	        ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
	        ValueObject pVO=pVOs.get("req"); 
	        
	        try {

	            intnMngtMgt.setPaymentInfo(pVO);
	            intnMngtMgt.setPaymentComInfo(pVO);
	            
	        } catch (UserException ex) {
	            setRollbackOnly();
	            throw (UserException) ex;
	           } catch (Exception ex) {
	            setRollbackOnly();
	            throw new UserException("nu.error.90000", ex);
	           }                  
	            
	        return retVOs;
	    }
	   
	   public ValueObjectAssembler reqGetReceiptList(ValueObjectAssembler pVOs) throws UserException{
           ValueObjectAssembler retVOs = new ValueObjectAssembler(); 
           ValueObject pVO=pVOs.get("req");
           
           try {
               ValueObject getVO = intnMngtMgt.getReceiptInfo(pVO);
               retVOs.set("ret", getVO);
               
              }catch (UserException ex) {
               setRollbackOnly();
               throw (UserException) ex;
              } catch (Exception ex) {
               setRollbackOnly();
               throw new UserException("nu.error.90000", ex);
              }
              
           return retVOs;
       }
	
}
