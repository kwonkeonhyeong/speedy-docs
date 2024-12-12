package projectStructure.appConfig;

import projectStructure.appConfig.controller.AppConfig;
import projectStructure.appConfig.controller.MainController;

public class Application {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();

        MainController mainController = appConfig.createMainController();

        mainController.run();

    }
}
