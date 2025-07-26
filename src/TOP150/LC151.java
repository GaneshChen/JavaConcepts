package TOP150;

public class LC151 {

    public static void main(String[] args) {
        String str = "a good   example";
        String[] words = str.split("\\s+");
        StringBuilder newStr= new StringBuilder();
        for(int i = words.length-1; i>=0 ;i--){

            if(!(words[i].equals("\\s"))){
                newStr.append(words[i]).append(" ");
            }

        }

        System.out.println(newStr.toString().trim());
    }

}