package com.okayan.springrecipe.services;

import com.okayan.springrecipe.domain.Recipe;

import java.util.Set;

/**
 * Created by onur on 03/08/2017.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

}
