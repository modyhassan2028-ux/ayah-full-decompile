package C0;

import A.C0041r0;
import J0.AbstractC0283f;
import K9.InterfaceC0402u;
import p063g1.q;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f669c = new C0041r0(2, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0402u f670d;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, long r13, q9.c r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof C0.b
            if (r0 == 0) goto L14
            r0 = r15
            C0.b r0 = (C0.b) r0
            int r1 = r0.f663t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f663t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            C0.b r0 = new C0.b
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f661r
            int r0 = r6.f663t
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 == r2) goto L32
            if (r0 != r1) goto L2a
            p110k9.a.e(r15)
            goto L83
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            p110k9.a.e(r15)
            goto L5f
        L36:
            p110k9.a.e(r15)
            C0.g r15 = r10.f667a
            r0 = 0
            if (r15 == 0) goto L49
            boolean r3 = r15.f19338E
            if (r3 == 0) goto L49
            J0.C0 r15 = J0.AbstractC0283f.j(r15)
            C0.g r15 = (C0.g) r15
            goto L4a
        L49:
            r15 = r0
        L4a:
            r3 = 0
            p9.a r7 = p161p9.a.f21156r
            if (r15 != 0) goto L64
            C0.g r1 = r10.f668b
            if (r1 == 0) goto L89
            r6.f663t = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.T(r2, r4, r6)
            if (r15 != r7) goto L5f
            goto L82
        L5f:
            g1.q r15 = (p063g1.q) r15
            long r3 = r15.f16269a
            goto L89
        L64:
            r8 = r3
            r2 = r11
            r11 = r8
            r4 = r13
            C0.g r13 = r10.f667a
            if (r13 == 0) goto L77
            boolean r14 = r13.f19338E
            if (r14 == 0) goto L77
            J0.C0 r13 = J0.AbstractC0283f.j(r13)
            r0 = r13
            C0.g r0 = (C0.g) r0
        L77:
            if (r0 == 0) goto L88
            r6.f663t = r1
            r1 = r0
            java.lang.Object r15 = r1.T(r2, r4, r6)
            if (r15 != r7) goto L83
        L82:
            return r7
        L83:
            g1.q r15 = (p063g1.q) r15
            long r3 = r15.f16269a
            goto L89
        L88:
            r3 = r11
        L89:
            g1.q r11 = new g1.q
            r11.<init>(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.d.a(long, long, q9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, q9.c cVar) {
        c cVar2;
        long j10;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f666t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f666t = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objH = cVar2.f664r;
        int i11 = cVar2.f666t;
        if (i11 == 0) {
            p110k9.a.e(objH);
            g gVar = this.f667a;
            g gVar2 = null;
            if (gVar != null && gVar.f19338E) {
                gVar2 = (g) AbstractC0283f.j(gVar);
            }
            if (gVar2 != null) {
                cVar2.f666t = 1;
                objH = gVar2.h(j, cVar2);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objH == aVar) {
                    return aVar;
                }
            } else {
                j10 = 0;
            }
            return new q(j10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p110k9.a.e(objH);
        j10 = ((q) objH).f16269a;
        return new q(j10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y9.a, z9.k] */
    public final InterfaceC0402u c() {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) this.f669c.invoke();
        if (interfaceC0402u != null) {
            return interfaceC0402u;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
