package ejercicios30;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/*from  www  .  j  a  v  a  2 s  .  c o  m*/
public class JListView extends Application
{
  public static void main(String[] args) 
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
    ObservableList<String> names = FXCollections
        .observableArrayList();
    ObservableList<String> data = FXCollections.observableArrayList();

    ListView<String> listView = new ListView<>(data);
    listView.setPrefSize(200, 250);
    listView.setEditable(true);

      boolean addAll = names.addAll("A", "B", "C", "D", "E");

    data.add("Double Click to Select Value");

    listView.setItems(data);
    listView.setCellFactory(ComboBoxListCell.forListView(names));

    StackPane root = new StackPane();
    root.getChildren().add(listView);
    primaryStage.setScene(new Scene(root, 200, 250));
    primaryStage.show();
  }
}