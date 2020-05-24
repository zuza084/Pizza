package pizza_gui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PizzaController {

    @FXML
    private TableView<?> tblPizza;

    @FXML
    private TableColumn<?, ?> tcName;

    @FXML
    private TableColumn<?, ?> tcIngredients;

    @FXML
    private TableColumn<?, ?> pcType;

    @FXML
    private TableColumn<?, ?> pcPrice;

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

    }

    @FXML
    void orderAction(MouseEvent event) {

    }

}
