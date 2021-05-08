import java.util.Scanner;
class q11

{
  public static void main (String args[])
  
 {
 Scanner sc= new Scanner(System.in);
  
System.out.println("Enter the radius");
 double a = sc.nextDouble();
  
double b = (Math.PI * a* a);

double c = (2 * Math.PI * a);
  
  System.out.println("area is "+b);
  
 System.out.println("perimeter is "+c);
 
 }
 }