
import projectStructure.mainOption.controller.MainController;
import projectStructure.mainOption.view.InputView;
import projectStructure.mainOption.view.OutputView;

public class Main {
    public static void main(String[] args) {
        MainController mainController = new MainController(
                new InputView(),
                new OutputView()
        );
        mainController.run();
    }

}
