package com.racing.ui;

import com.racing.domain.Car;

import java.util.List;

public class ResultView {
    public static void printStartMessage() {
        System.out.println("실행 결과");
    }

    public static void printRoundResult(int round, List<Car> carList) {
        System.out.println("# " + round + "회차");
        for (Car car : carList) {
            System.out.println(car.displayRacingState());
        }
        System.out.println();
    }
}