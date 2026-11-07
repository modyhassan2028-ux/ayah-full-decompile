package Y9;

import K0.C0362p;

/* JADX INFO: renamed from: Y9.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0662s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f10545e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W9.f f10546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0362p f10547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f10549d;

    public C0662s(W9.f fVar, C0362p c0362p) {
        p251z9.j.e(fVar, "descriptor");
        this.f10546a = fVar;
        this.f10547b = c0362p;
        int iD = fVar.d();
        if (iD <= 64) {
            this.f10548c = iD != 64 ? (-1) << iD : 0L;
            this.f10549d = f10545e;
            return;
        }
        this.f10548c = 0L;
        int i10 = (iD - 1) >>> 6;
        long[] jArr = new long[i10];
        if ((iD & 63) != 0) {
            jArr[i10 - 1] = (-1) << iD;
        }
        this.f10549d = jArr;
    }
}
