public class EvenSum {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        // Using while loop
        while (i <= 10) {
            sum = sum + (i * 2);
            i++;
        }

        System.out.println("Sum using while loop = " + sum);

        // Using do-while loop
        sum = 0;
        i = 1;

        do {
            sum = sum + (i * 2);
            i++;
        } while (i <= 10);

        System.out.println("Sum using do-while loop = " + sum);
    }
}