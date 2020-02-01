import org.w3c.dom.ls.LSOutput;

public class Main {

    public static double sale(Book book){
        double s = book.getPrice() * 0.5;
        return book.getPrice() - s;
    }

    public static void main(String[] args) {
        Book[] books = new Book[100];
        int date = 1900;
        for(int i = 0; i < 100; i++){
            books[i] = new Book("БИ" + i, 500, date++);
            if (i < 10){
                books[i].setPrice(sale(books[i]));
            }
        }

        Library l1 = new Library(books);

        for (Book book : books){
            System.out.println(book);
        }
        }
    }
