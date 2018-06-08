import java.util.ArrayList;
import java.util.Scanner;

public enum CoreCourses {

	CSC210,
	CSC220,
	CSC340,
	CSC413,
	Book,
	Bookable,
	Bookbinder,
	Bookcase;


	private ArrayList<String> defList;
	private static ArrayList<String> CSC210List = new ArrayList<>();
	private static ArrayList<String> CSC220List = new ArrayList<>();	
	private static ArrayList<String> CSC340List = new ArrayList<>();
	private static ArrayList<String> bookList = new ArrayList<>();
	private static ArrayList<String> bookableList = new ArrayList<>();
	private static ArrayList<String> bookBinderList = new ArrayList<>();
	private static ArrayList<String> bookCaseList = new ArrayList<>();

	private CoreCourses() {
	}

	private void setDefinition(ArrayList<String> defList) {
		this.defList = defList; 
	}

	public static void initDefinitions() {
		CSC210List.add("|");	
		CSC210List.add("CSC210 : Intro to Java");			
		CSC210List.add("CSC210 : To learn Java.");
		CSC210List.add("CSC210 : Comfortable with Objects and Classes.");
		CSC210List.add("CSC210 : Ready for CSC 220.");
		CSC210List.add("|");

		CSC220List.add("|");
		CSC220List.add("CSC220 : Data Structures.");		
		CSC220List.add("CSC220 : Ready to create complex data structures.");
		CSC220List.add("CSC220 : To create data structures.");
		CSC220List.add("|");
		
		CSC340List.add("|");
		CSC340List.add( "CSC340 : = C++ version of CSC210 + CSC220 + more");
		CSC340List.add("CSC340 : A CS upper division course.");
		CSC340List.add("CSC340 : Many hours outside of class.");
		CSC340List.add("|");
		
		
		bookList.add("|");
		bookList.add("Book : A set of pages.");		
		bookList.add("Book : To arrange something on a particular date.");
		bookList.add("|");
		
		
		bookableList.add("|");
		bookableList.add("Bookable : Can be ordered.");
		bookableList.add("|");
		
		bookBinderList.add("|");
		bookBinderList.add("Bookbinder : A person who fastens the pages of books.");
		bookBinderList.add("|");
		
		bookCaseList.add("|");
		bookCaseList.add("Bookcase : A piece of furniture with shelves.");	
		bookCaseList.add("|");
	}


	public static void print(ArrayList<String> arrayList) {
		for (String list : arrayList) {
			System.out.println(list);}

	}

	public static void search(CoreCourses course){
		switch (course) {
		case CSC340:
			print(CSC340List);
			break;

		case CSC220:
			print(CSC220List);
			break;

		case CSC210: 
			print(CSC210List);
			break;

		default:
			System.out.println("Not found");
			break;
		}
	}


	public static void main(String[] args) {		
		initDefinitions();
		CSC210.setDefinition(CSC210List);
		CSC220.setDefinition(CSC220List);
		CSC340.setDefinition(CSC340List);
		//CSC413.setDefinition(defList);,
		Book.setDefinition(bookList);
		Bookable.setDefinition(bookableList);
		Bookbinder.setDefinition(bookBinderList);
		Bookcase.setDefinition(bookCaseList);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Search: ");
		String word = scanner.nextLine();	
		CoreCourses.search(CoreCourses.valueOf(word));	
		scanner.close();
	}

}
