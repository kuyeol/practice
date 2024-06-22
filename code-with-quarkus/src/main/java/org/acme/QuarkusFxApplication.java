package org.acme;


import io.quarkiverse.fx.FxApplication;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import javafx.application.Application;

@QuarkusMain
public class QuarkusFxApplication implements QuarkusApplication {
    @Override
    public int run(final String... args) {
        Application.launch(FxApplication.class, args);
        return 0;
    }
}
