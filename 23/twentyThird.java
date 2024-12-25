// 0 0 0 0 0 0 0 0 0 10
// 0 0 0 0 0 0 0 0 9
// 0 0 0 0 0 0 0 8
// 0 0 0 0 0 0 7
// 0 0 0 0 0 6
// 0 0 0 0 5
// 0 0 0 4
// 0 0 3
// 0 2
// 1

public class twentyThird{
    public static void main(String[] args) {
        for(int i=10;i>0;i--){
            for(int j=1;j<=i;j++){
                if(j==i) System.out.print(i);
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}