package org.campus02.ronchetti;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    private BMICalculator bmiCalculator;

    @BeforeEach
    void setUp() {
        bmiCalculator = new BMICalculator(180, 1.8);
    }

    @Test
    @DisplayName("Konstruktor Test")
    void testConstructor(){
        Assertions.assertEquals(180,bmiCalculator.getWeightInKG());
        Assertions.assertEquals(1.8,bmiCalculator.getHeightInMeters());
    }

    @org.junit.jupiter.api.Test
    void result() {
        Assertions.assertEquals("obese",bmiCalculator.result());
    }
}