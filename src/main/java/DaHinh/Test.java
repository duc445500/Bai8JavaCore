package DaHinh;

public class Test {
    public static void main(String[] args) {
        Student st = new Student();
        Student st1 = new Student(1);
        Student st2 = new Student("Anh DUc");
        Student st3 = new Student(3,"Truong Anh Duc");

        System.out.println(st3.toString());
    }
}
