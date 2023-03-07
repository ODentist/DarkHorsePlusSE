package com.ODentist.day05.HomeWork;

import java.math.BigDecimal;

public class ArrayforBigDecima {
    public static void main(String[] args) {
        double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};
        double sum = 0;
        BigDecimal z = BigDecimal.ZERO;
        for (double v : arr) {
            //z = z.add(BigDecimal.valueOf(v))
            sum += v;

        }
        //sum/= arr.length;
        //z=z.divide(BigDecimal.valueOf(arr.length));
        // System.out.println(z);
        BigDecimal bigDecimal = new BigDecimal(Double.toString(sum));
        BigDecimal bigDecimal1 = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal1);


    }
}
