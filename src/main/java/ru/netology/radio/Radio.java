package ru.netology.radio;

public class Radio {
    public int currentStation;
    public int currentVolume;
    public int maxStation = 9;
    public int minStation = 0;
    public int maxVolume = 100;
    public int minVolume = 0;

    public Radio(int amountStation){
        this.maxStation = amountStation - 1;
    }

    public Radio(){
        int amountStation = 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {

        if (newStation > maxStation) {
            return;
        } else if (newStation < minStation) {
            return;
        } else {
            currentStation = newStation;
        }
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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume > maxVolume) {
            currentVolume = maxVolume;
        } else if (newVolume < minVolume) {
            return;
        } else {
            currentVolume = newVolume;
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
