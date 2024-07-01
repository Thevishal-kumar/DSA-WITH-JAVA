
public class addmiddle{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail; 


    public void addFirst(int data){
        //step1 =create new node
        Node newNode = new Node(data);
        if(head ==null){
            head =tail =newNode;
            return;

        }

        //step2 - newNode next = head
        newNode.next  = head; //link

        //step 3 head = newnode
        head = newNode;
    }

    public void addlast(int data){

        Node newNode= new Node(data);
        if(head == null){
            head=tail=newNode;
        }
        tail.next = newNode;
        tail= newNode;
        
    }
    public void print(){
        if(head ==null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;

         }
        System.out.println("null");
    }
        // add middle on LL
    public void add(int idx, int data ){
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;

        while(i< idx-1){
            temp = temp.next;
            i++;
        }

        //i=idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String args[]){
                //  create linked linkedlist
                addmiddle  ll= new addmiddle();
                // ll.print();
                ll.addFirst(1);
                // ll.print();
                ll.addFirst(2);
                // ll.print();
                ll.addlast(3);
                // ll.print();
                ll.addlast(4);
                // ll.print();
                ll.add(2,9);//add data on middle of
                ll.print();
               
    }
}