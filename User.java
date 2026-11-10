public class User {
    // 1. الخصائص
    private String name;
    private String email;
    private String password;

    // 2. الباني (Constructor)
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // 3. دالة طباعة المعلومات
    public void displayProfile() {
        System.out.println("--- User Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }

    // 4. فحص الباسوورد
    public boolean isPasswordStrong() {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    // 5. دالة القراءة (Getter)
    public String getEmail() {
        return email;
    }

    // 6. دالة التعديل (Setter)
    public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            this.password = newPassword;
            System.out.println("Password updated successfully.");
        } else {
            System.out.println("Error: New password is too weak.");
        }
    }
}