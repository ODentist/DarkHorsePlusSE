package Com.ODentist.Day10.HomeWork;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class InPutStudent {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("Day10\\src\\Com\\ODentist\\Day10\\HomeWork\\repository\\student.txt",true));
        Scanner scanner = new Scanner(System.in);
        int count=1;
        System.out.println("请输入第"+count+"位学生信息，输入ok表示结束");
        String s = scanner.nextLine();
        bufferedOutputStream.write(s.getBytes());
        bufferedOutputStream.write("\r\n".getBytes());
        while (!s.equals("ok")){
            if (s.equals("ok")){break;}
            count++;
            System.out.println("请输入第"+count+"位学生信息，输入ok表示结束");
            s = scanner.nextLine();
            bufferedOutputStream.write(s.getBytes());
            bufferedOutputStream.write("\r\n".getBytes());
        }
        bufferedOutputStream.close();

//        FileOutputStream fileOutputStream = new FileOutputStream("Day10\\src\\Com\\ODentist\\Day10\\HomeWork\\repository\\student.txt", true);
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        int count=1;
//        while (true){
//            if (s.equals("ok"))
//                break;
//            System.out.println("请输入第"+count+"位学生信息，输入ok表示结束");
//            count++;
//            byte[] bytes = s.getBytes();
//            fileOutputStream.write(bytes);
//            fileOutputStream.write("\r\n".getBytes());
//        }
//        fileOutputStream.close();
    }
}
