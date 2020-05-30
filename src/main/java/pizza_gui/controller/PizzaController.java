package pizza_gui.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import pizza_gui.model.Ingredient;
import pizza_gui.model.Pizza;
import pizza_gui.model.PizzaModel;
import pizza_gui.service.PizzaService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class PizzaController {
        // Aby dodać kolekcję obiektów do kontrolek FXML korzystamy ObservableList
        private ObservableList<PizzaModel> pizzas = FXCollections.observableArrayList();
        // Obiekt klasy Pizza service
        private PizzaService pizzaService = new PizzaService();

        @FXML
        private Label lblSum;
        @FXML
        private TableView<PizzaModel> tblPizza;         // Klasa modelu
        @FXML
        private TableColumn<PizzaModel, String> tcName; // Klasa modelu, typ danych
        @FXML
        private TableColumn<PizzaModel, String> tcIngredients;
        @FXML
        private TableColumn<PizzaModel, String> tcType;
        @FXML
        private TableColumn<PizzaModel, Double> tcPrice;
        @FXML
        private Label lblRandomPizza;
        @FXML
        private TextArea taBasket;
        @FXML
        private TextField tfAddress;
        @FXML
        private TextField tfPhone;
        @FXML
        public Label lblClock;
        @FXML
        public ProgressBar pgExit;
        @FXML
        void clearAction(MouseEvent event) {
            pizzaService.clearOrder(taBasket, tfAddress, tfPhone, lblSum);
        }
        @FXML
        void orderAction(MouseEvent event) {
            pizzaService.getOrder (tfPhone, tfAddress, taBasket, lblSum);

        }
        @FXML
        void selectPizzaAction(MouseEvent mouseEvent) {
            pizzaService.addToBasket(tblPizza, taBasket, lblSum);
        }
        // konstruktor -> inicjalizacja GUI
        public void initialize(){
            pizzaService.clock(lblClock);
            // wywołanie metod zaimplementowanych w logice biznesowej aplikacji
            pizzas = pizzaService.addPizzas(pizzas);
            pizzaService.insertPizzasToTable(tblPizza, tcName, tcIngredients, tcType, tcPrice, pizzas);
            pizzaService.pizzaOfTheDayGenerator(pizzas, lblRandomPizza);
        }

    }
