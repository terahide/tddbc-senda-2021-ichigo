package tddbc;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
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
 * [] 25g以上 → LL
 * [] 20g以上 → L
 * [] 10g以上 → M
 * [] 1g以上 → S
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
        @ParameterizedTest(name="品種の文字列表現のテスト:{0}")
        @ValueSource(ints=25)
        public void 品種の文字列表現のテスト(int 重さ) throws Exception {
            // Setup
            Strawberry sut = new Strawberry(あまおう,重さ);
            // Exercise
            Size actual = sut.getSize();
            // Verify
            assertEquals(LL, actual);
        }

    }
}
