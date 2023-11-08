package util;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import lotto.LottoPrinciples;

public class ValidationNumbers {

    private static final String COMMA = ",";
    private static final Integer REMOVE_LAST_SPACE_NUMBER = 0;

    private ValidationNumbers() {

    }

    public static void validateNumbers(String numbers) {
        validateNumber(numbers);
        validateLength(numbers);
    }

    private static void validateNumber(String numbers) {
        List<String> numbersList = List.of(numbers.split(COMMA, REMOVE_LAST_SPACE_NUMBER));
        try {
            numbersList.stream().forEach(Integer::parseInt);
        } catch (NumberFormatException notANumberException) {
            throw new IllegalArgumentException(ValidationNumbersMessages.NOT_A_NUMBER.getMessage());
        }
    }

    private static void validateLength(String numbers) {
        List<String> numbersList = List.of(numbers.split(COMMA, REMOVE_LAST_SPACE_NUMBER));
        if (numbersList.size() != LottoPrinciples.LIMIT_NUMBER.getNumber()) {
            throw new IllegalArgumentException(ValidationNumbersMessages.INVALID_LENGTH.getMessage());
        }
    }
}
