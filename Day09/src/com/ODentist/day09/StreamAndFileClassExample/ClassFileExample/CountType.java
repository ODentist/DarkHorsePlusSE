package com.ODentist.day09.StreamAndFileClassExample.ClassFileExample;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountType {
    public static void main(String[] args) {
        File file = new File("D:\\JAVA_Code\\DarkHorsePlusSE\\Day09\\src\\com\\ODentist\\day09\\Stream\\Resource\\TypeCount");
        HashMap<String, Integer> detected = Detected(file);
        System.out.println(detected);
    }

    public static HashMap<String, Integer> Detected(File file) {
        HashMap<String, Integer> map = new HashMap<>();
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                String name = file1.getName();
                String[] fileArr = name.split("\\.");
                if (fileArr.length >= 2) {
                    String typeName = fileArr[fileArr.length - 1];
                    if (map.containsKey(typeName)) {
                        int count = map.get(typeName);
                        count++;
                        map.put(typeName, count);
                    } else {
                        map.put(typeName, 1);
                    }
                }
            } else {
                //ziwenjian
                HashMap<String, Integer> detectedSonType = Detected(file1);
                Set<Map.Entry<String, Integer>> entries = detectedSonType.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if (map.containsKey(key)) {
                        int count = map.get(key);
                        count = count + value;
                        map.put(key, count);
                    } else {
                        map.put(key, value);
                    }
                }
            }
        }
        return map;
    }
}
