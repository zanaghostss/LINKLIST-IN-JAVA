public class LinkedList {
    Node head;

    // + br enteha

    public void append(int data){
        if (head==null){
            head=new Node(data);
            return;
        }
        Node current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=new Node(data);
    }

    //+ be ebteda
    public void prepend(int data){
        Node newHead=new Node(data);
        newHead.next=head;
        head=newHead;
    }

    // delete yek greh ba meghdar moshaxas

    public void deletwithVAlue(int data){
        if (head==null)return;

        if (head.data==data){
            head=head.next;
            return;
        }
        Node current=head;
        while (current.next!=null){
            if (current.next.data==data){
                current.next=current.next.next;
                return;
            }
            current=current.next;
        }

    }

    public void printList(){
        Node currrent=head;
        while (currrent!=null){
            System.out.print(currrent.data+"->");
            currrent=currrent.next;
        }
        System.out.println("null");
    }

}
