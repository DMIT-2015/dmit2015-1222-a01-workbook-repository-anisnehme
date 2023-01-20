package ca.nait.dmit.domain;

public class BMI {

    private int weight;
    private int height;

    public BMI() {
    }

    public BMI(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double bmi() {
        return ((double) 703 * weight) / Math.pow(height, 2);
    }

    public String bmiCategory() {
        double bmi = bmi();

        if (bmi < 18.5) {
            return "underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "normal";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "overweight";
        } else {
            return "obese";
        }
    }

}
