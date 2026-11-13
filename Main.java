import java.util.Scanner;
import java.util.ArrayList;

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
        System.out.println("\n--- Testing OOP ---");
        
        // إنشاء كائن (Object) جديد من الكلاس User
        User user1 = new User("Marwa", "marwa@email.com", "pass123");
        User user2 = new User("Sara", "sara@email.com", "strongPassword123");

        // استدعاء الدالة للكائن الأول
        user1.displayProfile();
        if (user1.isPasswordStrong()) {
            System.out.println("Password is Strong ✅");
        } else {
            System.out.println("Password is Weak ❌");
        }

        // استدعاء الدالة للكائن الثاني
        user2.displayProfile();
        if (user2.isPasswordStrong()) {
            System.out.println("Password is Strong ✅");
        } else {
            System.out.println("Password is Weak ❌");
        }
                // جرب قراءة الإيميل
        System.out.println("Reading email securely: " + user1.getEmail());

        // جرب تغيير الباسوورد لباسوورد قصير (يجب أن يرفض)
        user1.setPassword("123");
        
        // جرب تغيير الباسوورد لباسوورد طويل (يجب أن يقبل)
        user1.setPassword("newStrongPassword123");
        scanner.close();
             System.out.println("\n--- Testing ArrayList ---");
        
        // 1. إنشاء قائمة من نوع User
        ArrayList<User> usersList = new ArrayList<>();

        // 2. إنشاء مستخدمين وإضافتهم للقائمة
        User u1 = new User("Ali", "ali@test.com", "password123");
        User u2 = new User("Noura", "noura@test.com", "pass");
        
        usersList.add(u1);
        usersList.add(u2);

        // 3. طباعة عدد المستخدمين
        System.out.println("Total users: " + usersList.size());

        // 4. الدوران على القائمة (Loop) وطباعة كل مستخدم
        for (int i = 0; i < usersList.size(); i++) {
            User currentUser = usersList.get(i);
            System.out.println("User #" + (i+1) + ": " + currentUser.getEmail());
        }   
    }
}