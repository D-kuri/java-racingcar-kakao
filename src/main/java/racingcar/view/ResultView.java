package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.stream.Collectors;

public class ResultView {
    private static final String ROUND_START = "실행 결과";
    private static final String GAME_RESULT = "가 최종 우승했습니다";

    public static void printRoundStart() {
        System.out.println("\n" + ROUND_START);
    }

    public static void printRoundResult(Cars cars) {
        String roundResult = "";
        for (Car car : cars.getCars()) {
            roundResult += car.getName()
                    + " : "
                    + new String(new char[car.getLocation()]).replace("\0", "_")
                    + "\n";
        }

        System.out.println(roundResult);
    }

    public static void printWinner(Cars cars) {
        int winnerLocation = cars.getCars().stream()
                .mapToInt(car -> car.getLocation())
                .max().orElse(0);
        System.out.println(cars.getCars().stream()
                .filter(car -> car.getLocation() == winnerLocation)
                .map(Car::getName)
                .collect(Collectors.joining(" "))
                + GAME_RESULT);
    }

}
