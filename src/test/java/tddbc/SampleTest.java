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
        Strawberry sut = new Strawberry();
        // Exercise
        String actual = sut.getKind();
        // Verify
        assertEquals("あまおう", actual);
    }

}
