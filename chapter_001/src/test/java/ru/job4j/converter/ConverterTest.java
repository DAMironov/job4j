package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when67RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(67);
        assertThat(result, is(1));
    }

    @Test
    public void when75RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(75);
        assertThat(result, is(1));
    }

    @Test
    public void whenDollarTo67RubleThen67() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(67));
    }

    @Test
    public void whenEuroTo75RubleThen75() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(75));
    }

    @Test
    public void when600DollarTo67RubleThen40200() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(600);
        assertThat(result, is(40200));
    }

    @Test
    public void when40200RubleToDollarThen600() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(40200);
        assertThat(result, is(600));
    }

    @Test
    public void when45000RubleToEuroThen600() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(45000);
        assertThat(result, is(600));
    }

    @Test
    public void when600EuroTo75RubleThen45000() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(600);
        assertThat(result, is(45000));
    }
}
