package SortingObjectInArrayList;

import collectionAndHashSet.CollectionIterator;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class sortingObjectsArrayList {

//   الفكرة كلها هنا يا لول
    public static class Person implements Comparable<Person> {
        String name;
        int id;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


//       لازم تروح تعمل الدالة دي
        @Override
        public int compareTo(Person o) {
            return this.name.compareTo(o.name)  ;
//            return this.name.compareTo(o.name) * -1 ;  // This would be in reverse Order
        }
    }


   // we need to make function to create ArrayyList of Persons
    public static void addingObjectsToArrayList(){
       Person p=new Person("Aly"); //p repesents the one object in the heap
        ArrayList<Person> persons=new ArrayList<>();
        persons.add(p);
        p.setName("Ibrahim"); //
        persons.add(p); // This add another Object copy of the old object
        // كدا انت روحت ضفت ال اوبجيكت مرتين في ال  ليست
        System.out.println(persons);
        persons.forEach(
                (element) -> {
                    System.out.println(element.getName());
                }
        );

    }
    public static void main(String[]args){
//       addingObjectsToArrayList();
        ArrayList<Person> personList=new ArrayList<Person>();
        personList.add(new Person("Omar"));
        personList.add(new Person("Ola"));
        personList.add(new Person("Potter"));
        personList.add(new Person("Alaa"));
//        The idea each Person in the list will compare itself with next person
        Collections.sort(personList);
        personList.forEach(
                (ele)-> System.out.println(ele.name)
        );
    }
}
