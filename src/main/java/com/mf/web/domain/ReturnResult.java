package com.mf.web.domain;

public class ReturnResult {
	private int status;
	private String msg;
	private int msgCode;

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(int msgCode) {
		this.msgCode = msgCode;
	}

}
