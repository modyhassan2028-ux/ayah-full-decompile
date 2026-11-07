package B4;

import p124m3.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f617d;

    public a(j jVar, j jVar2, int i10, int i11) {
        p251z9.j.e(jVar, "startAyah");
        p251z9.j.e(jVar2, "endAyah");
        this.f614a = jVar;
        this.f615b = jVar2;
        this.f616c = i10;
        this.f617d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p251z9.j.a(this.f614a, aVar.f614a) && p251z9.j.a(this.f615b, aVar.f615b) && this.f616c == aVar.f616c && this.f617d == aVar.f617d;
    }

    public final int hashCode() {
        return ((((this.f615b.hashCode() + (this.f614a.hashCode() * 31)) * 31) + this.f616c) * 31) + this.f617d;
    }

    public final String toString() {
        return "AudioSettingsModel(startAyah=" + this.f614a + ", endAyah=" + this.f615b + ", rangeRepeat=" + this.f616c + ", ayahRepeat=" + this.f617d + ")";
    }
}
