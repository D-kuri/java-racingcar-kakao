package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cars {
    private List<Car> carList = new ArrayList<>();

    /* 자동차 이름 설정 */
    public void setCars(String carNames){
        addCarName(splitCarNames(carNames));
    }

    private String[] splitCarNames(String carNames){
        return carNames.replace(" ", "").split(",");
    }

    private void addCarName(String[] carNames) {
        for(String carName: carNames){
            carList.add(new Car(carName));
        }
    }


//    public boolean setCarList(){
//        String[] carNames = getCarNames(Race.carNames);
//        this.carList = new ArrayList<>();
//        addCarName(carNames);
//
//        return checkCarNames();
//    }

//    String[] getCarNames(String carNames) {
//        return carNames.replace(" ", "").split(",");
//    }






//    boolean checkCarNames(){
//        return this.carList.stream().allMatch(car -> car.carNameLengthCheck());
//    }
//
//    /* 자동차의 위치 설정 */
//    public void setCarLoc(RandomNumber randomNumber){
//        this.carList.forEach(car -> {
//            car.setLoc(dirToDis(randomNumber.setDirection()));
//        });
//    }
//
//    private int dirToDis(CarStatus dir) {
//        if (dir == CarStatus.Go) return 1;
//
//        return 0;
//    }
//
//    List<Car> setCalLocTest(RandomNumber randomNumber){
//        this.carList.forEach(car -> {
//            car.setLoc(dirToDis(randomNumber.setDirection()));
//        });
//        return this.carList;
//    }
//
//    /* 한 사이클마다 자동차의 위치 */
//    public void printCarLoc(){
//        this.carList.forEach(car -> {
//            String loc = makeStrLoc(car.getLoc());
//            System.out.println(car.getName() + " : " + loc);
//        });
//        System.out.print("\n");
//    }
//
//    private String makeStrLoc(int loc) {
//        String str = "";
//        for (int i = 0; i < loc; i++) {
//            str += "-";
//        }
//        return str;
//    }
//
//    /* 우승자 결정 */
//    public void winner(){
//        for (int i = 0; i < this.carList.size(); i++) {
//            this.carList.get(i).findWinnerLoc();
//        }
//        for (int i = 0; i < this.carList.size(); i++) {
//            this.carList.get(i).winnerName();
//        }
//        System.out.println(this.carList.get(0).getWinnerName() + "가 최종 우승했습니다.");
//
//    }

}