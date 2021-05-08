import java.util.Scanner;
class q17

{
  public static void main (String args[])
  
 {
 Scanner in= new Scanner(System.in);
  
System.out.println("Enter the decimal");
 int num = in.nextInt();
  
String b = "";
int t = num;
while(t>0)
{

  int r = t%2;
  t= t/2;
  b= r + b;
}
  System.out.println("binary equi of " +num+ " is " +b);
  
 
 }
}