package Z;

/* JADX INFO: renamed from: Z.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0697n0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10704t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f10705u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0697n0(int i10, int i11, Object obj, Object obj2) {
        super(1);
        this.f10702r = i11;
        this.f10704t = obj;
        this.f10703s = i10;
        this.f10705u = obj2;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        InterfaceC0701q interfaceC0701q;
        InterfaceC0701q interfaceC0701q2;
        int i10;
        switch (this.f10702r) {
            case 0:
                InterfaceC0701q interfaceC0701q3 = (InterfaceC0701q) obj;
                u.z zVar = (u.z) this.f10705u;
                C0699o0 c0699o0 = (C0699o0) this.f10704t;
                int i11 = c0699o0.f10750e;
                int i12 = this.f10703s;
                if (i11 == i12 && p251z9.j.a(zVar, c0699o0.f10751f) && (interfaceC0701q3 instanceof C0704u)) {
                    long[] jArr = zVar.f22784a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j = jArr[i13];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8;
                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((255 & j) < 128) {
                                        int i17 = (i13 << 3) + i16;
                                        Object obj2 = zVar.f22785b[i17];
                                        boolean z10 = zVar.f22786c[i17] != i12;
                                        if (z10) {
                                            i10 = i14;
                                            C0704u c0704u = (C0704u) interfaceC0701q3;
                                            u.E e10 = c0704u.f10827x;
                                            va.g.I(e10, obj2, c0699o0);
                                            interfaceC0701q2 = interfaceC0701q3;
                                            if (obj2 instanceof C) {
                                                C c10 = (C) obj2;
                                                if (!e10.c(c10)) {
                                                    va.g.J(c0704u.f10810A, c10);
                                                }
                                                u.E e11 = c0699o0.g;
                                                if (e11 != null) {
                                                    e11.j(obj2);
                                                }
                                            }
                                        } else {
                                            interfaceC0701q2 = interfaceC0701q3;
                                            i10 = i14;
                                        }
                                        if (z10) {
                                            zVar.f(i17);
                                        }
                                    } else {
                                        interfaceC0701q2 = interfaceC0701q3;
                                        i10 = i14;
                                    }
                                    j >>= i10;
                                    i16++;
                                    i14 = i10;
                                    interfaceC0701q3 = interfaceC0701q2;
                                }
                                interfaceC0701q = interfaceC0701q3;
                                if (i15 == i14) {
                                }
                            } else {
                                interfaceC0701q = interfaceC0701q3;
                            }
                            if (i13 != length) {
                                i13++;
                                interfaceC0701q3 = interfaceC0701q;
                            }
                        }
                    }
                }
                break;
            default:
                H0.T t2 = (H0.T) obj;
                p232y.g0 g0Var = (p232y.g0) this.f10704t;
                int iG = g0Var.f24517F.f24535a.g();
                if (iG < 0) {
                    iG = 0;
                }
                int i18 = this.f10703s;
                if (iG > i18) {
                    iG = i18;
                }
                int i19 = -iG;
                boolean z11 = g0Var.f24518G;
                int i20 = z11 ? 0 : i19;
                if (!z11) {
                    i19 = 0;
                }
                D.E e12 = new D.E((H0.U) this.f10705u, i20, i19, 3);
                t2.f3167a = true;
                e12.e(t2);
                t2.f3167a = false;
                break;
        }
        return p110k9.y.f19095a;
    }
}
