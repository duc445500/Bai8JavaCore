package DaHinh;

public class Student {
    private int studentId;
    private String studentName;

    public Student(){}

    public Student(int maHV){
        this.studentId = maHV;
    }
    public Student(String tenHV){
        this.studentName = tenHV;
    }
    public Student(int maHV,String tenHV){
        this.studentId = maHV;
        this.studentName = tenHV;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
