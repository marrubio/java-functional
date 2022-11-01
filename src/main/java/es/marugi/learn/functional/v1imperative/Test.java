package es.marugi.learn.functional.v1imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Test {

    public static void main(String[] args){

        System.out.println("Start v1imperative.Test()");

        // Supply List
        List<String> brandList = Arrays.asList("Audi","Bugatti","Peugeot","Renault","Mercedes","Ford","Ferrari","Maserati");
        System.out.println(brandList);

        //Filter list
        List<String> filteredList = new ArrayList<>();
        for(String brand : brandList){
            if(brand.length()>4) filteredList.add(brand);
        }
        System.out.println(filteredList);

        //Transform list
        List<String> transformedList = new ArrayList<>();
        for(String brand : filteredList){
            transformedList.add(brand.toUpperCase(Locale.ROOT));
        }
        System.out.println(transformedList);

        //Play list
        for(String brand : transformedList){
            System.out.println(brand);
        }

        //Reduce list
        int count = 0;
        int length = 0;
        //int i = 0;
        for(String brand : transformedList){
            count++;
            length += brand.length();
        }

        System.out.println("Total Brands:" + count );
        System.out.println("Total Length:" + length );



    }
}
