package com.ohgiraffers.jenkins_test_app.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;


@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {
}