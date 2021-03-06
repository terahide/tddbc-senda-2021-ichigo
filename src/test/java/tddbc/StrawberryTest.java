package tddbc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import static tddbc.Kind.*;

/**
 * ＃ todo list
 * ## お題1
 * * いちご(Strawberry)を生成して品種を取得する
 * * サイズを取得する
 */
public class StrawberryTest {
    class 品種のテスト{
        @Test
        @DisplayName("あまおう")
        public void あまおう() throws Exception {
            // Setup
            Strawberry sut = new Strawberry(あまおう);
            // Exercise
            Kind actual = sut.getKind();
            // Verify
            assertEquals(あまおう, actual);
        }

        @Test
        @DisplayName("とちおとめ")
        public void とちおとめ() throws Exception {
            // Setup
            Strawberry sut = new Strawberry(とちおとめ);
            // Exercise
            Kind actual = sut.getKind();
            // Verify
            assertEquals(とちおとめ, actual);
        }
    }
}
