

public class LinkedList2{

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
    
    public static void main(String args[]){
                //  create linked linkedlist
                LinkedList2  ll= new LinkedList2();
                // ll.print();
                ll.addFirst(1);
                // ll.print();
                ll.addFirst(2);
                // ll.print();
                ll.addlast(3);
                // ll.print();
                ll.addlast(4);
                ll.print();
              
               
               
    }
}