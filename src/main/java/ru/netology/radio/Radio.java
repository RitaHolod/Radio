package ru.netology.radio;

public class Radio {
    public int currentStation;
    public int currentVolume;
    public int maxStation = 9;
    public int minStation = 0;
    public int maxVolume = 10;
    public int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {

        if (newStation > maxStation) {
            return;
        }
        if (newStation < minStation) {
            return;
        } else {
            currentStation = newStation;
        }
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            int newStation = ++currentStation;
        } else {
            int newStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            int newStation = --currentStation;
        } else {
            int newStation = maxStation;
        }
    }

    public int getCurrentVolume(){
        return currentVolume;
    }

    public void increaseVolume(){
        if (currentVolume == maxVolume){
            return;
        } else {
            currentVolume = ++currentVolume;
        }
    }

    public void reduceVolume(){
        if (currentVolume == minVolume){
            return;
        } else {
            currentVolume = --minVolume;
        }
    }
}
