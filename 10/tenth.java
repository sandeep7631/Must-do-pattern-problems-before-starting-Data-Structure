// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalRows=2*n-1;
        for(int i=1;i<=totalRows;i++){
            int currentRow = i<=n ? i : totalRows-i + 1;
            int stars= 2*currentRow-1;
            for(int j=1;j<=currentRow;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
