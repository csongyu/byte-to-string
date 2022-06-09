package xyz.csongyu.bytetostring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import org.junit.Test;

public class CharacterByteToStringServiceImplTest {
    private final ByteToStringService byteToStringService = new CharacterByteToStringServiceImpl();

    @Test
    public void givenTextData_whenConvertStringToBytesThenBackToString_thenEquals() {
        final String source = "raw character";
        final byte[] bytes = this.byteToStringService.convert(source, StandardCharsets.UTF_8);
        final String target = this.byteToStringService.convert(bytes, StandardCharsets.UTF_8);
        assertEquals(source, target);
    }

    @Test
    public void givenBinaryData_whenUseUtf8ConvertBytesToStringThenBackToBytes_thenIncorrect() throws IOException {
        final byte[] source = Files.readAllBytes(Paths.get("src/test/resources/profile.png"));
        final String str = this.byteToStringService.convert(source, StandardCharsets.UTF_8);
        final byte[] target = this.byteToStringService.convert(str, StandardCharsets.UTF_8);
        assertNotEquals(Arrays.toString(source), Arrays.toString(target));
    }
}