package projectStructure.appConfig.controller;

import projectStructure.appConfig.view.InputView;
import projectStructure.appConfig.view.OutputView;

public class AppConfig {

    public MainController createMainController() {
        return new MainController(createInputView(), createOutputView());
    }

    private InputView createInputView() {
        return new InputView();
    }

    private OutputView createOutputView() {
        return new OutputView();
    }
}
