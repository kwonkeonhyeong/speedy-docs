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
        /*
         MainOption option;
            do {
                outputView.printMainOption();
                option = doLoop(() -> MainOption.from(inputView.enterSelectOption()));
                controllers.get(option).process();
            } while (option.isPlayable());
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
