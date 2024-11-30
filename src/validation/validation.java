package validation;

import java.util.List;

public class validation {

    // 빈 값 검증
    private static void validateEmpty(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    // 숫자 형식 검증
    private static void validateNumeric(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    // 0 값 검증
    private void validateZero(int value) {
        if (value == 0) {
            throw new IllegalArgumentException();
        }
    }

    private void validateRange(int value, int min, int max) {
        if (value < min || value > max) {
            throw new IllegalArgumentException();
        }
    }

    // 문자 길이 검증 - 문자 길이 일치 검증

    /*
    private void validateLength(String input, int inputLength) {
        if (input.length() != inputLength) {
            throw new IllegalArgumentException();
        }
    }
    */

    // 문자 길이 검증 - 문자 길이 최대 값 검증
    private void validateLength(String input, int maxLength) {
        if (input.length() > maxLength) {
            throw new IllegalArgumentException();
        }
    }

    // List size 검증 - 사이즈 일치 하는지 검증
    private <T> void validateSize(List<T> values, int valuesSize) {
        if (values.size() != valuesSize) {
            throw new IllegalArgumentException();
        }
    }

    // List size 검증 - 사이즈 최대 값 검증
    /*
    private <T> void validateSize(List<T> values, int maxSize) {
        if (values.size() > maxSize) {
            throw new IllegalArgumentException();
        }
    }
    */

    // 중복 검증
    // T의 equals 를 꼭 재정의하고 하용해야 합니다!!!!!
    private <T> void validateDuplication(List<T> values) {
        if (values.size() != values.stream().distinct().count()) {
            throw new IllegalArgumentException();
        }
    }

    // 입력 데이터 format 검증
    // ex ) [상품 - 2]
    private static void validateOrderFormat(String input) {
        if (!(input.startsWith("[") && input.endsWith("]"))) {
            throw new IllegalArgumentException();
        }

        if (!input.contains("-")) {
            throw new IllegalArgumentException();
        }
    }

}
