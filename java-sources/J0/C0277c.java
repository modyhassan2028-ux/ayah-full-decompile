package J0;

import D.C0081y;
import D0.C0096n;
import D0.EnumC0097o;
import G.C0171e;
import H0.InterfaceC0219s;
import H0.InterfaceC0221u;
import K9.C0389g;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.HashSet;

/* JADX INFO: renamed from: J0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0277c extends l0.q implements InterfaceC0302z, InterfaceC0293p, y0, w0, I0.d, I0.e, u0, InterfaceC0301y, InterfaceC0294q, p162q0.e, p162q0.o, p162q0.q, s0, p152p0.a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public l0.p f4052F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public I0.a f4053G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public HashSet f4054H;

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // J0.w0
    public final void C(C0096n c0096n, EnumC0097o enumC0097o, long j) {
        boolean z10;
        l0.p pVar = this.f4052F;
        p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        android.support.v4.media.session.r rVar = ((D0.C) pVar).f1048d;
        rVar.getClass();
        ?? r10 = c0096n.f1119a;
        D0.C c10 = (D0.C) rVar.f11366u;
        if (c10.f1047c) {
            z10 = true;
            break;
        }
        int size = r10.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = false;
                break;
            }
            D0.v vVar = (D0.v) r10.get(i10);
            if (D0.u.a(vVar) || D0.u.c(vVar)) {
                z10 = true;
                break;
            }
            i10++;
        }
        D0.A a9 = (D0.A) rVar.f11365t;
        D0.A a10 = D0.A.f1041t;
        EnumC0097o enumC0097o2 = EnumC0097o.f1125t;
        if (a9 != a10) {
            if (enumC0097o == EnumC0097o.f1123r && z10) {
                rVar.A(c0096n);
            }
            if (enumC0097o == enumC0097o2 && !z10) {
                rVar.A(c0096n);
            }
        }
        if (enumC0097o == enumC0097o2) {
            int size2 = r10.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (!D0.u.c((D0.v) r10.get(i11))) {
                    return;
                }
            }
            rVar.f11365t = D0.A.f1039r;
            c10.f1047c = false;
        }
    }

    @Override // p162q0.e
    public final void D(p162q0.s sVar) {
        l0.p pVar = this.f4052F;
        G0.a.b("onFocusEvent called on wrong node");
        pVar.getClass();
        throw new ClassCastException();
    }

    @Override // J0.InterfaceC0294q
    public final void H(j0 j0Var) {
        l0.p pVar = this.f4052F;
        p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        C0171e c0171e = (C0171e) pVar;
        if (c0171e.f2693a) {
            return;
        }
        c0171e.f2693a = true;
        C0389g c0389g = c0171e.f2694b;
        if (c0389g != null) {
            c0389g.resumeWith(p110k9.y.f19095a);
        }
        c0171e.f2694b = null;
    }

    @Override // J0.w0
    public final boolean J() {
        l0.p pVar = this.f4052F;
        p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((D0.C) pVar).f1048d.getClass();
        return true;
    }

    @Override // J0.y0
    public final void L(R0.j jVar) {
        l0.p pVar = this.f4052F;
        p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        R0.j jVarJ = ((R0.l) pVar).j();
        p251z9.j.c(jVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        u.E e10 = jVar.f7108r;
        if (jVarJ.f7110t) {
            jVar.f7110t = true;
        }
        if (jVarJ.f7111u) {
            jVar.f7111u = true;
        }
        u.E e11 = jVarJ.f7108r;
        Object[] objArr = e11.f22670b;
        Object[] objArr2 = e11.f22671c;
        long[] jArr = e11.f22669a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        Object obj2 = objArr2[i14];
                        R0.v vVar = (R0.v) obj;
                        if (!e10.b(vVar)) {
                            e10.l(vVar, obj2);
                        } else if (obj2 instanceof R0.a) {
                            Object objG = e10.g(vVar);
                            p251z9.j.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            R0.a aVar = (R0.a) objG;
                            String str = aVar.f7068a;
                            if (str == null) {
                                str = ((R0.a) obj2).f7068a;
                            }
                            p110k9.e eVar = aVar.f7069b;
                            if (eVar == null) {
                                eVar = ((R0.a) obj2).f7069b;
                            }
                            e10.l(vVar, new R0.a(str, eVar));
                        }
                    }
                    j >>= i11;
                    i13++;
                    i11 = i11;
                }
                if (i12 != i11) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // p162q0.o
    public final void N(p162q0.l lVar) {
        l0.p pVar = this.f4052F;
        G0.a.b("applyFocusProperties called on wrong node");
        pVar.getClass();
        throw new ClassCastException();
    }

    @Override // J0.w0
    public final void P() {
        R();
    }

    @Override // J0.w0
    public final void R() {
        l0.p pVar = this.f4052F;
        p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        android.support.v4.media.session.r rVar = ((D0.C) pVar).f1048d;
        D0.A a9 = (D0.A) rVar.f11365t;
        D0.C c10 = (D0.C) rVar.f11366u;
        if (a9 == D0.A.f1040s) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            D0.B b5 = new D0.B(c10, 1);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            b5.e(motionEventObtain);
            motionEventObtain.recycle();
            rVar.f11365t = D0.A.f1039r;
            c10.f1047c = false;
        }
    }

    @Override // J0.y0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // J0.y0
    public final /* synthetic */ boolean V() {
        return false;
    }

    @Override // J0.InterfaceC0293p
    public final void Y() {
        AbstractC0283f.m(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // I0.e
    public final Object Z(I0.f fVar) {
        C0280d0 c0280d0;
        this.f4054H.add(fVar);
        if (!this.f19339r.f19338E) {
            G0.a.b("visitAncestors called on an unattached node");
        }
        l0.q qVar = this.f19339r.f19343v;
        I iX = AbstractC0283f.x(this);
        while (iX != null) {
            if ((((l0.q) iX.f3914W.f4067f).f19342u & 32) != 0) {
                while (qVar != null) {
                    if ((qVar.f19341t & 32) != 0) {
                        ?? F10 = qVar;
                        ?? eVar = 0;
                        while (F10 != 0) {
                            if (F10 instanceof I0.d) {
                                I0.d dVar = (I0.d) F10;
                                if (dVar.j().q(fVar)) {
                                    return dVar.j().D(fVar);
                                }
                            } else if ((F10.f19341t & 32) != 0 && (F10 instanceof AbstractC0291n)) {
                                l0.q qVar2 = ((AbstractC0291n) F10).f4151G;
                                int i10 = 0;
                                F10 = F10;
                                eVar = eVar;
                                while (qVar2 != null) {
                                    if ((qVar2.f19341t & 32) != 0) {
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
                    qVar = qVar.f19343v;
                }
            }
            iX = iX.u();
            qVar = (iX == null || (c0280d0 = iX.f3914W) == null) ? null : (z0) c0280d0.f4066e;
        }
        return fVar.f3661a.invoke();
    }

    @Override // J0.InterfaceC0302z
    public final int a(P p10, H0.H h7, int i10) {
        l0.p pVar = this.f4052F;
        p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0221u) pVar).a(p10, h7, i10);
    }

    @Override // J0.w0
    public final void a0() {
        l0.p pVar = this.f4052F;
        p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((D0.C) pVar).f1048d.getClass();
    }

    @Override // p152p0.a
    public final long b() {
        return B9.a.d0(AbstractC0283f.v(this, 128).f3170t);
    }

    @Override // J0.InterfaceC0302z
    public final int c(P p10, H0.H h7, int i10) {
        l0.p pVar = this.f4052F;
        p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0221u) pVar).c(p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final int d(P p10, H0.H h7, int i10) {
        l0.p pVar = this.f4052F;
        p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0221u) pVar).d(p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final H0.J e(H0.K k7, H0.H h7, long j) {
        l0.p pVar = this.f4052F;
        p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0221u) pVar).e(k7, h7, j);
    }

    @Override // J0.InterfaceC0302z
    public final int f(P p10, H0.H h7, int i10) {
        l0.p pVar = this.f4052F;
        p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0221u) pVar).f(p10, h7, i10);
    }

    @Override // p152p0.a
    public final p063g1.c getDensity() {
        return AbstractC0283f.x(this).f3912P;
    }

    @Override // p152p0.a
    public final p063g1.m getLayoutDirection() {
        return AbstractC0283f.x(this).Q;
    }

    @Override // J0.u0
    public final Object i(p063g1.c cVar, Object obj) {
        l0.p pVar = this.f4052F;
        p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((H0.Q) pVar).i();
    }

    @Override // I0.d
    public final AbstractC0813f2 j() {
        I0.a aVar = this.f4053G;
        return aVar != null ? aVar : I0.b.f3654s;
    }

    @Override // l0.q
    public final void l0() {
        v0(true);
    }

    @Override // l0.q
    public final void m0() {
        if (this.f4052F instanceof D0.C) {
            R();
        }
    }

    @Override // l0.q
    public final void n0() {
        w0();
    }

    @Override // J0.w0
    public final long q() {
        return A0.f3873a;
    }

    @Override // J0.InterfaceC0293p
    public final void r(K k7) {
        l0.p pVar = this.f4052F;
        p251z9.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((p232y.M) pVar).f24438a.a(k7);
    }

    public final String toString() {
        return this.f4052F.toString();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    public final void v0(boolean z10) {
        if (!this.f19338E) {
            G0.a.b("initializeModifier called on unattached node");
        }
        l0.p pVar = this.f4052F;
        if ((this.f19341t & 32) != 0) {
            if (pVar instanceof D.F) {
                C0275b c0275b = new C0275b(this, 0);
                u.A a9 = ((AndroidComposeView) AbstractC0283f.y(this)).L0;
                if (a9.f(c0275b) < 0) {
                    a9.a(c0275b);
                }
            }
            if (pVar instanceof D.F) {
                D.F f3 = (D.F) pVar;
                I0.a aVar = this.f4053G;
                if (aVar != null) {
                    I0.f fVar = D.h0.f976a;
                    if (aVar.q(fVar)) {
                        aVar.f3653s = f3;
                        I0.c modifierLocalManager = AbstractC0283f.y(this).getModifierLocalManager();
                        modifierLocalManager.f3656b.b(this);
                        modifierLocalManager.f3657c.b(fVar);
                        modifierLocalManager.a();
                    } else {
                        I0.a aVar2 = new I0.a();
                        aVar2.f3653s = f3;
                        this.f4053G = aVar2;
                        if (AbstractC0283f.d(this)) {
                            I0.c modifierLocalManager2 = AbstractC0283f.y(this).getModifierLocalManager();
                            I0.f fVar2 = D.h0.f976a;
                            modifierLocalManager2.f3656b.b(this);
                            modifierLocalManager2.f3657c.b(fVar2);
                            modifierLocalManager2.a();
                        }
                    }
                } else {
                    I0.a aVar3 = new I0.a();
                    aVar3.f3653s = f3;
                    this.f4053G = aVar3;
                    if (AbstractC0283f.d(this)) {
                        I0.c modifierLocalManager3 = AbstractC0283f.y(this).getModifierLocalManager();
                        I0.f fVar3 = D.h0.f976a;
                        modifierLocalManager3.f3656b.b(this);
                        modifierLocalManager3.f3657c.b(fVar3);
                        modifierLocalManager3.a();
                    }
                }
            }
        }
        if ((this.f19341t & 4) != 0 && !z10) {
            AbstractC0283f.v(this, 2).L0();
        }
        if ((this.f19341t & 2) != 0) {
            if (AbstractC0283f.d(this)) {
                j0 j0Var = this.f19346y;
                p251z9.j.b(j0Var);
                ((B) j0Var).e1(this);
                q0 q0Var = j0Var.f4140W;
                if (q0Var != null) {
                    q0Var.invalidate();
                }
            }
            if (!z10) {
                AbstractC0283f.v(this, 2).L0();
                AbstractC0283f.x(this).E();
            }
        }
        if (pVar instanceof F.w) {
            ((F.w) pVar).f2137a.j = AbstractC0283f.x(this);
        }
        if ((this.f19341t & 256) != 0 && (pVar instanceof C0171e) && AbstractC0283f.d(this)) {
            AbstractC0283f.x(this).E();
        }
        int i10 = this.f19341t;
        if ((i10 & 16) != 0 && (pVar instanceof D0.C)) {
            ((D0.C) pVar).f1048d.f11364s = this.f19346y;
        }
        if ((i10 & 8) != 0) {
            ((AndroidComposeView) AbstractC0283f.y(this)).H();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [y9.a, z9.k] */
    public final void w0() {
        if (!this.f19338E) {
            G0.a.b("unInitializeModifier called on unattached node");
        }
        l0.p pVar = this.f4052F;
        if ((this.f19341t & 32) != 0) {
            if (pVar instanceof D.F) {
                I0.c modifierLocalManager = AbstractC0283f.y(this).getModifierLocalManager();
                I0.f fVar = D.h0.f976a;
                modifierLocalManager.f3658d.b(AbstractC0283f.x(this));
                modifierLocalManager.f3659e.b(fVar);
                modifierLocalManager.a();
            }
            if (pVar instanceof D.F) {
                D.F f3 = (D.F) pVar;
                D.d0 d0Var = (D.d0) D.h0.f976a.f3661a.invoke();
                D.d0 d0Var2 = f3.f881a;
                f3.f882b.setValue(new C0081y(d0Var2, d0Var));
                f3.f883c.setValue(new D.Z(d0Var, d0Var2));
            }
        }
        if ((this.f19341t & 8) != 0) {
            ((AndroidComposeView) AbstractC0283f.y(this)).H();
        }
    }

    @Override // J0.s0
    public final boolean x() {
        return this.f19338E;
    }

    public final void x0() {
        if (this.f19338E) {
            this.f4054H.clear();
            AbstractC0283f.y(this).getSnapshotObserver().a(this, C0281e.f4074s, new C0275b(this, 1));
        }
    }

    @Override // J0.InterfaceC0301y
    public final void G(InterfaceC0219s interfaceC0219s) {
    }

    @Override // J0.InterfaceC0301y
    public final void s(long j) {
    }
}
