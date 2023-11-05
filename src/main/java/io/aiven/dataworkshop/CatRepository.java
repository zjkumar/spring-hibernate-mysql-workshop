package io.aiven.dataworkshop;

import org.springframework.data.jpa.repository.JpaRepository;
import io.aiven.dataworkshop.model.Cat;

public interface CatRepository extends JpaRepository<Cat, Integer> {
    
}

