package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
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

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
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
