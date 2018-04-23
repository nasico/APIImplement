package mobile.util;

public class ResultUtil {
	private int code;
	private String msg;
	private Object data;

	public ResultUtil() {
		super();
		this.code = CodeMsg.SUCCESS.getCode();
		this.msg = CodeMsg.SUCCESS.getMsg();
	}
	
	public ResultUtil(CodeMsg cm, Object data) {
		super();
		if(cm != null) {
			this.code = cm.getCode();
			this.msg = cm.getMsg();
		}
		this.data = data;
	}
	
	public ResultUtil(CodeMsg cm) {
		super();
		if(cm != null) {
			this.code = cm.getCode();
			this.msg = cm.getMsg();
		}
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public Object getData() {
		return data;
	}
	
}
