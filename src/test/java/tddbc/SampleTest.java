package tddbc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * ＃ todo list
 * ## お題1
 * * いちご(Strawberry)を生成して品種を取得する
 * * サイズを取得する
 */
public class SampleTest {

    @Test
    @DisplayName("should return Hello TDD Boot Camp")
    public void _should_return_Hello_TDD_BootCamp() throws Exception {
        // Setup
        Sample sut = new Sample();
        // Exercise
        String actual = sut.say();
        // Verify
        assertEquals("Hello TDD BootCamp!", actual);
    }

}
