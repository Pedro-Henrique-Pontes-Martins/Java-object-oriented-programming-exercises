import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {
    /* make a program to read the values of height and width of a rectangle.
    After that, show on the screen the value of its area, perimeter and diagonal. */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Type the rectangle's width:");
        double width = sc.nextDouble(); 

        System.out.println("Type the rectangle's height:");
        double height = sc.nextDouble(); 

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Rectangle's information:");
        System.out.printf("Area: %.2f \n", rectangle.Area());
        System.out.printf("Perimeter: %.2f \n", rectangle.Perimeter());
        System.out.printf("Diagonal: %.2f \n", rectangle.Diagonal());

        sc.close();
    }
}
