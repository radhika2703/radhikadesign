import java.util.*;
class op
{
public double add(double x,double y)
{
	return x+y;
}
public double sub(double x,double y)
{
	return x-y;
}
public double mult(double x,double y)
{
	return x*y;
}
public double div(double x,double y)
{
	return x/y;
}
	
}
public class cal
{
	public static void main(String[] args)
	{
	int ch;
	double num1,num2,ans;
	op o=new op();
	for(;;)
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Operation to Perform\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");
	ch=sc.nextInt();
	
	{
	System.out.println("Enter numbers");
	num1=sc.nextDouble();
	num2=sc.nextDouble();
	}
	
	switch(ch)
	{
		case 1:ans=o.add(num1,num2);System.out.println(ans);
		break;
		case 2:ans=o.sub(num1,num2);System.out.println(ans);
		break;
		case 3:ans=o.mult(num1,num2);System.out.println(ans);
		break;
		case 4:ans=o.div(num1,num2);System.out.println(ans);
		break;
		case 5:System.exit(0);
	}
	
	
	}
}
}