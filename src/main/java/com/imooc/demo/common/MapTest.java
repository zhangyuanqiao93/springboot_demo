package com.imooc.demo.common;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Create By Bridge on 2017/8/4
 * function: Map ,List,Iterator demo
 */
public class MapTest {

    public static List<String> list = new ArrayList<>();

    public static void main(String[] agrs){
            MapTest mapTest = new MapTest();
            mapTest.initList(list);
            mapTest.foreach(list);
            mapTest.forlist(list);
            mapTest.iteratorList(list);

    }

    // Iterator 遍历循环
    private void iteratorList(List<String> list) {
        long  start = System.currentTimeMillis();
        for (Iterator<String> it = list.iterator();it.hasNext();){
            long end=System.currentTimeMillis();
            long count=end -start;
            System.out.println("iterator 遍历时间"+count);

        }
    }

    //list遍历for
    private void forlist(List<String> list) {

        long start = System.currentTimeMillis();
        int i ;

        for (i = 0;i<list.size();i++){

            String value = list.get(i);
        }

        long end  = System.currentTimeMillis();

        long count = end - start;
        System.out.println("list.size()遍历时间: " + count); //sout + tab
    }

    //list集合遍历
    private void foreach(List<String> list) {
        Long start = System.currentTimeMillis();
        for (String data : list){

            String value = data;
        }

        long end = System.currentTimeMillis();

        long count = end - start;

        System.out.println("foreach循环的时间是： " + count);

    }

    // list 集合中添加10万条数据
    private List initList(List<String> list) {
        int i ;
        int num = 600;

        for (i=0;i<num;i++){
            list.add("list" + i);
        }
        return list;
    }

}
