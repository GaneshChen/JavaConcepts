package DSNandy.BeginnerMath;

public class Divisors_22 {

    public static void getNumber(int m){
        for (int i=1; i<=m ; i++){
            if(m%i==0){
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args) {

        System.out.print("The divisors of 100 are : ");
                getNumber(100);

    }
}
