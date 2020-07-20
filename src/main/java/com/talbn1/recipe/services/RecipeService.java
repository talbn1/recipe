package com.talbn1.recipe.services;

import com.talbn1.recipe.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();
}
