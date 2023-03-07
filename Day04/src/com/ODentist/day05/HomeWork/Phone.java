package com.ODentist.day05.HomeWork;

public class Phone {
    public class MobilePhone {
        private String brand;
        private String color;
        private double price; // 构造方法

        public MobilePhone(String brand, String color, double price) {
            this.brand = brand;
            this.color = color;
            this.price = price;
        }

        public String getBrand() {
            return this.brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getPrice() {
            return this.price;
        }

        public void setPrice(double price) {
            this.price = price;
        } // 重写toString方法

        @Override
        public String toString() {
            return "手机品牌：" + this.brand + "，颜色：" + this.color + "，价格：" + this.price + "元";
        }
    }


}
