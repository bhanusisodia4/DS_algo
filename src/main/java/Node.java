public class Node {
    int data;
    Node next;

    private static void print(Node head){
        Node temp = new Node();
        temp=head;
        while(temp!=null) {
            System.out.print(" "+temp.data);
            temp= temp.next;
        }
    }
    private static Node insertAtStart(Node head,int data){
        Node temp = new Node();
        temp.data=data;
        temp.next= head;
        return  temp;
    }

    private static Node insertAtLast(Node head, int data) {
        Node temp = new Node();
        Node temp2 = new Node();
        temp2 = head;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = temp;
        temp.data = data;
        return head;
    }
    private static void middleIndex(Node head){
        Node slow = new Node();
        Node fast = new Node();
        Node prev = new Node();

        slow=head;
        fast=head;

        while(fast!=null&& fast.next!=null){
            prev=slow;
            slow= slow.next;
            fast= fast.next.next;
        }
        if(fast==null){
            System.out.println("linked list is even: "+prev.data+" "+slow.data);
        }
        else{
            System.out.println("Linked list is odd: "+slow.data);
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
        System.out.println();
       Node head= insertAtStart(first,44);
        print(head);
        System.out.println();
       head= insertAtLast(head,33);
       print(head);
        System.out.println();

        middleIndex(head);

    }
}
