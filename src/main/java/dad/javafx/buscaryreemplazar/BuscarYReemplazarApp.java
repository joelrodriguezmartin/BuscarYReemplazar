package dad.javafx.buscaryreemplazar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazarApp extends Application {
	
	private Label buscarLabel;
	private Label reemplazarLabel;
	private Label emptyLabel;
	private TextField buscarText;
	private TextField reemplazarText;
	private Button buscarButton;
	private Button reemplazarButton;
	private Button reemplazartodoButton;
	private Button cerrarButton;
	private Button ayudaButton;
	private CheckBox mayusCheck;
	private CheckBox atrasCheck;
	private CheckBox expresionCheck;
	private CheckBox resaltarCheck;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		buscarLabel = new Label("Buscar: ");
		
		reemplazarLabel = new Label("Reemplazar con: ");
		
		emptyLabel = new Label("");
		
		buscarText = new TextField();
		
		reemplazarText = new TextField();
		
		buscarButton = new Button("Buscar");
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		buscarButton.setDefaultButton(true);
		
		reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setMaxWidth(Double.MAX_VALUE);
		
		reemplazartodoButton = new Button("Reemplazar todo");
		reemplazartodoButton.setMaxWidth(Double.MAX_VALUE);
		
		cerrarButton = new Button("Cerrar");
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		
		ayudaButton = new Button("Ayuda");
		ayudaButton.setMaxWidth(Double.MAX_VALUE);
		
		mayusCheck = new CheckBox("Mayusculas y minusculas");
		
		atrasCheck = new CheckBox("Buscar hacia atras");
		
		expresionCheck = new CheckBox("Expresion regular");
		
		resaltarCheck = new CheckBox("Resaltar resultados");
		
		VBox botones = new VBox(5, buscarButton, reemplazarButton, reemplazartodoButton, cerrarButton, ayudaButton);
		botones.setAlignment(Pos.TOP_CENTER);
		VBox checks1 = new VBox(5, mayusCheck, expresionCheck);
		checks1.setAlignment(Pos.TOP_LEFT);
		VBox checks2 = new VBox(5, atrasCheck, resaltarCheck);
		checks2.setAlignment(Pos.TOP_LEFT);
		HBox checks = new HBox(5, checks1, checks2);
		checks.setAlignment(Pos.TOP_LEFT);
		
		GridPane root = new GridPane();
		root.setPadding(new Insets(20));
		root.setHgap(5);
		root.setVgap(5);
		root.addRow(0, buscarLabel, buscarText, botones);
		root.addRow(1, reemplazarLabel, reemplazarText);
		root.addRow(2, emptyLabel, checks);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
		};
		cols[1].setHgrow(Priority.ALWAYS);
		root.getColumnConstraints().setAll(cols);
		
		GridPane.setRowSpan(botones, 3);
		GridPane.setFillWidth(buscarText, true);
		GridPane.setFillWidth(reemplazarText, true);
		GridPane.setFillWidth(buscarLabel, true);
		GridPane.setFillWidth(reemplazarLabel, true);
		GridPane.setFillHeight(checks, true);
		GridPane.setVgrow(checks, Priority.ALWAYS);
		GridPane.setFillHeight(botones, true);
		GridPane.setVgrow(botones, Priority.ALWAYS);
		
		Scene scene = new Scene(root, 640, 480);
		
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
