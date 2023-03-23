package Com.ODentist.Day11.HomeWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SelectStudent {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day11\\src\\Com\\ODentist\\Day11\\HomeWork\\FileForHomeWork\\stu.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        List<String> s1 = new ArrayList<>();
        while ((s = br.readLine()) != null)
            s1.add(s);
        Random random = new Random();
        select(s1,random);

    }

    public static void select(List<String> s1, Random random) {
        Scanner scanner = new Scanner(System.in);
        String s2;
        while (s1.size() > 0) {
            int i1 = random.nextInt(s1.size());
            System.out.println("中奖"+s1.get(i1));
            s1.remove(i1);
            s2=scanner.nextLine();
            if (s2.equals("\r\n")) select(s1, random);
            if ("over".equalsIgnoreCase(s2)){
                System.out.println("it is over");
                break;
            }
        }

    }
}