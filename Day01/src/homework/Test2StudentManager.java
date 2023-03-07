package homework;

public class Test2StudentManager extends Test2Student{
    public String job;

    public Test2StudentManager() {
    }

    public Test2StudentManager(String name, String gender, int age, String nationality, String school, String stuNumber, String job) {
        super(name, gender, age, nationality, school, stuNumber);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void meeting(){
        System.out.println("学生干部喜欢开会!");
    }
}
