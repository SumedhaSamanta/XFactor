public class Department
{
    String name;
    String HOD;
    Department(String name, String HOD)
    {
        this.name = name;
        this.HOD = HOD;
    }
    public String toString()
    {
        return "Name: " + this.name + " HOD: " + this.HOD;
    }
}
