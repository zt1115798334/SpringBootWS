package com.zt;

import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class Client {
    public static void main(String[] args0) throws Exception {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        org.apache.cxf.endpoint.Client client = dcf.createClient("http://localhost:8080/zt/user?wsdl");
        //getUser 为接口中定义的方法名称  张三为传递的参数   返回一个Object数组
        Object[] objects = client.invoke("getName", "001");
        //输出调用结果
        System.out.println("*****" + objects[0].toString());
    }
}
