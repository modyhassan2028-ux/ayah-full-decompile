package I0;

import Z.C0672b;
import Z.C0681f0;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0813f2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f3662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0681f0 f3663t = C0672b.r(null);

    public g(f fVar) {
        this.f3662s = fVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public final Object D(f fVar) {
        if (fVar != this.f3662s) {
            G0.a.b("Check failed.");
        }
        Object value = this.f3663t.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public final boolean q(f fVar) {
        return fVar == this.f3662s;
    }
}
