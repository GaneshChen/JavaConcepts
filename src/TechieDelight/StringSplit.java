package TechieDelight;

public class StringSplit {

    public static void main(String[] args) {
        String str = "<html lang=\"en-US\">\n" +
                "<head>\n" +
                "<title>HTML p tag</title>\n" +
                "<meta charset=\"utf-8\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "<meta name=\"Keywords\" content=\"HTML, Python, CSS, SQL, JavaScript, How to, PHP, Java, C, C++, C#, jQuery, Bootstrap, Colors, W3.CSS, XML, MySQL, Icons, NodeJS, React, Graphics, Angular, R, AI, Git, Data Science, Code Game, Tutorials, Programming, Web Development, Training, Learning, Quiz, Exercises, Courses, Lessons, References, Examples, Learn to code, Source code, Demos, Tips, Website\">\n" +
                "<title name=\"Description\" content=\"Well organized and easy to understand Web building tutorials with lots of examples of how to use HTML, CSS, JavaScript, SQL, Python, PHP, Bootstrap, Java, XML and more.\">\n" +
                "<meta property=\"og:image\" content=\"https://www.w3schools.com/images/w3schools_logo_436_2.png\">\n" +
                "<meta property=\"og:image:type\" content=\"image/png\">\n" +
                "<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"/favicon-16x16.png\">";

        String[] abc = str.split("<title>");

        System.out.println(abc[0]);

    }
}
