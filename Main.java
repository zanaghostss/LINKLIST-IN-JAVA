public class Main {
    public static void main(String[] args) {

        LinkedList list=new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);

        list.printList();

        list.prepend(0);

        list.deletwithVAlue(2);

        list.printList();
    }
}