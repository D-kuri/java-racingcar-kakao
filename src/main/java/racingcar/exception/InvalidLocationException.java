package racingcar.exception;

public class InvalidLocationException extends RuntimeException {
    private static final String INVALID_LOCATION = "라운드를 잘못 입력하셨습니다";

    public InvalidLocationException() {
        super(INVALID_LOCATION);
    }
}
