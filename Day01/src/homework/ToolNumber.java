package homework;

import java.util.Scanner;

public class ToolNumber {
    public static final int IndexNumber(int [] arr,int num){
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                index=i;break;
            }
        }
        return index;
    }
    public static final String NumberString(int [] a){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i : a) {
            stringBuffer.append(i);
        }
        String s = stringBuffer.toString();
        return s;
    }
}
