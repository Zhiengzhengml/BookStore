import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please enter your firstName:");
    String firstName = scanner.nextLine();
    System.out.println("Please enter your lastName:");
    String lastName = scanner.nextLine();
    System.out.println("Please enter your emailAddress:");
    String emailAddress = scanner.nextLine();
    BookStore bookstore = new BookStore(firstName,lastName,emailAddress);

    System.out.println("The details of the book:");
    for(BookDetails book : BookDetails.values()){
        System.out.println("Book ID:" + book.getbookID() + " ,Book name:" + book.getbookName()+" bookAuthor:" + book.getbookAuthor());
    }

    System.out.println("The bookID you want to order:");
    String bookID = scanner.nextLine();

    bookstore.searchBook(bookID);

    System.out.println("You should enter 1 if you want to rent the book");
    System.out.println("You should enter 2 if you want to purchase the book");
    System.out.println("You should enter 3 if you want to exit without ordering anything. ");  
    int choice;
    do {
        System.out.println("How you would like to order the book,please enter 1,2or3");
        choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1 || choice == 2) {
            bookstore.orderBook(choice);
            System.out.println("\n");       
        } else if (choice == 3) {
            System.out.println("Invalid choice. Please try again.");
        }
    } while (choice ==3);
    bookstore.orderConfirmation();
    scanner.close();
    }
}

