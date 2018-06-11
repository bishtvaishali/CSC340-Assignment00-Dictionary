import java.util.Scanner;

public enum ProVersion {

	CSC210( "Intro to Java",
			"To learn Java." , 
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

	public void setNoun(String noun) {
		this.noun = noun;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public String getAdj() {
		return adj;
	}

	public void setAdj(String adj) {
		this.adj = adj;
	}


	public static void main(String[] args) {	
		String phrase;
		String[] str;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Search: ");

		while(scanner.hasNextLine()) {
			ProVersion pro = null;
			phrase = scanner.nextLine();

			System.out.println("|");

			str = phrase.split("\\s+");
			int length = str.length;


			if(length==1 && str[0].length()!= 0) {
				ProVersion proV = null;
				try {
					proV = ProVersion.valueOf(str[0].toUpperCase());	
					System.out.println(proV.name() + " [noun] :" + proV.getNoun());  
					System.out.println(proV.name() + " [verb] :"  + proV.getVerb());
					System.out.println(proV.name() + " [adjective] :" + proV.getAdj());
							  
				}catch(Exception e) {
					System.out.println("<Not found>");
				}
			} else if(length == 2){
				String str1 = null, str2 = null;
				String pos =  null;

				for(int i =0; i<= str.length; i++) {
					str1 = str[0].toUpperCase() ;
					str2 = str[1].toUpperCase();
				}

				try{	
					pro = ProVersion.valueOf(str1);
					pos = Type.valueOf(str2).name();

					if(pos.equals((Type.VERB).toString())) {				
						System.out.println(pro.getVerb());	
					}else if(pos.equals((Type.ADJECTIVE).toString())){
						System.out.println(pro.getAdj());
					}else if(pos.equals(Type.NOUN.toString())){
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