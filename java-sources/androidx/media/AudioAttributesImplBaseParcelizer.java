package androidx.media;

import Y2.b;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f12696a = bVar.f(audioAttributesImplBase.f12696a, 1);
        audioAttributesImplBase.f12697b = bVar.f(audioAttributesImplBase.f12697b, 2);
        audioAttributesImplBase.f12698c = bVar.f(audioAttributesImplBase.f12698c, 3);
        audioAttributesImplBase.f12699d = bVar.f(audioAttributesImplBase.f12699d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.f12696a, 1);
        bVar.j(audioAttributesImplBase.f12697b, 2);
        bVar.j(audioAttributesImplBase.f12698c, 3);
        bVar.j(audioAttributesImplBase.f12699d, 4);
    }
}
