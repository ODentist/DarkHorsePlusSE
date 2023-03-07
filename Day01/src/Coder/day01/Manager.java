package Coder.day01;

public class Manager extends Person{
    public double prise;

    public Manager(double prise) {
        this.prise = prise;
    }

    public Manager(double salary, String name, String id, double prise) {
        super(salary, name, id);
        this.prise = prise;
    }

    public Manager() {
    }

    public Manager(double salary, String name, String id) {
        super(salary, name, id);
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    @Override
    public void work() {
        System.out.println("上班");
    }
}
