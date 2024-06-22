package org.acme;

import javafx.fxml.*;
import jakarta.inject.Inject;

public class MyFxmlController {

  @Inject
  MyService myService;

  @FXML
  private void onButtonClicked() {
    this.myService.doSomething();
  }
}
