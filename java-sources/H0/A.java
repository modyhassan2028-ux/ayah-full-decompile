package H0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class A implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f3129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f3130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ J f3132e;

    public /* synthetic */ A(J j, E e10, int i10, J j10, int i11) {
        this.f3128a = i11;
        this.f3130c = e10;
        this.f3131d = i10;
        this.f3132e = j10;
        this.f3129b = j;
    }

    @Override // H0.J
    public final int a() {
        switch (this.f3128a) {
            case 0:
                break;
        }
        return this.f3129b.a();
    }

    @Override // H0.J
    public final int b() {
        switch (this.f3128a) {
            case 0:
                break;
        }
        return this.f3129b.b();
    }

    @Override // H0.J
    public final Map c() {
        switch (this.f3128a) {
            case 0:
                break;
        }
        return this.f3129b.c();
    }

    @Override // H0.J
    public final void d() {
        switch (this.f3128a) {
            case 0:
                int i10 = this.f3131d;
                E e10 = this.f3130c;
                e10.f3148v = i10;
                this.f3132e.d();
                u.E e11 = e10.f3139C;
                long[] jArr = e11.f22669a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j = jArr[i11];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j) < 128) {
                                    int i14 = (i11 << 3) + i13;
                                    Object obj = e11.f22670b[i14];
                                    b0 b0Var = (b0) e11.f22671c[i14];
                                    int iJ = e10.f3140D.j(obj);
                                    if (iJ < 0 || iJ >= e10.f3148v) {
                                        b0Var.a();
                                        e11.k(i14);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i12 != 8) {
                            }
                        }
                        if (i11 != length) {
                            i11++;
                        }
                    }
                }
                break;
            default:
                int i15 = this.f3131d;
                E e12 = this.f3130c;
                e12.f3147u = i15;
                this.f3132e.d();
                e12.a(e12.f3147u);
                break;
        }
    }

    @Override // H0.J
    public final p241y9.c e() {
        switch (this.f3128a) {
            case 0:
                break;
        }
        return this.f3129b.e();
    }
}
