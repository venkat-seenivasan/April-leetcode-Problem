public class Main {
    public static void main(String[] args) {
        Student [] student=new Student[5];
        Student std=new Student();

        std.roll=55;
        std.name="venkat";
        std.mark=94;
        System.out.println(std.mark);
        System.out.println(std.name);
        System.out.println(std.roll);
    }
}
class Student {
    int roll;
    String name;
    float mark;
    
}