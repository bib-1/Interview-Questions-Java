package LinkedList;

public class Main {
    public static void main(String[] args) {

        Node<Integer> head = buildNode(8);
        Node<Integer> nodeA = buildNode(12);
        Node<Integer> nodeB = buildNode(19);
        Node<Integer> nodeC = buildNode(3);
        Node<Integer> tail  = buildNode(2);

        head.setNext(nodeA);
        nodeA.setNext(nodeB);
        nodeB.setNext(nodeC);
        nodeC.setNext(tail);

        printLinkedList(head);

        deleteMiddleNode(head);

        printLinkedList(head);

        deleteMiddleNode(head);

        printLinkedList(head);

        deleteMiddleNode(head);

        printLinkedList(head);
    }
    public static Node<Integer> buildNode(int data){
        Node node = new Node();
        node.setData(data);
        node.setNext(null);
        return node;
    }

    public static Node deleteMiddleNode(Node head){
        Node fastNode = head;
        Node slowNode = head;
        Node prviousNode = null;

        //fastNode reaches the last node
        //slowNode reaches the middle node
        //previousNode reaches the node before the middle node
        while (fastNode != null && fastNode.getNext() != null){
            fastNode = fastNode.getNext().getNext();
            prviousNode = slowNode;
            slowNode = slowNode.getNext();
        }

        //Deleting the middle node by skipping slowNode after previousNode
        prviousNode.setNext(slowNode.getNext());

        return head;
    }

    public static void printLinkedList(Node head){
        while(head !=null){
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
        System.out.println();
    }



}
