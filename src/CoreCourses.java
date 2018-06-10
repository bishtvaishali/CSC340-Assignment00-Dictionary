

public enum CoreCourses {

	CSC210("|\n" + "CSC210 : Intro to Java"+ 
			"	 CSC210 : To learn Java.\n" + 
			"	 CSC210 : Comfortable with Objects and Classes.\n" + 
			"	 CSC210 : Ready for CSC 220.\n" + "|"),
	CSC220( "|\n" + "CSC220 : Data Structures.\n" + 
			"CSC220 : Ready to create complex data structures.\n" + 
			"CSC220 : To create data structures.\n" + "|"),
	CSC340( "|\n" + "CSC340 : = C++ version of CSC210 + CSC220 + more"+
			 "CSC340 : A CS upper division course.\n"+
			 "CSC340 : Many hours outside of class.\n" + "|"),
	CSC413(),
	
	Book("|\n"+ "Book : A set of pages.\n" + 
			"Book : To arrange something on a particular date.\n" + "|"),
	Bookable("|\n" + "Bookable : Can be ordered."),
	Bookbinder("|\n"+"Bookbinder : A person who fastens the pages of books.\n"),
	Bookcase("\n"+"Bookcase : A piece of furniture with shelves."+"\n");


	private String description;
	
	
	private CoreCourses() {
	}
	
	private CoreCourses(String description) {
		this.description = description;	
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
