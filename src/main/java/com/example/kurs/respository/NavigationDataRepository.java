package com.example.kurs.respository;

import com.example.kurs.model.NavigationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NavigationDataRepository extends JpaRepository<NavigationData, Long> {
}
