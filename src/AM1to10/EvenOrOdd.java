package AM1to10;

public class EvenOrOdd {

    public void evenoddCalculator(int i){

        if(i%2==0)
            System.out.println("This is a Even Number");
        else
            System.out.println("This is a Odd Number");
    }

      public static void main(String[] args) {

               EvenOrOdd evenOrOdd = new EvenOrOdd();
               evenOrOdd.evenoddCalculator(20);
               evenOrOdd.evenoddCalculator(25);

    }
}
