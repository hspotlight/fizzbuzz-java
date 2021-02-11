package com.codurance.training.tasks;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturn1WhenGiven1() {
        String result = new FizzBuzz().convert(1);
        assertEquals("1", result);
    }

    @Test
    public void shouldReturn2WhenGiven2() {
        String result = new FizzBuzz().convert(2);
        assertEquals("2", result);
    }

    @Test
    public void shouldReturnFizzWhenGiven3() {
        String result = new FizzBuzz().convert(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenGiven5() {
        String result = new FizzBuzz().convert(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzWhenGiven6() {
        String result = new FizzBuzz().convert(6);
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnFizzWhenGiven9() {
        String result = new FizzBuzz().convert(9);
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenGiven10() {
        String result = new FizzBuzz().convert(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnBuzzWhenGiven20() {
        String result = new FizzBuzz().convert(20);
        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenGiven15() {
        String result = new FizzBuzz().convert(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenGiven30() {
        String result = new FizzBuzz().convert(30);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenGiven45() {
        String result = new FizzBuzz().convert(45);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void specialCase5_7_5() {
        String result = new FizzBuzz(5, 7).convert(5);
        assertEquals("Fizz", result);
    }

    @Test
    public void specialCase5_7_7() {
        String result = new FizzBuzz(5, 7).convert(7);
        assertEquals("Buzz", result);
    }
}
