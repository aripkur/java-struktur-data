package collection;

import data.Person;
import data.PersonComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Arip"));
        people.add(new Person("bbb"));
        people.add(new Person("cccc"));

        for (var person : people){
            System.out.println(person.getName());
        }
    }
}
