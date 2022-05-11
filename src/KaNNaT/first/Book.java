package KaNNaT.first;

// 1. ���������� ������� ����� Book, ������� �������� � ���� ������ �� �����, ������ � ���� ����������.
// ���� ����� ������ ���� String, Author (������� �� ��������  � �. 2) � int.


import java.util.Objects;

public class Book {

    private final String bookName;
    public Author authorName;
    private int releaseYear;

// 3. �������� ������������ ��� ����� �������, ����������� ��� ����.

    public Book(String bookName, Author authorName, int releaseYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.releaseYear = releaseYear;
    }

// 4. ������� ������� ��� ���� ����� ����� �����.

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

// 5. ������� ������ ��� ���� ���� ���������� � �����.

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


// ����������� ������ toString, equals � hashCode � ������� Author � Book, ������� ���� ������� �� ������� �����.

    @Override
    public String toString() {
        return "Book{" +
                "name=" + bookName + '\'' +
                ", author=" + authorName +
                ", releaseYear=" + releaseYear +
                '}';
    }

    @Override
    public boolean equals(Object a) {
       if (this == a) return true;
       if (a == null || getClass() != a.getClass()) return false;
        Book book = (Book) a;
        return releaseYear == book.releaseYear && bookName.equals(book.bookName) && authorName.equals(book.authorName);
    }

    @Override
    public  int hashCode() {
        return Objects.hash(bookName, authorName, releaseYear);
    }

}
