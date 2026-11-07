package p165q3;

import p251z9.j;
import z3.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f21290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f21291b;

    public e(k kVar, k kVar2) {
        this.f21290a = kVar;
        this.f21291b = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return j.a(this.f21290a, eVar.f21290a) && j.a(this.f21291b, eVar.f21291b);
    }

    public final int hashCode() {
        return this.f21291b.hashCode() + (this.f21290a.hashCode() * 31);
    }

    public final String toString() {
        return "Ayah(startAyah=" + this.f21290a + ", endAyah=" + this.f21291b + ")";
    }
}
