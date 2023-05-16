package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    public int amountStation = 10;
    public int currentStation;
    public int currentVolume;
    public int maxStation = 9;
    public int minStation = 0;
    public int maxVolume = 100;
    public int minVolume = 0;



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
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume = --currentVolume;
        }
    }

}
