package recursion;

public class RecursionTask {
    public static int recursion(int n) {
        int result;

        if (n == 1) {
            return 1;
        }

        result = recursion(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
}
