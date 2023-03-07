package homework;

public class Test2Student extends TestPerson{
    public String school;
    public String stuNumber;

    public Test2Student() {
    }

    public Test2Student(String name, String gender, int age, String nationality, String school, String stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }
}
