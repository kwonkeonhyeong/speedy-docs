package projectStructure.applicationStatus.controller;

public enum ApplicationStatus {
    APPLICATION_EXIT;

    public boolean isPlayable() {
        return this != APPLICATION_EXIT;
    }
}
