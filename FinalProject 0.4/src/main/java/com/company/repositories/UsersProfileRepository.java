package com.company.repositories;

import com.company.models.UsersProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersProfileRepository extends JpaRepository<UsersProfile, Long> {
}
