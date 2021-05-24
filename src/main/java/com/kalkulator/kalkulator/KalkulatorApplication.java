package com.kalkulator.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KalkulatorApplication.class, args);

        Methods calculator = new Methods();

        int addResult = calculator.addOneToTwo(314, 564);
        int substractResult = calculator.subtractOneFromTwo(345, 142);

        System.out.println(addResult);
        System.out.println(substractResult);
    }

}
