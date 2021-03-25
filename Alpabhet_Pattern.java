package com.company;
import java.util.Scanner;
public class Alpa_Pattern {

        void display(int n)
        {

            for (int i = 0; i<=n; i++) {

                for (int j = 0; j<= n / 2; j++) {

                    if ((j == 0 || j == n / 2) && i != 0 ||

                            i == 0  && j != n / 2 ||

                            i == n / 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
     static void printN(int n)
    {
        int i, j, counter = 0;
        for (i = 0; i < n; i++)
        {
            System.out.printf("*");
            for (j = 0; j <= n; j++)
            {
                if (j == n)
                    System.out.printf("*");
                else if (j == counter)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            counter++;
            System.out.printf("\n");
        }
    }
   /* static void printPattern(char character)
    {
      //  char character = 'A';
        switch (character) {
            case 'A':
                printN();
                break;
        }
            //printPattern(character);
    }*/
        public static void main(String[] args)
        {
           Scanner sc = new Scanner(System.in);
            Alpa_Pattern a = new Alpa_Pattern();
            a.display(7);

            a.printN(5);
        }
    }


