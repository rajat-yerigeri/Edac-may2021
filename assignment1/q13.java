
/*
13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

class q13
{
public static void main(String args[])
{

double i = 5.6;
double j = 8.5;
double a=2;
double k=i*j;
double l=a*(i+j);

System.out.println(" Area is"+i+"*"+j+"="+k);
System.out.println(" Perimeter is"+a+"*"+"("+i+"+"+j+")"+"="+l);
}
}