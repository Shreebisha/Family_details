import models.Children;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n");

        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Singing ");
        hobbies.add("Dancing");
        hobbies.add("Photography");
        hobbies.add("Travelling");
        hobbies.add("Art");

        Children c1 = new Children("Shreebisha", 12, 17, hobbies);

        System.out.println(c1.getFullName());

        System.out.println(c1.getFullName()+" of age "+c1.age+" lives in "+c1.home_address+" and studies in grade "+c1.grade+" and hobbies are:");
        System.out.println(c1.getHobbies());


    }
}