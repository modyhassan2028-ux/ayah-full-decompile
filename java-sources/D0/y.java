package D0;

import I1.G0;
import J0.C0296t;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import Z.C0675c0;
import android.os.Handler;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.internal.measurement.J1;
import java.util.ArrayList;
import p151p.V;
import p223x.AbstractC1413d;
import p223x.AbstractC1434x;
import p223x.C1411c;
import p223x.u0;
import u.C1360o;

/* JADX INFO: loaded from: classes.dex */
public final class y implements p211v6.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f1158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f1159t = AbstractC1413d.a(0.0f);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f1160u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f1161v;

    /* JADX WARN: Multi-variable type inference failed */
    public y(p241y9.a aVar, boolean z10) {
        this.f1157r = z10;
        this.f1158s = (p251z9.k) aVar;
    }

    @Override // p211v6.a
    public boolean a() {
        return this.f1157r;
    }

    public void b(J0.K k7, float f3, long j) {
        float fFloatValue = ((Number) ((C1411c) this.f1159t).d()).floatValue();
        if (fFloatValue > 0.0f) {
            long jB = p180s0.q.b(j, fFloatValue);
            if (!this.f1157r) {
                p123m2.c.e(k7, jB, f3, 0L, 0, 124);
                return;
            }
            float fD = p171r0.i.d(k7.b());
            float fB = p171r0.i.b(k7.b());
            p074h0.i iVar = k7.f3942r.f22795s;
            long jV = iVar.v();
            iVar.p().q();
            try {
                ((p074h0.i) ((V) iVar.f16422s).f20603r).p().l(0.0f, 0.0f, fD, fB, 1);
                p123m2.c.e(k7, jB, f3, 0L, 0, 124);
            } finally {
                iVar.p().n();
                iVar.J(jV);
            }
        }
    }

    @Override // p211v6.a
    public void c(long j) {
        Handler handler = (Handler) this.f1159t;
        p211v6.b bVar = (p211v6.b) this.f1161v;
        handler.removeCallbacks(bVar);
        handler.postDelayed(bVar, j);
    }

    @Override // p211v6.a
    public void d() {
        ((Handler) this.f1159t).removeCallbacks((p211v6.b) this.f1161v);
        G0 g10 = (G0) this.f1160u;
        g10.f3681a.E(3);
        g10.f3681a.S();
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [y9.a, z9.k] */
    public void e(B.i iVar, InterfaceC0402u interfaceC0402u) {
        float f3;
        ArrayList arrayList = (ArrayList) this.f1160u;
        boolean z10 = iVar instanceof B.g;
        if (z10) {
            arrayList.add(iVar);
        } else if (iVar instanceof B.h) {
            arrayList.remove(((B.h) iVar).f568a);
        } else if (iVar instanceof B.d) {
            arrayList.add(iVar);
        } else if (iVar instanceof B.e) {
            arrayList.remove(((B.e) iVar).f564a);
        } else if (iVar instanceof B.b) {
            arrayList.add(iVar);
        } else if (iVar instanceof B.c) {
            arrayList.remove(((B.c) iVar).f563a);
        } else if (!(iVar instanceof B.a)) {
            return;
        } else {
            arrayList.remove(((B.a) iVar).f562a);
        }
        B.i iVar2 = (B.i) p120l9.m.n0(arrayList);
        if (p251z9.j.a((B.i) this.f1161v, iVar2)) {
            return;
        }
        p150o9.c cVar = null;
        if (iVar2 != null) {
            V.e eVar = (V.e) ((p251z9.k) this.f1158s).invoke();
            if (z10) {
                f3 = eVar.f8349c;
            } else if (iVar instanceof B.d) {
                f3 = eVar.f8348b;
            } else {
                f3 = iVar instanceof B.b ? eVar.f8347a : 0.0f;
            }
            u0 u0Var = V.h.f8352a;
            if (!(iVar2 instanceof B.g) && ((iVar2 instanceof B.d) || (iVar2 instanceof B.b))) {
                u0Var = new u0(45, AbstractC1434x.f24124d, 2);
            }
            AbstractC0405x.x(interfaceC0402u, null, new V.l(this, f3, u0Var, (p150o9.c) null), 3);
        } else {
            B.i iVar3 = (B.i) this.f1161v;
            u0 u0Var2 = V.h.f8352a;
            if (!(iVar3 instanceof B.g) && !(iVar3 instanceof B.d) && (iVar3 instanceof B.b)) {
                u0Var2 = new u0(150, AbstractC1434x.f24124d, 2);
            }
            AbstractC0405x.x(interfaceC0402u, null, new O9.y(this, u0Var2, cVar, 11), 3);
        }
        this.f1161v = iVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int f(M.k kVar, AndroidComposeView androidComposeView, boolean z10) {
        int i10;
        Object[] objArr;
        int i11;
        C0087e c0087e = (C0087e) this.f1159t;
        C0296t c0296t = (C0296t) this.f1161v;
        if (this.f1157r) {
            return 0;
        }
        try {
            this.f1157r = true;
            J1 j1D = ((O8.c) this.f1160u).D(kVar, androidComposeView);
            C1360o c1360o = (C1360o) j1D.f14056c;
            int iJ = c1360o.j();
            while (true) {
                if (i10 >= iJ) {
                    objArr = true;
                    break;
                }
                v vVar = (v) c1360o.k(i10);
                i10 = (vVar.f1135d || vVar.f1138h) ? 0 : i10 + 1;
                objArr = false;
                break;
            }
            int iJ2 = c1360o.j();
            for (int i12 = 0; i12 < iJ2; i12++) {
                v vVar2 = (v) c1360o.k(i12);
                if (objArr != false || u.a(vVar2)) {
                    ((J0.I) this.f1158s).A(vVar2.f1134c, (C0296t) this.f1161v, vVar2.f1139i, true);
                    if (!c0296t.f4167r.g()) {
                        c0087e.a(vVar2.f1132a, c0296t, u.a(vVar2));
                        c0296t.clear();
                    }
                }
            }
            boolean zD = c0087e.d(j1D, z10);
            if (j1D.f14055b) {
                i11 = 0;
            } else {
                int iJ3 = c1360o.j();
                for (int i13 = 0; i13 < iJ3; i13++) {
                    v vVar3 = (v) c1360o.k(i13);
                    if (!p171r0.c.b(u.g(vVar3, true), 0L) && vVar3.b()) {
                        i11 = 1;
                    }
                }
                i11 = 0;
            }
            return (zD ? 1 : 0) | (i11 << 1);
        } finally {
            this.f1157r = false;
        }
    }

    public void g(int i10, int i11) {
        if (i10 < 0.0f) {
            C.a.a("Index should be non-negative (" + i10 + ')');
        }
        ((C0675c0) this.f1158s).h(i10);
        G.G g = (G.G) this.f1161v;
        if (i10 != g.f2587s) {
            g.f2587s = i10;
            int i12 = (i10 / 30) * 30;
            g.f2586r.setValue(B0.c.i0(Math.max(i12 - 100, 0), i12 + 130));
        }
        ((C0675c0) this.f1159t).h(i11);
    }

    @Override // p211v6.a
    public void toggle() {
        if (this.f1157r) {
            d();
        } else {
            ((Handler) this.f1159t).removeCallbacks((p211v6.b) this.f1161v);
            ((G0) this.f1160u).f3681a.T(3);
        }
    }
}
