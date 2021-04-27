package com.xiesn.springboot;

import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.DigestAlgorithm;
import net.dreamlu.mica.http.HttpRequest;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AesDemo {

    public static final String DEFAULT_KEY = "XclgZZ2ga72gqvJR";


    @Test
    public void aa(){
        String s = HttpRequest.get("https://api.linkedin.com/v2/emailAddress?q=members&projection=(elements*(handle~))")
                .addHeader("Host", "api.linkedin.com")
                .addHeader("Connection", "Keep-Alive")
                .addHeader("Authorization", "Bearer " + "")
                .execute()
                .asJsonNode()
                .at("/elements/0/handle~0/emailAddress")
                .asText();
        System.err.println(s);

    }



    @Test
    public void aesTest() {
        String info = "{\"Appkey\":\"ZZwD6FEMwWJrU3Aa\",\"AppSecret\":\"KUBTrYZPOUMXyRR4GU3hCZCAmyU5NBLV\"}";
        //AES加密：aes().encrypt(data)
        String encrypt = SecureUtil.aes(DEFAULT_KEY.getBytes()).encryptHex(info, CharsetUtil.CHARSET_UTF_8).toUpperCase();
        System.err.println(encrypt);
        //AES解密：aes().decrypt(data)
        String decrypt = SecureUtil.aes(DEFAULT_KEY.getBytes()).decryptStr(encrypt, CharsetUtil.CHARSET_UTF_8);
        System.err.println(decrypt);


    }


    @Test
    public void desTest() {
        String info = "{\"Appkey\":\"ZZwD6FEMwWJrU3Aa\",\"AppSecret\":\"KUBTrYZPOUMXyRR4GU3hCZCAmyU5NBLV\"}";
        //des加密：des().encrypt(data)
        String encrypt = SecureUtil.des(DEFAULT_KEY.getBytes()).encryptHex(info, CharsetUtil.CHARSET_UTF_8).toUpperCase();
        System.err.println(encrypt);
        //des解密：des().decrypt(data)
        String decrypt = SecureUtil.des(DEFAULT_KEY.getBytes()).decryptStr(encrypt, CharsetUtil.CHARSET_UTF_8);
        System.err.println(decrypt);


    }


    @Test
    public void md5Test() {
        String info = "123456";
        String encrypt = SecureUtil.md5(info);
        System.err.println(encrypt);

    }

    @Test
    public void signParamsMd5(){
        Map params = new HashMap<>();
        params.put("b","11111");
        params.put("ba","2222");
        params.put("bcd","3333");
        params.put("aba",null);
        params.put("d2cd","44444");
        params.put("accd","5555");
        params.put("abcd","6666");
        String s = SecureUtil.signParamsMd5(params);


//        digestAlgorithm – 摘要算法
//        params – 参数
//        separator – entry之间的连接符
//        keyValueSeparator – kv之间的连接符
//        isIgnoreNull – 是否忽略null的键和值
//        otherParams – 其它附加参数字符串（例如密钥）
        String s1 = SecureUtil.signParams(DigestAlgorithm.MD5, params);
        System.err.println(s1);
        System.err.println(s);

        String s2 = MapUtil.sortJoin(params, "&", "=", true);
        System.err.println(s2);


    }
}
