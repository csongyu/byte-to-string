package xyz.csongyu.bytetostring;

import java.nio.charset.Charset;

import org.apache.commons.codec.DecoderException;

public interface ByteToStringService {
    String encode(byte[] bytes, Charset charset);

    String encode(byte[] bytes, Encoding encoding);

    byte[] decode(String str, Charset charset);

    byte[] decode(String str, Encoding encoding) throws DecoderException;
}
