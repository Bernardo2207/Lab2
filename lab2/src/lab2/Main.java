package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		System.out.println("Enter how many request you want to handle:");
		Scanner sc= new Scanner(System.in);

		int n=sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		while(n>0) {
		System.out.println("(1) put # at the end of ArrayLIst" );
		System.out.println("(2) remove all # from ArrayLIst" );
		System.out.println("(3) print the size of ArrayList\n" );
		System.out.println("Select Option:");
		int option=sc.nextInt();
		
		while(option<1||option>3) {
		System.out.println("Select Option(between 1-3):");
		option=sc.nextInt();
		}
		
		
			switch(option) {
			
			case 1 : 
				System.out.println("Enter the number you want to add:");
				int number= sc.nextInt();
				list.add(number);
				n--;
				break;
			case 2:
				System.out.println("Enter the number you want to remove from the list:");
				number=sc.nextInt();
				for(int i=0;i<list.size();i++) {
					if(number==list.get(i)) {list.remove(i);}
				}
				n--;
				break;
			case 3 :
				System.out.println("The Array Size is --->"+list.size());
				n--;
				break;
			}
			System.out.println("THE PROGRAM HAS COMPLETED YOUR N REQUEST.");
		}

	}
}
