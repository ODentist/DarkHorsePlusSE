package homework;

public class Test2Worker extends TestPerson{
    public String unit;
    public int workAge;

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子");
    }

    public Test2Worker() {
    }

    public Test2Worker(String name, String gender, int age, String nationality, String unit, int workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }
}
