
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {	
		String description;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Search: ");
		while(scanner.hasNext()) {
			System.out.print("Search: ");
			String word = scanner.nextLine();
			description = CoreCourses.valueOf(word).getDescription();
			System.out.println(description);
		}			
		
		scanner.close();	
	}

}
