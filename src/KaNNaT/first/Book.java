package KaNNaT.first;

// 1. ���������� ������� ����� Book, ������� �������� � ���� ������ �� �����, ������ � ���� ����������.
// ���� ����� ������ ���� String, Author (������� �� ��������  � �. 2) � int.


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

}
