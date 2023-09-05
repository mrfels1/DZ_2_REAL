public class factroialCounter {
    public static int  countFactorial(int n){
        if (n <= 2) {
            return n;
        }
        return n * countFactorial(n - 1);
    }
}
