package guru.springframework.recipeapp.service;

import guru.springframework.recipeapp.commands.RecipeCommand;
import guru.springframework.recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);

}
