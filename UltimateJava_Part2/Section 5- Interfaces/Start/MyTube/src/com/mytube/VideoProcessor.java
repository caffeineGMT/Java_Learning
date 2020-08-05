package com.mytube;

public class VideoProcessor {
    public void process(Video video, Encodable encodable, Storable storable, Servicable servicable) {
        encodable.encode(video);
        storable.store(video);
        servicable.sendEmail(video.getUser());
    }
}
