package P9;

import K9.AbstractC0383a;
import K9.AbstractC0405x;
import K9.D;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: loaded from: classes.dex */
public class q extends AbstractC0383a implements q9.d {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p150o9.c f6800u;

    public q(p150o9.c cVar, p150o9.h hVar) {
        super(hVar, true);
        this.f6800u = cVar;
    }

    @Override // K9.h0
    public final boolean P() {
        return true;
    }

    @Override // q9.d
    public final q9.d getCallerFrame() {
        p150o9.c cVar = this.f6800u;
        if (cVar instanceof q9.d) {
            return (q9.d) cVar;
        }
        return null;
    }

    @Override // K9.h0
    public void m(Object obj) throws D {
        b.h(AbstractC0405x.A(obj), AbstractC0813f2.H(this.f6800u));
    }

    @Override // K9.h0
    public void o(Object obj) {
        this.f6800u.resumeWith(AbstractC0405x.A(obj));
    }

    public void j0() {
    }
}
