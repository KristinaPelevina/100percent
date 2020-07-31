package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatisticServise;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void findMax() {
        StatisticServise service = new StatisticServise();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxfromLastPosition() {
        StatisticServise service = new StatisticServise();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 12, 8, 6, 11, 11, 16};
        long expected = 16;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}