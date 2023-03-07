package HomeWork.InnerClass;

    public class Outside{
        public void show(){

            int  a=10;
            class Inside{
                public void show(){
                    System.out.println("a = " + a);//10
                }
            }
            Inside in = new Inside();
            in.show();
        }
        public static void main(String[] args) {
            Outside outside = new Outside();
            outside.show();

        }
    }



