package DataStructures;


import java.util.List;

public class ArrayList {

public static void main(String[] args){

    // Creating an ArrayList
   List<Integer> arrayList = new ArrayList<>();

    // Adding elements
    arrayList.add(10);
    arrayList.add(20);
    arrayList.add(30);

    // Accessing elements
    System.out.println("Element at index 1: " + arrayList.get(1));

    // Modifying elements
    arrayList.set(1, 50);

    // Iterating through elements
    for (Integer num : arrayList) {
        System.out.println(num);
    }
}
}
    

