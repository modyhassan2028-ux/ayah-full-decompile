package p165q3;

import p251z9.j;
import z3.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f21279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f21280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21282d;

    public a(k kVar, k kVar2, int i10, int i11) {
        j.e(kVar, "startAyah");
        j.e(kVar2, "endAyah");
        this.f21279a = kVar;
        this.f21280b = kVar2;
        this.f21281c = i10;
        this.f21282d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f21279a, aVar.f21279a) && j.a(this.f21280b, aVar.f21280b) && this.f21281c == aVar.f21281c && this.f21282d == aVar.f21282d;
    }

    public final int hashCode() {
        return ((((this.f21280b.hashCode() + (this.f21279a.hashCode() * 31)) * 31) + this.f21281c) * 31) + this.f21282d;
    }

    public final String toString() {
        return "AudioPlaybackParameters(startAyah=" + this.f21279a + ", endAyah=" + this.f21280b + ", playCount=" + this.f21281c + ", rangePlayCount=" + this.f21282d + ")";
    }
}
