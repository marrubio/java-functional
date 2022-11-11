package es.marugi.learn.functional.v9reference;

import java.util.ArrayList;


public class Test {

    public static void main(String[] args){

        System.out.println("Start v9reference.main()");
        //https://www.w3schools.com/java/java_lambda.asp

        MyListFlow listFlow = new MyListFlow(new ArrayList<>());

        Integer length = listFlow.supply(BrandFlowUtils::getBrandList)
                .filterList(BrandFlowUtils::lengthBrandPredicate)
                .transformList(BrandFlowUtils::upperText)
                .printList(System.out::println)
                .reduceList(listFlow::sumLengthBrands);

        System.out.println("Total Length:" + length );

    }



}
