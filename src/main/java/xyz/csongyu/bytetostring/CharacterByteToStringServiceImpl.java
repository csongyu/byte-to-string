package xyz.csongyu.bytetostring;

import java.nio.charset.Charset;

public class CharacterByteToStringServiceImpl implements ByteToStringService {
    @Override
    public String encode(final byte[] bytes, final Charset charset) {
        return new String(bytes, charset);
    }

    @Override
    public String encode(final byte[] bytes, final Encoding encoding) {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte[] decode(final String str, final Charset charset) {
        return str.getBytes(charset);
    }

    @Override
    public byte[] decode(final String str, final Encoding encoding) {
        throw new UnsupportedOperationException();
    }
}
