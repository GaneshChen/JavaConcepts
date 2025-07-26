package AM21to30;

public class ReverseString26 {

    public static void main(String[] args) {
        String s = "United States of America";
        String nstr="";
        char ch;

        for (int i = s.length()-1;i>=0;i--)
        {
            ch = s.charAt(i);
            nstr=nstr+ch;
        }
        System.out.println(nstr);
    }
}
