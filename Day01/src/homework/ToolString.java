package homework;

public class ToolString {
    public static final int method1 (String s,char a){
        int count=0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (a==aChar)count++;
        }
        return count;
    }
    public static final String method2(String s){
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i++) {
            if (chars[i]<97&&chars[i]>64) {
                chars[i] = (char) (chars[i] + 32);
//                System.out.print(aChar);
                continue;
            }
            if (chars[i] >96&&chars[i] <123) {
                chars[i]  = (char) (chars[i] - 32);
//                System.out.print(aChar);
                continue;
            }
        }
        String s1 = new String(chars);
        return s1;

    }
}
