package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // implementacion de las 3 fabricas
        FactoryHandler churroHandler = new ChurroHandler();
        FactoryHandler softChurroHandler = new SoftChurroHandler();
        FactoryHandler hardChurroHandler = new HardChurroHandler();

        churroHandler.setFactoryHandler(softChurroHandler);
        softChurroHandler.setFactoryHandler(hardChurroHandler);

        Ingredient ingredient = new Ingredient("REGULAR_INGREDIENT");
        churroHandler.process(ingredient);

        ingredient = new Ingredient("SOFT_INGREDIENT");
        churroHandler.process(ingredient);

        ingredient = new Ingredient("HARD_INGREDIENT");
        churroHandler.process(ingredient);

        ingredient = new Ingredient("SPICY_INGREDIENT");
        churroHandler.process(ingredient);

        }
    }