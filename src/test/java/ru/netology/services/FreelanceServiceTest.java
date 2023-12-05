package ru.netology.services;

import com.sun.nio.sctp.Association;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelanceServiceTest {
    @Test
    public void testCalculate1() {
        FreelanceService service = new FreelanceService();

        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculate2() {
        FreelanceService service = new FreelanceService();

        int actual = service.calculate(100000, 60000, 150000);
        int expected = 2;


        Assertions.assertEquals(expected, actual);
    }
}