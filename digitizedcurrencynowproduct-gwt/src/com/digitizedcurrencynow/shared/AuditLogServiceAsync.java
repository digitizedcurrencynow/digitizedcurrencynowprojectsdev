package com.digitizedcurrencynow.shared;

import java.util.List;

import com.digitizedcurrencynow.shared.model.AuditLog;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AuditLogServiceAsync {

	void addAuditLog(AuditLog auditLog, AsyncCallback<Void> callback);
	void getAuditLog(AsyncCallback<List<AuditLog>> callback);

}