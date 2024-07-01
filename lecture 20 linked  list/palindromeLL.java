public class palindromeLL{

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
    public static int size;


    public void addFirst(int data){
        //step1 =create new node
        Node newNode = new Node(data);
        size++;
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
        size++;
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
    public void add(int idx, int data ){;
        Node newNode = new Node(data);
        size++;
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

        // SLOW FAST AAPROACH FOR MIDDLE
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;//+1
            fast = fast.next.next; //+2

        }
        return slow; //slow is my middle
    }
    
    public boolean checkpalindrome(){
        if(head == null || head.next == null){
           return  true;
        }
        //step1 find mid
        Node midNode = findMid(head);
        //step2 reverse half part
        Node prev = null;
        Node curr = midNode;
        Node next;
         while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
         }
         Node right = prev;
         Node left = head;
        //step 3 check left part == right part
        while(right !=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
        public static void main(String args[]){
                //  create linked linkedlist
                palindromeLL ll= new palindromeLL();
                
                ll.addlast(1);
                ll.addlast(2);
                ll.addlast(1);
                // ll.addlast(1);
                
                ll.print();
                System.out.println(ll.checkpalindrome());
            
               
              
                 
                
                

               
               
               
                
               
    }
}



