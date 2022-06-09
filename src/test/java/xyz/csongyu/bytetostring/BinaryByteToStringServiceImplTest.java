package xyz.csongyu.bytetostring;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import org.apache.commons.codec.DecoderException;
import org.junit.Test;

public class BinaryByteToStringServiceImplTest {
    private final ByteToStringService byteToStringService = new BinaryByteToStringServiceImpl();

    @Test
    public void givenBinaryData_whenUseHexConvertBytesToStringThenBackToBytes_thenEquals()
        throws IOException, DecoderException {
        final byte[] source = Files.readAllBytes(Paths.get("src/test/resources/profile.png"));
        final String str = this.byteToStringService.convert(source, Encoding.HEX);
        final byte[] target = this.byteToStringService.convert(str, Encoding.HEX);
        assertEquals(Arrays.toString(source), Arrays.toString(target));
    }

    @Test
    public void givenBinaryData_whenUseBase64ConvertBytesToStringThenBackToBytes_thenEquals()
        throws IOException, DecoderException {
        final byte[] source = Files.readAllBytes(Paths.get("src/test/resources/profile.png"));
        final String str = this.byteToStringService.convert(source, Encoding.BASE_64);
        final byte[] target = this.byteToStringService.convert(str, Encoding.BASE_64);
        assertEquals(Arrays.toString(source), Arrays.toString(target));
    }

    @Test
    public void givenBinaryData_whenUseIsoConvertBytesToStringThenBackToBytes_thenEquals()
        throws IOException, DecoderException {
        final byte[] source = Files.readAllBytes(Paths.get("src/test/resources/profile.png"));
        final String str = this.byteToStringService.convert(source, Encoding.ISO_8859_1);
        final byte[] target = this.byteToStringService.convert(str, Encoding.ISO_8859_1);
        assertEquals(Arrays.toString(source), Arrays.toString(target));
    }
}