package KaNNaT.first;


// 2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.

import java.util.Objects;

public class Author {
    public String authorFirstName;
    public String authorSurnameName;

// 3. Написать конструкторы для обоих классов, заполняющие все поля.

    public Author(String authorFirstName, String authorSurnameName) {
        this.authorFirstName = authorFirstName;
        this.authorSurnameName = authorSurnameName;
    }

// 4. Создать геттеры для всех полей автора и всех полей книги.

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorSurnameName() {
        return authorSurnameName;
    }


// Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке.

    @Override
    public String toString() {
        return "Author{" +
                "name='" + authorFirstName + '\'' +
                ", surnameName='" + authorSurnameName + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object b) {
        if (this == b) return true;
        if (b == null || getClass() != b.getClass()) return false;
        Author author = (Author) b;
        return authorFirstName.equals(author.authorFirstName) && authorSurnameName.equals(author.authorSurnameName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorSurnameName);
    }
}
