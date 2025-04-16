package org.example;

public interface FactoryHandler {
    // metodo para establecer el siguiente manejador
    void setFactoryHandler(FactoryHandler handler);
    // metodo para procesar el ingrediente
    void process(Ingredient ingredient);
}
