package com.mercadolibre.calculadoracalorias;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class CalculadoraCaloriasApplicationTests {
  @Autowired
  private MockMvc mockMvc;

  //a) Retorna as calorias totais do prato
  @Test
  void getDishTotalCalories() throws Exception {


  }

  //b) retorna as calorias de cada ingrediente
  @Test
  void getDishIngredientsCalories() throws Exception {

  }

  //c) ingrediente com mais calorias
  @Test
  void caloricIngredient() throws Exception {

  }

  //d) Gera um endpoint para receber uma lista de pratos e devolver a lista processada.
  @Test
  void processListOfDishes() throws Exception {

  }

  private String createIngredient(String name, int weight) {
    return "{\"name\": \""+name+"\", \"weight\": "+weight+"}";
  }

}
