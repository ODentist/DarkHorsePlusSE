package Com.ODentist.Day11.HomeWork;

import java.io.*;
import java.util.Arrays;
import java.util.TreeSet;

public class SortNumber {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day11\\src\\Com\\ODentist\\Day11\\HomeWork\\FileForHomeWork\\Number.txt");
        BufferedReader bfr = new BufferedReader(new FileReader(file));
        String s = bfr.readLine();
        String[] s1 = s.split(" ");
        int[] ints = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            ints[i]= Integer.parseInt(s1[i]);
        }
        BufferedWriter bfw = new BufferedWriter(new FileWriter(file,true));
        Arrays.sort(ints);
        for (int anInt : ints) {
            bfw.write(anInt+" ");
        }
        bfw.newLine();
        bfr.close();
        bfw.close();
    }
}
