package scrib.hyde.doodle.protobuf;

import scrib.hyde.models.protobufGen.RamensProto;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

public class ProtoDecodeTest {
    public static void main(String[] args) {
        String encodedMessage = "Ec3MzMzMTDRAGhcKDnJhbWVubG92ZXJfMjAyEgVzcGljeQ==";


        byte[] base64DecodedString = Base64.getDecoder().decode(encodedMessage);

        InputStream is = new ByteArrayInputStream(base64DecodedString);

        RamensProto.Ramens ramenRead = null;

        try {
            ramenRead = RamensProto.Ramens.parseFrom(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("I am done !!");

    }
}
