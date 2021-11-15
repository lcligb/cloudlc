package com.example.cloudlc.dailyTest.test;

import com.example.cloudlc.dailyTest.bean.Person;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        //固定长度的，如果调用add方法增加新的元素，会报异常
        List<String> list2 = Arrays.asList("a", "b");
        List list3 = Stream.of("a", "b").collect(Collectors.toList());
        List list4 = Lists.newArrayList("f", "g");
        Person person = new Person();
        collectionTest(list1);
//        preconditionsTets();
    }

    //判断基本类型是否为空
    public static void fundamentalTypeTest(){
        System.out.println(StringUtils.isEmpty(null));        //true
        System.out.println(StringUtils.isEmpty(""));          //true
        System.out.println(StringUtils.isEmpty("   "));       //false
        System.out.println(StringUtils.isEmpty("dd"));        //false

        System.out.println(StringUtils.isBlank(null));        //true
        System.out.println(StringUtils.isBlank(""));          //true
        System.out.println(StringUtils.isBlank("   "));       //true
        System.out.println(StringUtils.isBlank("dd"));        //false
    }

    //校验集合是否为空
    public static void collectionTest(List list){
        System.out.println(CollectionUtils.isEmpty(null));
        System.out.println(CollectionUtils.isEmpty(new HashSet<>()));
        System.out.println(CollectionUtils.isEmpty(list));
    }

    public static void preconditionsTets(){
        Preconditions.checkArgument(true,"错误");
        Preconditions.checkNotNull(new ArrayList<>(),"232");
        //传空字符串也判断为空
        Assert.hasText("2","idcScope is null");
        System.out.println("-------------");

    }
}
