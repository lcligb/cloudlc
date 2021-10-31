package com.example.cloudlc.dailyTest.control;

import com.alibaba.ais.dc.x.common.model.web.WebResult;
import com.example.cloudlc.dailyTest.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/config")
public class PersonAct {

    @Autowired
    Person person;
    @Value("${useLocalCache:false}")
    private String useLocalCache;


    @RequestMapping("/get")
    public String test1() {
//        System.out.println(person);
//        return "测试一下1";
        return useLocalCache;
    }
    @GetMapping("/test")
    public WebResult test2() {
//        System.out.println(person);
        return WebResult.success().withData("测试一下1");
    }

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String test3(@PathVariable String string) {
        System.out.println(person);
        return "Hello Nacos Discovery " + string;
    }
}
