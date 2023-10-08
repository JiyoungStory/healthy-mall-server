package com.cowork.shoppingmall.domain.user.repository;
import com.cowork.shoppingmall.domain.user.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<Users,Long>  {
}
