import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio.Radio;

public class RadioTest {

    @Test
    public void shouldNotExceedMaxRange() { // уход за границы max диапазона
        Radio radio = new Radio();

        radio.setStationRange(10);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotExceedMinRange() { // уход за границы min диапазона
        Radio radio = new Radio();

        radio.setStationRange(-1);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchFromEndToBeginning() { // переключение с 9 на 0 станцию
        Radio radio = new Radio();

        radio.setSwitchFromEndToBeginning(10);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToNextStation() { // переключение вперед
        Radio radio = new Radio();

        radio.setIncreaseStation(8);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchFromBeginningToEnd() { // переключение с 0 на 9 станцию
        Radio radio = new Radio();

        radio.setPrevStationNumber(-1);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToPrevStation() { // переключение назад
        Radio radio = new Radio();

        radio.setDecreaseStation(1);

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
    public void shouldNotExceedMaxVolume() { // уход за границы max диапазона
        Radio radio = new Radio();

        radio.setVolumeLevelRange(101);

        int expected = 0;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotExceedMinVolume() { // уход за границы min диапазона
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

        radio.setIncreaseVolume(99);

        int expected = 100;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStopAtMax() {  // остановка на max громкости
        Radio radio = new Radio();

        radio.setStopAtMaxVolume(101);

        int expected = 100;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() { // уменьшение громкости
        Radio radio = new Radio();

        radio.setDecreaseVolume(1);

        int expected = 0;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStopAtMin() { // остановка на min громкости
        Radio radio = new Radio();

        radio.setStopAtMinVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
}