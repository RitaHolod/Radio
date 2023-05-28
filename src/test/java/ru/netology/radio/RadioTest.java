package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio service = new Radio(10);

    @Test
    public void testDefaultAmountStation() {

        Assertions.assertEquals(10, service.getAmountStation());
    }

    @Test

    public void setCurrentStationTest() {
        service.setCurrentStation(4);

        int expected = 4;
        int actual = service.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxStation() {
        Radio service = new Radio();
        service.setCurrentStation(service.getMaxStation());

        int expected = 9;
        int actual = service.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinStation() {
        Radio service = new Radio();
        service.setCurrentStation(service.getMinStation());

        int expected = 0;
        int actual = service.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationAboveMax() {
        Radio service = new Radio();
        service.setCurrentStation(10);
        service.nextStation();

        int expected = 0;
        int actual = service.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationBelowMin() {
        Radio service = new Radio();
        service.setCurrentStation(0);
        service.prevStation();

        int expected = 9;
        int actual = service.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio service = new Radio();
        service.setCurrentStation(4);
        service.nextStation();

        int expected = 5;
        int actual = service.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAfterMax() {
        Radio service = new Radio();
        service.setCurrentStation(9);
        service.nextStation();

        int expected = 0;
        int actual = service.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio service = new Radio();
        service.setCurrentStation(4);
        service.prevStation();

        int expected = 3;
        int actual = service.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationBeforeMin() {
        Radio service = new Radio();
        service.prevStation();

        int expected = 9;
        int actual = service.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio service = new Radio();
        service.increaseVolume();

        int expected = 1;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(service.getMaxVolume());

        int expected = 100;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMax() {
        Radio service = new Radio();
        service.setCurrentVolume(service.getMaxVolume());
        service.increaseVolume();

        int expected = 100;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeTest() {
        Radio service = new Radio();
        service.setCurrentVolume(6);
        service.reduceVolume();

        int expected = 5;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceMinVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(service.getMinVolume());

        int expected = 0;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceBelowVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(service.getMinVolume());
        service.reduceVolume();

        int expected = 0;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeBelowMinBySetter() {
        Radio service = new Radio();
        service.setCurrentVolume(-1);
        service.reduceVolume();

        int expected = 0;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMaxBySetter() {
        Radio service = new Radio();
        service.setCurrentVolume(110);
        service.increaseVolume();

        int expected = 100;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
