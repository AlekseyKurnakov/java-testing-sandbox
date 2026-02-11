package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReversedTest {

    @Test
    void reversedTest() throws Exception {

        Path path1 = Paths.get("src/test/resources/fixtures/input.txt");
        Path path2 = Paths.get("src/test/resources/fixtures/expected.txt");
        String input = Files.readString(path1).trim();
        String expected = Files.readString(path2).trim();

        assertEquals(Reversed.reverse(input), expected);
    }

}
