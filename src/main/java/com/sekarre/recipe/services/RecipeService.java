package com.sekarre.recipe.services;

import com.sekarre.recipe.commands.RecipeCommand;
import com.sekarre.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long aLong);

    void deleteById(Long idToDelete);
}
