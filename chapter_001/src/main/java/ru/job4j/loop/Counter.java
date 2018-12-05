package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        int result = 0;
        int temp = 0;
        for (int t = start; t <= finish; t++) {
            if (t % 2 == 0) {
                result += t; //
            }
            result += temp;
        }
        return result;
    }
}