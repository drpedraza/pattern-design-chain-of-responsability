package org.example;

public class ChurroHandler implements FactoryHandler {
    //referencia al siguiente manejador
    private FactoryHandler factoryHandler;

    //metodo para settear la fabrica
    @Override
    public void setFactoryHandler(FactoryHandler handler) {
        factoryHandler = handler;
    }

    // metodo para procesar el ingrediente
    @Override
    public void process(Ingredient ingredient) {
        if (ingredient.getName().equals("REGULAR_INGREDIENT")) {
            System.out.println("Ingrediente procesado (ChurroHandler)");
            System.out.println("");
        } else if (factoryHandler != null) {
            System.out.println("Pasala");
            factoryHandler.process(ingredient);
        } else {
            System.out.println("INGREDIENTE INVALIDO");
        }
    }
}
