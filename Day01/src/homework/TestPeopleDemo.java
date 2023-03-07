package homework;

public class TestPeopleDemo {
    public static void main(String[] args) {
        Test2Student test2Student = new Test2Student("zhangsan","male",22,"China","CDTU","12306");
        Test2Worker test2Worker = new Test2Worker();
        Test2StudentManager test2StudentManager = new Test2StudentManager();
        test2Student.work();
        test2StudentManager.work();
        test2Worker.work();
    }
}
