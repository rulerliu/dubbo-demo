package com.test.impl;
import org.springframework.stereotype.Service;
import com.test.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello(String name) {
        System.out.println("消费者调用生产者服务接口name:" + name);
        return name; 
    }  
}