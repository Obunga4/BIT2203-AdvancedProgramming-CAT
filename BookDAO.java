import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Java Programming", "John Smith", true));
        books.add(new Book(2, "Database Systems", "Mary Jones", false));
        books.add(new Book(3, "Web Development", "Peter Brown", true));
        return books;
    }
}