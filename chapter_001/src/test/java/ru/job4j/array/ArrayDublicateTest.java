package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDublicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] except =  {"Привет", "Мир", "Супер"};
        ArrayDublicate dublicate = new ArrayDublicate();
        String[] result = dublicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }
}
