package com.marwa.my.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // لا تكتبي أي شيء هنا!
    // Spring Data JPA سيقوم تلقائياً بإنشاء دوال الحفظ والبحث والحذف خلف الكواليس.
}
