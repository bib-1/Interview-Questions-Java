package LinkedList;

public class LinkedList {

    public static void main(String[] args) {

        java.util.LinkedList<Integer> ll = new java.util.LinkedList<>(); //create
        ll.add(1);
        ll.add(2);
        ll.add(5);
        ll.add(4);

        System.out.println(ll);

        //First Operation
        ll.addFirst(0);
        ll.addLast(100);

        System.out.println("After 1st operation: "+ ll);

        //Second Operation -delete
        int index = ll.indexOf(1);
        ll.remove(index);

        System.out.println("After Second Operation: "+ ll);

        //Third operation -add
        ll.add(1, 1);

        System.out.println("After Third Operation: "+ ll);


        //Fourth Operation - update
        ll.set(0, -1);

        System.out.println("After Fourth Operation: "+ ll);


        //Fifth Operation
        ll.clear();

        System.out.println("After Fifth Operation: "+ ll);


    }
}
