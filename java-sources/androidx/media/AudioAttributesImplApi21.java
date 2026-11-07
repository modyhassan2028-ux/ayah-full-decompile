package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f12694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12695b = -1;

    public AudioAttributesImplApi21() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i10 = this.f12695b;
        return i10 != -1 ? i10 : AudioAttributesCompat.c(this.f12694a.getFlags(), this.f12694a.getUsage());
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object b() {
        return this.f12694a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f12694a.equals(((AudioAttributesImplApi21) obj).f12694a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12694a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f12694a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f12694a = audioAttributes;
    }
}
