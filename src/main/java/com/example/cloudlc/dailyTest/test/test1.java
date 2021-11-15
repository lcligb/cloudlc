package com.example.cloudlc.dailyTest.test;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * 非对象集合交、并、差处理
 */
public class Test1 {
    public static void main(String[] args) {
        String[] arrayA = new String[] { "1", "2", "3", "4"};
        String[] arrayB = new String[] { "3", "4", "5", "6" };
        List<String> listA = Arrays.asList(arrayA);
        List<String> listB = Arrays.asList(arrayB);
//        collectionUtilsHandle(listA,listB);
        streamHandle(listA,listB);
    }

    public static void collectionUtilsHandle(List<String> listA,List<String> listB){


        //1、并集 union
        System.out.println(CollectionUtils.union(listA, listB));
        //输出: [1, 2, 3, 4, 5, 6]

        //2、交集 intersection
        System.out.println(CollectionUtils.intersection(listA, listB));
        //输出:[3, 4]

        //3、交集的补集（析取）disjunction
        System.out.println(CollectionUtils.disjunction(listA, listB));
        //输出:[1, 2, 5, 6]

        //4、差集（扣除）
        System.out.println(CollectionUtils.subtract(listA, listB));
        //输出:[1, 2]
    }

    public static void listHandle(List<String> listA,List<String> listB){
        //1、交集
        List<String>  jiaoList = new ArrayList<>(listA);
        jiaoList.retainAll(listB);
        System.out.println(jiaoList);
        //输出:[3, 4]

        //2、差集
        List<String>  chaList = new ArrayList<>(listA);
        chaList.removeAll(listB);
        System.out.println(chaList);
        //输出:[1, 2]

        //3、并集 (先做差集再做添加所有）
        List<String>  bingList = new ArrayList<>(listA);
        bingList.removeAll(listB); // bingList为 [1, 2]
        bingList.addAll(listB);  //添加[3,4,5,6]
        System.out.println(bingList);
        //输出:[1, 2, 3, 4, 5, 6]
    }

    public static void streamHandle(List<String> listA,List<String> listB){
        // 交集
        List<String> intersection = listA.stream().filter(item -> listB.contains(item)).collect(toList());
        System.out.println(intersection);
        //输出:[3, 4]

        // 差集 (list1 - list2)
        List<String> reduceList = listA.stream().filter(item -> !listB.contains(item)).collect(toList());
        System.out.println(reduceList);
        //输出:[1, 2]

        // 并集 （新建集合:1、是因为不影响原始集合。2、Arrays.asList不能add和remove操作。
        List<String> listAll = listA.parallelStream().collect(toList());
        List<String> listAll2 = listB.parallelStream().collect(toList());
        listAll.addAll(listAll2);
        System.out.println(listAll);
        //输出:[1, 2, 3, 4, 3, 4, 5, 6]

        // 去重并集
        List<String> list =new ArrayList<>(listA);
        list.addAll(listB);
        List<String> listAllDistinct = list.stream().distinct().collect(toList());
        System.out.println(listAllDistinct);
        //输出:[1, 2, 3, 4, 5, 6]

    }
}
