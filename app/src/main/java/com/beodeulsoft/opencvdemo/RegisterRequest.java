package com.beodeulsoft.opencvdemo;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    // 서버 URL 설정 (PHP 파일 연동)
    final static private String URL = "http://winmfgd9.cafe24.com/Register.php";
    private Map<String, String> map;

    public RegisterRequest(String userID, String userPassword, String userName, int userAge, String NickName,String Email,int PhoneNumber,String CarName,String CarLicense, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword",userPassword);
        map.put("userName",userName);
        map.put("userAge",userAge + "");
        map.put("NickName",NickName);
        map.put("Email",Email);
        map.put("PhoneNumber",PhoneNumber + "");
        map.put("CarName",CarName);
        map.put("CarLicense",CarLicense);
    }

    // @Nullable 들어갓엇음
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}