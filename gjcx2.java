import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder output = new StringBuilder();

        if (n == 1) {
            System.out.println("End");
            return;
        }
        while (n != 1) {
            long current = n;
            if (current % 2 == 1) {
                long next = current * 3 + 1;
                output.append(current).append("*3+1=").append(next).append("\n");
                n = next;
            } else {
                long next = current / 2;
                output.append(current).append("/2=").append(next).append("\n");
                n = next;
            }
        }
        output.append("End");
        System.out.print(output);
    }
}