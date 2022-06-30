package ru.netology.sqr.numberofsquares.serveses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/squares.csv")

    public void searchExact(int expected, int lowLimit, int highLimit) {
        SQRService service = new SQRService();

        int actual = service.searchSquares(lowLimit, highLimit);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//
//    public void searchMaximumValue() {
//        SQRService service = new SQRService();
//
//        int expected = 90;
//        int actual = service.searchSquares(10, 9801);
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//
//    public void lowLimitInside() {
//        SQRService service = new SQRService();
//
//        int expected = 89;
//        int actual = service.searchSquares(121, 9801);
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//
//    public void highLimitInside() {
//        SQRService service = new SQRService();
//
//        int expected = 89;
//        int actual = service.searchSquares(100, 9604);
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//
//    public void lowLimitOutside() {
//        SQRService service = new SQRService();
//
//        int expected = 90;
//        int actual = service.searchSquares(81, 9801);
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//
//    public void highLimitOutside() {
//        SQRService service = new SQRService();
//
//        int expected = 90;
//        int actual = service.searchSquares(100, 10000);
//
//        Assertions.assertEquals(expected, actual);
//    }
}