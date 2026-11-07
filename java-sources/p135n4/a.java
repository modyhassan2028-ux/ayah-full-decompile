package p135n4;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import p120l9.m;
import p124m3.d;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0813f2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f20006s;

    public a(d dVar) {
        j.e(dVar, "pageDao");
        this.f20006s = dVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public final p124m3.j G() {
        return (p124m3.j) m.f0(this.f20006s.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f20006s, ((a) obj).f20006s);
    }

    public final int hashCode() {
        return this.f20006s.hashCode();
    }

    public final String toString() {
        return "PageResult(pageDao=" + this.f20006s + ")";
    }
}
