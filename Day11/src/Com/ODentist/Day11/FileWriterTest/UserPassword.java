package Com.ODentist.Day11.FileWriterTest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserPassword {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        FileWriter fileWriter = new FileWriter("D:\\JAVA_Code\\DarkHorsePlusSE\\Day11\\src\\Com\\ODentist\\Day11\\FileTest\\UsernamePassword.txt");
        fileWriter.write(s);
        String s1 = scanner.nextLine();
        fileWriter.flush();
        fileWriter.write("\r\n");
        fileWriter.write(s1);
        fileWriter.close();
    }
}
