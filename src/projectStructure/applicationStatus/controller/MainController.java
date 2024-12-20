package projectStructure.applicationStatus.controller;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;
import projectStructure.mainOption.controller.Controllable;
import projectStructure.mainOption.controller.MainOption;
import projectStructure.mainOption.view.InputView;
import projectStructure.mainOption.view.OutputView;

public class MainController {

    private final InputView inputView;
    private final OutputView outputView;
    private final Map<ApplicationStatus, Controllable> controllers;

    public MainController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.controllers = new EnumMap<>(ApplicationStatus.class);
        initializeControllers();
    }

    public void initializeControllers() {
        // controllers.put()
    }

    public void run() {
        /*
        ApplicationStatus applicationStatus = ApplicationStatus.REGISTER_VENDING_MACHINE;
        while (applicationStatus.isPlayable()) {
            applicationStatus = controllers.get(applicationStatus).process();
        }
        */
    }

    private <T> T doLoopWithReturn(Supplier<T> function) {
        while (true) {
            try {
                return function.get();
            } catch (IllegalArgumentException e) {
                outputView.printErrorMessage(e.getMessage());
            }
        }
    }

    private void doLoop(Runnable runnable) {
        while (true) {
            try {
                runnable.run();
                return;
            } catch (IllegalArgumentException e) {
                outputView.printErrorMessage(e.getMessage());
            }
        }
    }
}
