package projectStructure.mainOption.controller;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;
import projectStructure.mainOption.view.InputView;
import projectStructure.mainOption.view.OutputView;

public class MainController {
    private final InputView inputView;
    private final OutputView outputView;
    private final Map<MainOption, Controllable> controllers;

    public MainController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.controllers = new EnumMap<>(MainOption.class);
        initializeControllers();
    }

    public void initializeControllers() {
        // controllers.put()
    }

    public void run() {

    }

    private <T> T doLoop(Supplier<T> function) {
        while(true) {
            try {
                return function.get();
            } catch (IllegalArgumentException e) {
                outputView.printErrorMessage(e.getMessage());
            }
        }
    }
}
