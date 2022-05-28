public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BMI = service.calculate(200, 90);
        System.out.println("Body Mass Index: ");
        System.out.printf("%.1f", BMI);
    }
}
