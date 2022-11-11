package es.marugi.learn.functional.v9reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class BrandFlowUtils {

    public static List<String> upperText(List<String> brandList){
        List<String> result = new ArrayList<>();
        for(String brand :  brandList){
            result.add(brand.toUpperCase(Locale.ROOT));
        }
        return result;
    }

    public static List<String> getBrandList(){
        return Arrays.asList("Audi","Bugatti","Peugeot","Renault","Mercedes","Ford","Ferrari","Maserati");
    }

    public static boolean lengthBrandPredicate(Object brand){
        return ((String)brand).length()>4;
    }

}
