public class LinkedList_Basics {
    public static void display(node head){
        node temp = head.next;
        while(temp != null){
            System.out.println(temp.data
    public static void main(String[] args) {
        node a = new node(5);
        System.out.println(a.next);
        node b = new node(4);
        node c = new node(7);
        node d = new node(8);
        node e = new node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        System.out.println(a.next);
        display(a);
    }

}
