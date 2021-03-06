package tddbc;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static tddbc.Kind.*;
import static tddbc.Size.*;


/**
 * ＃ todo list
 * ## お題1
 * * [x] いちご(Strawberry)を生成して品種を取得する
 * * [x] サイズを取得する
 * * [] 文字列表現をする
 * ## お題2
 * * [x] 25g以上 → LL
 * * [X] 20g以上 → L
 * * [x] 10g以上 → M
 * * [X] 1g以上 → S
 * * [] 0gの考慮。現実におきないから後回し
 * ## お題３
 * * [x] 同一品種かどうか
 * * [] いちごのサイズ差
 */
public class StrawberryTest {
    @Nested
    class いちごの文字列表現のテスト{
        @ParameterizedTest(name="品種の文字列表現のテスト:{0}")
        @EnumSource(Kind.class)
        public void 品種の文字列表現のテスト(Kind 品種) throws Exception {
            // Setup
            Strawberry sut = new Strawberry(品種,S);
            // Exercise
            String actual = sut.toString();
            // Verify
            assertEquals(String.format("%s: S", 品種.name()), actual);
        }

        @ParameterizedTest(name="サイズの文字列表現のテスト:{0}")
        @EnumSource(Size.class)
        public void サイズの文字列表現のテスト(Size サイズ) throws Exception {
            // Setup
            Strawberry sut = new Strawberry(あまおう, サイズ);
            // Exercise
            String actual = sut.toString();
            // Verify
            assertEquals(String.format("あまおう: %s", サイズ.name()), actual);
        }
    }
    @Nested
    class いちごのサイズのテスト{
        @ParameterizedTest(name="いちごのサイズのテスト:{0} {1}")
        @CsvSource({
                "25, LL",
                "24, L",
                "20, L",
                "19, M",
                "10, M",
                "9, S",
        })
        public void いちごのサイズのテスト(int 重さ, Size expected) throws Exception {
            // Setup
            Strawberry sut = new Strawberry(あまおう,重さ);
            // Exercise
            Size actual = sut.getSize();
            // Verify
            assertEquals(expected, actual);
        }

        @Test
        public void 文字列表現のテスト() throws Exception {
            // Setup
            Strawberry sut = new Strawberry(あまおう,1);
            // Exercise
            String actual = sut.toString();
            // Verify
            assertEquals("あまおう: S", actual);
        }
    }
    @Nested
    class  同一品種かどうか{
        @ParameterizedTest(name="同一品種かどうかのテスト:{0} and {1} is {2}")
        @CsvSource({
                "あまおう, あまおう, true",
                "とちおとめ, とちおとめ, true",
                "もういっこ, もういっこ, true",
                "あまおう, もういっこ, false",
                "とちおとめ, もういっこ, false",
        })
        public void 同一品種かどうかのテスト(Kind 品種, Kind 比較する品種, boolean expected) throws Exception {
            // Setup
            Strawberry sut = new Strawberry(品種,1);
            // Exercise
            boolean actual = sut.isSameKind(new Strawberry(比較する品種,1));
            // Verify
            assertEquals(expected, actual);
        }
    }

    @Nested
    class いちごのサイズ差のテスト {
        @ParameterizedTest(name = "いちごのサイズ差のテスト:{0} and {1} is {2}")
        @CsvSource({
                "S, S, 0",
        })
        public void いちごのサイズ差のテスト(Size サイズ, Size 比較するサイズ, int expected) throws Exception {
            // Setup
            Strawberry sut = new Strawberry(あまおう, サイズ);
            // Exercise
            int actual = sut.getDiffelence(new Strawberry(あまおう, 比較するサイズ));
            // Verify
            assertEquals(expected, actual);
        }
    }

}
