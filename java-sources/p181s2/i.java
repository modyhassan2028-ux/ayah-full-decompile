package p181s2;

import N9.U;
import N9.k0;
import Z.C0672b;
import Z.C0681f0;
import androidx.lifecycle.EnumC0767p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p120l9.m;
import p173r2.C;
import p173r2.F;
import p173r2.G;
import p173r2.j;
import p173r2.n;
import p173r2.v;
import p185s8.u0;
import p197u2.h;

/* JADX INFO: loaded from: classes.dex */
@F("composable")
public final class i extends G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0681f0 f22072c = C0672b.r(Boolean.FALSE);

    @Override // p173r2.G
    public final v a() {
        return new h(this, c.f22068a);
    }

    @Override // p173r2.G
    public final void d(List list, C c10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            n nVarB = b();
            U u8 = nVarB.f21459e;
            p251z9.j.e(jVar, "backStackEntry");
            k0 k0Var = nVarB.f21457c;
            Iterable iterable = (Iterable) k0Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((j) it2.next()) == jVar) {
                            Iterable iterable2 = (Iterable) u8.f6130r.getValue();
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it3 = iterable2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((j) it3.next()) == jVar) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            j jVar2 = (j) m.n0((List) u8.f6130r.getValue());
            if (jVar2 != null) {
                k0Var.n(null, u0.w((Set) k0Var.getValue(), jVar2));
            }
            k0Var.n(null, u0.w((Set) k0Var.getValue(), jVar));
            nVarB.f(jVar);
        }
        this.f22072c.setValue(Boolean.FALSE);
    }

    @Override // p173r2.G
    public final void e(j jVar, boolean z10) {
        b().e(jVar, z10);
        this.f22072c.setValue(Boolean.TRUE);
    }

    public final void g(j jVar) {
        n nVarB = b();
        p251z9.j.e(jVar, "entry");
        k0 k0Var = nVarB.f21457c;
        k0Var.n(null, u0.w((Set) k0Var.getValue(), jVar));
        h hVar = nVarB.f21461h.f21412b;
        hVar.getClass();
        if (!hVar.f22854f.contains(jVar)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        jVar.c(EnumC0767p.f12664u);
    }
}
