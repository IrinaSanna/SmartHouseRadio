package ru.netology.Radio;

public class Radio {
    private int currentStationNumber;

    private int soundVolumeLevel;

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
        if (newCurrentStation > 9) {
            return;
        }
        currentStationNumber = newCurrentStation;
    }

    public void setVolumeLevelRange(int newVolumeLevel) { // диапазон
        if (newVolumeLevel < 0) {
            return;
        }
        if (newVolumeLevel > 100) {
            return;
        }
        soundVolumeLevel = newVolumeLevel;
    }

    public void setToMaxStationNumber() {
        currentStationNumber = 9;
    }

    public void moveFromMinToMaxStation() { // переключение с 0 на 9 станцию
        int lastStation = currentStationNumber;
        setToMaxStationNumber();
    }

    public void increaseStation() { // переключение на следующую станцию
        int nextStation = currentStationNumber + 1;
        setStationRange(nextStation);
    }

    public void decreaseStation() { // переключение на предыдущую станцию
        int prevStation = currentStationNumber - 1;
        setStationRange(prevStation);
    }

    public void increaseVolume() { // увеличение громкости
        int nextVolume = soundVolumeLevel + 1;
        setVolumeLevelRange(nextVolume);
    }

    public void decreaseVolume() { // уменьшение громкости
        int currentVolume = soundVolumeLevel - 1;
        setVolumeLevelRange(currentVolume);
    }

    public void stopMaxVolume() { // остановка на max громкости
        int maxVolume = soundVolumeLevel;
        setVolumeLevelRange(maxVolume);
    }
}