package com.example.security.repo;

import com.example.security.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
  // 사용자 이름으로 유저 찾기
  Optional<UserEntity> findByUsername(String username);

  // 사용자 이름으로 유저가 있는지 유무 확인
  boolean existsByUsername(String username);
}
