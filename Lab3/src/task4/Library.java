package task4;

import java.util.ArrayList;

public class Library {
    private String name;
    private String address;
    private ArrayList<Book> books;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void showNumOfBooks() {
        System.out.println("Количество книг: " + books.size());
    }

    public void showNumOfAuthors() {
        ArrayList<String> authors = new ArrayList<>();
        for (Book book : books) {
            if (authors.contains(book.getAuthor()))
                continue;
            else
                authors.add(book.getAuthor());
        }
        System.out.println("Количество авторов: " + authors.size());
    }

    public void showBooksForPeriod(int firstYear, int secondYear) {
        if (firstYear >= secondYear || firstYear < 0 || secondYear < 0) {
            System.out.println("Введите коорректные параметры!");
            return;
        } else {
            for (Book book : books) {
                if (book.getYear() >= firstYear && book.getYear() <= secondYear)
                    System.out.println(book);
            }
        }
    }
}
