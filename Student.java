public class Student
{
    String name;
    String gender;
    String address;
    int age;
    Student(String name, String gender, String address, int age)
    {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
    public String toString()
    {
        String s = "Name: " + this.name + " Age: " + this.age + " Gender: " + this.gender + " Address: " + this.address;
        return s;
    }
}
