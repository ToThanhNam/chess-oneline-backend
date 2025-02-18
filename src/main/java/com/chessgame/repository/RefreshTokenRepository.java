package com.chessgame.repository;

import com.chessgame.entity.RefreshToken;
import com.chessgame.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);
    
    @Modifying // Annotation to indicate that the query is a modification query
    int deleteByUser(User user);
} 