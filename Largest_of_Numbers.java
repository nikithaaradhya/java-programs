
import java.util.Scanner;
import java.lang.Math;
public class Largest_of_Numbers {
    static int max(int x,int y,int z)
    {
        if (x >= y && x >= z)

            // Returning 1st number if largest
            return x;

            // Comparing 2nd no with 1st and 3rd no
        else if (y >= x && y >= z)

            // Return z if the above conditions are false
            return y;

        else

            // Returning 3rd no, Its sure it is greatest
            return z;
    }
        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.println("Please input 3 integers: ");
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            int max = max(x,y,z);
            System.out.println(x + " " + y + " "+z);
            System.out.println("The max of three is: " + max);
        }
    }
