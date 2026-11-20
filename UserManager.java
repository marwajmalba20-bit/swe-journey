import java.util.HashMap;
import java.util.Collection;

public class UserManager {
    
    // 1. المخزن (HashMap): المفتاح هو الإيميل، والقيمة هي كائن المستخدم
    private HashMap<String, User> usersMap;

    // 2. الباني (Constructor)
    public UserManager() {
        this.usersMap = new HashMap<>();
    }

    // 3. دالة إضافة مستخدم
    public void addUser(User user) {
        usersMap.put(user.getEmail(), user);
        System.out.println("✅ User added: " + user.getEmail());
    }

    // 4. دالة البحث (تحتاج إلى إكمالها!)
    public User findUser(String email) {
        if (usersMap.containsKey(email)) {
            return usersMap.get(email);
            
        }
        // المطلوب منك هنا: 
        // إذا كان الإيميل موجوداً، أرجعي الكائن (User)
        // إذا لم يكن موجوداً، أرجعي null
        return null; // غيري هذا السطر
    }

    // 5. دالة طباعة كل المستخدمين (تحتاج إلى إكمالها!)
    public void displayAllUsers() {
        System.out.println("\n--- All Registered Users ---");
        Collection<User> allUsers = usersMap.values();
        for (User user : allUsers) {
            System.out.println(user.getEmail());
    // اطبعي إيميل المستخدم هنا
}
        // المطلوب منك هنا:
        // استخدمي for-each loop للمرور على القيم المخزنة في الـ HashMap
        // تلميح: Collection<User> allUsers = usersMap.values();
        // ثم اطبعي إيميل كل مستخدم
    }
}