// E 
// D E
// C D E
// B C D E

public class eigtheenth {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            char ch= (char)('E'-i);
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch+j)+" ");
            }
            System.out.println();
        }
    }
}