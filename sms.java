public class sms {
    int studentId;
    String name;
    int age;
    int grade;


    public sms(int studentId, String name, int age, int grade){
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void details(){
        System.out.println("Student id: "+ studentId + "\nStudent name: " + name +"\nStudent grade: "+ grade +"\nStudent age: "+ age);
    }
}
