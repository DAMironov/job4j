package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.RubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.RubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void whenDollarTo67RubleThen67() {
        Converter converter = new Converter();
        int result = converter.DollarToRuble(1);
        assertThat(result, is(67));
    }

    @Test
    public void whenEuroTo75RubleThen75() {
        Converter converter = new Converter();
        int result = converter.EuroToRuble(1);
        assertThat(result, is(75));
    }

    @Test
    public void when600DollarTo67RubleThen40200() {
        Converter converter = new Converter();
        int result = converter.DollarToRuble(600);
        assertThat(result, is(40200));
    }
}
