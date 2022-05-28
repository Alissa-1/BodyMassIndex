public class BmiService {
    public double calculate(double heightInSm, double weightInKg) {
        double a = heightInSm / 100;
        double BMI = weightInKg / (a * a);
        return BMI;
    }
}
