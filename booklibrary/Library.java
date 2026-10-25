package booklibrary;

import java.util.ArrayList;

public class Library implements Borrowable {
	
	
	ArrayList <Book> books=new ArrayList<>();
	


	
	public void addBook(Book book) {	
			books.add(book);
			System.out.println();
			System.out.println(book.getTitle()+" book Added succsssfully....");
			
	}
	
	public void addBook1(Book book) {	
		books.add(book);	
 }
	
	
	public void display() {
		if(books.isEmpty()) {
			System.out.println("there is no book there in library");
		}
		else {
			
			System.out.println("The books in library");
			System.out.println();
			System.out.println("Book ID | Book Title | Book Author | Book Is Available");
			System.out.println();
			
			for(Book books:books) {
				System.out.println(books);
			}
			
			System.out.println();
		}
	}
	
	
	public void searchBook(int bookId) {
		if(books.isEmpty()) {
			System.out.println("there is no book there in library");
		}
		
	
		else {
			
			boolean found=false;
			
			for(Book books:books) {
				if(books.getBookId()==bookId) {
					System.out.println(books);
					found=true;
					break;
				}
				
			}
			if(!found) {
				System.out.println("the book is not found");
			}
			
		}
	}
	
	
	public void borrowBook(int bookId) {
		if(books.isEmpty()) {
			System.out.println("there is no book there in library");
		}
		else {
			boolean found=false;
		for(Book books:books) {
		
			if(books.getBookId()==bookId) {
				
				if(books.isAvailable()) {
					books.setAvailable(false);
					System.out.println("the book is borrowed");
					found=true;
					break;
				}
				else {
					found=true;
					System.out.println("The book is already borrowed");
				}
				
			
			}
		}
		if(!found) {
			System.out.println("the book is not found");
		}
		
	}
	}

	@Override
	public void returnBook(int bookId) {
		
		if(books.isEmpty()) {
			System.out.println("there is no book there in library");
		}
		else {
			boolean found=false;
		for(Book books:books) {
		
			if(books.getBookId()==bookId) {
				
				if(!books.isAvailable()) {
					books.setAvailable(true);
					System.out.println("the book is returted");
					found=true;
					break;
				}
				else {
					found=true;
					System.out.println("The book is already retured");
				}
				
			
			}
		}
		if(!found) {
			System.out.println("the book is not found");
		}
		
	}
	}












	
	

}
