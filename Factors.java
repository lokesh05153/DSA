class Factors1to10 {
    public static void main(String[] args) {
        System.out.println("Factors of numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Factors of " + i + ": ");
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}