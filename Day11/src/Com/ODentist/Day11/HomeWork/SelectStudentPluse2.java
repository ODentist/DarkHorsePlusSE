package Com.ODentist.Day11.HomeWork;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectStudentPluse2 {
        // 创建集合用于记录读取出的姓名
        private static List<String> list = new ArrayList<>();
        static {
            // 读姓名文件,并将读到的姓名存入到集合中
            try (BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA_Code\\DarkHorsePlusSE\\Day11\\src\\Com\\ODentist\\Day11\\HomeWork\\FileForHomeWork\\stu.txt"))) {
                String name;
                while ((name = br.readLine()) != null) {
                    list.add(name);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 打乱集合
            Collections.shuffle(list);
        }
        public static void main(String[] args) throws IOException {
            // count.txt 用于记录程序启动次数的文件
            File f = new File("count.txt");
            if (!f.exists()) { // 运行程序第一次文件不存在,写入0次
                writeCount(0, f);
            }
            // 返回当前程序启动第几次
            int count = readCount(f);
            // 判断程序是否启动3次
            if (count == 3) { // 必定张三,并删除记录次数的文件
                System.out.println("程序第3次启动：张三");
                f.delete();
            } else {
                System.out.println("程序第" + count + "次启动：" + list.get(0));
            }

        }
        /**
         * 写入程序执行次数
         *
         * @param count 次数
         * @param file  记录次数的文件
         * @throws IOException 可能出现IO异常
         */
        private static void writeCount(int count, File file) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(count + "");
            bw.flush();
            bw.close();
        }
        /**
         * 读取文件执行次数,+1,写入文件
         *
         * @param file 记录程序启动次数的文件
         * @return 当前是第几次运行程序
         * @throws IOException
         */
        private static int readCount(File file) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = br.readLine();
            int result = Integer.parseInt(s) + 1;
            br.close();
            writeCount(result, file);
            return result;
        }
}
