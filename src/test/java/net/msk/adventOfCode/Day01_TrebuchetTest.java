package net.msk.adventOfCode;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day01TrebuchetTest extends BaseTest {

    @Test
    void task1TestTry() {
        final List<String> input = Stream.of("1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet").toList();
        final int result = Day01_Trebuchet.calculateCalibrationValueSum(input);
        assertEquals(142, result);
    }

    @Test
    void task1Test() throws IOException, URISyntaxException {
        final List<String> data = this.getDataFromFileAsList("day01_data");
        final int result = Day01_Trebuchet.calculateCalibrationValueSum(data);
        assertEquals(53539, result);
    }

    @Test
    void task2Try() {
        final List<String> input = Stream.of("two1nine","eightwothree","abcone2threexyz","xtwone3four","4nineeightseven2","zoneight234","7pqrstsixteen").toList();
        final int result = Day01_Trebuchet.calculateCalibrationValueSum(input);
        assertEquals(281, result);
    }
}