package org.acme;


public class MyFxmlController {

  @Inject
  MyService myService;

  @FXML
  private void onButtonClicked() {
    this.myService.doSomething();
  }
}
