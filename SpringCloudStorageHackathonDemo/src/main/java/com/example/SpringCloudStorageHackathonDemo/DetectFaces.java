package com.example.SpringCloudStorageHackathonDemo;

import com.google.cloud.vision.v1.AnnotateImageRequest;
import com.google.cloud.vision.v1.AnnotateImageResponse;
import com.google.cloud.vision.v1.BatchAnnotateImagesResponse;
import com.google.cloud.vision.v1.FaceAnnotation;
import com.google.cloud.vision.v1.Feature;
import com.google.cloud.vision.v1.Image;
import com.google.cloud.vision.v1.ImageAnnotatorClient;
import com.google.protobuf.ByteString;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DetectFaces {

    public static void main(String[] args) throws IOException {
        detectFaces();
    }

    public static void detectFaces() throws IOException {
        String filePath = "/Users/karanpurswani/Downloads/angry.jpeg";
        //String filePath = "/Users/karanpurswani/Downloads/657575.jpg";
        detectFaces(filePath);
    }

    public static void detectFaces(String filePath) throws IOException {
        List<AnnotateImageRequest> requests = new ArrayList<>();

        ByteString imgBytes = ByteString.readFrom(new FileInputStream(filePath));

        Image img = Image.newBuilder().setContent(imgBytes).build();
        Feature feat = Feature.newBuilder().setType(Feature.Type.FACE_DETECTION).build();
        AnnotateImageRequest request =
                AnnotateImageRequest.newBuilder().addFeatures(feat).setImage(img).build();
        requests.add(request);

        try (ImageAnnotatorClient client = ImageAnnotatorClient.create()) {
            BatchAnnotateImagesResponse response = client.batchAnnotateImages(requests);
            List<AnnotateImageResponse> responses = response.getResponsesList();


            for (AnnotateImageResponse res : responses) {
                if (res.hasError()) {
                    System.out.format("Error: %s%n", res.getError().getMessage());
                    return;
                }

                for (FaceAnnotation annotation : res.getFaceAnnotationsList()) {
                    System.out.format(
                            "anger: %s%njoy: %s%nsurprise: %s%nposition: %s",
                            annotation.getAngerLikelihood(),
                            annotation.getJoyLikelihood(),
                            annotation.getSurpriseLikelihood(),
                            annotation.getBoundingPoly());


                }

               // System.out.println("final reaction: "+res.getFaceAnnotationsList().get(0));
            }
        }
    }
}
