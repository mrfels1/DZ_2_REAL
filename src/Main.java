import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //---------------------------------Задание 3---------------------------------------
        int[] arr1 = {1,3,5,7,9};
        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        float mean = (float)sum1/arr1.length;
        System.out.println("Mean = " + mean + " Sum = " + sum1);
        //---------------------------------Задание 4---------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arr2length = 0;
        if(sc.hasNextInt()) {
            arr2length = sc.nextInt();
        }
        int[] arr2 = new int[arr2length];
        for(int i = 0; i < arr2.length; i++){
            System.out.println("Введите число: ");
            arr2[i] = sc.nextInt();
        }
        int sum2 = 0;
        int i = 0;
        int maxnum = Integer.MIN_VALUE;
        int minnum = Integer.MAX_VALUE;
        while(i < arr2.length) {
            sum2 += arr2[i];
            if (arr2[i] > maxnum){
                maxnum = arr2[i];
            }
            if(arr2[i] < minnum){
                minnum = arr2[i];
            }
            i++;
        }
        System.out.println("Sum = " + sum2 + " Max = " + maxnum + " Min = " + minnum);
        //---------------------------------Задание 5---------------------------------------
        for (int k = 0; k < args.length; k++) {
            System.out.println("Аргумент " + k + ": " + args[k]); //Аргументов нет, ничего не выведется
        }
        //---------------------------------Задание 6---------------------------------------
        for (i = 1; i <= 10; i++) {
            System.out.printf("1/" + i + " = " + (float) 1/i + "\n");
        }
        //---------------------------------Задание 7---------------------------------------
        System.out.printf("Factorial of 4 equals: " + factroialCounter.countFactorial(4));

    }
}