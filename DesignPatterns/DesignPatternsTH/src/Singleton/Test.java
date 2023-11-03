package Singleton;

public class Test {
    public static void main(String[] args) {
        System.out.println("BEGIN TESTING SINGGLETON PATTERN");

        BookBorrower bookBorrower = new BookBorrower();
        BookBorrower bookBorrower1 = new BookBorrower();

        bookBorrower.borrowBook();
        System.out.println("BookBorrower asked to borrow the book");
        System.out.println("BookBorrower Author and Title: ");
        System.out.println(bookBorrower.getAuthorAndTitle());


        bookBorrower1.borrowBook();
        System.out.println("BookBorrower1 asked to borrow the book");
        System.out.println("BookBorrower1 Author and Title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower.returnBook();
        System.out.println("BookBorrower returned the book");

        bookBorrower1.borrowBook();
        System.out.println("BookBorrower1 Author and Title: ");
        System.out.println(bookBorrower.getAuthorAndTitle());

        System.out.println("END TESTING SINGLETON PATTERN");
    }
}
