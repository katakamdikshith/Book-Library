package booklibrary;

import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Library library=new Library();
		
		library.addBook1(new Book(1,"java","james",true));
		library.addBook1(new Book(2,"python","james",true));
		library.addBook1(new Book(3,"my sql","james",false));
		library.addBook1(new Book(4,"spring","james",true));
		library.addBook1(new Book(5,"spring boot","james",false));
		
		boolean condition=true;
		
		while(condition) {
			
			System.out.println("========== LIBRARY MENU ==========");
			System.out.println("1. Add Book");
			System.out.println("2. Display All Books");
			System.out.println("3. Search Book");
			System.out.println("4. Borrow Book");
			System.out.println("5. Return Book");
			System.out.println("6. Exit");
			
			
			System.out.print("Enter your choice: ");
			int choice=scanner.nextInt();
			
			
			switch(choice){
			case 1:
				System.out.print("Enter the Book ID :");
				int bookId=scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter the Book Title :");
				String bookTitle=scanner.nextLine();
				System.out.print("Enter the Author Name : ");
				String bookAuthor=scanner.nextLine();
				System.out.print("This Book is Available Now : ");
				boolean bookAvailable=scanner.nextBoolean();
					
				library.addBook(new Book(bookId,bookTitle,bookAuthor,bookAvailable));
				break;
				
			case 2:
				library.display();
				break;
				
			case 3:
				
				System.out.println();
				
				System.out.print("Enter the Book Id : ");
				int ID=scanner.nextInt();
				System.out.println();
				library.searchBook(ID);
				System.out.println();

				break;
				
			case 4:
				
				System.out.println();
				
				System.out.print("Enter the Book Id : ");
				int Borrow=scanner.nextInt();
				System.out.println();
				library.borrowBook(Borrow);
				System.out.println();

				break;
				
			case 5:
				
				System.out.println();
				
				System.out.print("Enter the Book Id : ");
				int Return=scanner.nextInt();
				System.out.println();
				library.returnBook(Return);
				System.out.println();
				break;
				
			case 6:
				
				condition=false;
				System.out.println();
				System.out.println("Thank you Visiting Book Library.... ");
				break;
	
			}
	
			
		}
		scanner.close();
	}
}
