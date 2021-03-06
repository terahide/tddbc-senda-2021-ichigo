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
    @Test
    @DisplayName("いちごを生成するテスト あまおう")
    public void あまおうテスト() throws Exception {
        // Setup
        Strawberry sut = new Strawberry();
        // Exercise
        String actual = sut.getKind();
        // Verify
        assertEquals("あまおう", actual);
    }

    @Test
    @DisplayName("いちごを生成するテスト とちおとめ")
    public void とちおとめテスト() throws Exception {
        // Setup
        Strawberry sut = new Strawberry("とちおとめ");
        // Exercise
        String actual = sut.getKind();
        // Verify
        assertEquals("とちおとめ", actual);
    }

    @Test
    @DisplayName("いちごを生成するテスト あまおう")
    public void あまおうテスト_() throws Exception {
        // Setup
        Strawberry sut = new Strawberry(あまおう);
        // Exercise
        String actual = sut.getKind();
        // Verify
        assertEquals("あまおう", actual);
    }

    @Test
    @DisplayName("いちごを生成するテスト とちおとめ")
    public void とちおとめテスト_() throws Exception {
        // Setup
        Strawberry sut = new Strawberry(とちおとめ);
        // Exercise
        String actual = sut.getKind();
        // Verify
        assertEquals("とちおとめ", actual);
    }

}
