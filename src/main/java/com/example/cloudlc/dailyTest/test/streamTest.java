package com.example.cloudlc.dailyTest.test;

import com.example.cloudlc.dailyTest.bean.Dish;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streamTest {

    final static List<Dish> dishes = Lists.newArrayList(
            new Dish("name1", false, 800),
            new Dish("name2", false, 800),
            new Dish("name3", false, 400),
            new Dish("name4", true, 530),
            new Dish("name5", true, 350),
            new Dish("name6", true, 120),
            new Dish("name7", true, 550),
            new Dish("name8", false, 300),
            new Dish("name9", false, 450)
    );

    public static void main(String[] args) {
        List<String> dishList = new ArrayList<>();
//        test1(dishes);
//        list2Map(dishes);
//        toList(dishes);
//          forEach(dishes);
        forEach2(dishes,dishList);
        System.out.println(dishList);
        string1();
    }

    public static void test1(List<Dish> dishes){
        //直接连接
        String join1 = dishes.stream().map(Dish::getName).collect(Collectors.joining());
        System.out.println(join1);

        //逗号
        String join2 = dishes.stream().map(Dish::getName).collect(Collectors.joining(", "));
        System.out.println(join2);

    }

    public static void list2Map(List<Dish> dishes){
        //list转map
//        Map<String, Dish> collect = dishes.stream().collect(Collectors.toMap(Dish::getName, o -> o));
        Map<String, Dish> collect = dishes.stream().collect(Collectors.toMap(Dish::getName, Function.identity()));
        System.out.println(collect);

//        System.out.println("--------------------------------------------------------------------------");
//        Map<Integer, String> collect2 = dishes.stream().collect(Collectors.toMap(Dish::getNum, Dish::getName));
//        System.out.println(collect2);
        //如果有重复的key时候:
        System.out.println("---------------------------------------------------------------------------");
        Map<Integer, Dish> collect3 = dishes.stream().collect(Collectors.toMap(Dish::getNum, Function.identity(),(kry1,kry2) ->kry1));
        System.out.println(collect3);
    }

    public static void toList(List<Dish> dishes){
        List<Integer> name1 = dishes.stream().map(Dish::getNum).collect(Collectors.toList());
        //含方法体
        List<Integer> name2 = dishes.stream().map(dish -> dish.getNum()*2).collect(Collectors.toList());
        //含判断条件的方法体
        List<String> name3 = Lists.newArrayList();
        List<Boolean> collect = dishes.stream().filter(s -> 799 < s.getNum()).map(dish ->
             name3.add(dish.getName())).collect(Collectors.toList());


        System.out.println("name1:"+name1);
        System.out.println("name2:"+name2);
        System.out.println("name3:"+name3);
        System.out.println("collect:"+collect);

    }

    public static void forEach(List<Dish> dishes ){

        dishes.forEach(dish->{
            if("name1".equals(dish.getName())){
                System.out.println(dish.getName());
            }
        });
    }

    public static void forEach2(List<Dish> dishes, List<String> dishList){

        dishes.forEach(dish->{
            dishList.add(dish.getName());
        });
    }

    public static void string1(){
        System.out.println(System.currentTimeMillis());
    }





}
