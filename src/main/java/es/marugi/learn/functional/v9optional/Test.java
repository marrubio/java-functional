package es.marugi.learn.functional.v9optional;

import java.util.*;


public class Test {

    public static void main(String[] args){

        System.out.println("Start v9reference.main()");
        //https://www.w3schools.com/java/java_lambda.asp

        MyListFlow listFlow = new MyListFlow(new ArrayList<>());

        String maxLengthBrand = listFlow.supply(BrandFlowUtils::loadBrandsFromConfigFile)
                // Convert to uppercase
                .transformList(BrandFlowUtils::upperText)
                // Change length predicate value to 2 to test optional empty
                .filterList(BrandFlowUtils::lengthBrandPredicate)
                // Sort brands by length
                .sortList(BrandFlowUtils::lengthComparator)
                // Prints the list
                .printList(System.out::println)
                // Get max length brand and returns an optional
                .max(BrandFlowUtils::lengthComparator)
                // If max gets an empty list returns an empty optional
                .orElse("There is not items in the list");

        System.out.println("Max Brand Length: " + maxLengthBrand );




    }








}
