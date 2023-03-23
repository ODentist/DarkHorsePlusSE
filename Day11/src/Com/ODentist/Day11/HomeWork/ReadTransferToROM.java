package Com.ODentist.Day11.HomeWork;

import Com.ODentist.Day11.HomeWork.Pojo.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReadTransferToROM {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("张三",18);
        Student student1 = new Student("李四",28);
        Student student2 = new Student("王五",14);
        Student student3 = new Student("小明",23);
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day11\\src\\Com\\ODentist\\Day11\\HomeWork\\FileForHomeWork\\StudentTransfer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        oos.writeObject(students);

        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Student> students1 = (ArrayList<Student>) ois.readObject();
        for (Student s4 : students1) {
            System.out.print(s4.getName());
            System.out.println(s4.getAge());
        }
        ois.close();
    }
}
