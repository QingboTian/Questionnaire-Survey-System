package com.tqb.pojo.result;

public class QuesResult<T> {
	private String msg;

	private T t;

	private String status;

	public T getT() {
		return t;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setT(T t) {
		this.t = t;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void ok() {
		this.status = "ok";
	}

	public void error() {
		this.status = "error";
	}

}
