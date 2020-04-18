public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        calculator1.a = 25;

        Calculator calculator2 = new Calculator();
        calculator2.a = 31;

        Calculator calculator3 = new Calculator();
        calculator3.r = 1.5;

        Calculator calculator4 = new Calculator();
        calculator4.k = 4;

        System.out.println("Czy liczba całkowita jest parzysta: "
                + calculator1.isEven(25));

        System.out.println("Czy liczba całkowita jest nieparzysta: "
                + calculator2.isOdd(31));

        System.out.println("Pole koła wynosi: "
                + calculator3.circleField(1.5));

        System.out.println(" liczba całkowita podniesiona do drugiej potęgi wynosi: "
                + calculator4.power(4));
    }
}
