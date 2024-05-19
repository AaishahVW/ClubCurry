package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Ingredient;
@Repository

public interface IngredientRepository extends JpaRepository<Ingredient, String> {
}
