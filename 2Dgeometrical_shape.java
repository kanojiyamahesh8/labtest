import java.util.Scanner;
abstract class 2Dgeometrical_shape
{
String shape;
double perimeter;
double area;
public abstract void perimeter_cal();
}

class circle extends 2Dgeometrical_shape
{
public void perimeter_cal()
{
System.out.println("Enter the radius");
Scanner mk=new Scanner(System.in);
double radius=scan.nextDouble();
perimeter=2*3.14*radius;
}
}

class square extends 2Dgeometrical_shape
{
public void perimeter_cal()
{
System.out.println("Enter the side");
Scanner mk=new Scanner(System.in);
double side=scan.nextDouble();
area=side*side
}
}
class labclassdemo
{
	public static void main(String args[])
	{ 
	System.out.println("Enter the 2D shape")
	2Dgeometrical sh=new 2Dgeometrical shape();	
	Scanner mk=new Scanner(System.in);
	sh.shape=mk.nextLine();
	switch(sh.shape)
	{
		
	}
	
	
	}
}
