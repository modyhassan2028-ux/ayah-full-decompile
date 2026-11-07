package p151p;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
import p013b2.h;

/* JADX INFO: loaded from: classes.dex */
public final class X0 extends h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final WeakReference f20628r;

    public X0(SwitchCompat switchCompat) {
        this.f20628r = new WeakReference(switchCompat);
    }

    @Override // p013b2.h
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.f20628r.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // p013b2.h
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.f20628r.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
