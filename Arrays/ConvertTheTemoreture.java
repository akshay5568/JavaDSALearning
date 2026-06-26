package Arrays;

public class ConvertTheTemoreture {
    public static void main(String[] args) {

    }

    static double[] convertTemperature(double celsius) {
        double KelvinFormula = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{KelvinFormula,Fahrenheit};
    }
}
