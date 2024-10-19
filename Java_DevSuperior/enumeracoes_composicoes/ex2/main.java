package ex2;

import java.util.Date;

public class main {
    public static void main(String[] args) {
         String parseMoment = "21/06/2018 13:05:44";
         Date dateMoment = new Date(parseMoment);

         System.out.println(dateMoment.toLocaleString());
         Post p = new Post();
         p.setMoment(dateMoment);
         p.setTitle("Traveling to New York");
         p.setContent("Going visit a new world...");
         p.setLikes(150);

         Comment c1 = new Comment("Nice trip");

        System.out.println(p.getTitle());
        System.out.println(p.getLikes() + " - " + p.getMoment().toLocaleString());
        System.out.println("Comments");
        System.out.println(c1.getText());

    }
}
