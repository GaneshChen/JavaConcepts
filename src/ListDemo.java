import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {

        public static void main(String[] args) {

            ArrayList<String> L1= new ArrayList<String>();
            L1.add("hi");
            L1.add("How are you");
            L1.add("Good Morning");
            L1.add("bye");
            L1.add("Good night");

            ArrayList<String> L2= new ArrayList<String>();
            L2.add("Howdy");
            L2.add("Good Evening");
            L2.add("Honda");
            L2.add("bye");
            L2.add("Good night");

            L1.removeAll(L2);
            System.out.println(L1);

            System.out.println("****************");
        }
}
