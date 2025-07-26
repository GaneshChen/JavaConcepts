package AM31to40;

public class LargestOf3 {
    public static void main(String[] args) {
        double n1 = -4.5, n2=3.9, n3=2.5;

        if(n1>=n2 && n1>=n3)
            System.out.println(n1+ " N1 is the largest Number");
        else if (n2>=n1 && n2>=n3)
            System.out.println(n2+ " N2 is the largest Number");
        else
            System.out.println(n3+ " N3 is the largest Number");

        }
    }

