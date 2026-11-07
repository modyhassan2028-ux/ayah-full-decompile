package L2;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5467r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f5468s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f5469t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f5470u;

    public e(int i10, int i11, String str, String str2) {
        j.e(str, "from");
        j.e(str2, "to");
        this.f5467r = i10;
        this.f5468s = i11;
        this.f5469t = str;
        this.f5470u = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        j.e(eVar, "other");
        int i10 = this.f5467r - eVar.f5467r;
        return i10 == 0 ? this.f5468s - eVar.f5468s : i10;
    }
}
