package C0;

import A.C0041r0;
import J0.AbstractC0283f;
import J0.C0;
import K9.InterfaceC0402u;
import l0.q;
import p251z9.v;

/* JADX INFO: loaded from: classes.dex */
public final class g extends q implements C0, a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public a f682F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public d f683G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public g f684H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final String f685I;

    public g(a aVar, d dVar) {
        this.f682F = aVar;
        this.f683G = dVar == null ? new d() : dVar;
        this.f685I = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // C0.a
    public final long B(int i10, long j, long j10) {
        long jB = this.f682F.B(i10, j, j10);
        boolean z10 = this.f19338E;
        g gVar = null;
        if (z10 && z10) {
            gVar = (g) AbstractC0283f.j(this);
        }
        g gVar2 = gVar;
        return p171r0.c.h(jB, gVar2 != null ? gVar2.B(i10, p171r0.c.h(j, jB), p171r0.c.g(j10, jB)) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // C0.a
    public final Object T(long j, long j10, p150o9.c cVar) {
        e eVar;
        g gVar;
        long j11;
        long j12;
        long j13;
        g gVar2;
        long j14;
        long j15;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.f676w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f676w = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, (q9.c) cVar);
            }
        } else {
            eVar = new e(this, (q9.c) cVar);
        }
        e eVar2 = eVar;
        Object objT = eVar2.f674u;
        int i11 = eVar2.f676w;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i11 != 0) {
            if (i11 == 1) {
                j12 = eVar2.f673t;
                j11 = eVar2.f672s;
                gVar = eVar2.f671r;
                p110k9.a.e(objT);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j15 = eVar2.f672s;
                p110k9.a.e(objT);
            }
            j14 = ((p063g1.q) objT).f16269a;
            j13 = j15;
            return new p063g1.q(p063g1.q.e(j13, j14));
        }
        p110k9.a.e(objT);
        a aVar2 = this.f682F;
        eVar2.f671r = this;
        eVar2.f672s = j;
        eVar2.f673t = j10;
        eVar2.f676w = 1;
        objT = aVar2.T(j, j10, eVar2);
        if (objT != aVar) {
            gVar = this;
            j11 = j;
            j12 = j10;
        }
        return aVar;
        j13 = ((p063g1.q) objT).f16269a;
        boolean z10 = gVar.f19338E;
        if (z10) {
            gVar2 = (z10 && z10) ? (g) AbstractC0283f.j(gVar) : null;
        } else {
            gVar2 = gVar.f684H;
        }
        if (gVar2 != null) {
            long jE = p063g1.q.e(j11, j13);
            long jD = p063g1.q.d(j12, j13);
            eVar2.f671r = null;
            eVar2.f672s = j13;
            eVar2.f676w = 2;
            objT = gVar2.T(jE, jD, eVar2);
            if (objT != aVar) {
                j15 = j13;
                j14 = ((p063g1.q) objT).f16269a;
                j13 = j15;
            }
            return aVar;
        }
        j14 = 0;
        return new p063g1.q(p063g1.q.e(j13, j14));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r13 == r5) goto L31;
     */
    @Override // C0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r11, p150o9.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof C0.f
            if (r0 == 0) goto L13
            r0 = r13
            C0.f r0 = (C0.f) r0
            int r1 = r0.f681v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f681v = r1
            goto L1a
        L13:
            C0.f r0 = new C0.f
            q9.c r13 = (q9.c) r13
            r0.<init>(r10, r13)
        L1a:
            java.lang.Object r13 = r0.f679t
            int r1 = r0.f681v
            r2 = 0
            r3 = 2
            r4 = 1
            p9.a r5 = p161p9.a.f21156r
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L37
            if (r1 != r3) goto L2f
            long r11 = r0.f678s
            p110k9.a.e(r13)
            goto L7f
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            long r11 = r0.f678s
            C0.g r1 = r0.f677r
            p110k9.a.e(r13)
            goto L60
        L3f:
            p110k9.a.e(r13)
            boolean r13 = r10.f19338E
            if (r13 == 0) goto L4f
            if (r13 == 0) goto L4f
            J0.C0 r13 = J0.AbstractC0283f.j(r10)
            C0.g r13 = (C0.g) r13
            goto L50
        L4f:
            r13 = r2
        L50:
            if (r13 == 0) goto L68
            r0.f677r = r10
            r0.f678s = r11
            r0.f681v = r4
            java.lang.Object r13 = r13.h(r11, r0)
            if (r13 != r5) goto L5f
            goto L7e
        L5f:
            r1 = r10
        L60:
            g1.q r13 = (p063g1.q) r13
            long r6 = r13.f16269a
        L64:
            r8 = r6
            r6 = r11
            r11 = r8
            goto L6c
        L68:
            r6 = 0
            r1 = r10
            goto L64
        L6c:
            C0.a r13 = r1.f682F
            long r6 = p063g1.q.d(r6, r11)
            r0.f677r = r2
            r0.f678s = r11
            r0.f681v = r3
            java.lang.Object r13 = r13.h(r6, r0)
            if (r13 != r5) goto L7f
        L7e:
            return r5
        L7f:
            g1.q r13 = (p063g1.q) r13
            long r0 = r13.f16269a
            long r11 = p063g1.q.e(r11, r0)
            g1.q r13 = new g1.q
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.g.h(long, o9.c):java.lang.Object");
    }

    @Override // l0.q
    public final void l0() {
        d dVar = this.f683G;
        dVar.f667a = this;
        dVar.f668b = null;
        this.f684H = null;
        dVar.f669c = new C0041r0(3, this);
        dVar.f670d = h0();
    }

    @Override // C0.a
    public final long m(long j, int i10) {
        boolean z10 = this.f19338E;
        g gVar = null;
        if (z10 && z10) {
            gVar = (g) AbstractC0283f.j(this);
        }
        long jM = gVar != null ? gVar.m(j, i10) : 0L;
        return p171r0.c.h(jM, this.f682F.m(p171r0.c.g(j, jM), i10));
    }

    @Override // l0.q
    public final void n0() {
        v vVar = new v();
        AbstractC0283f.A(this, new h(vVar, 0));
        g gVar = (g) ((C0) vVar.f24886r);
        this.f684H = gVar;
        d dVar = this.f683G;
        dVar.f668b = gVar;
        if (dVar.f667a == this) {
            dVar.f667a = null;
        }
    }

    @Override // J0.C0
    public final Object p() {
        return this.f685I;
    }

    public final InterfaceC0402u v0() {
        g gVar = this.f19338E ? (g) AbstractC0283f.j(this) : null;
        if (gVar != null) {
            return gVar.v0();
        }
        InterfaceC0402u interfaceC0402u = this.f683G.f670d;
        if (interfaceC0402u != null) {
            return interfaceC0402u;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
