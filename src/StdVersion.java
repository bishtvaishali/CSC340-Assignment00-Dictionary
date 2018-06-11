import java.util.Scanner;

public enum StdVersion {

	CSC210( "CSC210 : Intro to Java.\n"+ 
			"CSC210 : To learn Java.\n" + 
			"CSC210 : Comfortable with Objects and Classes.\n" + 
			"CSC210 : Ready for CSC 220."),

	CSC220( "CSC220 : Data Structures.\n" + 
			"CSC220 : Ready to create complex data structures.\n" + 
			"CSC220 : To create data structures."),

	CSC340( "CSC340 : = C++ version of CSC210 + CSC220 + more\n"+
			"CSC340 : A CS upper division course.\n" +
			"CSC340 : Many hours outside of class."),

	CSC413(),

	BOOK( "Book : A set of pages.\n" + 
		  "Book : To arrange something on a particular date."),

	BOOKABLE("Bookable : Can be ordered."),

	BOOKBINDER("Bookbinder : A person who fastens the pages of books."),

	BOOKCASE("Bookcase : A piece of furniture with shelves.");


	private String description;


	private StdVersion() {
	}

	private StdVersion(String description) {
		this.description = description;	
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static void main(String[] args) {	
		String description = null;
		StdVersion courses;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Search: ");

		while(scanner.hasNextLine()) {			
			String word = scanner.nextLine();
			System.out.println("|");
			if(word.length() != 0) {
				try {	
					courses = StdVersion.valueOf(word.toUpperCase());
					description = courses.getDescription();
					System.out.println(description);
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
