package xyz.csongyu.bytetostring;

import java.nio.charset.Charset;

import org.apache.commons.codec.DecoderException;

public interface ByteToStringService {
    String convert(byte[] bytes, Charset charset);

    String convert(byte[] bytes, Encoding encoding);

    byte[] convert(String str, Charset charset);

    byte[] convert(String str, Encoding encoding) throws DecoderException;
}
