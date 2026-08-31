import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Reverse_List {

    static void reverselist(ArrayList<Integer> list ) {
        int i = 0; int j =list.size()-1;
        while(i < j)
        list.add(5);
        list.add(22);
        list.add(10);

        System.out.println("Original List "+list);
        Collections.reverse(list);
        System.out.println("Reverse List "+list);
        Collections.sort(list);
        System.out.println("Ascending Order "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending Order "+list);
    }

}
