package collection;

import data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Arip");

        person.addHobby("Game");
        person.addHobby("Coding");

        doSomethingWithHobbies(person.getHobbies());
        for (var hobby : person.getHobbies()){
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        // list person hoobies sudah keluar terus di tambah
        // biar tidak bisa ditambah/dirubah list dibuat immutable / Collection.unmodifiableList()
        hobbies.add("Bukan hobby");
    }
}
