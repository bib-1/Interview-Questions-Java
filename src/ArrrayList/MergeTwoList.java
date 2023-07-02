package ArrrayList;

import java.util.ArrayList;

public class MergeTwoList {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(4);

        ArrayList l2 = new ArrayList<Integer>();
        l2.add(2);
        l2.add(6);

        ArrayList mergedList = new ArrayList<>(l1);

        mergedList.addAll(l2);

        System.out.println(mergedList.toString());
    }
}
