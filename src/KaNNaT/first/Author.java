package KaNNaT.first;


// 2. ���������� ������� ����� Author, ������� �������� � ���� ������ �� ����� � ������� ������.

import java.util.Objects;

public class Author {
    public String authorFirstName;
    public String authorSurnameName;

// 3. �������� ������������ ��� ����� �������, ����������� ��� ����.

    public Author(String authorFirstName, String authorSurnameName) {
        this.authorFirstName = authorFirstName;
        this.authorSurnameName = authorSurnameName;
    }

// 4. ������� ������� ��� ���� ����� ������ � ���� ����� �����.

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorSurnameName() {
        return authorSurnameName;
    }


// ����������� ������ toString, equals � hashCode � ������� Author � Book, ������� ���� ������� �� ������� �����.

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
