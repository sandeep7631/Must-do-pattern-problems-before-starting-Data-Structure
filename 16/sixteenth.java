// A 
// B B 
// C C C 
// D D D D 
// E E E E E 

// public class sixteenth {
//     public static void main(String[] args) {
//         char ch='A';
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(ch+" ");
//             }
//             ch++;
//             System.out.println();
//         }
//     }
// }

//to remove or add comments to multiple lines, select all and then press ctrl+/ 


//another way (using typecasting)
public class sixteenth {
    public static void main(String[] args) {
        for(int i=65;i<=69;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char) i+" "); //typecasting
            }
            System.out.println();
        }
    }
}