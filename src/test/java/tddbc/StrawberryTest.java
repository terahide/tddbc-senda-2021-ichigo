package tddbc;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static tddbc.Kind.*;
import static tddbc.Size.M;
import static tddbc.Size.S;


/**
 * ＃ todo list
 * ## お題1
 * * [x] いちご(Strawberry)を生成して品種を取得する
 * * [] サイズを取得する
 */
public class StrawberryTest {
    @ParameterizedTest
    @EnumSource(Kind.class)
    public void 品種のテスト(Kind 品種) throws Exception {
        // Setup
        Strawberry sut = new Strawberry(品種,S);
        // Exercise
        Kind actual = sut.getKind();
        // Verify
        assertEquals(品種, actual);
    }

    @Nested
    class サイズのテスト {
        @ParameterizedTest
        @EnumSource(Size.class)
        public void サイズのテスト(Size サイズ) throws Exception {
            // Setup
            Strawberry sut = new Strawberry(あまおう, サイズ);
            // Exercise
            Size actual = sut.getSize();
            // Verify
            assertEquals(サイズ, actual);
        }
        @Test
        @DisplayName("S")
        public void s() throws Exception {
            // Setup
            Strawberry sut = new Strawberry(あまおう, S);
            // Exercise
            Size actual = sut.getSize();
            // Verify
            assertEquals(S, actual);
        }
        @Test
        @DisplayName("M")
        public void m() throws Exception {
            // Setup
            Strawberry sut = new Strawberry(あまおう, M);
            // Exercise
            Size actual = sut.getSize();
            // Verify
            assertEquals(M, actual);
        }
    }
}
