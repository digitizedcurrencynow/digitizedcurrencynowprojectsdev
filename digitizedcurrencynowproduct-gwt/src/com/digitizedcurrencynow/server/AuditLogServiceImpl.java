package com.digitizedcurrencynow.server;

import java.util.ArrayList;
import java.util.List;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import com.digitizedcurrencynow.shared.AuditLogService;
import com.digitizedcurrencynow.shared.model.AuditLog;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class AuditLogServiceImpl extends RemoteServiceServlet implements  AuditLogService {
	
	private static final long serialVersionUID = 1L;
	private static final PersistenceManagerFactory PMF = JDOHelper.getPersistenceManagerFactory("transactions-optional");

	public void addAuditLog(AuditLog auditLog)  {
		PersistenceManager pm = getPersistenceManager();
		try {
			System.out.println("AuditLog "+auditLog.toString());
			pm.makePersistent(auditLog);
		}catch(Exception e){
			System.out.println("Exception addAuditLog");
			e.printStackTrace();
		} 
		finally {
			pm.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<AuditLog> getAuditLog()  {
		
		PersistenceManager pm = getPersistenceManager();
		ArrayList<AuditLog> AuditLoglist = new ArrayList<AuditLog>();
		try {
			String query= "select from "+AuditLog.class.getName();
			List<AuditLog> result = (List<AuditLog>)pm.newQuery(query).execute();
			
			for (AuditLog up : result) {
				AuditLoglist.add(up);
			}
			
		}catch(Exception e){
			System.out.println("Exception auditLog");
			e.printStackTrace();
		}
		finally {
			pm.close();
		}
		return AuditLoglist;
	}
	
	private PersistenceManager getPersistenceManager() {
		return PMF.getPersistenceManager();
	}

	
}
