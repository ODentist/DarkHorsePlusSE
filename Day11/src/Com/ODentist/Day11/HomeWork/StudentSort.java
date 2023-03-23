package Com.ODentist.Day11.HomeWork;

import Com.ODentist.Day11.HomeWork.Pojo.Student;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class StudentSort {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day11\\src\\Com\\ODentist\\Day11\\HomeWork\\FileForHomeWork\\stu1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = new String();
        Set<Student> set = new TreeSet<>(((o1, o2) -> o1.getAge()- o2.getAge()));

        while ((s= br.readLine())!=null){
            Student student = new Student();
            String[] split = s.split(",");
            student.setName(split[0]);
            student.setAge(Integer.parseInt(split[1]));
            set.add(student);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
        for (Student student1 : set) {
            bw.write(student1.toString());
            bw.newLine();
        }
        br.close();
        bw.close();

    }
}
