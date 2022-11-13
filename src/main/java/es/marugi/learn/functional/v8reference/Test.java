package es.marugi.learn.functional.v8reference;

import java.util.ArrayList;


public class Test {

    public static void main(String[] args){

        System.out.println("Start v9reference.main()");
        //https://www.w3schools.com/java/java_lambda.asp

        MyListFlow listFlow = new MyListFlow(new ArrayList<>());

        String maxLengthBrand = listFlow.supply(BrandFlowUtils::loadBrandsFromConfigFile)
                .transformList(BrandFlowUtils::upperText)
                .filterList(BrandFlowUtils::lengthBrandPredicate)
                .sortList(BrandFlowUtils::lengthComparator)
                .printList(System.out::println)
                .max(BrandFlowUtils::lengthComparator)
                //.reduceList(listFlow::sumLengthBrands)
                ;

        System.out.println("Max length brand:" + maxLengthBrand );

    }








}
