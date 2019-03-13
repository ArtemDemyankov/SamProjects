package task4;

public class Book {
    private String author;
    private int year;
    private String name;

    public Book(String author, int year, String name) {
        this.author = author;
        this.year = year;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
