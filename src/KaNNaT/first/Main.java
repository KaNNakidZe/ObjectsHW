package KaNNaT.first;

// 6. В методе main создать несколько объектов Книга (достаточно двух)
// и несколько объектов Автор (достаточно тоже двух) и инициализировать друг друга.
// Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.

public class Main {

    public static void main(String[] args) {

        Author firstAuthor = new Author("Stephen", "King");
        System.out.println("Author of the book " + firstAuthor.getAuthorFirstName() + " " + firstAuthor.getAuthorSurnameName());

        Author firstAuthor2 = new Author("Stephen", "King");
        System.out.println("Author of the book " + firstAuthor.getAuthorFirstName() + " " + firstAuthor.getAuthorSurnameName());

        Author secondAuthor = new Author("Erich Maria", "Remarque");
        System.out.println("Author of the book " + secondAuthor.getAuthorFirstName() + " " + secondAuthor.getAuthorSurnameName());

        Book firstBook = new Book("Pet Sematary", firstAuthor, 1980);
        System.out.println(firstBook.getBookName() + ", " + firstBook.getAuthorName() + ", " + firstBook.getReleaseYear());

        Book secondBook = new Book("Black Obelisk", secondAuthor, 1956);
        System.out.println(secondBook.getBookName() + ", " + secondBook.getAuthorName() + ", " + secondBook.getReleaseYear());

        Book secondBook2 = new Book("Black Obelisk", secondAuthor, 1956);
        System.out.println(secondBook.getBookName() + ", " + secondBook.getAuthorName() + ", " + secondBook.getReleaseYear());

        System.out.println("The year of the book 's release: " + firstBook.getReleaseYear());
        firstBook.setReleaseYear(2022);
        System.out.println("The year of the book 's release: " + firstBook.getReleaseYear());

// Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке.

        System.out.println(firstAuthor.toString());
        System.out.println(firstBook.toString());

        System.out.println("Identical authors? " + firstAuthor.equals(firstAuthor2));
        System.out.println("Identical book? " + secondBook.equals(secondBook));

        System.out.println("secondBook.hashCode() = " + secondBook.hashCode());
        System.out.println("secondBook2.hashCode() = " + secondBook2.hashCode());

    }






}
