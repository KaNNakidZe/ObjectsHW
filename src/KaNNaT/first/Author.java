package KaNNaT.first;


// 2. ���������� ������� ����� Author, ������� �������� � ���� ������ �� ����� � ������� ������.

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
    public String toString() {
        return this.authorFirstName + " " + this.authorSurnameName;}
}
