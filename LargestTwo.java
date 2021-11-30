import java.util.Scanner;
public class LargestTwo
{
    public static void main (String[] args)
    {
        //Scanner scn = new Scanner (System.in);
       // System.out.println("Enter no. of elements you want in list:");
        //int n = scn.nextInt();

        int list[] = {11,22,45,92,21,54,79,11};
        System.out.println("Enter all the elements:");
        for (int i = 0; i < list.length; i++)
        {
         //   list[i] = scn.nextInt();
        }

        int largest1, largest2, temp;

        largest1 = list[0];
        largest2 = list[1];

        if (largest1 < largest2)
        {
            temp = largest1;
            largest1 = largest2;
            largest2 = temp;
        }

        for (int i = 2; i < list.length; i++)
        {
            if (list[i] > largest1)
            {
                largest2 = largest1;
                largest1 = list[i];
            }
            else if (list[i] > largest2 && list[i] != largest1)
            {
                largest2 = list[i];
            }
        }

        System.out.println ("The First largest is " + largest1);
        System.out.println ("The Second largest is " + largest2);

    }
}

