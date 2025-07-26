import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.size();
        list.toArray();
        list.get(2); // Accessing the element at index 2
        list.set(2, 35); // Changing the element at index 2 to
        // 35
        list.remove(2); // Removing the element at index 2     
        list.add(2, 25); // Adding 25 at index 2
        list.contains(30); // Checking if 30 is in the list
        list.indexOf(40); // Getting the index of 40
        list.lastIndexOf(50); // Getting the last index of 50
        list.clear(); // Clearing the list  
        list.isEmpty(); // Checking if the list is empty
        list.add(30); // Adding 30 back to the list
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer val = it.next();
            if (val == 30) {
                it.remove(); // Remove the element 30
            }
        }

    }
}
