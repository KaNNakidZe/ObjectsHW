package KaNNaT.first;

// 1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
// Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.


public class Book {

    private final String bookName;
    public Author authorName;
    private int releaseYear;

// 3. Написать конструкторы для обоих классов, заполняющие все поля.

    public Book(String bookName, Author authorName, int releaseYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.releaseYear = releaseYear;
    }

// 4. Создать геттеры для всех полей полей книги.

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

// 5. Создать сеттер для поля «Год публикации» у книги.

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}
