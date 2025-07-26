public class JavaInterview {

    public static void main(String[] args) {

        String str = "<body> <h1>  This is a heading</h1> <p>   This is a paragraph.   </p> </body>";

        int beginning = str.indexOf("<p>");
        int end =str.indexOf("</p>");

        System.out.println(beginning+ " "+end);
        System.out.println(str.substring(beginning+3,end).trim());

    }
}
