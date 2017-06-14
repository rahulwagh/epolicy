package org.epolicy.repository;

import org.epolicy.domain.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rahulwagh on 07-06-2017.
 */
@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long>{
}
