package com.lrm.util;

import com.lrm.vo.ResultVO;
import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.tags.Param;

import java.util.Map;

/**
 * @author: Seven.wk
 * @description: 辅助工具类
 * @create: 2018/07/04
 */
public class HttpUtils {

    /**
     * 向目的URL发送post请求
     * @param url       目的url
     * @return  ResultVO
     */
    public static ResultVO sendPostRequest(String url, Map<String,String> params){
        RestTemplate client = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpMethod method = HttpMethod.POST;
        // 以表单的方式提交
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //将请求头部和参数合成一个请求
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(headers);
        //执行HTTP请求，将返回的结构使用ResultVO类格式化
        ResponseEntity<ResultVO> response = client.exchange(url, method, requestEntity, ResultVO.class);
        System.out.println(response.getBody()+"==============================");
        return response.getBody();
    }

}
