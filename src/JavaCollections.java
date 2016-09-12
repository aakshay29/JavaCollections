import java.util.Scanner;
import java.util.Collections; 
import java.util.ArrayList;

public class JavaCollections {
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Please enter movie names. Type 'Done' when done.");
		ArrayList<String> movieList = new ArrayList<String>();
		for(int i = 0; i < 100; i++){
			System.out.println("Enter Movie Name: ");
			String input = sc.nextLine();
			if(input.equalsIgnoreCase("Done")){
				break;
			}
			else{
				movieList.add(input); 
			}
		}
		Collections.sort(movieList); 
		for (String temp:movieList) { 
		    System.out.println(temp); 
		}

	}

}
