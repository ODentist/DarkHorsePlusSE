package com.ODentist.day08.TestHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSetToValue {
    public static void main(String[] args) {
        Map<String, String> couple = new HashMap<>();
        couple.put("hasbend1","wife1");
        couple.put("hasbend2","wife2");
        couple.put("hasbend3","wife3");
        couple.put("hasbend4","wife4");
        couple.put("hasbend5","wife5");

        Set<String> set = couple.keySet();
        for (String s : set) {
            String s1 = couple.get(s);
            System.out.println(s+s1);

        }

    }
}
