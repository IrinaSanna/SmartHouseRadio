package ru.netology.Radio;

public class Radio {
    public int currentStationNumber;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setMaxNumberStation() {     // установка мах кол-ва станций
        currentStationNumber = 9;
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

    public void setSwitchFromEndToBeginning(int nextStation) { // переключение с 9 на 0 станцию
        if (nextStation > 9) {
            setStationRange(nextStation);
        }
    }

    public void setIncreaseStation(int newNextStation) { // переключение на следующую станцию
        if (newNextStation < 9) {
            currentStationNumber = newNextStation + 1;
        }
    }

    public void setPrevStationNumber(int prevStation) { // переключение с 0 на 9 станцию
        if (prevStation < 0) {
            setMaxNumberStation();
        }
    }

    public void setDecreaseStation(int newPrevStation) { // переключение на предыдущую станцию
        if (newPrevStation > 0) {
            currentStationNumber = newPrevStation - 1;
        }
    }

    public int soundVolumeLevel;

    public int getSoundVolumeLevel() {
        return soundVolumeLevel;
    }

    public void setMaxVolume() {
        soundVolumeLevel = 100;
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

    public void setIncreaseVolume(int newCurrentVolume) { // увеличение громкости
        if (newCurrentVolume < 100) {
            newCurrentVolume = newCurrentVolume + 1;
        }
        soundVolumeLevel = newCurrentVolume;
    }

    public void setStopAtMaxVolume(int currentMaxVolumeLevel) { // остановка на max громкости
        if (currentMaxVolumeLevel >= 100) {
            setMaxVolume();
        }
    }

    public void setDecreaseVolume(int currentVolume) { // уменьшение громкости
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        soundVolumeLevel = currentVolume;
    }

    public void setStopAtMinVolume(int currentMinVolumeLevel) { // остановка на min громкости
        if (currentMinVolumeLevel < 0) {
            currentMinVolumeLevel = soundVolumeLevel;
        }
    }
}