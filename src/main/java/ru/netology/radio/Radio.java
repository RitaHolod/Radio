package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int amountStation = 10;
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio(int amountStation) {
        this.maxStation = amountStation - 1;
    }


    public void nextStation() {
        if (currentStation < maxStation) {
            int newStation = ++currentStation;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            int newStation = --currentStation;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume = ++currentVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = --currentVolume;
        } else {
            currentVolume = minVolume;
        }
    }

}
