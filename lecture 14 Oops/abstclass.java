public class abstclass {
     public static void main(String args[]){
            //  Horse h= new Horse();
            //  h.eat();
            //  h.walk();
            // System.out.println(h.color);
             

            //  Chicken c= new Chicken();
            //  c.eat();
            //  c.walk();


            Mustang myhorse=new Mustang();
            
    }
}

abstract class Animal{
    String color;


Animal(){
    System.out.println("animal constructor is called");
}
    void eat(){
        System.out.println("animals eats");
    }

    abstract void walk();   //abstract method
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor is called");
    }
    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
   Mustang(){ System.out.println("mustang constructor is called");}
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}