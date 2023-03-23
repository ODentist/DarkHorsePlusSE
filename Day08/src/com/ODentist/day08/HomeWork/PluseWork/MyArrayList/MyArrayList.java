package com.ODentist.day08.HomeWork.PluseWork.MyArrayList;

public class MyArrayList <E >{
   private Object[] elementData;
   private int size;

        public MyArrayList() {
            elementData = new Object[10];
        }

        public void add(E e) {
            elementData[size++] = e;
        }

        public void remove(int index) {
            for (int i = index; i < size - 1; i++) {
                elementData[i] = elementData[i + 1];
            }
            size--;
        }

        public void set(int index, E e) {
            elementData[index] = e;
        }

        public E get(int index) {
            return (E) elementData[index];
        }

        public int size() {
            return size;
        }

}
