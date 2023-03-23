package Com.ODentist.day15.Reflect.ReflectComplexExample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class ReflectionExample {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        Student student = new Student("zhangsan", 18, '男', 185.0, "run");
        Teacher teacher = new Teacher("王小明", 8000);
        save(student);
        save(teacher);


    }
    public static void save(Object o) throws IOException, IllegalAccessException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JAVA_Code\\DarkHorsePlusSE\\Day15\\src\\Com\\ODentist\\day15\\Reflect\\ReflectComplexExample\\temple.txt",true));
        Class<?> aClass = o.getClass();
        String simpleName = aClass.getSimpleName();
        System.out.println(simpleName);

        bufferedWriter.write("=========="+simpleName+"==========");
        bufferedWriter.newLine();

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            String name = declaredField.getName();
            declaredField.setAccessible(true);
            Object value = declaredField.get(o);
            bufferedWriter.write(name+"="+value);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
