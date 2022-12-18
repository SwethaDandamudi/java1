import java.lang.*;
import java.util.Scanner;
class Test
{
  String name;
  int age;
  int roll;
  void read()
  {
    System.out.println("enter details:");
    Scanner s=new Scanner(System.in);
    name=s.next();
    age=s.nextInt();
    roll=s.nextInt();
  }
  void Display()
  {
     System.out.println("name= "+name+"age= "+age+"roll= "+roll);
  }
  public static void main(String args[])
  {
    Test obj1=new Test();
    obj1.read();
    obj1.Display();
  }
}
     
