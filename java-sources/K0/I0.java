package K0;

import android.graphics.Outline;
import p180s0.C1300i;

/* JADX INFO: loaded from: classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I0 f4948a = new I0();

    public final void a(Outline outline, p180s0.E e10) {
        if (!(e10 instanceof C1300i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C1300i) e10).f21829a);
    }
}
