package p165q3;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f21288f;
    public final a g;

    public b(String str, int i10, int i11, int i12, int i13, i iVar, a aVar) {
        j.e(str, "reciterId");
        this.f21283a = str;
        this.f21284b = i10;
        this.f21285c = i11;
        this.f21286d = i12;
        this.f21287e = i13;
        this.f21288f = iVar;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f21283a, bVar.f21283a) && this.f21284b == bVar.f21284b && this.f21285c == bVar.f21285c && this.f21286d == bVar.f21286d && this.f21287e == bVar.f21287e && this.f21288f == bVar.f21288f && j.a(this.g, bVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f21288f.hashCode() + (((((((((this.f21283a.hashCode() * 31) + this.f21284b) * 31) + this.f21285c) * 31) + this.f21286d) * 31) + this.f21287e) * 31)) * 31);
    }

    public final String toString() {
        return "Playback(reciterId=" + this.f21283a + ", sura=" + this.f21284b + ", ayah=" + this.f21285c + ", ayahId=" + this.f21286d + ", page=" + this.f21287e + ", playbackState=" + this.f21288f + ", playbackParameters=" + this.g + ")";
    }
}
