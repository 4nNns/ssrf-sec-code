//package com.ha0l.ssrfseccode.utils;
//
//public class SafeHttpUtils {
//
//    String url = request.getParameter("url");
//if (!SSRFHostCheck(url)) {
//        System.out.println("warning!!! illegal url:" + url);
//        return;
//    }
//    URL u = new URL(url);
//
//    URLConnection urlConnection = u.openConnection();
//    HttpURLConnection httpUrl = (HttpURLConnection)urlConnection;
//
//httpUrl.setInstanceFollowRedirects(false); //禁止30x跳转
//
//    BufferedReader in = new BufferedReader(new InputStreamReader(httpUrl.getInputStream())); //send request
//
//    public static Boolean SSRFHostCheck(String url) {
//        try {
//            URL u = new URL(url);
//            // 限制为http和https协议
//            if (!u.getProtocol().startsWith("http") && !u.getProtocol().startsWith("https")) {
//                String uProtocol = u.getProtocol();
//                System.out.println("illegal Protocol:" + uProtocol);
//                return  false;
//            }
//
//            // 获取域名或IP，并转为小写
//            String host = u.getHost().toLowerCase();
//            String hostwhitelist = "192.168.199.209";     //白名单
//            if (host.equals(hostwhitelist)) {
//                System.out.println("ok_host:" + host);
//                return true;
//            } else {
//                System.out.println("illegal host:" + host);
//                return false;
//            }
//        } catch (Exception e) {
//            return false;
//        }
//    }
//}
//
