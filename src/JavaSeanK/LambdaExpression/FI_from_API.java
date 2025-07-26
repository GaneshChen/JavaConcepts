package JavaSeanK.LambdaExpression;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FI_from_API {
    public static void main(String[] args) {
            FI_from_API fiFromApi = new FI_from_API();
            //fiFromApi.predicate();
            //fiFromApi.supplier();
            //fiFromApi.consumer();
            //fiFromApi.function();
            fiFromApi.unaryBinaryOperator();
    }

    public void predicate(){

        Predicate<String> pstr = s->s.contains("City");
        System.out.println(pstr.test("Hallowen City"));

        BiPredicate<String,Integer> checkLength = (str,len)-> str.length()==len;
        System.out.println(checkLength.test("Vatican City",8));
    }

    public void supplier(){
        Supplier<StringBuilder> supplier = () -> new StringBuilder();
        System.out.println(supplier.get().append("SK"));

        Supplier<LocalTime> suptime = () -> LocalTime.now();
        System.out.println(suptime.get());

        Supplier<Double> random = () ->Math.random();
        System.out.println(random.get());

    }

    public void consumer(){
        Consumer<String> print = s-> System.out.println(s);
        print.accept("This is a Consumer Example");

        List<String> names = new ArrayList<>();
        names.add("John");names.add("Mary");
        names.forEach(print);

        System.out.println("***Before BiConsumer Example***");
        Map<String,String> mapCapitalCities = new HashMap<>();

        BiConsumer<String,String> biConsumer = (key,value) -> mapCapitalCities.put(key,value);
        biConsumer.accept("Dublin","Ireland");
        biConsumer.accept("Washington D.C","USA");
        System.out.println(mapCapitalCities);

        BiConsumer<String,String> mapPrint = (key,value) ->
                System.out.println(key+" is the capital of: "+ value);

        mapCapitalCities.forEach(mapPrint);

    }

    public void function(){
        Function<String,Integer> fn2 = s->s.length();
        System.out.println(fn2.apply("Moscow"));

        BiFunction<String,String,Integer> biFunction = (s1,s2) -> s1.length()+s2.length();
        System.out.println(biFunction.apply("William","Shakespeare"));

        BiFunction<String,String,String> biFunction1 = (s1,s2) ->s1.concat(s2);
        System.out.println(biFunction1.apply("Hello","World"));
    }

    public void unaryBinaryOperator(){
        UnaryOperator<String> unaryOperator = name -> "My Name is: "+name;
        System.out.println(unaryOperator.apply("Sean"));

        BinaryOperator<String> binaryOperator = (s1,s2) -> s1.concat(s2);
        System.out.println(binaryOperator.apply("William ","Shakespeare"));
    }

}
