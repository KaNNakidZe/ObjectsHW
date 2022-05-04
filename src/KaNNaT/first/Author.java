package KaNNaT.first;


// 2. Ќеобходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.

public class Author {
    public String authorFirstName;
    public String authorSurnameName;

// 3. Ќаписать конструкторы дл€ обоих классов, заполн€ющие все пол€.

    public Author(String authorFirstName, String authorSurnameName) {
        this.authorFirstName = authorFirstName;
        this.authorSurnameName = authorSurnameName;
    }

// 4. —оздать геттеры дл€ всех полей автора и всех полей книги.

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorSurnameName() {
        return authorSurnameName;
    }
    public String toString() {
        return this.authorFirstName + " " + this.authorSurnameName;}
}
