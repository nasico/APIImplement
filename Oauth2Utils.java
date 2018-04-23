package mobile.util;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * 第三方授权后台实现
 * 
 * @author nasico
 *
 */
public class Oauth2Utils {
	
	public static JSONObject weixinOauth(String appid, String secret, String code, String grantType) {
		Map<String, String> param = new HashMap<String, String>();
		param.put("appid", appid);
		param.put("secret", secret);
		param.put("code", code);
		param.put("grantType", grantType);
		
		String response = HttpClientUtils.doPost("https://api.weixin.qq.com/sns/oauth2/access_token", param );
		JSONObject obj = JSONObject.parseObject(response);
		
		return obj;
	}

	public static JSONObject getUserInfo(JSONObject obj) {
		Map<String, String> param = new HashMap<String, String>();
		param.put("access_token", obj.getString("access_token"));
		param.put("openid", obj.getString("openid"));
		param.put("lang", "zh_CN");
		
		String response = HttpClientUtils.doPost("https://api.weixin.qq.com/sns/userinfo", param );
		JSONObject userObj = JSONObject.parseObject(response);
		
		return userObj;
	}
}
