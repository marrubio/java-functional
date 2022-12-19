package es.marugi.learn.functional.v10stream;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {

    public static void main(String[] args){

        System.out.println("Start v10stream.main()");
        //https://www.w3schools.com/java/java_lambda.asp

        List<String> brandList = new ArrayList<>(BrandFlowUtils.loadBrandsFromConfigFile());

        // Native list stream
        String maxLengthBrand = brandList.stream()
                // Convert to uppercase
                .map(BrandFlowUtils::upperText)
                // Filter list
                .filter(BrandFlowUtils::lengthBrandPredicate)
                // Sort brands by length
                .sorted(BrandFlowUtils::lengthComparator)
                // Prints the list
                //.peek(System.out::println)
                // Get max length brand and returns an optional
                //.max(BrandFlowUtils::lengthComparator)
                .collect(Collectors.joining(";"));
                // If max gets an empty list returns an empty optional
                //.orElse("There is not items in the list");

        System.out.println("CSV: " + maxLengthBrand );

        //Stream generator

        Random random = new Random();

        //1 - Stream.of
        System.out.printf("1 - Stream.of\n");
        List<String> streamOf = Stream.of("Fulano", "Mengano","Paco", "Manolo", "Ana", "Joaquin")
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(streamOf);

        //2 - Stream.generate
        System.out.printf("2 - Stream.generate\n");
        List<Integer> streamGenerate = Stream.generate(() -> random.nextInt(100))
                .limit(25) // Limit stream to stop stream when we have 25 numbers
                .collect(Collectors.toList()); // Convert to a List
        System.out.println(streamGenerate);

        //3a - Stream.iterate
        System.out.printf("3a - Stream.iterate\n");
        List<Integer> streamIterate = Stream.iterate(1, x -> x + x)
                .limit(25) // Limit stream to stop stream when we have 25 numbers
                .collect(Collectors.toList()); // Convert to a List
        System.out.println(streamIterate);


        //3b Fibonacci
        System.out.printf("3b - Stream.iterate - Fibonacci\n");
        List<Integer> fibo = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(25)
                .map(t -> t[0])
                .collect(Collectors.toList());
        System.out.println(fibo);


        //4 - Random.ints
        System.out.printf("4 - Random.ints\n");
        List<Integer> randomInts = random.ints(25, 1, 100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(randomInts);


    }

}
