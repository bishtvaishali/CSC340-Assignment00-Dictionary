import java.util.Scanner;

public enum StdVersion {

	CSC210(" Intro to Java., To learn Java., Comfortable with Objects and Classes., Ready for CSC 220."),

	CSC220( " Data Structures., Ready to create complex data structures., To create data structures."),

	CSC340( " = C++ version of CSC210 + CSC220 + more, A CS upper division course., Many hours outside of class."),

	CSC413(),

	BOOK( " A set of pages., To arrange something on a particular date."),

	BOOKABLE(" Can be ordered."),

	BOOKBINDER(" A person who fastens the pages of books."),

	BOOKCASE(" A piece of furniture with shelves.");


	private String description;

	private StdVersion() {
	}

	private StdVersion(String description) {
		this.description = description;	
	}

	public String getDescription() {
		return description;
	}

	public static void main(String[] args) {	
		String description = null;
		StdVersion courses;
		Scanner scanner = new Scanner(System.in);
		System.out.print("-----DICTIONARY 340 Standard-----\n\nSearch:");

		while(scanner.hasNextLine()) {			
			String word = scanner.nextLine();
			if(word.toLowerCase().equals("!q")) {
				System.out.println("-----THANK YOU-----");
				break;
			}

			System.out.println("|");

			if(word.length() != 0) { // For every null value entered, prompt user to "enter word"
				try {					
					courses = StdVersion.valueOf(word.toUpperCase());
					description = courses.getDescription();
					String[] descArr = description.split(",") ;
					for(String arr : descArr) {
						System.out.println(courses.name() + ": "+ arr);						
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
