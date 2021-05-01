import java.util.*;
public class ManagementSystem
{
    public static void main(String args[])
    {
        ArrayList <Student> students = new ArrayList<Student>();//List of students
        ArrayList<Department> departments = new ArrayList<Department>();//List of departments

        Scanner s = new Scanner(System.in);

        System.out.println("----------------");
        System.out.println();
        System.out.println("### Output");

        boolean flag = true;
        while (flag==true)
        {
            System.out.println("1. Add student\n2. List Students\n3. Add department\n4. List Departments\n5. Remove student\n6. Remove Department\n7. Exit");
            System.out.println("Enter your choice: ");
            int choice = s.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("-- Selected Add student --");
                    System.out.println("Enter name of student: ");
                    String name = s.next();
                    System.out.println("Enter gender of student: ");
                    String gender = s.next();
                    System.out.println("Enter address of student: ");
                    String address = s.next();
                    System.out.println("Enter age of student: ");
                    int age = s.nextInt();
                    Student student = new Student(name,gender,address,age);
                    students.add(student);//adding new student
                    System.out.println("Student added successfully");
                    break;

                case 2:
                    System.out.println("-- Selected List students --");
                    for (Student s2:students)
                    {
                        System.out.println(s2);
                    }
                    System.out.println("List of students displayed");
                    break;

                case 3:
                    System.out.println("-- Selected Add department --");
                    System.out.println("Enter name of department: ");
                    String dname = s.next();
                    System.out.println("Enter HOD of department: ");
                    String HOD = s.next();
                    Department department = new Department(dname,HOD);
                    departments.add(department);//adding new department
                    System.out.println("Department added successfully");
                    break;

                case 4:
                    System.out.println("-- Selected List departments --");
                    for (Department deptDetails:departments)
                    {
                        System.out.println(deptDetails);
                    }
                    System.out.println("List of departments displayed");
                    break;

                case 5:
                    System.out.println("-- Selected Remove student --");
                    System.out.println("Enter details of student to be removed: ");
                    System.out.println("Enter name of student: ");
                    String sname = s.next();
                    System.out.println("Enter gender of student: ");
                    String sgender = s.next();
                    System.out.println("Enter address of student: ");
                    String saddress = s.next();
                    System.out.println("Enter age of student: ");
                    int sage = s.nextInt();
                    int index1 = -1;
                    boolean studentExists = false;
                    for (Student s1:students)
                    {
                        index1 = index1 + 1;
                        if (s1.name.equals(sname) && s1.gender.equals(sgender) && s1.age==sage && s1.address.equals(saddress))
                        {
                            studentExists = true;
                            break;
                        }
                    }
                    if (studentExists)
                    {
                        students.remove(index1);//removing student
                        System.out.println("Student removed successfully");
                    }
                    else
                    {
                        System.out.println("No such student");
                    }
                    break;

                case 6:
                    System.out.println("-- Selected Remove department --");
                    System.out.println("Enter details of department to be removed: ");
                    System.out.println("Enter name of department: ");
                    String dname2 = s.next();
                    System.out.println("Enter HOD of department: ");
                    String HOD2 = s.next();
                    int index = -1;
                    boolean isFound = false;
                    for (Department d1:departments)
                    {
                        index = index + 1;
                        if (d1.name.equals(dname2) && d1.HOD.equals(HOD2))
                        {
                            isFound = true;
                            break;
                        }
                    }
                    if (isFound==false)
                    {
                        System.out.println("No such department");
                    }
                    else
                    {
                        departments.remove(index);//removing department
                        System.out.println("Department removed successfully");
                    }
                    break;

                case 7:
                    flag = false;
                    System.out.println("Thank you. Exiting.");
                    break;

                default:
                    System.out.println("Incorrect choice selected");
                    break;                    
            }
        }
    }
}