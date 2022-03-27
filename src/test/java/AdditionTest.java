import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.learnup.javaqa.group2.chernykh2.Addition;


public class AdditionTest {

    @Test
    public void shouldCountLosersNought() {
        int[] speeds = {0, 0, 0};
        Addition.isGreenLight = false;

        int actual = Addition.droppedOut(speeds);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersOneNought() {
        int[] speeds = {0};
        Addition.isGreenLight = false;

        int actual = Addition.droppedOut(speeds);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersNothing() {
        int[] speeds = {};
        Addition.isGreenLight = false;

        int actual = Addition.droppedOut(speeds);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersBigNumber() {
        int[] speeds = {1000000000, 0, 0};
        Addition.isGreenLight = false;

        int actual = Addition.droppedOut(speeds);

        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersBorder() {
        int[] speeds = {7, 7, 7};
        Addition.isGreenLight = false;

        int actual = Addition.droppedOut(speeds);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersBigNumbers() {
        int[] speeds = {999999999, 999999999, 999999999};
        Addition.isGreenLight = false;

        int actual = Addition.droppedOut(speeds);

        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersManyPlayers() {
        int[] speeds = {0, 5, 1, 8, 0, 9, 2, 99, 999};
        Addition.isGreenLight = false;

        int actual = Addition.droppedOut(speeds);

        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersOnePlayer() {
        int[] speeds = {7};
        Addition.isGreenLight = false;

        int actual = Addition.droppedOut(speeds);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLosersLightTrue() {
        int[] speeds = {7, 9, 8, 6, 0};
        Addition.isGreenLight = true;

        int actual = Addition.droppedOut(speeds);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosers() {
        int[] speeds = {8, 8, 8};
        Addition.isGreenLight = false;

        int[] actual = Addition.speedDroppedOut(speeds);

        int[] expected = {8, 8, 8};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersNought() {
        int[] speeds = {0, 0, 0};
        Addition.isGreenLight = false;

        int[] actual = Addition.speedDroppedOut(speeds);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersOne() {
        int[] speeds = {0, 0, 7};
        Addition.isGreenLight = false;

        int[] actual = Addition.speedDroppedOut(speeds);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersOneNought() {
        int[] speeds = {0};
        Addition.isGreenLight = false;

        int[] actual = Addition.speedDroppedOut(speeds);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersNothing() {
        int[] speeds = {};
        Addition.isGreenLight = false;

        int[] actual = Addition.speedDroppedOut(speeds);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersManyPlayers() {
        int[] speeds = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
        Addition.isGreenLight = false;

        int[] actual = Addition.speedDroppedOut(speeds);

        int[] expected = {8, 9, 10};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedLosersLightTrue() {
        int[] speeds = {8, 9, 6, 0, 7};
        Addition.isGreenLight = true;

        int[] actual = Addition.speedDroppedOut(speeds);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersAll() {
        int[] speeds = {0, 0, 0};
        Addition.isGreenLight = false;

        int[] actual = Addition.speedStayedIn(speeds);

        int[] expected = {0, 0, 0};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersOne() {
        int[] speeds = {7, 8, 9};
        Addition.isGreenLight = false;

        int[] actual = Addition.speedStayedIn(speeds);

        int[] expected = {7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersOneNought() {
        int[] speeds = {0};
        Addition.isGreenLight = false;

        int[] actual = Addition.speedStayedIn(speeds);

        int[] expected = {0};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersNothing() {
        int[] speeds = {};
        Addition.isGreenLight = false;

        int[] actual = Addition.speedStayedIn(speeds);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersManyPlayers() {
        int[] speeds = {0, 1, 2, 0, 3, 4, 0, 5, 6, 0, 7, 8, 0, 9, 10};
        Addition.isGreenLight = false;

        int[] actual = Addition.speedStayedIn(speeds);

        int[] expected = {0, 1, 2, 0, 3, 4, 0, 5, 6, 0, 7, 0};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCountSpeedWinnersLightTrue() {
        int[] speeds = {7, 8, 9, 0, 6, 100};
        Addition.isGreenLight = true;

        int[] actual = Addition.speedStayedIn(speeds);

        int[] expected = {7, 8, 9, 0, 6, 100};

        Assertions.assertArrayEquals(expected, actual);
    }
}

