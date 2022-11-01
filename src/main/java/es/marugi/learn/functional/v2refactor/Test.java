package es.marugi.learn.functional.v2refactor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Test {

    public static void main(String[] args){

        System.out.println("Start v2refactor.Test()");

        // Supply List
        List<String> brandList = supplyList();
        System.out.println(brandList);

        //Filter list
        List<String> filteredList = filterList(brandList,4);
        System.out.println(filteredList);

        //Transform list
        List<String> transformedList = transformList(filteredList);
        System.out.println(transformedList);

        //Print list
        printList(transformedList);

        //Reduce list
        Integer length = reduceList(transformedList);
        System.out.println("Total Length:" + length );

    }

    private static List<String> supplyList() {
        return Arrays.asList("Audi","Bugatti","Peugeot","Renault","Mercedes","Ford","Ferrari","Maserati");
    }

    private static List<String> filterList(List<String> brandList, int length) {
        List<String> result = new ArrayList<>();
        for(String brand : brandList){
            if(brand.length()>length) result.add(brand);
        }
        return result;
    }

    private static List<String> transformList(List<String> list) {
        List<String> result = new ArrayList<>();
        for(String brand : list){
            result.add(brand.toUpperCase(Locale.ROOT));
        }
        return result;
    }

    private static void printList(List<String> list) {
        for(String item : list){
            System.out.println(item);
        }
    }

    private static Integer reduceList(List<String> transformedList) {
        int length = 0;
        //int i = 0;
        for(String brand : transformedList){
            length += brand.length();
        }
        return length;
    }


}
