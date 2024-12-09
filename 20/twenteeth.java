// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

public class twenteeth{
    public static void main(String[] args){
        int n=5;
        int totalRows=2*n-1;
        for(int i=1;i<=totalRows;i++){
            int currentRow = i<=n ? i : totalRows-i+1;
            for(int j=1;j<=currentRow;j++){
                System.out.print("*");
            }
            for(int s=0;s<2*(n-currentRow);s++){
                System.out.print(" ");
            }
            for(int j=1;j<=currentRow;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}