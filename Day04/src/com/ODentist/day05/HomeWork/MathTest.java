package com.ODentist.day05.HomeWork;

public class MathTest {
        public static void main(String[] args) {
        // 计算3的5次幂
        int result1 = (int)Math.pow(3, 5); System.out.println("3的5次幂的结果为：" + result1);

        // 计算3.2向上取整的结果
        int result2 = (int)Math.ceil(3.2);
        System.out.println("3.2向上取整的结果为：" + result2);

        // 计算3.8向下取整的结果
        int result3 = (int)Math.floor(3.8);
        System.out.println("3.8向下取整的结果为：" + result3);

        // 计算5.6四舍五入取整的结果
        int result4 = (int)Math.round(5.6);
        System.out.println("5.6四舍五入取整的结果为：" + result4);
    }

}
