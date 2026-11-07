package F2;

import A.C0039q;
import J0.AbstractC0283f;
import K.T;
import K.W;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import K9.a0;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import O.N;
import p232y.C1467v;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2195r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2196s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2197t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2198u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2199v;

    public /* synthetic */ D(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2195r = i10;
        this.f2196s = obj;
        this.f2197t = obj2;
        this.f2198u = obj3;
        this.f2199v = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(InterfaceC0415h interfaceC0415h, p150o9.c cVar) {
        O9.f fVar;
        D d5;
        if (cVar instanceof O9.f) {
            fVar = (O9.f) cVar;
            int i10 = fVar.f6527v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f6527v = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new O9.f(this, cVar);
            }
        } else {
            fVar = new O9.f(this, cVar);
        }
        Object obj = fVar.f6525t;
        int i11 = fVar.f6527v;
        if (i11 == 0) {
            p110k9.a.e(obj);
            a0 a0Var = (a0) this.f2196s;
            if (a0Var != null && !a0Var.b()) {
                throw a0Var.E();
            }
            S9.h hVar = (S9.h) this.f2197t;
            fVar.f6523r = this;
            fVar.f6524s = interfaceC0415h;
            fVar.f6527v = 1;
            Object objA = hVar.a(fVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objA == aVar) {
                return aVar;
            }
            d5 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0415h = fVar.f6524s;
            d5 = fVar.f6523r;
            p110k9.a.e(obj);
        }
        AbstractC0405x.x((M9.s) d5.f2198u, null, new C0039q(interfaceC0415h, (O9.v) d5.f2199v, (S9.h) d5.f2197t, null, 20), 3);
        return p110k9.y.f19095a;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, p150o9.c cVar) {
        O9.j jVar;
        D d5;
        switch (this.f2195r) {
            case 0:
                return c((int[]) obj, cVar);
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                N n6 = (N) this.f2198u;
                W w9 = (W) this.f2196s;
                if (zBooleanValue && w9.b()) {
                    T.o((Z0.z) this.f2197t, w9, n6.k(), (Z0.k) this.f2199v, n6.f6309b);
                } else {
                    T.k(w9);
                }
                return p110k9.y.f19095a;
            case 2:
                return a((InterfaceC0415h) obj, cVar);
            case 3:
                if (cVar instanceof O9.j) {
                    jVar = (O9.j) cVar;
                    int i10 = jVar.f6538v;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        jVar.f6538v = i10 - Integer.MIN_VALUE;
                    } else {
                        jVar = new O9.j(this, cVar);
                    }
                } else {
                    jVar = new O9.j(this, cVar);
                }
                Object obj2 = jVar.f6536t;
                int i11 = jVar.f6538v;
                if (i11 == 0) {
                    p110k9.a.e(obj2);
                    a0 a0Var = (a0) ((p251z9.v) this.f2196s).f24886r;
                    if (a0Var != null) {
                        a0Var.e(new O9.l("Child of the scoped flow was cancelled"));
                        jVar.f6534r = this;
                        jVar.f6535s = obj;
                        jVar.f6538v = 1;
                        Object objW = a0Var.w(jVar);
                        p161p9.a aVar = p161p9.a.f21156r;
                        if (objW == aVar) {
                            return aVar;
                        }
                    }
                    d5 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = jVar.f6535s;
                    d5 = jVar.f6534r;
                    p110k9.a.e(obj2);
                }
                ((p251z9.v) d5.f2196s).f24886r = AbstractC0405x.x((InterfaceC0402u) d5.f2198u, null, new O9.i((O9.k) d5.f2199v, (InterfaceC0416i) d5.f2197t, obj, null), 1);
                return p110k9.y.f19095a;
            default:
                B.i iVar = (B.i) obj;
                p251z9.t tVar = (p251z9.t) this.f2198u;
                p251z9.t tVar2 = (p251z9.t) this.f2197t;
                p251z9.t tVar3 = (p251z9.t) this.f2196s;
                boolean z10 = true;
                if (iVar instanceof B.l) {
                    tVar3.f24884r++;
                } else if ((iVar instanceof B.m) || (iVar instanceof B.k)) {
                    tVar3.f24884r--;
                } else if (iVar instanceof B.g) {
                    tVar2.f24884r++;
                } else if (iVar instanceof B.h) {
                    tVar2.f24884r--;
                } else if (iVar instanceof B.d) {
                    tVar.f24884r++;
                } else if (iVar instanceof B.e) {
                    tVar.f24884r--;
                }
                int i12 = tVar3.f24884r;
                boolean z11 = false;
                boolean z12 = i12 > 0;
                boolean z13 = tVar2.f24884r > 0;
                boolean z14 = tVar.f24884r > 0;
                C1467v c1467v = (C1467v) this.f2199v;
                if (c1467v.f24591G != z12) {
                    c1467v.f24591G = z12;
                    z11 = true;
                }
                if (c1467v.f24592H != z13) {
                    c1467v.f24592H = z13;
                    z11 = true;
                }
                if (c1467v.f24593I != z14) {
                    c1467v.f24593I = z14;
                } else {
                    z10 = z11;
                }
                if (z10) {
                    AbstractC0283f.m(c1467v);
                }
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r1.b(r15, r2) == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r1.b(r15, r2) == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(int[] r14, p150o9.c r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f2198u
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.f2197t
            N9.i r1 = (N9.InterfaceC0416i) r1
            boolean r2 = r15 instanceof F2.C
            if (r2 == 0) goto L1b
            r2 = r15
            F2.C r2 = (F2.C) r2
            int r3 = r2.f2194v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f2194v = r3
            goto L20
        L1b:
            F2.C r2 = new F2.C
            r2.<init>(r13, r15)
        L20:
            java.lang.Object r15 = r2.f2192t
            int r3 = r2.f2194v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3d
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2d
            goto L35
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            int[] r14 = r2.f2191s
            F2.D r0 = r2.f2190r
            p110k9.a.e(r15)
            goto La2
        L3d:
            p110k9.a.e(r15)
            java.lang.Object r15 = r13.f2196s
            z9.v r15 = (p251z9.v) r15
            java.lang.Object r3 = r15.f24886r
            p9.a r6 = p161p9.a.f21156r
            if (r3 != 0) goto L5b
            java.util.Set r15 = p120l9.l.p0(r0)
            r2.f2190r = r13
            r2.f2191s = r14
            r2.f2194v = r5
            java.lang.Object r15 = r1.b(r15, r2)
            if (r15 != r6) goto La1
            goto La0
        L5b:
            java.lang.Object r3 = r13.f2199v
            int[] r3 = (int[]) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L67:
            if (r8 >= r7) goto L8a
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r15.f24886r
            if (r12 == 0) goto L82
            int[] r12 = (int[]) r12
            r9 = r3[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L7e
            r5.add(r10)
        L7e:
            int r8 = r8 + 1
            r9 = r11
            goto L67
        L82:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        L8a:
            boolean r15 = r5.isEmpty()
            if (r15 != 0) goto La1
            java.util.Set r15 = p120l9.m.G0(r5)
            r2.f2190r = r13
            r2.f2191s = r14
            r2.f2194v = r4
            java.lang.Object r15 = r1.b(r15, r2)
            if (r15 != r6) goto La1
        La0:
            return r6
        La1:
            r0 = r13
        La2:
            java.lang.Object r15 = r0.f2196s
            z9.v r15 = (p251z9.v) r15
            r15.f24886r = r14
            k9.y r14 = p110k9.y.f19095a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.D.c(int[], o9.c):java.lang.Object");
    }

    public D(p251z9.v vVar, InterfaceC0402u interfaceC0402u, O9.k kVar, InterfaceC0416i interfaceC0416i) {
        this.f2195r = 3;
        this.f2196s = vVar;
        this.f2198u = interfaceC0402u;
        this.f2199v = kVar;
        this.f2197t = interfaceC0416i;
    }
}
