package net.msk.adventOfCode;

import java.util.List;
import java.util.Map;

public class Day01_Trebuchet {

    public static int calculateCalibrationValueSum(final List<String> input) {

        final Map<String, String> replaceMap = Map.of(
                "one", "o1e",
                "two", "t2o",
                "three", "t3e",
                "four", "f4r",
                "five", "f5e",
                "six", "s6x",
                "seven", "s7n",
                "eight", "e8t",
                "nine", "n9e"
        );

        return input.stream()
                .map(s -> {
                    for(var entry : replaceMap.entrySet()) {
                        s = s.replace(entry.getKey(), entry.getKey() + entry.getValue());
                    }
                    return s;
                })
                .map(s -> s.replaceAll("[a-zA-Z]", ""))
                .map(s -> s.charAt(0) + s.substring(s.length() - 1))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
