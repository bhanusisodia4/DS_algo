public class Node {
    int data;
    Node next;

    private static void print(Node temp){
        while(temp!=null) {
            System.out.println(temp.data);
            temp= temp.next;
        }
    }

    public static void main(String[] args) {
        Node first = new Node();
        first.data=1;
        first.next= null;

        Node second = new Node();
        second.data=2;
        second.next=null;

        first.next=second;

        Node third = new Node();
        third.data=3;
        third.next= null;

        second.next= third;

        print(first);
    }
}
