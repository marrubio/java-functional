package es.marugi.learn.functional.v10stream;

import java.util.ArrayList;
import java.util.List;


public class Test {

    public static void main(String[] args){

        System.out.println("Start v10stream.main()");
        //https://www.w3schools.com/java/java_lambda.asp

        List<String> brandList = new ArrayList<>(BrandFlowUtils.loadBrandsFromConfigFile());

        // Native list stream
        String maxLengthBrand = brandList.stream()
                // Convert to uppercase
                //.map(BrandFlowUtils::upperText)
                // Filter list
                .filter(BrandFlowUtils::lengthBrandPredicate)
                // Sort brands by length
                .sorted(BrandFlowUtils::lengthComparator)
                // Prints the list
                .peek(System.out::println)
                // Get max length brand and returns an optional
                .max(BrandFlowUtils::lengthComparator)
                // If max gets an empty list returns an empty optional
                .orElse("There is not items in the list");

        System.out.println("Max Brand Length: " + maxLengthBrand );

    }

}
