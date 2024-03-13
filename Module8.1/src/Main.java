import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    static class Person{
        String name;
        int age;
        String city;
        public Person(String name, int age, String city){
            this.name = name;
            this.age = age;
            this.city = city;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public String getCity(){
            return city;
        }
    }
    static void listPrinter(ArrayList<Person> persons) {
        System.out.printf("%-8s %-8s %-8s\n", "Name", "Age", "City");
        for (Person p : persons)
            System.out.printf("%-8s %-8d %-8s\n", p.getName(), p.getAge(), p.getCity());
        System.out.println();
    }

    public static void main(String[] args) {
        // TASK 1: LIST OR PEOPLE
        // List of persons:
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 30, "New York"));
        persons.add(new Person("Alice", 25, "Boston"));
        persons.add(new Person("Bob", 35, "New York"));
        persons.add(new Person("Eve", 20, "Boston"));
        persons.add(new Person("Tom", 40, "New York"));
        persons.add(new Person("Sue", 22, "Boston"));
        persons.add(new Person("Ann", 28, "New York"));
        persons.add(new Person("Sam", 33, "Boston"));
        System.out.println("Original list of persons:");
        listPrinter(persons);

        // Use lambda to sort persons by age with the comparator interface:
        persons.sort(Comparator.comparing(Person::getAge));
        System.out.println("Sorted list of persons by age:");
        listPrinter(persons);

        // Use lambda to filter only persons from Boston:
        Predicate<Person> predicate = p -> p.getCity().equals("Boston");
        persons.removeIf(predicate.negate());
        System.out.println("Filtered list of persons from Boston:");
        listPrinter(persons);


        // TASK 2: ARRAY OF INTEGERS
        // Array of integers:
        Integer[] numlist = {10, 5, 8, 20, 15, 3, 12, 18, 25, 30};
        System.out.println("Original array of integers: " + Arrays.toString(numlist));

        // Remove even numbers:
        numlist = Arrays.stream(numlist).filter(n -> n % 2 != 0).toArray(Integer[]::new);
        System.out.println("Array of odd numbers: " + Arrays.toString(numlist));

        // Double
        


    }
}
