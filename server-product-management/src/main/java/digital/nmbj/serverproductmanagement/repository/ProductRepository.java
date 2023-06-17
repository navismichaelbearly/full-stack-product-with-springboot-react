package digital.nmbj.serverproductmanagement.repository;

import digital.nmbj.serverproductmanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
