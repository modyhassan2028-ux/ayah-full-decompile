package J0;

import A.C0041r0;
import D0.C0086d;
import K0.c1;
import Z.C0681f0;
import Z.C0705v;
import Z.InterfaceC0686i;
import Z.InterfaceC0706w;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I implements InterfaceC0686i, s0, InterfaceC0288k {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final D f3894h0 = new D("Undefined intrinsics block and it is required");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final C f3895i0 = new C();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final F1.b f3896j0 = new F1.b(2);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final M.k f3897A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p011b0.e f3898B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f3899C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public I f3900D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public r0 f3901E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ViewFactoryHolder f3902F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f3903G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f3904H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f3905I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public R0.j f3906J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f3907K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p011b0.e f3908L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f3909M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public H0.I f3910N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public M.k f3911O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public p063g1.c f3912P;
    public p063g1.m Q;
    public c1 R;
    public InterfaceC0706w S;
    public G T;
    public G U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f3913V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final C0280d0 f3914W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final M f3915X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public H0.E f3916Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public j0 f3917Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f3918a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public l0.r f3919b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public l0.r f3920c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public p094j1.c f3921d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public D0.D f3922e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f3923f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f3924g0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f3925r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3926s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f3927t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f3928u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f3929v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3931x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public I f3932y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3933z;

    public I(int i10) {
        this(R0.m.f7112a.addAndGet(1), (i10 & 1) == 0);
    }

    public static boolean P(I i10) {
        Z z10 = i10.f3915X.f3958p;
        return i10.O(z10.f4021A ? new p063g1.a(z10.f3171u) : null);
    }

    public static void U(I i10, boolean z10, int i11) {
        I iU;
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i11 & 2) != 0;
        boolean z12 = (i11 & 4) != 0;
        if (i10.f3932y == null) {
            G0.a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        r0 r0Var = i10.f3901E;
        if (r0Var == null || i10.f3904H || i10.f3925r) {
            return;
        }
        ((AndroidComposeView) r0Var).F(i10, true, z10, z11);
        if (z12) {
            V v10 = i10.f3915X.f3959q;
            p251z9.j.b(v10);
            M m10 = v10.f4004w;
            I iU2 = m10.f3945a.u();
            G g = m10.f3945a.T;
            if (iU2 == null || g == G.f3891t) {
                return;
            }
            while (iU2.T == g && (iU = iU2.u()) != null) {
                iU2 = iU;
            }
            int iOrdinal = g.ordinal();
            if (iOrdinal == 0) {
                if (iU2.f3932y != null) {
                    U(iU2, z10, 6);
                    return;
                } else {
                    W(iU2, z10, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (iU2.f3932y != null) {
                iU2.T(z10);
            } else {
                iU2.V(z10);
            }
        }
    }

    public static void W(I i10, boolean z10, int i11) {
        r0 r0Var;
        I iU;
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i11 & 2) != 0;
        boolean z12 = (i11 & 4) != 0;
        if (i10.f3904H || i10.f3925r || (r0Var = i10.f3901E) == null) {
            return;
        }
        ((AndroidComposeView) r0Var).F(i10, false, z10, z11);
        if (z12) {
            M m10 = i10.f3915X.f3958p.f4046w;
            I iU2 = m10.f3945a.u();
            G g = m10.f3945a.T;
            if (iU2 == null || g == G.f3891t) {
                return;
            }
            while (iU2.T == g && (iU = iU2.u()) != null) {
                iU2 = iU;
            }
            int iOrdinal = g.ordinal();
            if (iOrdinal == 0) {
                W(iU2, z10, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                iU2.V(z10);
            }
        }
    }

    public static void X(I i10) {
        M m10 = i10.f3915X;
        if (H.f3893a[m10.f3948d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + m10.f3948d);
        }
        if (m10.f3949e) {
            U(i10, true, 6);
            return;
        }
        if (m10.f3950f) {
            i10.T(true);
        }
        if (i10.r()) {
            W(i10, true, 6);
        } else if (i10.q()) {
            i10.V(true);
        }
    }

    private final String k(I i10) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(i10);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(h(0));
        sb.append(" Other tree: ");
        I i11 = i10.f3900D;
        sb.append(i11 != null ? i11.h(0) : null);
        return sb.toString();
    }

    public final void A(long j, C0296t c0296t, int i10, boolean z10) {
        C0280d0 c0280d0 = this.f3914W;
        j0 j0Var = (j0) c0280d0.f4065d;
        p180s0.G g = j0.f4120Y;
        ((j0) c0280d0.f4065d).J0(j0.f4123b0, j0Var.A0(j), c0296t, i10, z10);
    }

    public final void B(int i10, I i11) {
        if (i11.f3900D != null && i11.f3901E != null) {
            G0.a.b(k(i11));
        }
        i11.f3900D = this;
        M.k kVar = this.f3897A;
        ((p011b0.e) kVar.f5618s).a(i10, i11);
        ((C0041r0) kVar.f5619t).invoke();
        N();
        if (i11.f3925r) {
            this.f3933z++;
        }
        G();
        r0 r0Var = this.f3901E;
        if (r0Var != null) {
            i11.b(r0Var);
        }
        if (i11.f3915X.f3954l > 0) {
            M m10 = this.f3915X;
            m10.b(m10.f3954l + 1);
        }
    }

    public final void C() {
        if (this.f3918a0) {
            C0280d0 c0280d0 = this.f3914W;
            j0 j0Var = (C0298v) c0280d0.f4064c;
            j0 j0Var2 = ((j0) c0280d0.f4065d).f4127E;
            this.f3917Z = null;
            while (!p251z9.j.a(j0Var, j0Var2)) {
                if ((j0Var != null ? j0Var.f4140W : null) != null) {
                    this.f3917Z = j0Var;
                    break;
                }
                j0Var = j0Var != null ? j0Var.f4127E : null;
            }
        }
        j0 j0Var3 = this.f3917Z;
        if (j0Var3 != null && j0Var3.f4140W == null) {
            throw android.support.v4.media.session.p.s("layer was not set");
        }
        if (j0Var3 != null) {
            j0Var3.L0();
            return;
        }
        I iU = u();
        if (iU != null) {
            iU.C();
        }
    }

    public final void D() {
        C0280d0 c0280d0 = this.f3914W;
        C0298v c0298v = (C0298v) c0280d0.f4064c;
        for (j0 j0Var = (j0) c0280d0.f4065d; j0Var != c0298v; j0Var = j0Var.f4126D) {
            p251z9.j.c(j0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            q0 q0Var = ((B) j0Var).f4140W;
            if (q0Var != null) {
                q0Var.invalidate();
            }
        }
        q0 q0Var2 = ((C0298v) c0280d0.f4064c).f4140W;
        if (q0Var2 != null) {
            q0Var2.invalidate();
        }
    }

    public final void E() {
        this.f3930w = true;
        if (this.f3932y != null) {
            U(this, false, 7);
        } else {
            W(this, false, 7);
        }
    }

    public final void F() {
        if (this.f3907K) {
            return;
        }
        this.f3914W.getClass();
        if (f0.f4084a.f19344w != null || this.f3920c0 != null) {
            this.f3905I = true;
            return;
        }
        R0.j jVar = this.f3906J;
        this.f3907K = true;
        p251z9.v vVar = new p251z9.v();
        vVar.f24886r = new R0.j();
        t0 snapshotObserver = L.a(this).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f4173d, new C0086d(5, this, vVar));
        this.f3907K = false;
        this.f3906J = (R0.j) vVar.f24886r;
        this.f3905I = false;
        r0 r0VarA = L.a(this);
        r0VarA.getSemanticsOwner().b(this, jVar);
        ((AndroidComposeView) r0VarA).H();
    }

    public final void G() {
        I i10;
        if (this.f3933z > 0) {
            this.f3899C = true;
        }
        if (!this.f3925r || (i10 = this.f3900D) == null) {
            return;
        }
        i10.G();
    }

    public final boolean H() {
        return this.f3901E != null;
    }

    public final boolean I() {
        return this.f3915X.f3958p.f4031K;
    }

    public final Boolean J() {
        V v10 = this.f3915X.f3959q;
        if (v10 != null) {
            return Boolean.valueOf(v10.s());
        }
        return null;
    }

    public final void K() {
        I iU;
        if (this.T == G.f3891t) {
            g();
        }
        V v10 = this.f3915X.f3959q;
        p251z9.j.b(v10);
        try {
            v10.f4005x = true;
            if (!v10.f3990C) {
                G0.a.b("replace() called on item that was not placed");
            }
            v10.f4003P = false;
            boolean zS = v10.s();
            v10.m0(v10.f3993F, v10.f3994G, v10.f3995H);
            if (zS && !v10.f4003P && (iU = v10.f4004w.f3945a.u()) != null) {
                iU.T(false);
            }
        } finally {
            v10.f4005x = false;
        }
    }

    public final void L(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 > i11 ? i10 + i13 : i10;
            int i15 = i10 > i11 ? i11 + i13 : (i11 + i12) - 2;
            M.k kVar = this.f3897A;
            p011b0.e eVar = (p011b0.e) kVar.f5618s;
            C0041r0 c0041r0 = (C0041r0) kVar.f5619t;
            Object objL = eVar.l(i14);
            c0041r0.invoke();
            ((p011b0.e) kVar.f5618s).a(i15, (I) objL);
            c0041r0.invoke();
        }
        N();
        G();
        E();
    }

    public final void M(I i10) {
        if (i10.f3915X.f3954l > 0) {
            M m10 = this.f3915X;
            m10.b(m10.f3954l - 1);
        }
        if (this.f3901E != null) {
            i10.i();
        }
        i10.f3900D = null;
        ((j0) i10.f3914W.f4065d).f4127E = null;
        if (i10.f3925r) {
            this.f3933z--;
            p011b0.e eVar = (p011b0.e) i10.f3897A.f5618s;
            Object[] objArr = eVar.f13125r;
            int i11 = eVar.f13127t;
            for (int i12 = 0; i12 < i11; i12++) {
                ((j0) ((I) objArr[i12]).f3914W.f4065d).f4127E = null;
            }
        }
        G();
        N();
    }

    public final void N() {
        if (!this.f3925r) {
            this.f3909M = true;
            return;
        }
        I iU = u();
        if (iU != null) {
            iU.N();
        }
    }

    public final boolean O(p063g1.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.T == G.f3891t) {
            f();
        }
        return this.f3915X.f3958p.p0(aVar.f16246a);
    }

    public final void Q() {
        M.k kVar = this.f3897A;
        p011b0.e eVar = (p011b0.e) kVar.f5618s;
        p011b0.e eVar2 = (p011b0.e) kVar.f5618s;
        int i10 = eVar.f13127t;
        while (true) {
            i10--;
            if (-1 >= i10) {
                eVar2.g();
                ((C0041r0) kVar.f5619t).invoke();
                return;
            }
            M((I) eVar2.f13125r[i10]);
        }
    }

    public final void R(int i10, int i11) {
        if (i11 < 0) {
            G0.a.a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            M.k kVar = this.f3897A;
            M((I) ((p011b0.e) kVar.f5618s).f13125r[i12]);
            Object objL = ((p011b0.e) kVar.f5618s).l(i12);
            ((C0041r0) kVar.f5619t).invoke();
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    public final void S() {
        I iU;
        if (this.T == G.f3891t) {
            g();
        }
        Z z10 = this.f3915X.f3958p;
        z10.getClass();
        try {
            z10.f4047x = true;
            if (!z10.f4022B) {
                G0.a.b("replace called on unplaced item");
            }
            boolean z11 = z10.f4031K;
            z10.n0(z10.f4025E, z10.f4028H, z10.f4026F, z10.f4027G);
            if (z11 && !z10.f4039X && (iU = z10.f4046w.f3945a.u()) != null) {
                iU.V(false);
            }
        } finally {
            z10.f4047x = false;
        }
    }

    public final void T(boolean z10) {
        r0 r0Var;
        if (this.f3925r || (r0Var = this.f3901E) == null) {
            return;
        }
        ((AndroidComposeView) r0Var).G(this, true, z10);
    }

    public final void V(boolean z10) {
        r0 r0Var;
        this.f3930w = true;
        if (this.f3925r || (r0Var = this.f3901E) == null) {
            return;
        }
        ((AndroidComposeView) r0Var).G(this, false, z10);
    }

    public final void Y() {
        p011b0.e eVarZ = z();
        Object[] objArr = eVarZ.f13125r;
        int i10 = eVarZ.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            I i12 = (I) objArr[i11];
            G g = i12.U;
            i12.T = g;
            if (g != G.f3891t) {
                i12.Y();
            }
        }
    }

    public final void Z(p063g1.c cVar) {
        if (p251z9.j.a(this.f3912P, cVar)) {
            return;
        }
        this.f3912P = cVar;
        E();
        I iU = u();
        if (iU != null) {
            iU.C();
        }
        D();
        for (l0.q qVar = (l0.q) this.f3914W.f4067f; qVar != null; qVar = qVar.f19344w) {
            qVar.m0();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 4331. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void a(l0.r r17) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.I.a(l0.r):void");
    }

    public final void a0(I i10) {
        if (p251z9.j.a(i10, this.f3932y)) {
            return;
        }
        this.f3932y = i10;
        M m10 = this.f3915X;
        if (i10 != null) {
            if (m10.f3959q == null) {
                m10.f3959q = new V(m10);
            }
            C0280d0 c0280d0 = this.f3914W;
            j0 j0Var = ((C0298v) c0280d0.f4064c).f4126D;
            for (j0 j0Var2 = (j0) c0280d0.f4065d; !p251z9.j.a(j0Var2, j0Var) && j0Var2 != null; j0Var2 = j0Var2.f4126D) {
                j0Var2.y0();
            }
        } else {
            m10.f3959q = null;
        }
        E();
    }

    public final void b(r0 r0Var) {
        I i10;
        p122m0.d dVar;
        R0.j jVarW;
        if (this.f3901E != null) {
            G0.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
        }
        I i11 = this.f3900D;
        if (i11 != null && !p251z9.j.a(i11.f3901E, r0Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(r0Var);
            sb.append(") than the parent's owner(");
            I iU = u();
            sb.append(iU != null ? iU.f3901E : null);
            sb.append("). This tree: ");
            sb.append(h(0));
            sb.append(" Parent tree: ");
            I i12 = this.f3900D;
            sb.append(i12 != null ? i12.h(0) : null);
            G0.a.b(sb.toString());
        }
        I iU2 = u();
        M m10 = this.f3915X;
        if (iU2 == null) {
            m10.f3958p.f4031K = true;
            V v10 = m10.f3959q;
            if (v10 != null) {
                v10.f3996I = S.f3978r;
            }
        }
        C0280d0 c0280d0 = this.f3914W;
        ((j0) c0280d0.f4065d).f4127E = iU2 != null ? (C0298v) iU2.f3914W.f4064c : null;
        this.f3901E = r0Var;
        this.f3903G = (iU2 != null ? iU2.f3903G : -1) + 1;
        l0.r rVar = this.f3920c0;
        if (rVar != null) {
            a(rVar);
        }
        this.f3920c0 = null;
        AndroidComposeView androidComposeView = (AndroidComposeView) r0Var;
        androidComposeView.getLayoutNodes().h(this.f3926s, this);
        I i13 = this.f3900D;
        if (i13 == null || (i10 = i13.f3932y) == null) {
            i10 = this.f3932y;
        }
        a0(i10);
        if (this.f3932y == null && c0280d0.g(512)) {
            a0(this);
        }
        if (!this.f3924g0) {
            for (l0.q qVar = (l0.q) c0280d0.f4067f; qVar != null; qVar = qVar.f19344w) {
                qVar.j0();
            }
        }
        p011b0.e eVar = (p011b0.e) this.f3897A.f5618s;
        Object[] objArr = eVar.f13125r;
        int i14 = eVar.f13127t;
        for (int i15 = 0; i15 < i14; i15++) {
            ((I) objArr[i15]).b(r0Var);
        }
        if (!this.f3924g0) {
            c0280d0.k();
        }
        E();
        if (iU2 != null) {
            iU2.E();
        }
        j0 j0Var = ((C0298v) c0280d0.f4064c).f4126D;
        for (j0 j0Var2 = (j0) c0280d0.f4065d; !p251z9.j.a(j0Var2, j0Var) && j0Var2 != null; j0Var2 = j0Var2.f4126D) {
            j0Var2.a1(j0Var2.f4130H, true);
            q0 q0Var = j0Var2.f4140W;
            if (q0Var != null) {
                q0Var.invalidate();
            }
        }
        p094j1.c cVar = this.f3921d0;
        if (cVar != null) {
            cVar.e(r0Var);
        }
        m10.h();
        if (!this.f3924g0 && c0280d0.g(8)) {
            F();
        }
        androidComposeView.getClass();
        if (!AndroidComposeView.h() || (dVar = androidComposeView.T) == null || (jVarW = w()) == null || !jVarW.f7108r.b(R0.s.f7169p)) {
            return;
        }
        dVar.f19468h.a(this.f3926s);
        dVar.f19462a.g(dVar.f19464c, this.f3926s, true);
    }

    public final void b0(H0.I i10) {
        if (p251z9.j.a(this.f3910N, i10)) {
            return;
        }
        this.f3910N = i10;
        M.k kVar = this.f3911O;
        if (kVar != null) {
            ((C0681f0) kVar.f5619t).setValue(i10);
        }
        E();
    }

    @Override // Z.InterfaceC0686i
    public final void c() {
        p122m0.d dVar;
        if (!H()) {
            G0.a.a("onReuse is only expected on attached node");
        }
        ViewFactoryHolder viewFactoryHolder = this.f3902F;
        if (viewFactoryHolder != null) {
            viewFactoryHolder.c();
        }
        H0.E e10 = this.f3916Y;
        if (e10 != null) {
            e10.f(false);
        }
        this.f3907K = false;
        boolean z10 = this.f3924g0;
        C0280d0 c0280d0 = this.f3914W;
        if (z10) {
            this.f3924g0 = false;
        } else {
            for (l0.q qVar = (z0) c0280d0.f4066e; qVar != null; qVar = qVar.f19343v) {
                if (qVar.f19338E) {
                    qVar.q0();
                }
            }
            c0280d0.l();
            for (l0.q qVar2 = (z0) c0280d0.f4066e; qVar2 != null; qVar2 = qVar2.f19343v) {
                if (qVar2.f19338E) {
                    qVar2.k0();
                }
            }
        }
        int i10 = this.f3926s;
        this.f3926s = R0.m.f7112a.addAndGet(1);
        r0 r0Var = this.f3901E;
        if (r0Var != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) r0Var;
            androidComposeView.getLayoutNodes().g(i10);
            androidComposeView.getLayoutNodes().h(this.f3926s, this);
        }
        for (l0.q qVar3 = (l0.q) c0280d0.f4067f; qVar3 != null; qVar3 = qVar3.f19344w) {
            qVar3.j0();
        }
        c0280d0.k();
        if (c0280d0.g(8)) {
            F();
        }
        X(this);
        r0 r0Var2 = this.f3901E;
        if (r0Var2 != null) {
            AndroidComposeView androidComposeView2 = (AndroidComposeView) r0Var2;
            if (AndroidComposeView.h() && (dVar = androidComposeView2.T) != null) {
                AndroidComposeView androidComposeView3 = dVar.f19464c;
                N0.a aVar = dVar.f19462a;
                u.u uVar = dVar.f19468h;
                if (uVar.e(i10)) {
                    aVar.g(androidComposeView3, i10, false);
                }
                R0.j jVarW = w();
                if (jVarW != null && jVarW.f7108r.b(R0.s.f7169p)) {
                    uVar.a(this.f3926s);
                    aVar.g(androidComposeView3, this.f3926s, true);
                }
            }
            androidComposeView2.getRectManager().f(this, this.f3915X.f3958p.f4025E, true);
        }
    }

    public final void c0(l0.r rVar) {
        if (this.f3925r && this.f3919b0 != l0.o.f19333a) {
            G0.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f3924g0) {
            G0.a.a("modifier is updated when deactivated");
        }
        if (!H()) {
            this.f3920c0 = rVar;
            return;
        }
        a(rVar);
        if (this.f3905I) {
            F();
        }
    }

    @Override // Z.InterfaceC0686i
    public final void d() {
        ViewFactoryHolder viewFactoryHolder = this.f3902F;
        if (viewFactoryHolder != null) {
            viewFactoryHolder.d();
        }
        H0.E e10 = this.f3916Y;
        if (e10 != null) {
            e10.d();
        }
        C0280d0 c0280d0 = this.f3914W;
        j0 j0Var = ((C0298v) c0280d0.f4064c).f4126D;
        for (j0 j0Var2 = (j0) c0280d0.f4065d; !p251z9.j.a(j0Var2, j0Var) && j0Var2 != null; j0Var2 = j0Var2.f4126D) {
            j0Var2.f4128F = true;
            j0Var2.U.invoke();
            if (j0Var2.f4140W != null) {
                if (j0Var2.f4141X != null) {
                    j0Var2.f4141X = null;
                }
                j0Var2.a1(null, false);
                j0Var2.f4125C.V(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void d0(c1 c1Var) {
        if (p251z9.j.a(this.R, c1Var)) {
            return;
        }
        this.R = c1Var;
        l0.q qVar = (l0.q) this.f3914W.f4067f;
        if ((qVar.f19342u & 16) != 0) {
            while (qVar != null) {
                if ((qVar.f19341t & 16) != 0) {
                    ?? F10 = qVar;
                    ?? eVar = 0;
                    while (F10 != 0) {
                        if (F10 instanceof w0) {
                            ((w0) F10).P();
                        } else if ((F10.f19341t & 16) != 0 && (F10 instanceof AbstractC0291n)) {
                            l0.q qVar2 = ((AbstractC0291n) F10).f4151G;
                            int i10 = 0;
                            F10 = F10;
                            eVar = eVar;
                            while (qVar2 != null) {
                                if ((qVar2.f19341t & 16) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        eVar = eVar;
                                        F10 = qVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new p011b0.e(new l0.q[16]);
                                        }
                                        if (F10 != 0) {
                                            eVar.b(F10);
                                            F10 = 0;
                                        }
                                        eVar.b(qVar2);
                                    }
                                }
                                qVar2 = qVar2.f19344w;
                                F10 = F10;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        F10 = AbstractC0283f.f(eVar);
                    }
                }
                if ((qVar.f19342u & 16) == 0) {
                    return;
                } else {
                    qVar = qVar.f19344w;
                }
            }
        }
    }

    @Override // Z.InterfaceC0686i
    public final void e() {
        p122m0.d dVar;
        ViewFactoryHolder viewFactoryHolder = this.f3902F;
        if (viewFactoryHolder != null) {
            viewFactoryHolder.e();
        }
        H0.E e10 = this.f3916Y;
        if (e10 != null) {
            e10.f(true);
        }
        this.f3924g0 = true;
        C0280d0 c0280d0 = this.f3914W;
        for (l0.q qVar = (z0) c0280d0.f4066e; qVar != null; qVar = qVar.f19343v) {
            if (qVar.f19338E) {
                qVar.q0();
            }
        }
        c0280d0.l();
        for (l0.q qVar2 = (z0) c0280d0.f4066e; qVar2 != null; qVar2 = qVar2.f19343v) {
            if (qVar2.f19338E) {
                qVar2.k0();
            }
        }
        if (H()) {
            this.f3906J = null;
            this.f3905I = false;
        }
        r0 r0Var = this.f3901E;
        if (r0Var != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) r0Var;
            androidComposeView.getRectManager().h(this);
            if (AndroidComposeView.h() && (dVar = androidComposeView.T) != null && dVar.f19468h.e(this.f3926s)) {
                dVar.f19462a.g(dVar.f19464c, this.f3926s, false);
            }
        }
    }

    public final void e0() {
        if (this.f3933z <= 0 || !this.f3899C) {
            return;
        }
        this.f3899C = false;
        p011b0.e eVar = this.f3898B;
        if (eVar == null) {
            eVar = new p011b0.e(new I[16]);
            this.f3898B = eVar;
        }
        eVar.g();
        p011b0.e eVar2 = (p011b0.e) this.f3897A.f5618s;
        Object[] objArr = eVar2.f13125r;
        int i10 = eVar2.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            I i12 = (I) objArr[i11];
            if (i12.f3925r) {
                eVar.c(eVar.f13127t, i12.z());
            } else {
                eVar.b(i12);
            }
        }
        M m10 = this.f3915X;
        m10.f3958p.R = true;
        V v10 = m10.f3959q;
        if (v10 != null) {
            v10.f3999L = true;
        }
    }

    public final void f() {
        this.U = this.T;
        this.T = G.f3891t;
        p011b0.e eVarZ = z();
        Object[] objArr = eVarZ.f13125r;
        int i10 = eVarZ.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            I i12 = (I) objArr[i11];
            if (i12.T != G.f3891t) {
                i12.f();
            }
        }
    }

    public final void g() {
        this.U = this.T;
        this.T = G.f3891t;
        p011b0.e eVarZ = z();
        Object[] objArr = eVarZ.f13125r;
        int i10 = eVarZ.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            I i12 = (I) objArr[i11];
            if (i12.T == G.f3890s) {
                i12.g();
            }
        }
    }

    public final String h(int i10) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        p011b0.e eVarZ = z();
        Object[] objArr = eVarZ.f13125r;
        int i12 = eVarZ.f13127t;
        for (int i13 = 0; i13 < i12; i13++) {
            sb.append(((I) objArr[i13]).h(i10 + 1));
        }
        String string = sb.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        p251z9.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void i() {
        p122m0.d dVar;
        J j;
        r0 r0Var = this.f3901E;
        if (r0Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            I iU = u();
            sb.append(iU != null ? iU.h(0) : null);
            G0.a.c(sb.toString());
            throw new A6.a();
        }
        I iU2 = u();
        M m10 = this.f3915X;
        if (iU2 != null) {
            iU2.C();
            iU2.E();
            Z z10 = m10.f3958p;
            G g = G.f3891t;
            z10.f4023C = g;
            V v10 = m10.f3959q;
            if (v10 != null) {
                v10.f3988A = g;
            }
        }
        J j10 = m10.f3958p.f4036P;
        j10.f3935b = true;
        j10.f3936c = false;
        j10.f3938e = false;
        j10.f3937d = false;
        j10.f3939f = false;
        j10.g = false;
        j10.f3940h = null;
        V v11 = m10.f3959q;
        if (v11 != null && (j = v11.f3997J) != null) {
            j.f3935b = true;
            j.f3936c = false;
            j.f3938e = false;
            j.f3937d = false;
            j.f3939f = false;
            j.g = false;
            j.f3940h = null;
        }
        D0.D d5 = this.f3922e0;
        if (d5 != null) {
            d5.e(r0Var);
        }
        C0280d0 c0280d0 = this.f3914W;
        c0280d0.l();
        this.f3904H = true;
        p011b0.e eVar = (p011b0.e) this.f3897A.f5618s;
        Object[] objArr = eVar.f13125r;
        int i10 = eVar.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            ((I) objArr[i11]).i();
        }
        this.f3904H = false;
        for (l0.q qVar = (z0) c0280d0.f4066e; qVar != null; qVar = qVar.f19343v) {
            if (qVar.f19338E) {
                qVar.k0();
            }
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) r0Var;
        androidComposeView.getLayoutNodes().g(this.f3926s);
        X x9 = androidComposeView.f12032g0;
        M.k kVar = x9.f4012b;
        ((p248z6.c) kVar.f5618s).K(this);
        ((p248z6.c) kVar.f5619t).K(this);
        ((p011b0.e) x9.f4015e.f5618s).k(this);
        androidComposeView.U = true;
        androidComposeView.getRectManager().h(this);
        if (AndroidComposeView.h() && (dVar = androidComposeView.T) != null && dVar.f19468h.e(this.f3926s)) {
            dVar.f19462a.g(dVar.f19464c, this.f3926s, false);
        }
        this.f3901E = null;
        a0(null);
        this.f3903G = 0;
        Z z11 = m10.f3958p;
        z11.f4049z = Integer.MAX_VALUE;
        z11.f4048y = Integer.MAX_VALUE;
        z11.f4031K = false;
        V v12 = m10.f3959q;
        if (v12 != null) {
            v12.f4007z = Integer.MAX_VALUE;
            v12.f4006y = Integer.MAX_VALUE;
            v12.f3996I = S.f3980t;
        }
        if (c0280d0.g(8)) {
            R0.j jVar = this.f3906J;
            this.f3906J = null;
            this.f3905I = false;
            r0Var.getSemanticsOwner().b(this, jVar);
            androidComposeView.H();
        }
    }

    public final void j(p180s0.o oVar, p205v0.b bVar) {
        ((j0) this.f3914W.f4065d).w0(oVar, bVar);
    }

    public final void l() {
        if (this.f3932y != null) {
            U(this, false, 5);
        } else {
            W(this, false, 5);
        }
        Z z10 = this.f3915X.f3958p;
        p063g1.a aVar = z10.f4021A ? new p063g1.a(z10.f3171u) : null;
        if (aVar != null) {
            r0 r0Var = this.f3901E;
            if (r0Var != null) {
                ((AndroidComposeView) r0Var).z(this, aVar.f16246a);
                return;
            }
            return;
        }
        r0 r0Var2 = this.f3901E;
        if (r0Var2 != null) {
            ((AndroidComposeView) r0Var2).y(true);
        }
    }

    public final List m() {
        V v10 = this.f3915X.f3959q;
        p251z9.j.b(v10);
        p011b0.e eVar = v10.f3998K;
        M m10 = v10.f4004w;
        m10.f3945a.o();
        if (!v10.f3999L) {
            return eVar.f();
        }
        I i10 = m10.f3945a;
        p011b0.e eVarZ = i10.z();
        Object[] objArr = eVarZ.f13125r;
        int i11 = eVarZ.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            I i13 = (I) objArr[i12];
            if (eVar.f13127t <= i12) {
                V v11 = i13.f3915X.f3959q;
                p251z9.j.b(v11);
                eVar.b(v11);
            } else {
                V v12 = i13.f3915X.f3959q;
                p251z9.j.b(v12);
                Object[] objArr2 = eVar.f13125r;
                Object obj = objArr2[i12];
                objArr2[i12] = v12;
            }
        }
        eVar.m(((p011b0.b) i10.o()).f13119r.f13127t, eVar.f13127t);
        v10.f3999L = false;
        return eVar.f();
    }

    public final List n() {
        return this.f3915X.f3958p.h0();
    }

    public final List o() {
        return z().f();
    }

    public final List p() {
        return ((p011b0.e) this.f3897A.f5618s).f();
    }

    public final boolean q() {
        return this.f3915X.f3958p.f4034N;
    }

    public final boolean r() {
        return this.f3915X.f3958p.f4033M;
    }

    public final G s() {
        G g;
        V v10 = this.f3915X.f3959q;
        return (v10 == null || (g = v10.f3988A) == null) ? G.f3891t : g;
    }

    public final M.k t() {
        M.k kVar = this.f3911O;
        if (kVar != null) {
            return kVar;
        }
        M.k kVar2 = new M.k(this, this.f3910N);
        this.f3911O = kVar2;
        return kVar2;
    }

    public final String toString() {
        return K0.P.s(this) + " children: " + ((p011b0.b) o()).f13119r.f13127t + " measurePolicy: " + this.f3910N;
    }

    public final I u() {
        I i10 = this.f3900D;
        while (i10 != null && i10.f3925r) {
            i10 = i10.f3900D;
        }
        return i10;
    }

    public final int v() {
        return this.f3915X.f3958p.f4049z;
    }

    public final R0.j w() {
        if (H() && !this.f3924g0 && this.f3914W.g(8)) {
            return this.f3906J;
        }
        return null;
    }

    @Override // J0.s0
    public final boolean x() {
        return H();
    }

    public final p011b0.e y() {
        boolean z10 = this.f3909M;
        p011b0.e eVar = this.f3908L;
        if (z10) {
            eVar.g();
            eVar.c(eVar.f13127t, z());
            eVar.o(f3896j0);
            this.f3909M = false;
        }
        return eVar;
    }

    public final p011b0.e z() {
        e0();
        if (this.f3933z == 0) {
            return (p011b0.e) this.f3897A.f5618s;
        }
        p011b0.e eVar = this.f3898B;
        p251z9.j.b(eVar);
        return eVar;
    }

    public I(int i10, boolean z10) {
        this.f3925r = z10;
        this.f3926s = i10;
        this.f3927t = 9223372034707292159L;
        this.f3928u = 0L;
        this.f3929v = 9223372034707292159L;
        this.f3930w = true;
        this.f3897A = new M.k(24, new p011b0.e(new I[16]), new C0041r0(9, this));
        this.f3908L = new p011b0.e(new I[16]);
        this.f3909M = true;
        this.f3910N = f3894h0;
        this.f3912P = L.f3944a;
        this.Q = p063g1.m.f16261r;
        this.R = f3895i0;
        InterfaceC0706w.f10838h.getClass();
        this.S = C0705v.f10833b;
        G g = G.f3891t;
        this.T = g;
        this.U = g;
        this.f3914W = new C0280d0(this);
        this.f3915X = new M(this);
        this.f3918a0 = true;
        this.f3919b0 = l0.o.f19333a;
    }
}
