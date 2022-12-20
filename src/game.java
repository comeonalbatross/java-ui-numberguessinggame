
import java.awt.Component;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class game
{
    public static void main(final String[] args) {
        Random random = new Random();
        int count = 0;
        int check = 1;
        int number = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        
        while (check == 1) {
            int guess;
            do {
                
                guess = Integer.parseInt(JOptionPane.showInputDialog("Think of a number between 0-100"));
                if (guess < number) {
                    JOptionPane.showMessageDialog(null, "Increase ! ");
                }
                else if (guess > number) {
                    JOptionPane.showMessageDialog(null, "Decrease");
                }
                count++;
                
            } while (guess != number);
            JOptionPane.showMessageDialog(null, "Number was : " + number + " and you found it at " +count+".try" );
            count = 0;
            number = random.nextInt(101);
            
            check = Integer.parseInt(JOptionPane.showInputDialog("Type 1 to continue, type 0 to stop : "));
        }
    }
}

