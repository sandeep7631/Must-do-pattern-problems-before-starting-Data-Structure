//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA

public class seventeenth {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            char ch='A';
            for(int s=1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            char cha=--ch;
            for(int j=i-1;j>=1;j--){
                System.out.print(--cha);
                
            }
            System.out.println();
        }
    }    
}
