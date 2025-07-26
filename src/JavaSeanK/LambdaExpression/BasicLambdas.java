package JavaSeanK.LambdaExpression;
interface I{
    void m();
}
public class BasicLambdas {

    public static void main(String[] args) {

        I i = new I() {
            @Override
            public void m() {
                System.out.println("Prior to Java8 --> I::M");
            }
        };

        i.m();

        I lambda = () -> System.out.println("From Jaa 8 -> Lambda Version");

        lambda.m();
    }

}
