package mobile.util;

public enum CodeMsg {
	SUCCESS(0, "请求成功"),
	SERVER_EXCEPTION(1001,"服务端异常"),
	PARAMETER_ISNULL(1101,"输入参数为空"),
	PARAMETER_ISERROR(1102,"参数校验错误"),
	USER_NOT_EXSIST(1201,"用户不存在"),
	USER_EXSIST(1201,"注册用户已存在"),
	USER_LOGIN_FAIL(1202,"用户名或密码错误"),
	USER_NOT_POWER(1205,"用户权限不足"),
	NOT_FIND_DATA(1301,"查找不到对应数据"), 
	TOKEN_ERROR(1401,"未获取登录授权");

	private int code;
	private String msg;

	CodeMsg(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}
