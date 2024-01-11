package bookshelf;

import bookshelf.bookz.Book;

public class Bottom {

    static Book cujo = new Book("Cujo", "Stephen King", "horror", 1976);
    static Book shining = new Book("Shining", "Stephen King", "horror", 1979);
    static Book darkTower = new Book("The Dark Tower", "Stephen King", "horror", 1985);

    public void getBack(Book book1, Book book2, Book book3) {
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    };

    public static void main(String[] args) {
        Bottom getBook = new Bottom();
        getBook.getBack(cujo, shining, darkTower);
        }
    }

