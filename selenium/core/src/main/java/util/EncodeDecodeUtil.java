package util;

import java.util.Base64;

public class EncodeDecodeUtil {

    public static String decode(String str) {
        return new String(Base64.getDecoder().decode(str.getBytes()));
    }

    public static String encode(String str) {
        return Base64.getEncoder().encodeToString(str.getBytes());
    }
}