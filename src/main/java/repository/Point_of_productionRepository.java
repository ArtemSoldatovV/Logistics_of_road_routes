package repository;

import entity.Point_of_sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Point_of_productionRepository extends JpaRepository<Point_of_sale, Long> {

}