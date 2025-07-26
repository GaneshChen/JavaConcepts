package AM1to10;

public class Vowelconsonant {

    public static void main(String[] args) {
        char ch = 'z';

        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowels");
                break;

            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a Vowels");
                break;

            default:
                System.out.println(ch + " is a consonants");
        }
    }
}
