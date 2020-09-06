package com.sekarre.recipe.services;

import com.sekarre.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
