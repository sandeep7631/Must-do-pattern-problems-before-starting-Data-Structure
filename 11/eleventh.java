// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

import java.util.Scanner;
public class eleventh{
    public static void main(String[] args) {
        int x;
        for(int i=1;i<=5;i++){
            x= (i%2==0) ? 0:1;
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x=1-x;
            }
            System.out.println();
        }
    }
}

// another approach
// public class eleventh {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int x=1;
//         for(int i=1;i<=n;i++){
//             if(i%2!=0) x=1;
//             for(int j=1;j<=i;j++){
//                 if(x==0){
//                     System.out.print(x);
//                     x=1;
//                 }else if(x==1){
//                     System.out.print(x);
//                     x=0;
//                 }
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }
