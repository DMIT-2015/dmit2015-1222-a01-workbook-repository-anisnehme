package ca.nait.dmit.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @Test
    void bmiCategory_Underweight_ReturnsCorrectResults() {
        BMI body  = new BMI();

        body.setWeight(100);
        body.setHeight(66);

        assertEquals("underweight", body.bmiCategory());
    }

    @Test
    void bmiCategory_Normal_ReturnsCorrectResults() {
        BMI body  = new BMI();

        body.setWeight(140);
        body.setHeight(66);

        assertEquals("normal", body.bmiCategory());
    }

    @Test
    void bmiCategory_Overweight_ReturnsCorrectResults() {
        BMI body  = new BMI();

        body.setWeight(175);
        body.setHeight(66);

        assertEquals("overweight", body.bmiCategory());
    }

    @Test
    void bmiCategory_Obese_ReturnsCorrectResults() {
        BMI body  = new BMI();

        body.setWeight(200);
        body.setHeight(66);

        assertEquals("obese", body.bmiCategory());
    }
}