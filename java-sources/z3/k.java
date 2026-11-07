package z3;

import java.io.Serializable;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparable, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f24796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f24797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f24798t;

    public k(int i10, int i11, int i12) {
        this.f24796r = i10;
        this.f24797s = i11;
        this.f24798t = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        p251z9.j.e(kVar, "other");
        return u0.i(Integer.valueOf(this.f24798t), Integer.valueOf(kVar.f24798t));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f24796r == kVar.f24796r && this.f24797s == kVar.f24797s && this.f24798t == kVar.f24798t;
    }

    public final int hashCode() {
        return (((this.f24796r * 31) + this.f24797s) * 31) + this.f24798t;
    }

    public final String toString() {
        return p245z2.a.E(p123m2.c.x("SuraAyah(sura=", this.f24796r, ", ayah=", this.f24797s, ", ayahId="), this.f24798t, ")");
    }
}
