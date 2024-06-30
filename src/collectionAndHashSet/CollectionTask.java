package collectionAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTask {
    /*
     * How to remove duplicated values from Arraylist
     *
     * الجزء الاهم ان ال hashSet لا تسمح بالتكرار
     * */
    public static ArrayList<Integer> removeDuplicatedValues(ArrayList<Integer> numbers) {
        HashSet<Integer> hashSet = new HashSet<>();
        Iterator<Integer> result = numbers.iterator();
        while (result.hasNext()) {
            hashSet.add(result.next());
        }
        ArrayList<Integer> tempArrayList = new ArrayList<>();
        for (Integer ele : hashSet) {
            tempArrayList.add(ele);
        }

        return tempArrayList;
    }

    public static ArrayList<Integer> removeDuplicated(ArrayList<Integer> numbers) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(numbers);
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.addAll(hashSet);
        return numbersList;
    }

    public static ArrayList<Integer> removeDuplicatedTwoLines(ArrayList<Integer> numbers) {
        HashSet<Integer> numbersSet = new HashSet<>(numbers);
        ArrayList<Integer> numbersList = new ArrayList<>(numbersSet);
        return numbersList;
    }

    public static ArrayList<Integer> removeDuplicatedOneLine(ArrayList<Integer> numbers) {
        return new ArrayList<>(new HashSet<>(numbers));
    }


    // we need to make function to iterator over ArrayList or sets
    public static void displayArrayListElements(ArrayList<Integer> arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
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
//        ArrayList<Integer> removedDuplicatedValues = removeDuplicatedValues(numbers);
//        System.out.println(removedDuplicatedValues);
//        System.out.println("================= This is another way to remove duplicated values");
//        ArrayList<Integer> result = removeDuplicated(numbers);
//        displayArrayListElements(result);
//        System.out.println("============ Another way to remove duplicated Values==================");
//        displayArrayListElements(removeDuplicatedTwoLines(numbers));
        System.out.println("============ Another way to remove duplicated Values==================");
        displayArrayListElements(removeDuplicatedOneLine(numbers));
    }
}
