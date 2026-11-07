package com.squareup.moshi;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Da.y {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Da.k f15470A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Da.k f15471B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Da.k f15472C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Da.k f15473D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Da.k f15474y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Da.k f15475z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Da.j f15476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Da.h f15477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Da.h f15478t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Da.k f15479u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15480v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f15481w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15482x = false;

    static {
        Da.k kVar = Da.k.f1363u;
        f15474y = R7.f.m("[]{}\"'/#");
        f15475z = R7.f.m("'\\");
        f15470A = R7.f.m("\"\\");
        f15471B = R7.f.m("\r\n");
        f15472C = R7.f.m("*");
        f15473D = Da.k.f1363u;
    }

    public r(Da.j jVar, Da.h hVar, Da.k kVar, int i10) {
        this.f15476r = jVar;
        this.f15477s = jVar.a();
        this.f15478t = hVar;
        this.f15479u = kVar;
        this.f15480v = i10;
    }

    public final void b(long j) {
        while (true) {
            long j10 = this.f15481w;
            if (j10 >= j) {
                return;
            }
            Da.k kVar = this.f15479u;
            Da.k kVar2 = f15473D;
            if (kVar == kVar2) {
                return;
            }
            Da.h hVar = this.f15477s;
            long j11 = hVar.f1362s;
            Da.j jVar = this.f15476r;
            if (j10 == j11) {
                if (j10 > 0) {
                    return;
                } else {
                    jVar.S(1L);
                }
            }
            long jN = hVar.n(this.f15479u, this.f15481w);
            if (jN == -1) {
                this.f15481w = hVar.f1362s;
            } else {
                byte bE = hVar.e(jN);
                Da.k kVar3 = this.f15479u;
                Da.k kVar4 = f15470A;
                Da.k kVar5 = f15475z;
                Da.k kVar6 = f15472C;
                Da.k kVar7 = f15471B;
                Da.k kVar8 = f15474y;
                if (kVar3 == kVar8) {
                    if (bE == 34) {
                        this.f15479u = kVar4;
                        this.f15481w = jN + 1;
                    } else if (bE == 35) {
                        this.f15479u = kVar7;
                        this.f15481w = jN + 1;
                    } else if (bE == 39) {
                        this.f15479u = kVar5;
                        this.f15481w = jN + 1;
                    } else if (bE != 47) {
                        if (bE != 91) {
                            if (bE != 93) {
                                if (bE != 123) {
                                    if (bE != 125) {
                                    }
                                }
                            }
                            int i10 = this.f15480v - 1;
                            this.f15480v = i10;
                            if (i10 == 0) {
                                this.f15479u = kVar2;
                            }
                            this.f15481w = jN + 1;
                        }
                        this.f15480v++;
                        this.f15481w = jN + 1;
                    } else {
                        long j12 = 2 + jN;
                        jVar.S(j12);
                        long j13 = jN + 1;
                        byte bE2 = hVar.e(j13);
                        if (bE2 == 47) {
                            this.f15479u = kVar7;
                            this.f15481w = j12;
                        } else if (bE2 == 42) {
                            this.f15479u = kVar6;
                            this.f15481w = j12;
                        } else {
                            this.f15481w = j13;
                        }
                    }
                } else if (kVar3 == kVar5 || kVar3 == kVar4) {
                    if (bE == 92) {
                        long j14 = jN + 2;
                        jVar.S(j14);
                        this.f15481w = j14;
                    } else {
                        if (this.f15480v > 0) {
                            kVar2 = kVar8;
                        }
                        this.f15479u = kVar2;
                        this.f15481w = jN + 1;
                    }
                } else if (kVar3 == kVar6) {
                    long j15 = 2 + jN;
                    jVar.S(j15);
                    long j16 = jN + 1;
                    if (hVar.e(j16) == 47) {
                        this.f15481w = j15;
                        this.f15479u = kVar8;
                    } else {
                        this.f15481w = j16;
                    }
                } else {
                    if (kVar3 != kVar7) {
                        throw new AssertionError();
                    }
                    this.f15481w = jN + 1;
                    this.f15479u = kVar8;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15482x = true;
    }

    @Override // Da.y
    public final Da.A d() {
        return this.f15476r.d();
    }

    @Override // Da.y
    public final long o(long j, Da.h hVar) {
        if (this.f15482x) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        Da.h hVar2 = this.f15478t;
        boolean zY = hVar2.y();
        Da.h hVar3 = this.f15477s;
        if (!zY) {
            long jO = hVar2.o(j, hVar);
            long j10 = j - jO;
            if (!hVar3.y()) {
                long jO2 = o(j10, hVar);
                if (jO2 != -1) {
                    return jO2 + jO;
                }
            }
            return jO;
        }
        b(j);
        long j11 = this.f15481w;
        if (j11 == 0) {
            if (this.f15479u == f15473D) {
                return -1L;
            }
            throw new AssertionError();
        }
        long jMin = Math.min(j, j11);
        hVar.Z(jMin, hVar3);
        this.f15481w -= jMin;
        return jMin;
    }
}
