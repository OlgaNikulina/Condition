package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

    @Test
    void increaseCurrentTemperature() {
        Condition condition = new Condition(32 );
        int expected = 33;
        int actual = condition.increaseCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseCurrentTemperature() {
        Condition condition = new Condition(19);
        int expected = 18;
        int actual = condition.decreaseCurrentTemperature();
        assertEquals(expected, actual);
    }
}

