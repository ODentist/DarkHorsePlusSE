package Com.ODentist.Day10.HomeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class ReadTextFromStudent {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\HomeWork\\repository\\student.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\JAVA_Code\\DarkHorsePlusSE\\Day10\\src\\Com\\ODentist\\Day10\\HomeWork\\repository\\SortedStudent.txt");
        int data;
        StringBuilder stringBuilder = new StringBuilder();
        while ((data = fileInputStream.read()) != -1) {
            stringBuilder.append((char) data);
        }
        String s1 = stringBuilder.toString();
        String[] split = s1.split("\r\n");
        HashMap<String, String> studentMap = new HashMap<>();
        for (String s : split) {
            String[] split1 = s.split(",");
            studentMap.put(split1[0],split1[1]);
        }
        String[] split1 = split.toString().split(",");

        Map<String, String> result = new HashMap<>();
        Set<Map.Entry<String, String>> entries = studentMap.entrySet();
        entries.stream().sorted(Map.Entry.comparingByValue()).forEach(x->result.put(x.getKey(),x.getValue()));
        String s = result.toString();
        fileOutputStream.write(s.getBytes());
        fileOutputStream.close();
        fileInputStream.close();
    }
}
