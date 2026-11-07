package E4;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1850f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final N3.a f1852i;

    public a(int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, boolean z12, N3.a aVar) {
        this.f1845a = i10;
        this.f1846b = i11;
        this.f1847c = i12;
        this.f1848d = i13;
        this.f1849e = i14;
        this.f1850f = z10;
        this.g = z11;
        this.f1851h = z12;
        this.f1852i = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1845a == aVar.f1845a && this.f1846b == aVar.f1846b && this.f1847c == aVar.f1847c && this.f1848d == aVar.f1848d && this.f1849e == aVar.f1849e && this.f1850f == aVar.f1850f && this.g == aVar.g && this.f1851h == aVar.f1851h && p251z9.j.a(this.f1852i, aVar.f1852i);
    }

    public final int hashCode() {
        return this.f1852i.hashCode() + (((((((((((((((this.f1845a * 31) + this.f1846b) * 31) + this.f1847c) * 31) + this.f1848d) * 31) + this.f1849e) * 31) + (this.f1850f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.f1851h ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbX = p123m2.c.x("AyahDetailsModel(ayahId=", this.f1845a, ", suraNumber=", this.f1846b, ", ayahNumber=");
        sbX.append(this.f1847c);
        sbX.append(", pageNumber=");
        sbX.append(this.f1848d);
        sbX.append(", verseCount=");
        sbX.append(this.f1849e);
        sbX.append(", isStarred=");
        sbX.append(this.f1850f);
        sbX.append(", hasNote=");
        sbX.append(this.g);
        sbX.append(", isKhatmahEnd=");
        sbX.append(this.f1851h);
        sbX.append(", bookmark=");
        sbX.append(this.f1852i);
        sbX.append(")");
        return sbX.toString();
    }
}
