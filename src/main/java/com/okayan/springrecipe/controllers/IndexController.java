package com.okayan.springrecipe.controllers;

import com.okayan.springrecipe.domain.Category;
import com.okayan.springrecipe.domain.UnitOfMeasure;
import com.okayan.springrecipe.repositories.CategoryRepository;
import com.okayan.springrecipe.repositories.UnitOfMeasureRepository;
import com.okayan.springrecipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by onur on 01/08/2017.
 */
@Controller
@Slf4j
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        log.info("Inside IndexController");
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
