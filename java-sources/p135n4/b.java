package p135n4;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import p120l9.m;
import p124m3.g;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0813f2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f20007s;

    public b(g gVar) {
        j.e(gVar, "partDao");
        this.f20007s = gVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public final p124m3.j G() {
        return (p124m3.j) m.f0(this.f20007s.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j.a(this.f20007s, ((b) obj).f20007s);
    }

    public final int hashCode() {
        return this.f20007s.hashCode();
    }

    public final String toString() {
        return "PartResult(partDao=" + this.f20007s + ")";
    }
}
