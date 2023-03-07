package homework;

public class test01Phone {
    String brand;
    int price;

    public test01Phone() {
    }

    public test01Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "test01Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
    public void call(){
        System.out.println("给张三打电话");
    }
    public  void sendMessage(){
        System.out.println("给李四发短息: 帮我充话费");

    }
    public void playGame(){
        System.out.println("玩王者荣耀游戏");
    }

}
