import java.time.LocalDate;
public class BookStore{

    private String orderedBook;
    private LocalDate orderDate;
    private String orderID;
    private double transactionAmount;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String userID;
    private String orderType;

    public BookStore(String firstName,String lastName,String emailAddress){
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailAddress=emailAddress;
        this.userID= "TANLUS" + (firstName + lastName).substring(0, 10).toUpperCase();
    }
    
    public String getOrderedBook() {
        return orderedBook;
    }
    public void setOrderedBook(String orderedBook) {
        this.orderedBook = orderedBook;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderID() {
        return orderID;
    }
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getOrderType() {
        return orderType;
    }
    public void setOrderType(String orderType) {
        this.orderType= orderType;
    }

    
    public void searchBook(String bookID) {
        boolean found = false;
        for (BookDetails book : BookDetails.values()) {
            if (book.getbookID().equals(bookID)) {
                found = true;
                System.out.println("Book Details:");
                System.out.println("Book ID:TANL-" + book.getbookID());
                System.out.println("Book Name: " + book.getbookName());
                System.out.println("Book Author: " + book.getbookAuthor());
                System.out.println("Book Pages: " + book.getbookPages());
                System.out.println("Book Genre: " + book.getbookGenre());
                System.out.println("Book Rating: " + book.getbookRating());
                System.out.println("Book Published Year: " + book.getbookPublishedYear());
                System.out.println("Book Publisher: " + book.getbookPublisher());
                System.out.println("Book Price: " + book.getbookPrice());
                orderedBook = book.getbookName();
                orderID = book.getbookID();
                orderDate = java.time.LocalDate.now();
                transactionAmount = book.getbookPrice();
               
            }
        }
        if (!found) {
            System.out.println("Book not found. Please try again.");
        }
    }

    public void orderBook(int choice){
        if (choice == 1){
                System.out.println("You have chosen to rent the book.");
                System.out.println("The rent is only for one month.");
                System.out.println("You will be charged €5 for the period.");
                orderType = "Rent";
            } else if (choice == 2){
                System.out.println("You have to chosen to purchase the book.");
                orderType = "Purchase";
            } else {
             System.out.println("The choice is invalid,please try a gain.");
            }
        }
        

    public void orderConfirmation() {
        System.out.println("Dear," + firstName + " " + lastName);
        System.out.println("Thank you for ordering orderedBook from Turn-A-New-Leaf. Following are your orderdetails:");
        System.out.println("Order ID:" + orderID);
        System.out.println("Order Date:" + orderDate);            System.out.println("User ID:" + userID);
        System.out.println("User contact:" + emailAddress);
        System.out.println("Transaction:" + orderType);
        System.out.println("Transaction amount:" + transactionAmount + "€");
        }
}

    enum BookDetails {
        BOOK1("001","Carrise","Stephen King",272,"Horror",3.98,1974,"Wings",14.0),
        BOOK2("002","The Firm","Robin Waterfield / John Grisham",448,"Thriller",4.01,1991,"Addison Wesley Publishing Company",25.0),
        BOOK3("003","Slaughterhouse-Five","Kurt Vonnegut Jr.",275,"Sci-Fi",4.10,1969,"Dial Press",18.0),
        BOOK4("004","The Great Gatsby","F. Scott Fitzgerald",188,"Classic",3.91,1925,"Scribner",8.0),
        BOOK5("005","American Gods","Neil Gaiman",635,"Fantasy",4.11,2001,"Harper Collins",4.0);
    
        private final String bookID;
        private final String bookName;
        private final String bookAuthor;
        private final int bookPages;
        private final String bookGenre;
        private final double bookRating;
        private final int  bookPublishedYear;
        private final String bookPublisher;
        private final double bookPrice;
        private final double bookRent = 5.0;

        BookDetails(String bookID,String bookName,String bookAuthor,int bookPages,String bookGenre,double bookRating,int  bookPublishedYear,String bookPublisher,double bookPrice){
            this.bookID=bookID;
            this.bookName=bookName;
            this.bookAuthor=bookAuthor;
            this.bookPages=bookPages;
            this.bookGenre=bookGenre;
            this.bookRating=bookRating;
            this.bookPublishedYear=bookPublishedYear;
            this.bookPublisher=bookPublisher;
            this.bookPrice=bookPrice;
        }

        public String getbookID(){
            return bookID;
        }
        public String getbookName(){
            return bookName;
        }
        public String getbookAuthor(){
            return bookAuthor;
        }
        public int getbookPages(){
            return bookPages;
        }
        public String getbookGenre(){
            return bookGenre;
        }
        public double getbookRating(){
            return bookRating;
        }
        public int getbookPublishedYear(){
            return bookPublishedYear;
        }
        public String getbookPublisher(){
            return bookPublisher;
        }
        public double getbookPrice(){
            return bookPrice;
        }
        
        public double getbookRent() {
            return bookRent;
        }
}
