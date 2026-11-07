package androidx.compose.material3;

import A.C0040q0;
import J0.AbstractC0274a0;
import K9.AbstractC0405x;
import W.C0556f0;
import W.C0576l;
import l0.q;
import p150o9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class ClockDialModifier extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0576l f11913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11915c;

    public ClockDialModifier(C0576l c0576l, boolean z10, int i10) {
        this.f11913a = c0576l;
        this.f11914b = z10;
        this.f11915c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return j.a(this.f11913a, clockDialModifier.f11913a) && this.f11914b == clockDialModifier.f11914b && this.f11915c == clockDialModifier.f11915c;
    }

    public final int hashCode() {
        return (((this.f11913a.hashCode() * 31) + (this.f11914b ? 1231 : 1237)) * 31) + this.f11915c;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new C0556f0(this.f11913a, this.f11914b, this.f11915c);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        C0556f0 c0556f0 = (C0556f0) qVar;
        C0576l c0576l = this.f11913a;
        c0556f0.f9064H = c0576l;
        c0556f0.f9065I = this.f11914b;
        int i10 = c0556f0.f9066J;
        int i11 = this.f11915c;
        if (i10 == i11) {
            return;
        }
        c0556f0.f9066J = i11;
        AbstractC0405x.x(c0556f0.h0(), null, new C0040q0(c0576l, (c) null, 14), 3);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ClockDialModifier(state=");
        sb.append(this.f11913a);
        sb.append(", autoSwitchToMinute=");
        sb.append(this.f11914b);
        sb.append(", selection=");
        int i10 = this.f11915c;
        if (i10 == 0) {
            str = "Hour";
        } else {
            str = i10 == 1 ? "Minute" : "";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
