package p181s2;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Iterator;
import java.util.List;
import p074h0.d;
import p120l9.m;
import p173r2.C;
import p173r2.F;
import p173r2.G;
import p173r2.j;
import p173r2.v;

/* JADX INFO: loaded from: classes.dex */
@F("dialog")
public final class q extends G {
    @Override // p173r2.G
    public final v a() {
        d dVar = e.f22070a;
        return new p(this);
    }

    @Override // p173r2.G
    public final void d(List list, C c10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((j) it.next());
        }
    }

    @Override // p173r2.G
    public final void e(j jVar, boolean z10) {
        b().e(jVar, z10);
        int iI0 = m.i0((Iterable) b().f21460f.f6130r.getValue(), jVar);
        int i10 = 0;
        for (Object obj : (Iterable) b().f21460f.f6130r.getValue()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC0813f2.T();
                throw null;
            }
            j jVar2 = (j) obj;
            if (i10 > iI0) {
                b().c(jVar2);
            }
            i10 = i11;
        }
    }
}
