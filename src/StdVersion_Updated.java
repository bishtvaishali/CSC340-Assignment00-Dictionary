import java.util.ArrayList;
import java.util.Scanner;

public class StdVersion_Updated {

	public static void main(String[] args) {
		
		Dictionary dict = new Dictionary();
		ArrayList<String> array = new ArrayList<>();
		Word word;
		
		dict.init();
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("-----DICTIONARY 340 Standard-----\n\nSearch:");

		while(scanner.hasNextLine()) {			
			String value = scanner.nextLine();
			if(value.toLowerCase().equals("!q")) {
				System.out.println("-----THANK YOU-----");
				break;
			}

			System.out.println("|");

			if(value.length() != 0) { // For every null value entered, prompt user to "enter word"
				try {					
					word = Word.valueOf(value.toUpperCase());
					array= dict.dictMap.get(word);				
					for(String arr : array) {
						System.out.println(word.name() + ": "+ arr);						
					}			
				}catch(Exception e) {
					System.out.println("<Not found>");
				}	
			}
			else {			
				System.out.println("Enter word");
			}

			System.out.print("|\nSearch:");
		}			

		scanner.close();	
	}
		
	}
	
