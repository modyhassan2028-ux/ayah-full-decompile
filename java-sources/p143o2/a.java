package p143o2;

import X4.c;
import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi26;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    @Override // X4.c
    public final AudioAttributesImpl i() {
        return new AudioAttributesImplApi26(((AudioAttributes.Builder) this.f9953r).build());
    }

    @Override // X4.c
    public final c n() {
        ((AudioAttributes.Builder) this.f9953r).setUsage(1);
        return this;
    }

    @Override // X4.c
    public final c r() {
        ((AudioAttributes.Builder) this.f9953r).setUsage(1);
        return this;
    }
}
