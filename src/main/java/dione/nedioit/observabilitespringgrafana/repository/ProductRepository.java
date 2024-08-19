package dione.nedioit.observabilitespringgrafana.repository;

import dione.nedioit.observabilitespringgrafana.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
