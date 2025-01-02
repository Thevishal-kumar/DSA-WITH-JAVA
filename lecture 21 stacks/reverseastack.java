import java.util.Stack;

public class reverseastack {
     public static void pushAtBottom(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        System.out.println("push-stack"+" "+" "+s);
        int top = s.pop();
          System.out.println("push-After pop"+" "+top +" "+s);
        pushAtBottom(s, data);
          System.out.println("push-after push at bottom"+" "+top+" "+s);
        s.push(top);
    }


    public static void reverseStack(Stack<Integer>s ) {
        if(s.isEmpty()){
            return;
        }
        System.out.println("stack"+" "+" "+s);
        int top = s.pop();
        System.out.println("After pop"+" "+top +" "+s);
        reverseStack(s);
        System.out.println("after reverse"+" "+s);
        pushAtBottom(s, top);
         System.out.println("after push at bottom"+" "+top+" "+s);
    }

    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
        public static void main(String args[]){
            Stack<Integer> s =new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
            //3,2,1
            reverseStack(s);
            printStack(s);
            // 1,2,3

        }

    }

