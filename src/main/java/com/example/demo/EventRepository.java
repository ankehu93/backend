package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository {

    interface NameRepository extends JpaRepository<Event, String> {

    }
}
