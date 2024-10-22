package ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post post1 = new Post();
        Post post2 = new Post();

        post1.setMoment(sdf.parse("21/06/2018 13:05:44"));
        post1.setTitle("Traveling to new Zealand");
        post1.setContent("I'm goingo to visitthis wonderful country");
        post1.setLikes(12);
        post1.addComment("Have a nice trip!!");
        post1.addComment("Wow, that's aewsome!!");
        System.out.println(post1.toString());

        post2.setMoment(sdf.parse("28/07/2018 23:14:19"));
        post2.setTitle("Good Night guys!!");
        post2.setContent("See you tomorrow!!");
        post2.setLikes(5);
        post2.addComment("Good night!!");
        post2.addComment("May the force with you");
        System.out.println(post2.toString());

    }
}
