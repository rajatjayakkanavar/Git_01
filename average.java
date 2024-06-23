import java.util.Scanner;
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p,r,t, sinterest;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the principal amount: ");
		p=scan.nextFloat();
		System.out.println("enter the time interest for yea: ");
	    r=scan.nextFloat();
		System.out.println("enter the rete of thetime period in year: ");
	    t =scan.nextFloat();
		scan.close();
		sinterest=(p*r*t)/100;
	    System.out.println("simple interest is: "+ sinterest);


		
		

	}

}
