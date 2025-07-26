package JavaSeanK.LambdaExpression;

import java.util.function.Predicate;

interface Evaluate<T>{
    boolean isNegative(T t);
}
public class TestPredicate {
    public static void main(String[] args) {

        Evaluate<Integer> lambda = i-> {
            return i<0;
        };
        System.out.println(lambda.isNegative(-4));
        System.out.println(lambda.isNegative(1));

        System.out.println("*******************");

        Predicate<Integer> predicate = i-> i<0;
        System.out.println(predicate.test(-7));
        System.out.println(predicate.test(25));

        System.out.println("*******************");
        System.out.println(check(6,n->n%2 ==0));

        System.out.println("Starts With*******************");
        System.out.println(check("Mr. Clarke",s->s.startsWith("Mr")));
    }

    public static <T> boolean check(T t, Predicate<T> lambda){
           return lambda.test(t);
    }
}
