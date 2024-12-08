//     *
//    ***
//   *****
//  *******
// *********

import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" "); //print spaces n-row times
            }
            for(int star=1;star<=row*2-1;star++){
                System.out.print("*"); //print stars row*2-1 times
            }
            System.out.println(); //print rows
        }
    }
}
