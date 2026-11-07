package p223x;

import android.support.v4.media.session.p;
import p151p.V;
import p204v.a;
import p251z9.j;
import u.s;
import u.t;

/* JADX INFO: loaded from: classes.dex */
public final class D0 implements z0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC1427p f23833A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float[] f23834B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float[] f23835C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public V f23836D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f23837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f23838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f23839t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC1433w f23840u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f23841v = y0.f24125a;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float[] f23842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC1427p f23843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AbstractC1427p f23844y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AbstractC1427p f23845z;

    public D0(s sVar, t tVar, int i10, InterfaceC1433w interfaceC1433w) {
        this.f23837r = sVar;
        this.f23838s = tVar;
        this.f23839t = i10;
        this.f23840u = interfaceC1433w;
        float[] fArr = y0.f24126b;
        this.f23842w = fArr;
        this.f23834B = fArr;
        this.f23835C = fArr;
        this.f23836D = y0.f24127c;
    }

    public final int a(int i10) {
        int i11;
        s sVar = this.f23837r;
        int i12 = sVar.f22758b;
        sVar.getClass();
        if (i12 <= 0 || i12 > sVar.f22758b) {
            a.d("");
            throw null;
        }
        int i13 = i12 - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = sVar.f22757a[i11];
                if (i15 >= i10) {
                    if (i15 <= i10) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = -(i14 + 1);
                break;
            }
        }
        return i11 < -1 ? -(i11 + 2) : i11;
    }

    public final float b(int i10, int i11, boolean z10) {
        InterfaceC1433w interfaceC1433w;
        float f3;
        s sVar = this.f23837r;
        if (i10 >= sVar.f22758b - 1) {
            f3 = i11;
        } else {
            int iC = sVar.c(i10);
            int iC2 = sVar.c(i10 + 1);
            if (i11 == iC) {
                f3 = iC;
            } else {
                int i12 = iC2 - iC;
                C0 c10 = (C0) this.f23838s.b(iC);
                if (c10 == null || (interfaceC1433w = c10.f23823b) == null) {
                    interfaceC1433w = this.f23840u;
                }
                float f7 = i12;
                float fA = interfaceC1433w.a((i11 - iC) / f7);
                if (z10) {
                    return fA;
                }
                f3 = (f7 * fA) + iC;
            }
        }
        return f3 / 1000;
    }

    public final void c(AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        float[] fArr;
        boolean z10 = this.f23836D != y0.f24127c;
        AbstractC1427p abstractC1427p4 = this.f23843x;
        t tVar = this.f23838s;
        s sVar = this.f23837r;
        if (abstractC1427p4 == null) {
            this.f23843x = abstractC1427p.c();
            this.f23844y = abstractC1427p3.c();
            int i10 = sVar.f22758b;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = sVar.c(i11) / 1000;
            }
            this.f23842w = fArr2;
            int i12 = sVar.f22758b;
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                iArr[i13] = 0;
            }
            this.f23841v = iArr;
        }
        if (z10) {
            if (this.f23836D != y0.f24127c && j.a(this.f23845z, abstractC1427p) && j.a(this.f23833A, abstractC1427p2)) {
                return;
            }
            this.f23845z = abstractC1427p;
            this.f23833A = abstractC1427p2;
            int iB = abstractC1427p.b() + (abstractC1427p.b() % 2);
            this.f23834B = new float[iB];
            this.f23835C = new float[iB];
            int i14 = sVar.f22758b;
            float[][] fArr3 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                int iC = sVar.c(i15);
                C0 c10 = (C0) tVar.b(iC);
                if (iC == 0 && c10 == null) {
                    fArr = new float[iB];
                    for (int i16 = 0; i16 < iB; i16++) {
                        fArr[i16] = abstractC1427p.a(i16);
                    }
                } else if (iC == this.f23839t && c10 == null) {
                    fArr = new float[iB];
                    for (int i17 = 0; i17 < iB; i17++) {
                        fArr[i17] = abstractC1427p2.a(i17);
                    }
                } else {
                    j.b(c10);
                    AbstractC1427p abstractC1427p5 = c10.f23822a;
                    float[] fArr4 = new float[iB];
                    for (int i18 = 0; i18 < iB; i18++) {
                        fArr4[i18] = abstractC1427p5.a(i18);
                    }
                    fArr = fArr4;
                }
                fArr3[i15] = fArr;
            }
            this.f23836D = new V(this.f23841v, this.f23842w, fArr3);
        }
    }

    @Override // p223x.x0
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // p223x.x0
    public final AbstractC1427p e(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        int[] iArr = y0.f24125a;
        int i10 = 0;
        long j10 = (j / 1000000) - ((long) 0);
        long j11 = this.f23839t;
        if (j10 < 0) {
            j10 = 0;
        }
        long j12 = j10 > j11 ? j11 : j10;
        if (j12 < 0) {
            return abstractC1427p3;
        }
        c(abstractC1427p, abstractC1427p2, abstractC1427p3);
        AbstractC1427p abstractC1427p4 = this.f23844y;
        j.b(abstractC1427p4);
        if (this.f23836D != y0.f24127c) {
            int i11 = (int) j12;
            float fB = b(a(i11), i11, false);
            float[] fArr = this.f23835C;
            r[][] rVarArr = (r[][]) this.f23836D.f20603r;
            float f3 = rVarArr[0][0].f24075a;
            float f7 = rVarArr[rVarArr.length - 1][0].f24076b;
            if (fB < f3) {
                fB = f3;
            }
            if (fB <= f7) {
                f7 = fB;
            }
            int length = fArr.length;
            boolean z10 = false;
            for (r[] rVarArr2 : rVarArr) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < length - 1) {
                    r rVar = rVarArr2[i13];
                    if (f7 <= rVar.f24076b) {
                        if (rVar.f24088p) {
                            fArr[i12] = rVar.f24089q;
                            fArr[i12 + 1] = rVar.f24090r;
                        } else {
                            rVar.c(f7);
                            fArr[i12] = rVar.a();
                            fArr[i12 + 1] = rVar.b();
                        }
                        z10 = true;
                    }
                    i12 += 2;
                    i13++;
                }
                if (z10) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i10 < length2) {
                abstractC1427p4.e(i10, fArr[i10]);
                i10++;
            }
        } else {
            AbstractC1427p abstractC1427pL = l((j12 - 1) * 1000000, abstractC1427p, abstractC1427p2, abstractC1427p3);
            AbstractC1427p abstractC1427pL2 = l(j12 * 1000000, abstractC1427p, abstractC1427p2, abstractC1427p3);
            int iB = abstractC1427pL.b();
            while (i10 < iB) {
                abstractC1427p4.e(i10, (abstractC1427pL.a(i10) - abstractC1427pL2.a(i10)) * 1000.0f);
                i10++;
            }
        }
        return abstractC1427p4;
    }

    @Override // p223x.x0
    public final long i(AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return ((long) r()) * 1000000;
    }

    @Override // p223x.z0
    public final int k() {
        return 0;
    }

    @Override // p223x.x0
    public final AbstractC1427p l(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        AbstractC1427p abstractC1427p4;
        AbstractC1427p abstractC1427p5;
        float f3;
        AbstractC1427p abstractC1427p6 = abstractC1427p;
        AbstractC1427p abstractC1427p7 = abstractC1427p2;
        int[] iArr = y0.f24125a;
        int i10 = 0;
        long j10 = (j / 1000000) - ((long) 0);
        int i11 = this.f23839t;
        long j11 = i11;
        if (j10 < 0) {
            j10 = 0;
        }
        if (j10 <= j11) {
            j11 = j10;
        }
        int i12 = (int) j11;
        t tVar = this.f23838s;
        C0 c10 = (C0) tVar.b(i12);
        if (c10 != null) {
            return c10.f23822a;
        }
        if (i12 >= i11) {
            return abstractC1427p7;
        }
        if (i12 <= 0) {
            return abstractC1427p6;
        }
        c(abstractC1427p6, abstractC1427p7, abstractC1427p3);
        AbstractC1427p abstractC1427p8 = this.f23843x;
        j.b(abstractC1427p8);
        boolean z10 = true;
        if (this.f23836D != y0.f24127c) {
            float fB = b(a(i12), i12, false);
            float[] fArr = this.f23834B;
            r[][] rVarArr = (r[][]) this.f23836D.f20603r;
            int length = rVarArr.length - 1;
            float f7 = rVarArr[0][0].f24075a;
            float f10 = rVarArr[length][0].f24076b;
            int length2 = fArr.length;
            if (fB < f7 || fB > f10) {
                if (fB > f10) {
                    f7 = f10;
                } else {
                    length = 0;
                }
                float f11 = fB - f7;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2 - 1) {
                    r rVar = rVarArr[length][i14];
                    boolean z11 = rVar.f24088p;
                    float f12 = rVar.f24090r;
                    float f13 = rVar.f24089q;
                    if (z11) {
                        float f14 = rVar.f24075a;
                        float f15 = rVar.f24083k;
                        f3 = f11;
                        float f16 = rVar.f24077c;
                        fArr[i13] = (f3 * f13) + p.n(rVar.f24079e, f16, (f7 - f14) * f15, f16);
                        float f17 = (f7 - f14) * f15;
                        float f18 = rVar.f24078d;
                        fArr[i13 + 1] = (f3 * f12) + p.n(rVar.f24080f, f18, f17, f18);
                    } else {
                        f3 = f11;
                        rVar.c(f7);
                        fArr[i13] = (rVar.a() * f3) + (rVar.f24086n * rVar.f24081h) + f13;
                        fArr[i13 + 1] = (rVar.b() * f3) + (rVar.f24087o * rVar.f24082i) + f12;
                    }
                    i13 += 2;
                    i14++;
                    f11 = f3;
                    rVarArr = rVarArr;
                }
            } else {
                int length3 = rVarArr.length;
                int i15 = 0;
                boolean z12 = false;
                while (i15 < length3) {
                    int i16 = i10;
                    int i17 = i16;
                    while (i16 < length2 - 1) {
                        r rVar2 = rVarArr[i15][i17];
                        if (fB <= rVar2.f24076b) {
                            if (rVar2.f24088p) {
                                float f19 = rVar2.f24075a;
                                float f20 = rVar2.f24083k;
                                float f21 = rVar2.f24077c;
                                fArr[i16] = p.n(rVar2.f24079e, f21, (fB - f19) * f20, f21);
                                float f22 = rVar2.f24078d;
                                fArr[i16 + 1] = p.n(rVar2.f24080f, f22, (fB - f19) * f20, f22);
                            } else {
                                rVar2.c(fB);
                                fArr[i16] = (rVar2.f24086n * rVar2.f24081h) + rVar2.f24089q;
                                fArr[i16 + 1] = (rVar2.f24087o * rVar2.f24082i) + rVar2.f24090r;
                            }
                            z12 = z10;
                        } else {
                            z10 = z10;
                        }
                        i16 += 2;
                        i17++;
                        z10 = z10;
                    }
                    boolean z13 = z10;
                    if (z12) {
                        break;
                    }
                    i15++;
                    z10 = z13;
                    i10 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i18 = 0; i18 < length4; i18++) {
                abstractC1427p8.e(i18, fArr[i18]);
            }
        } else {
            int iA = a(i12);
            float fB2 = b(iA, i12, true);
            s sVar = this.f23837r;
            C0 c11 = (C0) tVar.b(sVar.c(iA));
            if (c11 != null && (abstractC1427p5 = c11.f23822a) != null) {
                abstractC1427p6 = abstractC1427p5;
            }
            C0 c12 = (C0) tVar.b(sVar.c(iA + 1));
            if (c12 != null && (abstractC1427p4 = c12.f23822a) != null) {
                abstractC1427p7 = abstractC1427p4;
            }
            int iB = abstractC1427p8.b();
            for (int i19 = 0; i19 < iB; i19++) {
                abstractC1427p8.e(i19, (abstractC1427p7.a(i19) * fB2) + ((1 - fB2) * abstractC1427p6.a(i19)));
            }
        }
        return abstractC1427p8;
    }

    @Override // p223x.z0
    public final int r() {
        return this.f23839t;
    }

    @Override // p223x.x0
    public final AbstractC1427p s(AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return e(i(abstractC1427p, abstractC1427p2, abstractC1427p3), abstractC1427p, abstractC1427p2, abstractC1427p3);
    }
}
