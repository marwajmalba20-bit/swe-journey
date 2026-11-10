public class User {
    // 1. الخصائص (Attributes) - مخفية (private) لحمايتها
    private String name;
    private String email;
    private String password;

    // 2. الباني (Constructor) - دالة تشتغل أول ما ننشئ مستخدم جديد
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // 3. دالة تطبع معلومات المستخدم
    public void displayProfile() {
        System.out.println("--- User Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }

    // 4. دالة تفحص طول الباسوورد
    public boolean isPasswordStrong() {
        if (password.length() >= 8) {
            return true;  // الباسوورد قوي
        } else {
            return false; // الباسوورد ضعيف
        }
    }
}