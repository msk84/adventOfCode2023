package net.msk.adventOfCode;

import java.util.List;

public class Day01_Trebuchet {

    public static int calculateCalibrationValueSum(final List<String> input) {
        return input.stream()
                .map(s -> s.replaceAll("[a-zA-Z]", ""))
                .map(s -> s.charAt(0) + s.substring(s.length() - 1))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
