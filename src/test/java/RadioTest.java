import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void testSetCurrentStationWithinBounds() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void SetCurrentStationOutOfBounds() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void IncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void IncreaseVolumeBeyondMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void NextStation() {
        Radio radio = new Radio();
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void NextStationLoop() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void PrevStation() {
        Radio radio = new Radio();
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void PrevStationLoop() {
        Radio radio = new Radio();
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }
}
