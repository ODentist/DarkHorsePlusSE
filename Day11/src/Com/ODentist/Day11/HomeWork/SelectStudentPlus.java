package Com.ODentist.Day11.HomeWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SelectStudentPlus {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day11\\src\\Com\\ODentist\\Day11\\HomeWork\\FileForHomeWork\\stu.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        List<String> s1 = new ArrayList<>();
        while ((s = br.readLine()) != null)
            s1.add(s);
        Random random = new Random();
        int count=0;
        select(s1,random,count);



    }

    public static void select(List<String> s1, Random random,int count) {
        Scanner scanner = new Scanner(System.in);
        String s2;
        while (s1.size() > 0) {
            int i1 = random.nextInt(s1.size());
            System.out.println("中奖"+s1.get(i1));
            s1.remove(i1);
            s2=scanner.nextLine();
            if (s2.equals("\r\n")) {
                if (count==2){
                    for (String s : s1) {
                        if ("张三".equals(s)){
                            System.out.println("中奖"+s);
                            s1.remove(s);
                        }
                    }
                    continue;
                }
                select(s1, random,count++);
            }
            if ("over".equalsIgnoreCase(s2)){
                System.out.println("it is over");
                break;
            }
        }

    }
}
