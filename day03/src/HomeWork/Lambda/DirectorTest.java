package HomeWork.Lambda;

public class DirectorTest {
    public interface Director {
        void makeMovie();
    }

        public static void main(String[] args) {
            //请使用Lambda【标准格式】及【省略格式】调用invokeDirect方法,打印输出“导演拍电影啦！”字样
            //1
            Director d=()-> {System.out.println(
                    "导演拍电影啦！"
            );
            };
            invokeDirect(d);
            //2
            invokeDirect(()-> System.out.println("------"));


        }
        private static void invokeDirect(Director director) {
            director.makeMovie();
        }

}
