import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	private static Map<Word,ArrayList<String>> map = new HashMap<>();

	static ArrayList<String> CSC210List = new ArrayList<>();
	static ArrayList<String> CSC220List = new ArrayList<>();	
	static ArrayList<String> CSC340List = new ArrayList<>();
	static ArrayList<String> bookList = new ArrayList<>();
	static ArrayList<String> bookableList = new ArrayList<>();
	static ArrayList<String> bookBinderList = new ArrayList<>();
	static ArrayList<String> bookCaseList = new ArrayList<>();
	//static ArrayList<String> bookList = new ArrayList<>();
	

	public static void initMap() {
		CSC210List.add(" CSC210 : Intro to Java"+ 
				"	 CSC210 : To learn Java.\n" + 
				"	 CSC210 : Comfortable with Objects and Classes.\n" + 
				"	 CSC210 : Ready for CSC 220.");
		
		CSC220List.add(" CSC220 : Data Structures.\n" + 
				"CSC220 : Ready to create complex data structures.\n" + 
				"CSC220 : To create data structures.");
		
		CSC340List.add( "CSC340 : = C++ version of CSC210 + CSC220 + more"+
				 "CSC340 : A CS upper division course."+
				 "CSC340 : Many hours outside of class.");
		
		bookList.add("Book : A set of pages.\n" + 
				"Book : To arrange something on a particular date.");
		
		bookableList.add("Bookable : Can be ordered.");
		
		bookBinderList.add("Bookbinder : A person who fastens the pages of books.");
		
		bookCaseList.add("Bookcase : A piece of furniture with shelves.");	
		
		map.put(Word.csc210, CSC210List);
		map.put(Word.csc220, CSC220List);
		map.put(Word.csc340, CSC340List);
		map.put(Word.book, bookList);
		map.put(Word.bookable, bookableList);
		map.put(Word.bookBinder, bookBinderList);
		map.put(Word.bookCase, bookCaseList);
	}

	public static void print(String word) {		
		initMap();
		
		ArrayList<String> value = map.get(Word.valueOf(word));	
		System.out.println(value.get(0));
		
	}

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Search: ");
		String word = scanner.nextLine();
		System.out.println(word);
		scanner.close();
		print(word);
	}

}
