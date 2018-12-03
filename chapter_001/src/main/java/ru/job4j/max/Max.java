package ru.job4j.max;

public class Max {
    public int max(int first, int second) {
        return first < second ? second : first;
    }

    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        return max((temp), third);
    }
}
