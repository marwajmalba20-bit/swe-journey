import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to my SWE Journey!");
        System.out.print("What is your name? ");
        
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name );
        System.out.println( name + " Let's Try Palindrome Checker");
        System.out.println("write a word you want to Check");
        String word= scanner.nextLine();
            boolean isPalindrome = true;

        // for loop: نبدأ من 0، ونستمر طالما i أصغر من نصف طول الكلمة، ونزيد i بمقدار 1
        for (int i = 0; i < word.length() / 2; i++) {
            
            // نقارن الحرف الحالي (i) مع الحرف المقابل له من النهاية
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break; // اخرج من الحلقة فورًا
            }
        }

        if (isPalindrome) {
            System.out.println("Yes! '" + word + "' is a Palindrome.");
        } else {
            System.out.println("No! '" + word + "' is NOT a Palindrome.");
        }
        scanner.close();
    }
}