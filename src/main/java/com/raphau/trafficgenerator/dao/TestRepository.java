package com.raphau.trafficgenerator.dao;

import com.raphau.trafficgenerator.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TestRepository extends JpaRepository<Test, Integer> {
    Test[] findAllByName(String name);
}
