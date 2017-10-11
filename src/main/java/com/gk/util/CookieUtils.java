package com.gk.util;

import com.gk.entity.master.UserCookie;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class CookieUtils {
    private static final String COOKIE_NAME_MANAGE = "fscCookieXYZManage";
    private static final String COOKIE_NAME_ADMIN = "fscCookieXYZAdmin";
    private static String cookieName = COOKIE_NAME_MANAGE;


    public static String getCookieName() {
        return cookieName;
    }

    public static void setCookieName(String cookieName) {
        CookieUtils.cookieName = cookieName;
    }

    public static void setManageCookieName() {
        CookieUtils.cookieName = COOKIE_NAME_MANAGE;
    }

    public static void setAdminCookieName() {
        CookieUtils.cookieName = COOKIE_NAME_ADMIN;
    }

    // 添加一个cookie  
    public static Cookie newCookie(UserCookie userCookie) {
        Cookie cookie = new Cookie(cookieName, userCookie.getUserId() + "," + userCookie.getCookie());
        cookie.setPath("/");
        cookie.setMaxAge(60 * 60 * 24);
        return cookie;
    }

    public static void updateCookie(UserCookie userCookie) {
        String strTime = BasicUtils.getCurrentAccurateDateTimeString();
        String strCookie = MD5Utils.string2MD5(strTime);
        if (null == strCookie) {
            strCookie = strTime;
        }

        userCookie.setCookie(strCookie);
        userCookie.setUpdateTime(BasicUtils.getCurrentTime());
    }

    // 得到cookie  
    public static UserCookie checkCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        //System.out.println("cookies: " + cookies);  
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                //System.out.println("cookie: " + cookie.getName());  
                if (CookieUtils.cookieName.equals(cookie.getName())) {
                    String value = cookie.getValue();
                    if (StringUtils.isNotBlank(value)) {
                        String[] split = value.split(",");
                        if (split.length == 2) {
                            String strUserId = split[0];
                            String strCookie = split[1];
                            if (strUserId != null && cookie != null) {
                                try {
                                    Long userId = Long.parseLong(strUserId);
                                    UserCookie info = new UserCookie(userId, strCookie);
                                    return info;
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    // 删除cookie  
    public static List<Cookie> delCookie(HttpServletRequest request) {
        List<Cookie> listCookie = new ArrayList<Cookie>();
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookieName.equals(cookie.getName())) {
                    cookie.setPath("/");
                    cookie.setMaxAge(0);
                    listCookie.add(cookie);
                }
            }
        }
        return listCookie;
    }
}
