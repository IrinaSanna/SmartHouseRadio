package ru.netology.Radio;

public class Radio {
    private int maxAmountOfStations;
    private int currentStationNumber;

    private int soundVolumeLevel;

    public Radio(int maxAmountOfStations) {
        this.maxAmountOfStations = maxAmountOfStations;
    }

    public Radio() {
        this.maxAmountOfStations = 10;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getSoundVolumeLevel() {
        return soundVolumeLevel;
    }

    public void setStationRange(int newCurrentStation) { // диапазон станций
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxAmountOfStations - 1) {
            return;
        }
        currentStationNumber = newCurrentStation;
    }

    public void setVolumeLevelRange(int newVolumeLevel) { // диапазон громкости
        if (newVolumeLevel < 0) {
            return;
        }
        if (newVolumeLevel > 100) {
            return;
        }
        soundVolumeLevel = newVolumeLevel;
    }

    public void nextNumberStation() { // переключение на следующую станцию
        int nextStation = currentStationNumber + 1;
        setStationRange(nextStation);
    }

    public void prevNumberStation() { // переключение на предыдущую станцию
        if (currentStationNumber > 0) {
            currentStationNumber = currentStationNumber - 1;
        } else {
            currentStationNumber = maxAmountOfStations - 1;
        }
    }

    public void increaseVolume() { // увеличение громкости
        if (soundVolumeLevel < 100) {
            soundVolumeLevel = soundVolumeLevel + 1;
        } else {
            soundVolumeLevel = 100;
        }
    }

    public void decreaseVolume() { // уменьшение громкости
        if (soundVolumeLevel > 0) {
            soundVolumeLevel = soundVolumeLevel - 1;
        } else {
            soundVolumeLevel = 0;
        }
    }
}