package HomeWork.Lambda;

public class CalculatorTest {
    public interface Calculator {
        int calc(int a, int b);
    }

        public static void main(String[] args) {
            //请分别使用Lambda【标准格式】及【省略格式】调用invokeCalc方法来计算130-120的结果
            int i=130,j=120;
            invokeCalc(i,j,(int a,int b)->{return (i-j);});
            //
            invokeCalc(i,j,(a,b)->i-j);
        }

        private static void invokeCalc(int a, int b, Calculator calculator) {
            int result = calculator.calc(a, b);
            System.out.println("结果是：" + result);
        }

}
