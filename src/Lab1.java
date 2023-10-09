/**
 * Паралельне програмування
 * Лабораторна робота №1
 * Функції 1.30, 2.18, 3.09
 * F1: e = (A*(MA*ME)*SORT(B))
 * F2: h = MIN(MG*ML)
 * F3: O = SORT(P)*(MR*MS)
 * Поляков Валентин ІО-15
 * Дата 09.10.2023
 **/
public class Main {
    public static void main(String[] args) {
        Thread T1 = new T1();
        Thread T2 = new T2();
        Thread T3 = new T3();
        T1.start();
        T2.start();
        T3.start();
        try {
            T1.join();
            T2.join();
            T3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
