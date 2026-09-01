import java.util.ArrayList;
class Methods_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(7);
        l1.add(9);

        System.out.println("get an element at index i");
        System.out.println(l1.get(1));
        System.out.println("print with loop");
        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
        System.out.println("printing the array list directly");
        System.out.println(l1);
        System.out.println("adding element at some index i");
        l1.add(1,100);
        System.out.println(l1);
        System.out.println("modifying element at index i");
        l1.set(1,10);
        System.out.println(l1);
        System.out.println("Removing an element e");
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);
        System.out.println("Checking If An Element Exist");
        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println(ans);

        System.out.println("if you dont specify,you can put anything inside it");
        ArrayList l = new ArrayList();
        l.add(98);
        l.add("PQRS");
        l.add(12);
        System.out.println(l);
    }
}
