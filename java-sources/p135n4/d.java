package p135n4;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import p124m3.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0813f2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f20009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f20010t;

    public d(j jVar, boolean z10) {
        p251z9.j.e(jVar, "verseDao");
        this.f20009s = jVar;
        this.f20010t = z10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public final j G() {
        return this.f20009s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p251z9.j.a(this.f20009s, dVar.f20009s) && this.f20010t == dVar.f20010t;
    }

    public final int hashCode() {
        return (this.f20009s.hashCode() * 31) + (this.f20010t ? 1231 : 1237);
    }

    public final String toString() {
        return "VerseResult(verseDao=" + this.f20009s + ", representsSura=" + this.f20010t + ")";
    }
}
