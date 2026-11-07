package N9;

import A.C0029l;
import A.C0040q0;
import K9.AbstractC0405x;
import K9.EnumC0403v;
import K9.InterfaceC0402u;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: N9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0419l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G9.m f6213a = new G9.m(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P9.t f6214b = new P9.t("NO_VALUE", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P9.t f6215c = new P9.t("NONE", 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P9.t f6216d = new P9.t("PENDING", 0);

    public static final Y a(int i10, int i11, M9.a aVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(p123m2.c.r(i10, "replay cannot be negative, but was ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(p123m2.c.r(i11, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i10 <= 0 && i11 <= 0 && aVar != M9.a.f5830r) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i12 = i11 + i10;
        if (i12 < 0) {
            i12 = Integer.MAX_VALUE;
        }
        return new Y(i10, i12, aVar);
    }

    public static /* synthetic */ Y b(int i10, int i11, M9.a aVar) {
        int i12 = (i11 & 1) != 0 ? 0 : 1;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return a(i12, i10, aVar);
    }

    public static final k0 c(Object obj) {
        if (obj == null) {
            obj = O9.c.f6518b;
        }
        return new k0(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void d(InterfaceC0416i interfaceC0416i, Object obj, Object obj2, q9.c cVar) {
        C0431y c0431y;
        if (cVar instanceof C0431y) {
            c0431y = (C0431y) cVar;
            int i10 = c0431y.f6266t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0431y.f6266t = i10 - Integer.MIN_VALUE;
            } else {
                c0431y = new C0431y(cVar);
            }
        } else {
            c0431y = new C0431y(cVar);
        }
        Object obj3 = c0431y.f6265s;
        int i11 = c0431y.f6266t;
        if (i11 == 0) {
            p110k9.a.e(obj3);
            c0431y.f6264r = obj2;
            c0431y.f6266t = 1;
            if (interfaceC0416i.b(obj, c0431y) == p161p9.a.f21156r) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = c0431y.f6264r;
            p110k9.a.e(obj3);
        }
        throw new O9.a(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(m0 m0Var, p241y9.f fVar, Throwable th, q9.c cVar) {
        C0420m c0420m;
        if (cVar instanceof C0420m) {
            c0420m = (C0420m) cVar;
            int i10 = c0420m.f6220t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0420m.f6220t = i10 - Integer.MIN_VALUE;
            } else {
                c0420m = new C0420m(cVar);
            }
        } else {
            c0420m = new C0420m(cVar);
        }
        Object obj = c0420m.f6219s;
        int i11 = c0420m.f6220t;
        try {
            if (i11 == 0) {
                p110k9.a.e(obj);
                c0420m.f6218r = th;
                c0420m.f6220t = 1;
                Object objD = fVar.d(m0Var, th, c0420m);
                Object obj2 = p161p9.a.f21156r;
                if (objD == obj2) {
                    return obj2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = c0420m.f6218r;
                p110k9.a.e(obj);
            }
            return p110k9.y.f19095a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                p110k9.a.a(th2, th);
            }
            throw th2;
        }
    }

    public static final void f(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static InterfaceC0415h g(InterfaceC0415h interfaceC0415h, int i10) {
        M9.a aVar;
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(p123m2.c.r(i10, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i10 == -1) {
            i10 = 0;
            aVar = M9.a.f5831s;
        } else {
            aVar = M9.a.f5830r;
        }
        int i11 = i10;
        M9.a aVar2 = aVar;
        return interfaceC0415h instanceof O9.p ? O9.c.b((O9.p) interfaceC0415h, null, i11, aVar2, 1) : new O9.h(interfaceC0415h, null, i11, aVar2, 2);
    }

    public static final C0410c h(p241y9.e eVar) {
        return new C0410c(eVar, p150o9.i.f20380r, -2, M9.a.f5830r);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable i(InterfaceC0415h interfaceC0415h, InterfaceC0416i interfaceC0416i, q9.c cVar) throws Throwable {
        C0425s c0425s;
        p251z9.v vVar;
        K9.a0 a0Var;
        CancellationException cancellationExceptionE;
        if (cVar instanceof C0425s) {
            c0425s = (C0425s) cVar;
            int i10 = c0425s.f6245t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0425s.f6245t = i10 - Integer.MIN_VALUE;
            } else {
                c0425s = new C0425s(cVar);
            }
        } else {
            c0425s = new C0425s(cVar);
        }
        Object obj = c0425s.f6244s;
        int i11 = c0425s.f6245t;
        if (i11 == 0) {
            p110k9.a.e(obj);
            p251z9.v vVar2 = new p251z9.v();
            try {
                InterfaceC0416i fVar = new B.f(6, interfaceC0416i, vVar2);
                c0425s.f6243r = vVar2;
                c0425s.f6245t = 1;
                Object objD = interfaceC0415h.d(fVar, c0425s);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objD == aVar) {
                    return aVar;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                vVar = vVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = c0425s.f6243r;
            try {
                p110k9.a.e(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) vVar.f24886r;
        if ((th3 != null && th3.equals(th)) || ((a0Var = (K9.a0) c0425s.getContext().i(K9.r.f5392s)) != null && a0Var.isCancelled() && (cancellationExceptionE = a0Var.E()) != null && cancellationExceptionE.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            p110k9.a.a(th3, th);
            throw th3;
        }
        p110k9.a.a(th, th3);
        throw th;
    }

    public static final Object j(InterfaceC0415h interfaceC0415h, p241y9.e eVar, q9.i iVar) {
        int i10 = E.f6087a;
        Object objD = g(new O9.k(new D(eVar, null), interfaceC0415h, p150o9.i.f20380r, -2, M9.a.f5830r), 0).d(O9.r.f6555r, iVar);
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        if (objD != aVar) {
            objD = yVar;
        }
        return objD == aVar ? objD : yVar;
    }

    public static final b0 k(InterfaceC0415h interfaceC0415h) {
        M9.i.f5873b.getClass();
        int i10 = M9.h.f5872b;
        if (1 >= i10) {
            i10 = 1;
        }
        int i11 = i10 - 1;
        boolean z10 = interfaceC0415h instanceof O9.e;
        M9.a aVar = M9.a.f5830r;
        if (z10) {
            O9.e eVar = (O9.e) interfaceC0415h;
            M9.a aVar2 = eVar.f6522t;
            InterfaceC0415h interfaceC0415hI = eVar.i();
            if (interfaceC0415hI != null) {
                int i12 = eVar.f6521s;
                if (i12 != -3 && i12 != -2 && i12 != 0) {
                    i11 = i12;
                } else if (aVar2 != aVar || i12 == 0) {
                    i11 = 0;
                }
                return new b0(i11, aVar2, interfaceC0415hI, eVar.f6520r);
            }
        }
        return new b0(i11, aVar, interfaceC0415h, p150o9.i.f20380r);
    }

    public static final C0411d l(M9.e eVar) {
        return new C0411d(eVar, true);
    }

    public static final InterfaceC0415h m(InterfaceC0415h interfaceC0415h) {
        if (interfaceC0415h instanceof i0) {
            return interfaceC0415h;
        }
        boolean z10 = interfaceC0415h instanceof C0414g;
        G9.m mVar = f6213a;
        if (z10) {
            C0414g c0414g = (C0414g) interfaceC0415h;
            if (c0414g.f6184s == mVar) {
                return c0414g;
            }
        }
        return new C0414g(interfaceC0415h, mVar);
    }

    public static final C0427u n(InterfaceC0415h interfaceC0415h, int i10) {
        if (i10 >= 0) {
            return new C0427u(interfaceC0415h, i10, 0);
        }
        throw new IllegalArgumentException(p123m2.c.r(i10, "Drop count should be non-negative, but had ").toString());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r1.b(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(N9.InterfaceC0416i r7, M9.u r8, boolean r9, p150o9.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof N9.C0418k
            if (r0 == 0) goto L13
            r0 = r10
            N9.k r0 = (N9.C0418k) r0
            int r1 = r0.f6210w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6210w = r1
            goto L18
        L13:
            N9.k r0 = new N9.k
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f6209v
            int r1 = r0.f6210w
            r2 = 0
            r3 = 2
            r4 = 1
            p9.a r5 = p161p9.a.f21156r
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L3f
            if (r1 != r3) goto L37
            boolean r9 = r0.f6208u
            M9.b r7 = r0.f6207t
            M9.u r8 = r0.f6206s
            N9.i r1 = r0.f6205r
            p110k9.a.e(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f6208u
            M9.b r7 = r0.f6207t
            M9.u r8 = r0.f6206s
            N9.i r1 = r0.f6205r
            p110k9.a.e(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            p110k9.a.e(r10)
            boolean r10 = r7 instanceof N9.m0
            if (r10 != 0) goto Lab
            M9.b r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.f6205r = r7     // Catch: java.lang.Throwable -> L35
            r0.f6206s = r8     // Catch: java.lang.Throwable -> L35
            r0.f6207t = r10     // Catch: java.lang.Throwable -> L35
            r0.f6208u = r9     // Catch: java.lang.Throwable -> L35
            r0.f6210w = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L67
            goto L87
        L67:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f6205r = r1     // Catch: java.lang.Throwable -> L35
            r0.f6206s = r8     // Catch: java.lang.Throwable -> L35
            r0.f6207t = r7     // Catch: java.lang.Throwable -> L35
            r0.f6208u = r9     // Catch: java.lang.Throwable -> L35
            r0.f6210w = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.b(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L87:
            return r5
        L88:
            if (r9 == 0) goto L8d
            r8.e(r2)
        L8d:
            k9.y r7 = p110k9.y.f19095a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L9b:
            if (r2 != 0) goto La7
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La7:
            r8.e(r2)
        Laa:
            throw r10
        Lab:
            N9.m0 r7 = (N9.m0) r7
            java.lang.Throwable r7 = r7.f6221r
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.AbstractC0419l.o(N9.i, M9.u, boolean, o9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object p(InterfaceC0415h interfaceC0415h, p150o9.c cVar) {
        H h7;
        p251z9.v vVar;
        O9.a e10;
        F f3;
        P9.t tVar = O9.c.f6518b;
        if (cVar instanceof H) {
            h7 = (H) cVar;
            int i10 = h7.f6098u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h7.f6098u = i10 - Integer.MIN_VALUE;
            } else {
                h7 = new H(cVar);
            }
        } else {
            h7 = new H(cVar);
        }
        Object obj = h7.f6097t;
        int i11 = h7.f6098u;
        if (i11 == 0) {
            p110k9.a.e(obj);
            vVar = new p251z9.v();
            vVar.f24886r = tVar;
            F f7 = new F(vVar, 0);
            try {
                h7.f6095r = vVar;
                h7.f6096s = f7;
                h7.f6098u = 1;
                Object objD = interfaceC0415h.d(f7, h7);
                Object obj2 = p161p9.a.f21156r;
                if (objD == obj2) {
                    return obj2;
                }
            } catch (O9.a e11) {
                e10 = e11;
                f3 = f7;
                if (e10.f6512r == f3) {
                    throw e10;
                }
                AbstractC0405x.l(h7.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f3 = h7.f6096s;
            vVar = h7.f6095r;
            try {
                p110k9.a.e(obj);
            } catch (O9.a e12) {
                e10 = e12;
                if (e10.f6512r == f3) {
                    throw e10;
                }
                AbstractC0405x.l(h7.getContext());
            }
        }
        Object obj3 = vVar.f24886r;
        if (obj3 != tVar) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object q(InterfaceC0415h interfaceC0415h, p241y9.e eVar, q9.c cVar) {
        I i10;
        p251z9.v vVar;
        O9.a e10;
        B.f fVar;
        P9.t tVar = O9.c.f6518b;
        if (cVar instanceof I) {
            i10 = (I) cVar;
            int i11 = i10.f6102u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i10.f6102u = i11 - Integer.MIN_VALUE;
            } else {
                i10 = new I(cVar);
            }
        } else {
            i10 = new I(cVar);
        }
        Object obj = i10.f6101t;
        int i12 = i10.f6102u;
        if (i12 == 0) {
            p110k9.a.e(obj);
            p251z9.v vVar2 = new p251z9.v();
            vVar2.f24886r = tVar;
            B.f fVar2 = new B.f(8, eVar, vVar2);
            try {
                i10.f6099r = vVar2;
                i10.f6100s = fVar2;
                i10.f6102u = 1;
                Object objD = interfaceC0415h.d(fVar2, i10);
                Object obj2 = p161p9.a.f21156r;
                if (objD == obj2) {
                    return obj2;
                }
                vVar = vVar2;
            } catch (O9.a e11) {
                vVar = vVar2;
                e10 = e11;
                fVar = fVar2;
                if (e10.f6512r == fVar) {
                    throw e10;
                }
                AbstractC0405x.l(i10.getContext());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = i10.f6100s;
            vVar = i10.f6099r;
            try {
                p110k9.a.e(obj);
            } catch (O9.a e12) {
                e10 = e12;
                if (e10.f6512r == fVar) {
                    throw e10;
                }
                AbstractC0405x.l(i10.getContext());
            }
        }
        Object obj3 = vVar.f24886r;
        if (obj3 != tVar) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object r(InterfaceC0415h interfaceC0415h, q9.c cVar) {
        J j;
        p251z9.v vVar;
        O9.a e10;
        F f3;
        if (cVar instanceof J) {
            j = (J) cVar;
            int i10 = j.f6106u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j.f6106u = i10 - Integer.MIN_VALUE;
            } else {
                j = new J(cVar);
            }
        } else {
            j = new J(cVar);
        }
        Object obj = j.f6105t;
        int i11 = j.f6106u;
        if (i11 == 0) {
            p110k9.a.e(obj);
            vVar = new p251z9.v();
            F f7 = new F(vVar, 1);
            try {
                j.f6103r = vVar;
                j.f6104s = f7;
                j.f6106u = 1;
                Object objD = interfaceC0415h.d(f7, j);
                Object obj2 = p161p9.a.f21156r;
                if (objD == obj2) {
                    return obj2;
                }
            } catch (O9.a e11) {
                e10 = e11;
                f3 = f7;
                if (e10.f6512r == f3) {
                    throw e10;
                }
                AbstractC0405x.l(j.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f3 = j.f6104s;
            vVar = j.f6103r;
            try {
                p110k9.a.e(obj);
            } catch (O9.a e12) {
                e10 = e12;
                if (e10.f6512r == f3) {
                    throw e10;
                }
                AbstractC0405x.l(j.getContext());
            }
        }
        return vVar.f24886r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0415h s(H2.j jVar, p150o9.h hVar) {
        if (hVar.i(K9.r.f5392s) == null) {
            if (hVar.equals(p150o9.i.f20380r)) {
                return jVar;
            }
            return jVar instanceof O9.p ? O9.c.b((O9.p) jVar, hVar, 0, null, 6) : new O9.h(jVar, hVar, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + hVar).toString());
    }

    public static final InterfaceC0415h t(V v10, p150o9.h hVar, int i10, M9.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == M9.a.f5830r) ? v10 : new O9.h(i10, aVar, v10, hVar);
    }

    public static final void u(InterfaceC0415h interfaceC0415h, InterfaceC0402u interfaceC0402u) {
        AbstractC0405x.x(interfaceC0402u, null, new C0040q0(interfaceC0415h, (p150o9.c) null, 11), 3);
    }

    public static final U v(InterfaceC0415h interfaceC0415h, P9.d dVar, h0 h0Var, Serializable serializable) {
        b0 b0VarK = k(interfaceC0415h);
        k0 k0VarC = c(serializable);
        AbstractC0405x.w(dVar, (p150o9.h) b0VarK.f6167d, h0Var.equals(c0.f6169a) ? EnumC0403v.f5401r : EnumC0403v.f5404u, new C0029l(h0Var, (InterfaceC0415h) b0VarK.f6165b, k0VarC, serializable, (p150o9.c) null));
        return new U(k0VarC);
    }
}
