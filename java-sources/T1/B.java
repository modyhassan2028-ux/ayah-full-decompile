package T1;

import A.C0007a;
import A.C0039q;
import A.M0;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import N9.InterfaceC0415h;
import java.util.List;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC0491h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f7561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0486c f7562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0402u f7563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4.e f7564d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7566f;
    public K9.A g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Aa.a f7568i;
    public final p110k9.o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p110k9.o f7569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Aa.a f7570l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S9.c f7565e = S9.d.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O8.c f7567h = new O8.c(26);

    public B(F f3, List list, InterfaceC0486c interfaceC0486c, InterfaceC0402u interfaceC0402u) {
        this.f7561a = f3;
        this.f7562b = interfaceC0486c;
        this.f7563c = interfaceC0402u;
        p150o9.c cVar = null;
        this.f7564d = new C4.e(new C0039q(this, cVar, 23));
        Aa.a aVar = new Aa.a();
        aVar.f557u = this;
        aVar.f554r = S9.d.a();
        aVar.f555s = AbstractC0405x.a();
        aVar.f556t = p120l9.m.C0(list);
        this.f7568i = aVar;
        this.j = p110k9.a.d(new C0496m(this, 1));
        this.f7569k = p110k9.a.d(new C0496m(this, 0));
        M0 m10 = new M0(23, this);
        O9.y yVar = new O9.y(this, cVar, 7);
        Aa.a aVar2 = new Aa.a();
        aVar2.f554r = interfaceC0402u;
        aVar2.f555s = yVar;
        aVar2.f556t = u0.a(Integer.MAX_VALUE, 6, null);
        aVar2.f557u = new p248z6.c(25, (byte) 0);
        K9.a0 a0Var = (K9.a0) interfaceC0402u.getCoroutineContext().i(K9.r.f5392s);
        if (a0Var != null) {
            a0Var.s(new C0007a(25, m10, aVar2));
        }
        this.f7570l = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(B b5, q9.c cVar) {
        C0500q c0500q;
        S9.c cVar2;
        if (cVar instanceof C0500q) {
            c0500q = (C0500q) cVar;
            int i10 = c0500q.f7722v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0500q.f7722v = i10 - Integer.MIN_VALUE;
            } else {
                c0500q = new C0500q(b5, cVar);
            }
        } else {
            c0500q = new C0500q(b5, cVar);
        }
        Object obj = c0500q.f7720t;
        int i11 = c0500q.f7722v;
        if (i11 == 0) {
            p110k9.a.e(obj);
            cVar2 = b5.f7565e;
            c0500q.f7718r = b5;
            c0500q.f7719s = cVar2;
            c0500q.f7722v = 1;
            Object objE = cVar2.e(c0500q);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S9.c cVar3 = c0500q.f7719s;
            B b10 = c0500q.f7718r;
            p110k9.a.e(obj);
            cVar2 = cVar3;
            b5 = b10;
        }
        try {
            int i12 = b5.f7566f - 1;
            b5.f7566f = i12;
            if (i12 == 0) {
                K9.A a9 = b5.g;
                if (a9 != null) {
                    a9.e(null);
                }
                b5.g = null;
            }
            return p110k9.y.f19095a;
        } finally {
            cVar2.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r1v9, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T1.B] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [T1.B] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(T1.B r9, T1.N r10, q9.c r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.B.d(T1.B, T1.N, q9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(B b5, q9.c cVar) {
        C0501s c0501s;
        S9.c cVar2;
        if (cVar instanceof C0501s) {
            c0501s = (C0501s) cVar;
            int i10 = c0501s.f7733v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0501s.f7733v = i10 - Integer.MIN_VALUE;
            } else {
                c0501s = new C0501s(b5, cVar);
            }
        } else {
            c0501s = new C0501s(b5, cVar);
        }
        Object obj = c0501s.f7731t;
        int i11 = c0501s.f7733v;
        if (i11 == 0) {
            p110k9.a.e(obj);
            cVar2 = b5.f7565e;
            c0501s.f7729r = b5;
            c0501s.f7730s = cVar2;
            c0501s.f7733v = 1;
            Object objE = cVar2.e(c0501s);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S9.c cVar3 = c0501s.f7730s;
            B b10 = c0501s.f7729r;
            p110k9.a.e(obj);
            cVar2 = cVar3;
            b5 = b10;
        }
        p150o9.c cVar4 = null;
        try {
            int i12 = b5.f7566f + 1;
            b5.f7566f = i12;
            if (i12 == 1) {
                b5.g = AbstractC0405x.x(b5.f7563c, null, new C0497n(b5, cVar4, 1), 3);
            }
            return p110k9.y.f19095a;
        } finally {
            cVar2.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(B b5, boolean z10, p150o9.c cVar) {
        C0503u c0503u;
        B b10;
        d0 d0Var;
        B b11;
        p110k9.j jVar;
        d0 d0Var2;
        if (cVar instanceof C0503u) {
            c0503u = (C0503u) cVar;
            int i10 = c0503u.f7744w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0503u.f7744w = i10 - Integer.MIN_VALUE;
            } else {
                c0503u = new C0503u(b5, cVar);
            }
        } else {
            c0503u = new C0503u(b5, cVar);
        }
        Object objA = c0503u.f7742u;
        int i11 = c0503u.f7744w;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(objA);
            d0 d0VarP = b5.f7567h.p();
            if (d0VarP instanceof e0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            M mH = b5.h();
            c0503u.f7739r = b5;
            c0503u.f7740s = d0VarP;
            c0503u.f7741t = z10;
            c0503u.f7744w = 1;
            Object objE = mH.e(c0503u);
            if (objE != aVar) {
                b10 = b5;
                d0Var = d0VarP;
                objA = objE;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                b11 = c0503u.f7739r;
                p110k9.a.e(objA);
                jVar = (p110k9.j) objA;
                d0Var2 = (d0) jVar.f19077r;
                if (((Boolean) jVar.f19078s).booleanValue()) {
                    b11.f7567h.E(d0Var2);
                }
                return d0Var2;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b11 = c0503u.f7739r;
            p110k9.a.e(objA);
            jVar = (p110k9.j) objA;
            d0Var2 = (d0) jVar.f19077r;
            if (((Boolean) jVar.f19078s).booleanValue()) {
                b11.f7567h.E(d0Var2);
            }
            return d0Var2;
        }
        z10 = c0503u.f7741t;
        d0Var = c0503u.f7740s;
        b10 = c0503u.f7739r;
        p110k9.a.e(objA);
        int iIntValue = ((Number) objA).intValue();
        boolean z11 = d0Var instanceof C0487d;
        int i12 = z11 ? d0Var.f7669a : -1;
        if (z11 && iIntValue == i12) {
            return d0Var;
        }
        p150o9.c cVar2 = null;
        if (z10) {
            M mH2 = b10.h();
            C0504v c0504v = new C0504v(b10, null);
            c0503u.f7739r = b10;
            c0503u.f7740s = null;
            c0503u.f7744w = 2;
            objA = mH2.b(c0504v, c0503u);
            if (objA != aVar) {
                b11 = b10;
                jVar = (p110k9.j) objA;
                d0Var2 = (d0) jVar.f19077r;
                if (((Boolean) jVar.f19078s).booleanValue()) {
                    b11.f7567h.E(d0Var2);
                }
                return d0Var2;
            }
        } else {
            M mH3 = b10.h();
            C0505w c0505w = new C0505w(b10, i12, cVar2, 0);
            c0503u.f7739r = b10;
            c0503u.f7740s = null;
            c0503u.f7744w = 3;
            objA = mH3.a(c0505w, c0503u);
            if (objA != aVar) {
                b11 = b10;
                jVar = (p110k9.j) objA;
                d0Var2 = (d0) jVar.f19077r;
                if (((Boolean) jVar.f19078s).booleanValue()) {
                    b11.f7567h.E(d0Var2);
                }
                return d0Var2;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009f A[Catch: b -> 0x005f, TryCatch #0 {b -> 0x005f, blocks: (B:19:0x005a, B:54:0x00ff, B:24:0x0068, B:51:0x00e0, B:32:0x0085, B:40:0x009f, B:42:0x00a5, B:36:0x008e, B:48:0x00cd), top: B:78:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:61:0x012a, B:63:0x013c, B:64:0x0144), top: B:79:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0144 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #1 {all -> 0x0169, blocks: (B:61:0x012a, B:63:0x013c, B:64:0x0144), top: B:79:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:70:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(B b5, boolean z10, q9.c cVar) {
        C0506x c0506x;
        p251z9.v vVar;
        C0485b c0485b;
        B b10;
        boolean z11;
        p251z9.v vVar2;
        p251z9.t tVar;
        C0485b c0485b2;
        C0507y c0507y;
        Object objB;
        p251z9.t tVar2;
        p251z9.v vVar3;
        int iHashCode;
        Object objE;
        B b11;
        int i10;
        Object obj;
        if (cVar instanceof C0506x) {
            c0506x = (C0506x) cVar;
            int i11 = c0506x.f7763z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0506x.f7763z = i11 - Integer.MIN_VALUE;
            } else {
                c0506x = new C0506x(b5, cVar);
            }
        } else {
            c0506x = new C0506x(b5, cVar);
        }
        Object objE2 = c0506x.f7761x;
        int i12 = c0506x.f7763z;
        p150o9.c cVar2 = null;
        Object c0487d = p161p9.a.f21156r;
        try {
            switch (i12) {
                case 0:
                    p110k9.a.e(objE2);
                    if (z10) {
                        c0506x.f7755r = b5;
                        c0506x.f7759v = z10;
                        c0506x.f7763z = 1;
                        objE2 = b5.j(c0506x);
                        if (objE2 != c0487d) {
                            if (objE2 != null) {
                                iHashCode = objE2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            M mH = b5.h();
                            c0506x.f7755r = b5;
                            c0506x.f7756s = objE2;
                            c0506x.f7759v = z10;
                            c0506x.f7760w = iHashCode;
                            c0506x.f7763z = 2;
                            objE = mH.e(c0506x);
                            if (objE != c0487d) {
                                b11 = b5;
                                i10 = iHashCode;
                                obj = objE2;
                                objE2 = objE;
                                return new C0487d(i10, ((Number) objE2).intValue(), obj);
                            }
                        }
                    } else {
                        M mH2 = b5.h();
                        c0506x.f7755r = b5;
                        c0506x.f7759v = z10;
                        c0506x.f7763z = 3;
                        objE2 = mH2.e(c0506x);
                        if (objE2 != c0487d) {
                            int iIntValue = ((Number) objE2).intValue();
                            M mH3 = b5.h();
                            C0505w c0505w = new C0505w(b5, iIntValue, cVar2, 1);
                            c0506x.f7755r = b5;
                            c0506x.f7759v = z10;
                            c0506x.f7763z = 4;
                            objE2 = mH3.a(c0505w, c0506x);
                            if (objE2 == c0487d) {
                            }
                            return (C0487d) objE2;
                        }
                    }
                    return c0487d;
                case 1:
                    z10 = c0506x.f7759v;
                    b5 = (B) c0506x.f7755r;
                    p110k9.a.e(objE2);
                    if (objE2 != null) {
                        iHashCode = objE2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    M mH4 = b5.h();
                    c0506x.f7755r = b5;
                    c0506x.f7756s = objE2;
                    c0506x.f7759v = z10;
                    c0506x.f7760w = iHashCode;
                    c0506x.f7763z = 2;
                    objE = mH4.e(c0506x);
                    if (objE != c0487d) {
                        b11 = b5;
                        i10 = iHashCode;
                        obj = objE2;
                        objE2 = objE;
                        return new C0487d(i10, ((Number) objE2).intValue(), obj);
                    }
                    return c0487d;
                case 2:
                    i10 = c0506x.f7760w;
                    z10 = c0506x.f7759v;
                    obj = c0506x.f7756s;
                    b11 = (B) c0506x.f7755r;
                    try {
                        p110k9.a.e(objE2);
                        return new C0487d(i10, ((Number) objE2).intValue(), obj);
                    } catch (C0485b e10) {
                        e = e10;
                        b5 = b11;
                        vVar = new p251z9.v();
                        InterfaceC0486c interfaceC0486c = b5.f7562b;
                        c0506x.f7755r = b5;
                        c0506x.f7756s = e;
                        c0506x.f7757t = vVar;
                        c0506x.f7758u = vVar;
                        c0506x.f7759v = z10;
                        c0506x.f7763z = 5;
                        Object objF = interfaceC0486c.f(e);
                        if (objF != c0487d) {
                            c0485b = e;
                            objE2 = objF;
                            b10 = b5;
                            z11 = z10;
                            vVar2 = vVar;
                            vVar2.f24886r = objE2;
                            tVar = new p251z9.t();
                            try {
                                c0507y = new C0507y(vVar, b10, tVar, (p150o9.c) null);
                                c0506x.f7755r = c0485b;
                                c0506x.f7756s = vVar;
                                c0506x.f7757t = tVar;
                                c0506x.f7758u = null;
                                c0506x.f7763z = 6;
                                if (z11) {
                                    b10.getClass();
                                    objB = c0507y.e(c0506x);
                                } else {
                                    objB = b10.h().b(new C0490g(c0507y, cVar2, 1), c0506x);
                                }
                                if (objB != c0487d) {
                                    tVar2 = tVar;
                                    vVar3 = vVar;
                                    Object obj2 = vVar3.f24886r;
                                    c0487d = new C0487d(obj2 != null ? obj2.hashCode() : 0, tVar2.f24884r, obj2);
                                }
                            } catch (Throwable th) {
                                th = th;
                                c0485b2 = c0485b;
                                p110k9.a.a(c0485b2, th);
                                throw c0485b2;
                            }
                        }
                        return c0487d;
                    }
                case 3:
                    z10 = c0506x.f7759v;
                    b5 = (B) c0506x.f7755r;
                    p110k9.a.e(objE2);
                    int iIntValue2 = ((Number) objE2).intValue();
                    M mH5 = b5.h();
                    C0505w c0505w2 = new C0505w(b5, iIntValue2, cVar2, 1);
                    c0506x.f7755r = b5;
                    c0506x.f7759v = z10;
                    c0506x.f7763z = 4;
                    objE2 = mH5.a(c0505w2, c0506x);
                    if (objE2 == c0487d) {
                        return c0487d;
                    }
                    return (C0487d) objE2;
                case 4:
                    boolean z12 = c0506x.f7759v;
                    p110k9.a.e(objE2);
                    return (C0487d) objE2;
                case 5:
                    z11 = c0506x.f7759v;
                    vVar2 = c0506x.f7758u;
                    vVar = (p251z9.v) c0506x.f7757t;
                    c0485b = (C0485b) c0506x.f7756s;
                    b10 = (B) c0506x.f7755r;
                    p110k9.a.e(objE2);
                    vVar2.f24886r = objE2;
                    tVar = new p251z9.t();
                    c0507y = new C0507y(vVar, b10, tVar, (p150o9.c) null);
                    c0506x.f7755r = c0485b;
                    c0506x.f7756s = vVar;
                    c0506x.f7757t = tVar;
                    c0506x.f7758u = null;
                    c0506x.f7763z = 6;
                    if (z11) {
                        b10.getClass();
                        objB = c0507y.e(c0506x);
                    } else {
                        objB = b10.h().b(new C0490g(c0507y, cVar2, 1), c0506x);
                    }
                    if (objB != c0487d) {
                        tVar2 = tVar;
                        vVar3 = vVar;
                        Object obj3 = vVar3.f24886r;
                        c0487d = new C0487d(obj3 != null ? obj3.hashCode() : 0, tVar2.f24884r, obj3);
                    }
                    return c0487d;
                case 6:
                    tVar2 = (p251z9.t) c0506x.f7757t;
                    vVar3 = (p251z9.v) c0506x.f7756s;
                    c0485b2 = (C0485b) c0506x.f7755r;
                    try {
                        p110k9.a.e(objE2);
                        Object obj4 = vVar3.f24886r;
                        c0487d = new C0487d(obj4 != null ? obj4.hashCode() : 0, tVar2.f24884r, obj4);
                        return c0487d;
                    } catch (Throwable th2) {
                        th = th2;
                        p110k9.a.a(c0485b2, th);
                        throw c0485b2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (C0485b e11) {
            e = e11;
        }
    }

    @Override // T1.InterfaceC0491h
    public final Object a(p241y9.e eVar, p150o9.c cVar) {
        h0 h0Var = (h0) cVar.getContext().i(g0.f7679r);
        if (h0Var != null) {
            h0Var.a(this);
        }
        return AbstractC0405x.I(new h0(h0Var, this), new C0039q(this, eVar, (p150o9.c) null), cVar);
    }

    @Override // T1.InterfaceC0491h
    public final InterfaceC0415h b() {
        return this.f7564d;
    }

    public final M h() {
        return (M) this.f7569k.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r3.G(r0) == r4) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(q9.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof T1.C0502t
            if (r0 == 0) goto L13
            r0 = r7
            T1.t r0 = (T1.C0502t) r0
            int r1 = r0.f7738v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7738v = r1
            goto L18
        L13:
            T1.t r0 = new T1.t
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f7736t
            int r1 = r0.f7738v
            r2 = 2
            r3 = 1
            p9.a r4 = p161p9.a.f21156r
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            int r1 = r0.f7735s
            T1.B r0 = r0.f7734r
            p110k9.a.e(r7)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r7 = move-exception
            goto L6e
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            T1.B r1 = r0.f7734r
            p110k9.a.e(r7)
            goto L51
        L3e:
            p110k9.a.e(r7)
            T1.M r7 = r6.h()
            r0.f7734r = r6
            r0.f7738v = r3
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r4) goto L50
            goto L65
        L50:
            r1 = r6
        L51:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            Aa.a r3 = r1.f7568i     // Catch: java.lang.Throwable -> L69
            r0.f7734r = r1     // Catch: java.lang.Throwable -> L69
            r0.f7735s = r7     // Catch: java.lang.Throwable -> L69
            r0.f7738v = r2     // Catch: java.lang.Throwable -> L69
            java.lang.Object r7 = r3.G(r0)     // Catch: java.lang.Throwable -> L69
            if (r7 != r4) goto L66
        L65:
            return r4
        L66:
            k9.y r7 = p110k9.y.f19095a
            return r7
        L69:
            r0 = move-exception
            r5 = r1
            r1 = r7
            r7 = r0
            r0 = r5
        L6e:
            O8.c r0 = r0.f7567h
            T1.W r2 = new T1.W
            r2.<init>(r7, r1)
            r0.E(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.B.i(q9.c):java.lang.Object");
    }

    public final Object j(q9.c cVar) {
        return ((I) this.j.getValue()).a(new C0498o(3, (p150o9.c) null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(Object obj, boolean z10, q9.c cVar) {
        C0508z c0508z;
        p251z9.t tVar;
        if (cVar instanceof C0508z) {
            c0508z = (C0508z) cVar;
            int i10 = c0508z.f7773u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0508z.f7773u = i10 - Integer.MIN_VALUE;
            } else {
                c0508z = new C0508z(this, cVar);
            }
        } else {
            c0508z = new C0508z(this, cVar);
        }
        Object obj2 = c0508z.f7771s;
        int i11 = c0508z.f7773u;
        if (i11 == 0) {
            p110k9.a.e(obj2);
            p251z9.t tVar2 = new p251z9.t();
            I i12 = (I) this.j.getValue();
            A a9 = new A(tVar2, this, obj, z10, null);
            c0508z.f7770r = tVar2;
            c0508z.f7773u = 1;
            Object objB = i12.b(a9, c0508z);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objB == aVar) {
                return aVar;
            }
            tVar = tVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = c0508z.f7770r;
            p110k9.a.e(obj2);
        }
        return new Integer(tVar.f24884r);
    }
}
