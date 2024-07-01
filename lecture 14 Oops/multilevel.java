public class multilevel {
    public static void main(String args[]){
   Dog dobby = new Dog();
   dobby.eat();
   dobby.legs = 4;
    System.out.println(dobby.legs);
    }
}



class Animal {
    String color;

    void eat(){
    System.out.println("eats");
}


    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk(){
        System.out.println("walks");
    }
    int legs;
}


class Fish extends Animal {
    void swim(){
        System.out.println("swim");
    }
    int legs;
}


class Birds extends Animal {
    void fly(){
        System.out.println("fly");
    }
    int legs;
}


class Dog extends Mammal{
    String breed;
}

