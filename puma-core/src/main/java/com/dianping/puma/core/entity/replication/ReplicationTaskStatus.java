package com.dianping.puma.core.entity.replication;

import com.dianping.puma.core.entity.BinlogInfo;
import com.dianping.puma.core.entity.TaskStatus;

import java.util.Date;

public class ReplicationTaskStatus extends TaskStatus {

	private Status status;

	private BinlogInfo binlogInfo;

	private long rowsInsert;

	private long rowsDelete;

	private long rowsUpdate;

	private long ddls;

	public ReplicationTaskStatus() {
		super.setGmtCreate(new Date());
	}

	public ReplicationTaskStatus(String taskId) {
		super.setTaskId(taskId);
		super.setGmtCreate(new Date());

		status = Status.CONNECTING;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public BinlogInfo getBinlogInfo() {
		return binlogInfo;
	}

	public void setBinlogInfo(BinlogInfo binlogInfo) {
		this.binlogInfo = binlogInfo;
	}

	public long getRowsInsert() {
		return rowsInsert;
	}

	public void setRowsInsert(long rowsInsert) {
		this.rowsInsert = rowsInsert;
	}

	public long getRowsDelete() {
		return rowsDelete;
	}

	public void setRowsDelete(long rowsDelete) {
		this.rowsDelete = rowsDelete;
	}

	public long getRowsUpdate() {
		return rowsUpdate;
	}

	public void setRowsUpdate(long rowsUpdate) {
		this.rowsUpdate = rowsUpdate;
	}

	public long getDdls() {
		return ddls;
	}

	public void setDdls(long ddls) {
		this.ddls = ddls;
	}

	public enum Status {
		CONNECTING,
		WAITING,
		PREPARING,
		RUNNING,
		STOPPING,
		STOPPED,
		FAILED,
		ERROR
	}
}