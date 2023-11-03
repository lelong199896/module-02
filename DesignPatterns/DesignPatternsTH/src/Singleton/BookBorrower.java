package Singleton;


//Người mượn sách
public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    //Mượn sách
    public void borrowBook() {
        borrowedBook = BookSingleton.borrowBook();
        if (borrowedBook == null) {
            haveBook = false;
        } else {
            haveBook = true;
        }
    }

    //Lấy thông tin sách mượn
    public String getAuthorAndTitle() {
        if (haveBook) {
            return borrowedBook.getAuthorAndTitle();
        }
        return "I don't have the book";
    }

    //Trả sách
    public void returnBook() {
        borrowedBook.returnBook(borrowedBook);
    }
}
