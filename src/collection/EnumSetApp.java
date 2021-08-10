package collection;

import java.util.EnumSet;

public class EnumSetApp {
    public static enum Gender{
        MALE, FEMALE
    }

    public static void main(String[] args) {
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        for (var value : genders){
            System.out.println(value);
        }

//        Gender[] values = Gender.values();

//        for (var value : values) {
//            System.out.println(value);
//        }
    }
}
