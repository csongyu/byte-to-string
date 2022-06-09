package xyz.csongyu.bytetostring;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class BinaryByteToStringServiceImpl implements ByteToStringService {
    @Override
    public String encode(final byte[] bytes, final Charset charset) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String encode(final byte[] bytes, final Encoding encoding) {
        return switch (encoding) {
            case HEX -> Hex.encodeHexString(bytes);
            case BASE_64 -> Base64.getEncoder().encodeToString(bytes);
            case ISO_8859_1 -> new String(bytes, StandardCharsets.ISO_8859_1);
        };
    }

    @Override
    public byte[] decode(final String str, final Charset charset) {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte[] decode(final String str, final Encoding encoding) throws DecoderException {
        return switch (encoding) {
            case HEX -> Hex.decodeHex(str);
            case BASE_64 -> Base64.getDecoder().decode(str);
            case ISO_8859_1 -> str.getBytes(StandardCharsets.ISO_8859_1);
        };
    }
}
