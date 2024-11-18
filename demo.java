import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        demoo doo = new demoo();
        boolean k = true;
        int ans = 0;
        for (; k == true;) {
            System.out.println("Enter the operator");
            char op = s.next().charAt(0);
            if (op == '+' || op == '-') {
                System.out.println("Enter the number");
                int x = s.nextInt();
                int y = s.nextInt();
                if (op == '+')
                    ans = doo.add(x, y);
                if (op == '-')
                    ans = doo.sub(x, y);
                System.out.println("Answer is:" + ans);
                ans = 0;
            } else if (op == 'x') {
                k = false;
            } else {
                System.out.println("Invalid");
            }

        }
    }
}
