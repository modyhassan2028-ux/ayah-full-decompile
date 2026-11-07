package E4;

/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p165q3.j f1866f;

    public f(int i10, int i11, int i12, int i13, int i14, p165q3.j jVar) {
        this.f1861a = i10;
        this.f1862b = i11;
        this.f1863c = i12;
        this.f1864d = i13;
        this.f1865e = i14;
        this.f1866f = jVar;
    }

    @Override // E4.j
    public final int a() {
        return this.f1861a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f1861a == fVar.f1861a && this.f1862b == fVar.f1862b && this.f1863c == fVar.f1863c && this.f1864d == fVar.f1864d && this.f1865e == fVar.f1865e && this.f1866f == fVar.f1866f;
    }

    public final int hashCode() {
        return this.f1866f.hashCode() + (((((((((this.f1861a * 31) + this.f1862b) * 31) + this.f1863c) * 31) + this.f1864d) * 31) + this.f1865e) * 31);
    }

    public final String toString() {
        StringBuilder sbX = p123m2.c.x("PlayAudio(ayahId=", this.f1861a, ", sura=", this.f1862b, ", ayah=");
        sbX.append(this.f1863c);
        sbX.append(", verses=");
        sbX.append(this.f1864d);
        sbX.append(", page=");
        sbX.append(this.f1865e);
        sbX.append(", playbackType=");
        sbX.append(this.f1866f);
        sbX.append(")");
        return sbX.toString();
    }
}
