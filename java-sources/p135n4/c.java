package p135n4;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import p124m3.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0813f2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f20008s;

    public c(h hVar) {
        j.e(hVar, "quarterDao");
        this.f20008s = hVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public final p124m3.j G() {
        return this.f20008s.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j.a(this.f20008s, ((c) obj).f20008s);
    }

    public final int hashCode() {
        return this.f20008s.hashCode();
    }

    public final String toString() {
        return "QuarterResult(quarterDao=" + this.f20008s + ")";
    }
}
