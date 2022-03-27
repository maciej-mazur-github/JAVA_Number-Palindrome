public class NumberPalindrome {
    public static int reverseNumber(int number) {

        int reversedNumber = 0;

        while(number != 0) {
            reversedNumber *= 10;  // does nothing in the first step (0 * 10 = 0) but shifts reversedNumber by one position in further loop steps
            reversedNumber += number % 10;
            number /= 10;
        }

        return reversedNumber;
    }

    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(12345));
        System.out.println(reverseNumber(1212));
        System.out.println(reverseNumber(-486));
        System.out.println(reverseNumber(-4976));
        System.out.println("****************************");
        System.out.println(isPalindrome(12345));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(11));
    }
}
