package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void whenDollarTo67RubleThen67() {
        Converter converter = new Converter();
        int result = converter.DollarToruble(1);
        assertThat(result, is(67));
    }

    @Test
    public void whenEuroTo75RubleThen75() {
        Converter converter = new Converter();
        int result = converter.EuroToruble(1);
        assertThat(result, is(75));
    }
}
