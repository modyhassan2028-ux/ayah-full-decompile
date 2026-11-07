package p133n2;

import androidx.lifecycle.J;
import androidx.lifecycle.P;

/* JADX INFO: loaded from: classes.dex */
public class a extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J f19981c = new J(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u.P f19982b = new u.P(0);

    @Override // androidx.lifecycle.P
    public final void b() {
        u.P p10 = this.f19982b;
        if (p10.g() > 0) {
            p10.h(0).getClass();
            throw new ClassCastException();
        }
        int i10 = p10.f22707u;
        Object[] objArr = p10.f22706t;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        p10.f22707u = 0;
        p10.f22704r = false;
    }
}
