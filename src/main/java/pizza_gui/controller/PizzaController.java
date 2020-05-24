package pizza_gui.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import pizza_gui.model.Ingredient;
import pizza_gui.model.Pizza;
import pizza_gui.model.PizzaModel;
import pizza_gui.service.PizzaService;
import pizza_gui.service.PizzaService;

import java.util.List;
import java.util.stream.Collectors;

public class PizzaController {

    private ObservableList<PizzaModel> pizzas = FXCollections.observableArrayList ();
    private PizzaService pizzaService = new PizzaService ();

    @FXML
    private Label lblSum;


    @FXML
    private TableView<PizzaModel> tblPizza;

    @FXML
    private TableColumn<PizzaModel, String> tcName;

    @FXML
    private TableColumn<PizzaModel, String> tcIngredients;

    @FXML
    private TableColumn<PizzaModel, String> tcType;

    @FXML
    private TableColumn<PizzaModel, Double> tcPrice;

    @FXML
    private Label tblRandomPizza;

    @FXML
    private TextArea taBasket;

    @FXML
    private TextField tfAddress;

    @FXML
    private TextField tfPhone;

    @FXML
    void clearAction(MouseEvent event) {
        pizzaService.clearOrder (taBasket, lblSum);
    }

    @FXML
    void orderAction(MouseEvent event) {
        System.out.println ("zamów");
    }
    @FXML
    void selectPizzaAction(MouseEvent mouseEvent) {
        pizzaService.addToBasket(tblPizza, taBasket);

    }
public void initialize (){
        pizzas = pizzaService.addPizzas(pizzas);
        pizzaService.insertPizzasToTable (tblPizza, tcName, tcIngredients, tcType, tcPrice, pizzas);
        pizzaService.pizzaOfTheDayGenerator (pizzas, tblRandomPizza);

    }

}

