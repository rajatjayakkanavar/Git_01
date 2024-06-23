import java.util.ArrayList;
//import java.util.Scanner;

import org.testng.annotations.Test;
public class Adder {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
public void rajat() {
			ArrayList<String> names = new ArrayList<String>();

			names.add("Abhijeeta");
			names.add("Rajat");
			names.add("Don");
			names.add("Ram");
			names.add("Adam");
			names.add("Abdhul");

			Long D = names.stream().filter(s -> s.startsWith("A")).count();
			System.out.println(D);
	}
	  }
//}

