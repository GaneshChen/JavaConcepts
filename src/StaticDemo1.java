public class StaticDemo1 {

    static void f1(){
        System.out.println("Hello");
    }
    void f2(){
        f1();
    }

    public static void main(String[] args) {
        StaticDemo1 s = new StaticDemo1();
        s.f2();
    }

}
