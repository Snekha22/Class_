package Factorial;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

System.out.println("Enter a Num:");

int n=scan.nextInt();
int k, fact=1;

for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println( "factorail of number is:" + fact );
	}

}
