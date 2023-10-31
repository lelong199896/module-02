public class Prime1 {
    public static void main(String[] args) {
        //Hiển thị các số nguyên tố nhỏ hơn 100
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                    System.out.println(i);
            }
            count = 0;
        }
    }
}
