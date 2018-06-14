
import java.util.ArrayList;
import java.util.HashMap;


public class Dictionary {

	HashMap<Word, ArrayList<String>> dictMap = new HashMap<>();

	
	private  ArrayList<String> CSC210List = new ArrayList<>();
	private  ArrayList<String> CSC220List = new ArrayList<>();	
	private  ArrayList<String> CSC340List = new ArrayList<>();
	private  ArrayList<String> bookList = new ArrayList<>();
	private  ArrayList<String> bookableList = new ArrayList<>();
	private  ArrayList<String> bookBinderList = new ArrayList<>();
	private static ArrayList<String> bookCaseList = new ArrayList<>();
	
	public void init() {	
		
		CSC210List.add("Intro to Java");
		CSC210List.add("To learn Java.") ;
		CSC210List.add("Comfortable with Objects and Classes."); 
		CSC210List.add("Ready for CSC 220.");
		
		
		CSC220List.add("Data Structures.");
		CSC220List.add("Ready to create complex data structures.");
		CSC220List.add("To create data structures.");
		
		CSC340List.add( "= C++ version of CSC210 + CSC220 + more");
		CSC340List.add("A CS upper division course.");
		CSC340List.add("Many hours outside of class.");
		
		
		bookList.add("Book : A set of pages.\n" + 
				"Book : To arrange something on a particular date.");
		
		bookableList.add("Bookable : Can be ordered.");
		
		bookBinderList.add("Bookbinder : A person who fastens the pages of books.");
		
		bookCaseList.add("Bookcase : A piece of furniture with shelves.");
		
		
		
		dictMap.put(Word.CSC210, CSC210List);
		dictMap.put(Word.CSC220, CSC220List);
		dictMap.put(Word.CSC340, CSC340List);
		dictMap.put(Word.CSC413, null);
		dictMap.put(Word.BOOK, bookList);
		dictMap.put(Word.BOOKCASE, bookCaseList);
		dictMap.put(Word.BOOKBINDER, bookBinderList);
		dictMap.put(Word.BOOKABLE, bookableList);
		
	}
	
	
	public void add() {
	
		
		
	}
	
	
	
	
	
	
}
