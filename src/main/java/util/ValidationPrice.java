package util;

public class ValidationPrice {

    private static final Integer UNIT_NUMBER = 1000;
    private static final Integer VALID_REMAINDER = 0;

    private ValidationPrice() {

    }

    public static void validatePrice(String priceString) {
        validateNumber(priceString);
        validateRemainder(priceString);
    }

    public static void validateNumber(String priceString) {
        try {
            Integer price = Integer.parseInt(priceString);
        } catch (NumberFormatException notANumber) {
            throw new IllegalArgumentException(ValidationPriceMessages.NOT_A_NUMBER.getMessage());
        }
    }

    public static void validateRemainder(String priceString) {
        Integer price = Integer.parseInt(priceString);
        if (price % UNIT_NUMBER != VALID_REMAINDER) {
            throw new IllegalArgumentException(ValidationPriceMessages.INVALID_REMAINDER.getMessage());
        }
    }
}
