package androidx.media;

import Y2.b;
import Y2.d;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        d dVarH = audioAttributesCompat.f12693a;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        audioAttributesCompat.f12693a = (AudioAttributesImpl) dVarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f12693a;
        bVar.i(1);
        bVar.l(audioAttributesImpl);
    }
}
