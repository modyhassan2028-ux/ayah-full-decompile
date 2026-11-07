package p143o2;

import X4.c;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f20267e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f20268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f20269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioAttributesCompat f20270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20271d;

    static {
        int i10 = AudioAttributesCompat.f12692b;
        c aVar = Build.VERSION.SDK_INT >= 26 ? new a(27) : new c(27);
        aVar.r();
        aVar.i();
    }

    public d(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat) {
        this.f20269b = handler;
        this.f20270c = audioAttributesCompat;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f20268a = onAudioFocusChangeListener;
        } else {
            this.f20268a = new c(onAudioFocusChangeListener, handler);
        }
        if (i10 >= 26) {
            this.f20271d = b.a(1, (AudioAttributes) audioAttributesCompat.f12693a.b(), false, this.f20268a, handler);
        } else {
            this.f20271d = null;
        }
    }

    public final AudioFocusRequest a() {
        return (AudioFocusRequest) this.f20271d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.f20268a, dVar.f20268a) && Objects.equals(this.f20269b, dVar.f20269b) && this.f20270c.equals(dVar.f20270c);
    }

    public final int hashCode() {
        return Objects.hash(1, this.f20268a, this.f20269b, this.f20270c, Boolean.FALSE);
    }
}
