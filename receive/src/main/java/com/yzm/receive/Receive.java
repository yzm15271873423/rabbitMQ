package com.yzm.receive;

import com.yzm.bean.SearchPojo;
import com.yzm.utils.HttpClientUtil;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: yzm
 * @Date: 2021/6/16 - 06 - 16 - 10:56
 */

@Component
public class Receive {

    @RabbitListener(queues = "DemoQueue")
    public void solr(Object obj){
        Message msg = (Message)obj;
        try{
            //从消息队列中获取要保存的对象
            ByteArrayInputStream bis = new ByteArrayInputStream(msg.getBody());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object spObj = ois.readObject();

            SearchPojo sp = (SearchPojo)spObj;
            //调用HttpClient 执行http连接 进行insert操作
            Map<String , String> params = new HashMap<>();
            params.put("id" , sp.getId()+"");
            params.put("name" , sp.getName());
            params.put("price" , sp.getPrice()+"");
            HttpClientUtil.doPost("http://localhost:8989/insert" , params);
            ois.close();
            bis.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
