public class oops{
    public static void main(String args[]){
          Pen p1 = new Pen();
          p1.setColor("blue");
          System.out.println(p1.color);
        //   p1.setColor("yellow"); //call the function
          p1.color = "yellow";
          System.out.println(p1.color);


          BankAccount myAcc = new BankAccount();
          myAcc.username = "abcd";
          
          
    }

}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class BankAccount{
   public String username ;
  private String password;
}

class Student{
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int math)
{
    percentage = (phy + chem +math)/300 *100;

}}