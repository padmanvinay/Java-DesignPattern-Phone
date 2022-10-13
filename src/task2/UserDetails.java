package task2;

public class UserDetails
{
    private String name;
    private int age;
    private int birthYear;
    private String company;

    public UserDetails(String name, int age, int birthYear, String company)
    {
        this.name = name;
        this.age = age;
        this.birthYear = birthYear;
        this.company = company;
    }

    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthYear=" + birthYear +
                ", company='" + company + '\'' ;
    }
}
class UserBuilder
{
    private String name;
    private int age;
    private int birthYear;
    private String company;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public UserBuilder setCompany(String company) {
        this.company = company;
        return this;
    }
    public UserDetails getNotepad()
    {
        return new UserDetails(name,age,birthYear,company);
    }
}
