package ru.job4j.loop;

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 1; i <= height; i++) {
            for (int w = 1; w <= width; w++) {
                int summ = i + w;
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if (summ % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            System.getProperty("line.separator"); // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}
