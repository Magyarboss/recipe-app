package guru.springframework.recipeapp.controllers;

import guru.springframework.recipeapp.service.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.ui.Model;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IndexControllerTest {

    @Mock
    RecipeService recipeService;
    @Mock
    Model model;

    IndexController indexController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        indexController = new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {
        String returnString = indexController.getIndexPage(model);


//        model.addAttribute("recipes", recipeService.getRecipes());

//        when(model.addAttribute("recipes")).thenReturn(returnString);

        assertEquals( "index", returnString);

        verify(model, times(1)).addAttribute(eq("recipes"), anySet());
        verify(recipeService, times(1)).getRecipes();

    }
}