package com.demo.servermanager.repo;

import com.demo.servermanager.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIdAddress(String ipAddress);
}
