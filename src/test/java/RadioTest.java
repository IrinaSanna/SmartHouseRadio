import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio.Radio;

public class RadioTest {

    @Test
    public void shouldSwitchFromEndToBeginning() { // переключение с 9 на 0 станцию
        Radio radio = new Radio();

        radio.setStationRange(10);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToNextStation() { // переключение на следующую станцию
        Radio radio = new Radio();

        radio.setStationRange(8);

        radio.increaseStation();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveFromMinToMaxStation() { // переключение с 0 на 9 станцию
        Radio radio = new Radio();
        radio.setStationRange(-1);

        radio.moveFromMinToMaxStation();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToPrevStation() { // переключение на предыдущую станцию
        Radio radio = new Radio();

        radio.setStationRange(1);

        radio.decreaseStation();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() { // выставление номера станции
        Radio radio = new Radio();

        radio.setStationRange(5);

        int expected = 5;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    // тесты для уровня громкости

    @Test
    public void shouldStopAtMax() { // остановка на max громкости
        Radio radio = new Radio();

        radio.setVolumeLevelRange(101);

        int expected = 0;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStopAtMinVolume() { // остановка на min громкости
        Radio radio = new Radio();

        radio.setVolumeLevelRange(-1);

        int expected = 0;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume() { // диапазон громкости
        Radio radio = new Radio();

        radio.setVolumeLevelRange(33);

        int expected = 33;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() { // увеличение громкости
        Radio radio = new Radio();

        radio.setVolumeLevelRange(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() { // уменьшение громкости
        Radio radio = new Radio();

        radio.setVolumeLevelRange(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStopAtMaxVolume() { // остановка на max громкости
        Radio radio = new Radio();

        radio.setVolumeLevelRange(100);

        radio.stopMaxVolume();

        int expected = 100;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
}