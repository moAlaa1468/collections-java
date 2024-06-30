package collectionAndHashSet;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIterator {


    //This is the first function to Iterate over the ArrayList
    // This is the first function
    public static void loopingOverArrayList(ArrayList<Integer> numbers) {
        Iterator numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            Integer number = (Integer) numberIterator.next();
            System.out.println(number);
        }

    }

    //This is the first function to Iterate over the ArrayList
    // This is the second function
    //This is the same Task uaAmer
    public static void loopingOverUsingFor(ArrayList<Integer> numbers) {
        for (Integer element : numbers) {
            System.out.println(element);
        }
    }

    public static void loopingOverUsingForEach(ArrayList<Integer> numbers) {
        numbers.forEach(
                (element) -> {
                    System.out.println(element);
                }
        );
    }



        public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(12);
        numbers.add(77);
        numbers.add(77);
        numbers.add(12);
        numbers.add(77);
        numbers.add(66);
        numbers.add(98);
        numbers.add(653);
        numbers.add(98);
        numbers.add(9764);
        numbers.add(98);

        /*
         * ينفع انك تعمل ريفرينس من ال انترفيس بس مش نافع اوجيكت
         * مثال
         * دالة ال [Iterator] هتخرج عندي كلاس من نوع اي مش عارف المهم ان النوع دا بيعمل [implement to Collection Interface]
         * */
//        Iterator numberIterator = numbers.iterator();
//        while (numberIterator.hasNext()) {
//            Integer number = (Integer) numberIterator.next();
//            System.out.println(number);
//        }

            System.out.println("=============");
            loopingOverUsingForEach(numbers);
    }
}
