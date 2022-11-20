package es.marugi.learn.functional.v10stream;

import es.marugi.learn.App;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class BrandFlowUtils {

    public static String upperText(String brand){
        return brand.toUpperCase(Locale.ROOT);
    }

    public static boolean lengthBrandPredicate(Object brand){
        return ((String)brand).length()>3;
    }

    public static int lengthComparator(Object value1, Object value2){
        return ((String)value1).length()-((String)value2).length();
    }

    public static List<String> loadBrandsFromConfigFile(){

        List<String> brandList = null;

        try {

            InputStream input = App.class.getClassLoader().getResourceAsStream("config.properties");

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                throw new IOException();
            }

            // load a properties file from class path, inside static method
            prop.load(input);

            // get the property value and print it out
            String[] brandArray = prop.getProperty("brand.name").split(",");

            brandList = Arrays.asList(brandArray);

            System.out.println(brandList);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return brandList;
    }


}
