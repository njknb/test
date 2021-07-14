package com.hy.demo.common;

/**
 * @author: 何志权27629
 * @description: 统一返回结果类
 */
public class Result {

	/** 返回码 */
    private String code;

    /** 返回数据 */
    private Object data;

	/** 其他信息 */
	private Object other;

	public Result(String code, Object data, Object other) {
		super();
		this.code = code;
		this.data = data;
		this.other = other;
	}

	public Result() {

	}

	public Result(String code, Object data) {
		super();
		this.code = code;
		this.data = data;
	}

	public void successResult(Object data) {
		this.code = StatusCode.OK;
		this.data = data;
	}

	public void errorResult(Object other) {
		this.code = StatusCode.ERROR;
		this.other = other;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getOther() {
		return other;
	}

	public void setOther(Object other) {
		this.other = other;
	}

	@Override
	public String toString() {
		return "Result{" +
				"code='" + code + '\'' +
				", data=" + data +
				", other=" + other +
				'}';
	}
}