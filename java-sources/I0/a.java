package I0;

import D.F;
import D.d0;
import D.h0;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0813f2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public F f3653s;

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public final Object D(f fVar) {
        this.f3653s.getClass();
        if (fVar != h0.f976a) {
            G0.a.b("Check failed.");
        }
        return (d0) this.f3653s.f883c.getValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public final boolean q(f fVar) {
        this.f3653s.getClass();
        return fVar == h0.f976a;
    }
}
