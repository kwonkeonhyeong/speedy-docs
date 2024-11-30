package projectStructure.mainOption.controller;

import java.util.Arrays;

public enum MainOption {
    EXIT("Q");

    private final String option;

    MainOption(String option) {
        this.option = option;
    }

    public static MainOption from(String input) {
        return Arrays.stream(MainOption.values())
                .filter(option -> option.getOption().equals(input))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 선택할 수 없는 기능입니다. 다시 입력해주세요."));
    }

    public String getOption() {
        return option;
    }
}
