package Test;

public final class ToolClass {
    private ToolClass(){}
    public static int getMax(int [ ]arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
                max=arr[i];
            
        }
        return  max;
    }
}
