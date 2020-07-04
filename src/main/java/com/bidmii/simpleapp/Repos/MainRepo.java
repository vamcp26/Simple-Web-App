package com.bidmii.simpleapp.Repos;

import com.bidmii.simpleapp.entities.MainEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainRepo extends JpaRepository<MainEntity, Long> {

}