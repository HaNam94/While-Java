import java.util.Scanner;

public class Prime {

    static boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        if( number < 2){
//            System.out.println(number + " is not a prime");
//        }
//        else {
//            int i = 2;
//            boolean check = true;
//            while (i < number){
//                if ( number % i == 0){
//                    check = false;
//                    break;
//                }
//                i++;
//            }
//            if (check)
//                System.out.println(number + " is a prime");
//            else
//                System.out.println(number + " is not a prime");
//        }


//        System.out.print("Nhập số lượng số nguyên tố cần hiện thị: ");
//        int numbers = scanner.nextInt();
//        int count = 0;
//        int N = 2;
//        while (count < numbers){
//            boolean isPrime = true;
//            for (int i = 2; i < Math.sqrt(N) ; i++) {
//                if (N % i == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime){
//                System.out.print(N + " ");
//                count++;
//            }
//            N++;
//        }


        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 2; i < 100 ; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

}
