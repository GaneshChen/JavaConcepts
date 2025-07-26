package JavaStreams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Lec140 {

    public static void main(String[] args) {
        String a = "Ball";
        String b = "Delta";
        String c = "Apple";
        String aa;


        Optional<String> opt =  Stream.of(a,b,c).min(Comparator.naturalOrder());

        if(opt.isPresent())
        {
            aa = opt.get();
            System.out.println(aa);
        }

    }
}
