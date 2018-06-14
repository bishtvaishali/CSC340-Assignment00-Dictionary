import java.util.Scanner;

public enum ProVersion {

	CSC210( "Intro to Java",
			"To learn Java.", 
			"Comfortable with Objects and Classes."),

	CSC220( "Data Structures.",   
			"To create data structures.",
			"Ready to create complex data structures."),

	CSC340( "A CS upper division course.Many hours outside of class.\n", 
			"",
			"C++ version of CSC210 + CSC220 + more"),

	CSC413(),

	BOOK( "A set of pages.\n",
		  "To arrange something on a particular date.", 
		  ""),

	BOOKABLE( "",
			  "", 
			  "Can be ordered."),

	BOOKBINDER( "A person who fastens the pages of books.\n", 
			    "", 
			    ""),

	BOOKCASE( "A piece of furniture with shelves.\n",
			  "",
			  "");

	private String noun, verb, adj;

	private ProVersion() {}

	private ProVersion(String noun, String verb, String adj) {		
		this.verb = verb;
		this.noun = noun;
		this.adj = adj;
	}

	public String getNoun() {
		return noun;
	}

	public String getVerb() {
		return verb;
	}

	public String getAdj() {
		return adj;
	}

	public static void main(String[] args) {	
		String phrase;
		String[] str;

		Scanner scanner = new Scanner(System.in);
		System.out.println("-----DICTIONARY 340 Pro-----\n\nSearch:");

		while(scanner.hasNextLine()) {
			ProVersion pro = null;
			phrase = scanner.nextLine();

			str = phrase.split("\\s+");
			
			if(str[0].toLowerCase().equals("!q")) {
				System.out.println("-----THANK YOU-----");
				break;
			}
			
			System.out.println("|");
						
			int length = str.length;

			if(length==1 && str[0].length()!= 0) {
				try {
					pro = ProVersion.valueOf(str[0].toUpperCase());	
					System.out.println(pro.name() + " [noun] :" + pro.getNoun());  
					System.out.println(pro.name() + " [verb] :"  + pro.getVerb());
					System.out.println(pro.name() + " [adjective] :" + pro.getAdj());
							  
				}catch(Exception e) {
					System.out.println("<Not found>");
				}
			} else if(length == 2){
				String str1 = str[0].toUpperCase() ;
				String str2 = str[1].toUpperCase() ;
				
				try{	
					pro = ProVersion.valueOf(str1);
					Type pos = Type.valueOf(str2); 
					
					if(pos.equals(Type.VERB)) {				
						System.out.println(pro.getVerb());	
					}else if(pos.equals(Type.ADJECTIVE)){
						System.out.println(pro.getAdj());
					}else if(pos.equals(Type.NOUN)){
						System.out.println(pro.getNoun());			
					}
				}catch(Exception e){
					System.out.println(" Word/Part of speech not found");
				}
			}else {
				System.out.println("Enter word");			
			}
			System.out.print("|\nSearch:");
		}			

		scanner.close();	
	}

}