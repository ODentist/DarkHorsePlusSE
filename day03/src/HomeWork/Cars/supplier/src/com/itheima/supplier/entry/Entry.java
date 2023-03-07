package HomeWork.Cars.supplier.src.com.itheima.supplier.entry;

import java.util.Random;
import java.util.function.Supplier;

public class Entry {

    // 验证码可选字符
    private static final String OPTIONS_CAHS = "023456789abcdefghjklmnopqrstuvwxyz" ;

    public static void main(String[] args) {

        // 在等号的右边补全代码
        String verificationCode = verificationCode(()->{
            char[] chars = OPTIONS_CAHS.toCharArray();
            Random random = new Random();
            StringBuilder stringBuilder = new StringBuilder();

            for (int i1 = 0; i1 < 4; i1++) {
                int i = random.nextInt(chars.length);
                stringBuilder.append(chars[i]);
            }
            return stringBuilder.toString();
        });

        // 输出
        System.out.println("本次生成的验证码为：" + verificationCode);

    }

    // 调用该方法生成一个4位的随机验证码
    public static String verificationCode(Supplier<String> supplier) {
        return supplier.get() ;
    }

}
