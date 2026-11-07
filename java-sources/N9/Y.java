package N9;

import K9.C0387e;
import K9.C0389g;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Y extends O9.b implements Q, InterfaceC0415h, O9.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f6142A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f6143B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f6144C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6145v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final M9.a f6147x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object[] f6148y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f6149z;

    public Y(int i10, int i11, M9.a aVar) {
        this.f6145v = i10;
        this.f6146w = i11;
        this.f6147x = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0077, B:35:0x0081, B:39:0x0094, B:42:0x009b, B:43:0x009f, B:44:0x00a0, B:22:0x0049), top: B:53:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0094 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0077, B:35:0x0081, B:39:0x0094, B:42:0x009b, B:43:0x009f, B:44:0x00a0, B:22:0x0049), top: B:53:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [N9.i] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [O9.b] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [N9.Y] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [N9.i] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [O9.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [N9.Z] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [N9.Z] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ae -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:35:0x0081
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void n(N9.Y r8, N9.InterfaceC0416i r9, p150o9.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof N9.X
            if (r0 == 0) goto L13
            r0 = r10
            N9.X r0 = (N9.X) r0
            int r1 = r0.f6141x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6141x = r1
            goto L18
        L13:
            N9.X r0 = new N9.X
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f6139v
            int r1 = r0.f6141x
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5c
            r8 = 1
            if (r1 == r8) goto L4d
            if (r1 == r3) goto L41
            if (r1 != r2) goto L39
            K9.a0 r8 = r0.f6138u
            N9.Z r9 = r0.f6137t
            N9.i r1 = r0.f6136s
            N9.Y r4 = r0.f6135r
            p110k9.a.e(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L74
        L36:
            r8 = move-exception
            goto Lb4
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            K9.a0 r8 = r0.f6138u
            N9.Z r9 = r0.f6137t
            N9.i r1 = r0.f6136s
            N9.Y r4 = r0.f6135r
            p110k9.a.e(r10)     // Catch: java.lang.Throwable -> L36
            goto L77
        L4d:
            N9.Z r9 = r0.f6137t
            N9.i r8 = r0.f6136s
            N9.Y r1 = r0.f6135r
            p110k9.a.e(r10)     // Catch: java.lang.Throwable -> L59
            r10 = r8
            r8 = r1
            goto L68
        L59:
            r8 = move-exception
            r4 = r1
            goto Lb4
        L5c:
            p110k9.a.e(r10)
            O9.d r10 = r8.e()
            N9.Z r10 = (N9.Z) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L68:
            o9.h r1 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            K9.r r4 = K9.r.f5392s     // Catch: java.lang.Throwable -> Lb1
            o9.f r1 = r1.i(r4)     // Catch: java.lang.Throwable -> Lb1
            K9.a0 r1 = (K9.a0) r1     // Catch: java.lang.Throwable -> Lb1
        L74:
            r4 = r8
            r8 = r1
            r1 = r10
        L77:
            java.lang.Object r10 = r4.v(r9)     // Catch: java.lang.Throwable -> L36
            P9.t r5 = N9.AbstractC0419l.f6214b     // Catch: java.lang.Throwable -> L36
            p9.a r6 = p161p9.a.f21156r
            if (r10 != r5) goto L92
            r0.f6135r = r4     // Catch: java.lang.Throwable -> L36
            r0.f6136s = r1     // Catch: java.lang.Throwable -> L36
            r0.f6137t = r9     // Catch: java.lang.Throwable -> L36
            r0.f6138u = r8     // Catch: java.lang.Throwable -> L36
            r0.f6141x = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.l(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L77
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r5 = r8.b()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.E()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        La0:
            r0.f6135r = r4     // Catch: java.lang.Throwable -> L36
            r0.f6136s = r1     // Catch: java.lang.Throwable -> L36
            r0.f6137t = r9     // Catch: java.lang.Throwable -> L36
            r0.f6138u = r8     // Catch: java.lang.Throwable -> L36
            r0.f6141x = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.b(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lb0:
            return
        Lb1:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb4:
            r4.j(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.Y.n(N9.Y, N9.i, o9.c):void");
    }

    @Override // N9.V
    public final List a() {
        synchronized (this) {
            int iR = (int) ((r() + ((long) this.f6143B)) - this.f6149z);
            if (iR == 0) {
                return p120l9.r.f19440r;
            }
            ArrayList arrayList = new ArrayList(iR);
            Object[] objArr = this.f6148y;
            p251z9.j.b(objArr);
            for (int i10 = 0; i10 < iR; i10++) {
                arrayList.add(objArr[((int) (this.f6149z + ((long) i10))) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, p150o9.c cVar) throws Throwable {
        Throwable th;
        p150o9.c[] cVarArrQ;
        W w9;
        if (g(obj)) {
            return p110k9.y.f19095a;
        }
        C0389g c0389g = new C0389g(1, AbstractC0813f2.H(cVar));
        c0389g.s();
        p150o9.c[] cVarArrQ2 = O9.c.f6517a;
        synchronized (this) {
            try {
                if (t(obj)) {
                    try {
                        c0389g.resumeWith(p110k9.y.f19095a);
                        cVarArrQ = q(cVarArrQ2);
                        w9 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        W w10 = new W(this, r() + ((long) (this.f6143B + this.f6144C)), obj, c0389g);
                        p(w10);
                        this.f6144C++;
                        if (this.f6146w == 0) {
                            cVarArrQ2 = q(cVarArrQ2);
                        }
                        cVarArrQ = cVarArrQ2;
                        w9 = w10;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (w9 != null) {
                    c0389g.v(new C0387e(2, w9));
                }
                for (p150o9.c cVar2 : cVarArrQ) {
                    if (cVar2 != null) {
                        cVar2.resumeWith(p110k9.y.f19095a);
                    }
                }
                Object objR = c0389g.r();
                p161p9.a aVar = p161p9.a.f21156r;
                if (objR != aVar) {
                    objR = p110k9.y.f19095a;
                }
                return objR == aVar ? objR : p110k9.y.f19095a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // O9.p
    public final InterfaceC0415h c(p150o9.h hVar, int i10, M9.a aVar) {
        return AbstractC0419l.t(this, hVar, i10, aVar);
    }

    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) throws Throwable {
        n(this, interfaceC0416i, cVar);
        return p161p9.a.f21156r;
    }

    @Override // N9.Q
    public final void f() throws Throwable {
        synchronized (this) {
            try {
                try {
                    w(r() + ((long) this.f6143B), this.f6142A, r() + ((long) this.f6143B), r() + ((long) this.f6143B) + ((long) this.f6144C));
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // N9.Q
    public final boolean g(Object obj) {
        int i10;
        boolean z10;
        p150o9.c[] cVarArrQ = O9.c.f6517a;
        synchronized (this) {
            if (t(obj)) {
                cVarArrQ = q(cVarArrQ);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (p150o9.c cVar : cVarArrQ) {
            if (cVar != null) {
                cVar.resumeWith(p110k9.y.f19095a);
            }
        }
        return z10;
    }

    @Override // O9.b
    public final O9.d h() {
        Z z10 = new Z();
        z10.f6150a = -1L;
        return z10;
    }

    @Override // O9.b
    public final O9.d[] i() {
        return new Z[2];
    }

    public final Object l(Z z10, X x9) {
        C0389g c0389g = new C0389g(1, AbstractC0813f2.H(x9));
        c0389g.s();
        synchronized (this) {
            try {
                if (u(z10) < 0) {
                    z10.f6151b = c0389g;
                } else {
                    c0389g.resumeWith(p110k9.y.f19095a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objR = c0389g.r();
        return objR == p161p9.a.f21156r ? objR : p110k9.y.f19095a;
    }

    public final void m() {
        if (this.f6146w != 0 || this.f6144C > 1) {
            Object[] objArr = this.f6148y;
            p251z9.j.b(objArr);
            while (this.f6144C > 0) {
                long jR = r();
                int i10 = this.f6143B;
                int i11 = this.f6144C;
                if (objArr[((int) ((jR + ((long) (i10 + i11))) - 1)) & (objArr.length - 1)] != AbstractC0419l.f6214b) {
                    return;
                }
                this.f6144C = i11 - 1;
                AbstractC0419l.f(objArr, r() + ((long) (this.f6143B + this.f6144C)), null);
            }
        }
    }

    public final void o() {
        O9.d[] dVarArr;
        Object[] objArr = this.f6148y;
        p251z9.j.b(objArr);
        AbstractC0419l.f(objArr, r(), null);
        this.f6143B--;
        long jR = r() + 1;
        if (this.f6149z < jR) {
            this.f6149z = jR;
        }
        if (this.f6142A < jR) {
            if (this.f6514s != 0 && (dVarArr = this.f6513r) != null) {
                for (O9.d dVar : dVarArr) {
                    if (dVar != null) {
                        Z z10 = (Z) dVar;
                        long j = z10.f6150a;
                        if (j >= 0 && j < jR) {
                            z10.f6150a = jR;
                        }
                    }
                }
            }
            this.f6142A = jR;
        }
    }

    public final void p(Object obj) {
        int i10 = this.f6143B + this.f6144C;
        Object[] objArrS = this.f6148y;
        if (objArrS == null) {
            objArrS = s(null, 0, 2);
        } else if (i10 >= objArrS.length) {
            objArrS = s(objArrS, i10, objArrS.length * 2);
        }
        AbstractC0419l.f(objArrS, r() + ((long) i10), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [o9.c[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final p150o9.c[] q(p150o9.c[] cVarArr) {
        O9.d[] dVarArr;
        Z z10;
        C0389g c0389g;
        int length = cVarArr.length;
        if (this.f6514s != 0 && (dVarArr = this.f6513r) != null) {
            int length2 = dVarArr.length;
            int i10 = 0;
            while (i10 < length2) {
                O9.d dVar = dVarArr[i10];
                if (dVar == null || (c0389g = (z10 = (Z) dVar).f6151b) == null || u(z10) < 0) {
                    cVarArr = cVarArr;
                } else {
                    if (length >= cVarArr.length) {
                        cVarArr = cVarArr;
                        cVarArr = cVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) cVarArr, Math.max(2, cVarArr.length * 2));
                        p251z9.j.d(objArrCopyOf, "copyOf(...)");
                        cVarArr = objArrCopyOf;
                    }
                    cVarArr = cVarArr;
                    cVarArr = cVarArr;
                    ((p150o9.c[]) cVarArr)[length] = c0389g;
                    z10.f6151b = null;
                    length++;
                }
                i10++;
                cVarArr = cVarArr;
            }
            cVarArr = cVarArr;
        }
        return (p150o9.c[]) cVarArr;
    }

    public final long r() {
        return Math.min(this.f6142A, this.f6149z);
    }

    public final Object[] s(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f6148y = objArr2;
        if (objArr != null) {
            long jR = r();
            for (int i12 = 0; i12 < i10; i12++) {
                long j = ((long) i12) + jR;
                AbstractC0419l.f(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    public final boolean t(Object obj) {
        int i10;
        long jR;
        long j;
        int i11 = this.f6514s;
        int i12 = this.f6145v;
        if (i11 != 0) {
            int i13 = this.f6143B;
            int i14 = this.f6146w;
            if (i13 < i14 || this.f6142A > this.f6149z) {
                p(obj);
                i10 = this.f6143B + 1;
                this.f6143B = i10;
                if (i10 > i14) {
                    o();
                }
                jR = r() + ((long) this.f6143B);
                j = this.f6149z;
                if (((int) (jR - j)) > i12) {
                    w(1 + j, this.f6142A, r() + ((long) this.f6143B), r() + ((long) this.f6143B) + ((long) this.f6144C));
                }
            } else {
                int iOrdinal = this.f6147x.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal == 1) {
                    p(obj);
                    i10 = this.f6143B + 1;
                    this.f6143B = i10;
                    if (i10 > i14) {
                        o();
                    }
                    jR = r() + ((long) this.f6143B);
                    j = this.f6149z;
                    if (((int) (jR - j)) > i12) {
                        w(1 + j, this.f6142A, r() + ((long) this.f6143B), r() + ((long) this.f6143B) + ((long) this.f6144C));
                    }
                } else if (iOrdinal != 2) {
                    throw new A6.a();
                }
            }
        } else if (i12 != 0) {
            p(obj);
            int i15 = this.f6143B + 1;
            this.f6143B = i15;
            if (i15 > i12) {
                o();
            }
            this.f6142A = r() + ((long) this.f6143B);
            return true;
        }
        return true;
    }

    public final long u(Z z10) {
        long j = z10.f6150a;
        if (j < r() + ((long) this.f6143B)) {
            return j;
        }
        if (this.f6146w <= 0 && j <= r() && this.f6144C != 0) {
            return j;
        }
        return -1L;
    }

    public final Object v(Z z10) {
        Object obj;
        p150o9.c[] cVarArrX = O9.c.f6517a;
        synchronized (this) {
            try {
                long jU = u(z10);
                if (jU < 0) {
                    obj = AbstractC0419l.f6214b;
                } else {
                    long j = z10.f6150a;
                    Object[] objArr = this.f6148y;
                    p251z9.j.b(objArr);
                    Object obj2 = objArr[((int) jU) & (objArr.length - 1)];
                    if (obj2 instanceof W) {
                        obj2 = ((W) obj2).f6133t;
                    }
                    z10.f6150a = jU + 1;
                    Object obj3 = obj2;
                    cVarArrX = x(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (p150o9.c cVar : cVarArrX) {
            if (cVar != null) {
                cVar.resumeWith(p110k9.y.f19095a);
            }
        }
        return obj;
    }

    public final void w(long j, long j10, long j11, long j12) {
        long jMin = Math.min(j10, j);
        for (long jR = r(); jR < jMin; jR++) {
            Object[] objArr = this.f6148y;
            p251z9.j.b(objArr);
            AbstractC0419l.f(objArr, jR, null);
        }
        this.f6149z = j;
        this.f6142A = j10;
        this.f6143B = (int) (j11 - jMin);
        this.f6144C = (int) (j12 - j11);
    }

    public final p150o9.c[] x(long j) {
        long j10;
        long j11;
        p150o9.c[] cVarArr;
        p150o9.c[] cVarArr2;
        O9.d[] dVarArr;
        P9.t tVar = AbstractC0419l.f6214b;
        p150o9.c[] cVarArr3 = O9.c.f6517a;
        if (j <= this.f6142A) {
            long jR = r();
            long j12 = ((long) this.f6143B) + jR;
            int i10 = this.f6146w;
            if (i10 == 0 && this.f6144C > 0) {
                j12++;
            }
            int i11 = 0;
            if (this.f6514s != 0 && (dVarArr = this.f6513r) != null) {
                for (O9.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j13 = ((Z) dVar).f6150a;
                        if (j13 >= 0 && j13 < j12) {
                            j12 = j13;
                        }
                    }
                }
            }
            if (j12 > this.f6142A) {
                long jR2 = r() + ((long) this.f6143B);
                int iMin = this.f6514s > 0 ? Math.min(this.f6144C, i10 - ((int) (jR2 - j12))) : this.f6144C;
                long j14 = ((long) this.f6144C) + jR2;
                if (iMin > 0) {
                    j11 = 1;
                    Object[] objArr = this.f6148y;
                    p251z9.j.b(objArr);
                    p150o9.c[] cVarArr4 = new p150o9.c[iMin];
                    long j15 = jR2;
                    while (true) {
                        if (jR2 >= j14) {
                            cVarArr2 = cVarArr4;
                            j10 = j12;
                            break;
                        }
                        cVarArr2 = cVarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jR2)];
                        if (obj != tVar) {
                            p251z9.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            W w9 = (W) obj;
                            int i12 = i11 + 1;
                            j10 = j12;
                            cVarArr2[i11] = w9.f6134u;
                            AbstractC0419l.f(objArr, jR2, tVar);
                            AbstractC0419l.f(objArr, j15, w9.f6133t);
                            j15++;
                            if (i12 >= iMin) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            j10 = j12;
                        }
                        jR2++;
                        cVarArr4 = cVarArr2;
                        j12 = j10;
                    }
                    jR2 = j15;
                    cVarArr = cVarArr2;
                } else {
                    j10 = j12;
                    j11 = 1;
                    cVarArr = cVarArr3;
                }
                int i13 = (int) (jR2 - jR);
                long j16 = this.f6514s == 0 ? jR2 : j10;
                long jMax = Math.max(this.f6149z, jR2 - ((long) Math.min(this.f6145v, i13)));
                if (i10 == 0 && jMax < j14) {
                    Object[] objArr2 = this.f6148y;
                    p251z9.j.b(objArr2);
                    if (p251z9.j.a(objArr2[((int) jMax) & (objArr2.length - 1)], tVar)) {
                        jR2 += j11;
                        jMax += j11;
                    }
                }
                w(jMax, j16, jR2, j14);
                m();
                return cVarArr.length == 0 ? cVarArr : q(cVarArr);
            }
        }
        return cVarArr3;
    }
}
