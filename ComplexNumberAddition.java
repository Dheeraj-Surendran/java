import java.util.Scanner;

class Complex {
    double real, imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    @Override
    public String toString() {
        if (imaginary > 0) {
            return real + "+" + imaginary + "i";
        } else if (imaginary < 0) {
            return real + "-" + Math.abs(imaginary) + "i";
        } else {
            return Double.toString(real);
        }
    }
}

public class ComplexNumberAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter real part:");
        double real1 = scanner.nextDouble();
        System.out.println("enter imaginary part:");
        double imaginary1 = scanner.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);
        System.out.println("enter real part:");
        double real2 = scanner.nextDouble();
        System.out.println("enter imaginary part:");
        double imaginary2 = scanner.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);
        Complex sum = complex1.add(complex2);
        System.out.println("result:" + sum);
        scanner.close();
    }
}
