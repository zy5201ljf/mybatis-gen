package com.levmin.service.impl;

import com.levmin.service.HttpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

@Service
@Slf4j
public class HttpServiceImpl implements HttpService {

    @Autowired(required=true)
    private RestTemplate restTemplate;
    @Override
    public String getToken() throws UnknownHostException {
        String app_id = "appid:up_fd1mnx9mbeyh_qwpo";
        String app_secret = "";
        String tokenUrl = "https://openapi.unionpay.com/upapi/mhsiqs/token";
        tokenUrl = tokenUrl+"?app_id="+app_id+"&app_secret="+app_secret;
        Map forObject = restTemplate.getForObject(tokenUrl, Map.class);
        String respCd = (String)forObject.get("respCd");
        String token = (String)forObject.get("token");
        String respMsg = (String)forObject.get("respMsg");
        log.info("获取token相应结果：{}",respCd);
        log.info("获取respMsg相应结果：{}",respMsg);
        InetAddress localHost = InetAddress.getLocalHost();
        log.info("获取当前ip地址：{}",localHost.getAddress());

        return token;
    }
}
