// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4

public class tewntySecond {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6 || j == 0 || j == 6) {
                    System.out.print("4 ");
                } else if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("3 ");
                } else if (i == 2 || i == 4 || j == 2 || j == 4) {
                    System.out.print("2 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
