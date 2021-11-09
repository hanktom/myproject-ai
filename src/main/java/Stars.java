public class Stars {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            for (int j = 0; j < 20; j++) {
                if (j==0 || j==19 || (j>=2 && j<=17)) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
