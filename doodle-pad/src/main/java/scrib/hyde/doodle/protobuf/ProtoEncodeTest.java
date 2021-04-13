package scrib.hyde.doodle.protobuf;

import scrib.hyde.models.protobufGen.RamensProto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;

public class ProtoEncodeTest {
    public static void main(String[] args) {
        RamensProto.Ramens.RamenComments comment = RamensProto.Ramens.RamenComments.newBuilder()
                .setComment("spicy")
                .setCommentFrom("ramenlover_202")
                .build();


        RamensProto.Ramens ramens_obj = RamensProto.Ramens.newBuilder()
                .addComments(comment)
                .setRamenName("Smoodles")
                .setInrRate(20.30)
                .build();

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            ramens_obj.writeTo(os);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String base64Val = Base64.getEncoder().encodeToString(os.toByteArray());

        System.out.println(base64Val);


    }
}
