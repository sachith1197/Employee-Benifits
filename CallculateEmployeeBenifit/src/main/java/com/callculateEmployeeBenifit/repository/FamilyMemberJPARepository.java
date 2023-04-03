package com.callculateEmployeeBenifit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.callculateEmployeeBenifit.model.FamilyMember;

@Repository
public interface FamilyMemberJPARepository extends JpaRepository<FamilyMember, Integer> {
}
