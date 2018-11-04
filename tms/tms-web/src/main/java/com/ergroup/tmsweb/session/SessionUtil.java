package com.ergroup.tmsweb.session;

import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.ConcurrentHashMap;

public class SessionUtil {

    private static final ConcurrentHashMap<String, Boolean> sessionMap = new ConcurrentHashMap<>();

    public static Boolean checkSession(String userName) {

        if(StringUtils.isBlank(userName)) return Boolean.FALSE;
        return sessionMap.get(userName);
    }

    public static boolean setSession(String userName) {

        if(StringUtils.isBlank(userName)) return Boolean.FALSE;
        return sessionMap.put(userName, Boolean.TRUE);
    }
}
