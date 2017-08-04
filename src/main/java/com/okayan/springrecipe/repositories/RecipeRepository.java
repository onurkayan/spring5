package com.okayan.springrecipe.repositories;

import com.okayan.springrecipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by onur on 02/08/2017.
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
