
package org.acme;


public class Controller{

@Inject
FXMLLoader fxmlLoader;

public void load() {
  Parent root = this.fxmlLoader.load(this.getClass().getResourceAsStream("/app.fxml"));
  Scene scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
}
}
