package guru.springframework.services;

import com.talbn1.recipe.domain.Recipe;
import com.talbn1.recipe.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void before() {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }


    @Test
    void getRecipes() {
        Recipe receipe = new Recipe();
        HashSet receipesData = new HashSet();
        receipesData.add(receipe);

        when(recipeRepository.findAll()).thenReturn(receipesData);

        Set<Recipe>  recipes = recipeService.getRecipes();
        assertEquals(recipes.size(), 1);
        verify(recipeRepository,times(1)).findAll();
    }
}