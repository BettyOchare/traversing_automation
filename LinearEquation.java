package linear.equation;

import java.util.Arrays;

public class LinearEquation {
    public static void main(String[] args) {
        // Coefficients of the linear equations
        double a = 5, b = 6, c = 57;
        double d = 4, e = 1, f = 19;

        // Printing the matrix form
        System.out.println("Matrix form: ");
        double[][] coefficientsMatrix = {{a, b}, {d, e}};
        for (double[] row : coefficientsMatrix) {
            System.out.println(Arrays.toString(row));
        }

        // Calculating the determinant
        double determinant = (a * e) - (b * d);
        System.out.println("Determinant of matrix: " + determinant);

        // Checking if the system of equations has a unique solution
        if (determinant == 0) {
            System.out.println("The system of equations has no unique solution.");
        } else {
            // Calculating the values of x and y
            double x = ((c * e) - (b * f)) / determinant;
            double y = ((a * f) - (c * d)) / determinant;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
