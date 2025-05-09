package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student
{
    private String name;
    private int age;

    public Student()
    {

    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }


}


public class Constructor_Reference {
    
    public static void main(String[] args) {
        
         List<String> names = Arrays.asList("Rahat", "Shivi", "Rahul", "Avi", "Tannu");

         List<Student> students = new ArrayList<>();

         for (String name : names) {
            students.add(new Student(name));
         }

        // students = names.stream()
        //                 .map(name -> new Student(name))
        //                 .toList();
        
        System.out.println(students);
    }

}
