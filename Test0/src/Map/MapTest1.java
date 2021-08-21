package Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        Student s=new Student("Xiao Ming",99);
        Map<String,Student> map=new HashMap<>();
        map.put("Xiao Ming",s);
        Student target=map.get("Xiao Ming");
        System.out.println(target.score);
    }
}
class Student{
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
