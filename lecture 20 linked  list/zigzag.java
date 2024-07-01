

public class zigzag{

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
  

    public void zigzag(){
        //find middle
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast  = fast.next.next;
        }
        Node mid = slow;
        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next =  prev;
            prev = curr;
            curr = next;

        }

        Node left = head;
        Node right  = prev ;
        Node nextL, nextR;

        ////alt merge
        while(left !=null && right !=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next =nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String args[]){
        
               zigzag ll = new zigzag();
              ll.addlast(1);
              ll.addlast(2);
              ll.addlast(3);
              ll.addlast(4);
              ll.addlast(5);
              
              ll.print();
              ll.zigzag();
              ll.print();
               
    }
}