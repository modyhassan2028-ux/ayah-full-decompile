package p005a4;

import Ba.b;
import I4.a;
import Z.C0672b;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.M0;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p074h0.d;
import p074h0.j;
import p180s0.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M0 f11187a = new M0(new b(13));

    public static final void a(boolean z10, d dVar, C0698o c0698o, int i10) {
        c0698o.V(403521171);
        int i11 = i10 | 2;
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                z10 = (((Configuration) c0698o.k(AndroidCompositionLocals_androidKt.f12062a)).uiMode & 48) == 32;
            } else {
                c0698o.N();
            }
            c0698o.q();
            b(z10 ? b.f11181b : b.f11180a, j.d(-317775569, new c(dVar, 0), c0698o), c0698o, 48);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new d(z10, dVar, i10, 0);
        }
    }

    public static final void b(a aVar, d dVar, C0698o c0698o, int i10) {
        C0681f0 c0681f0;
        C0681f0 c0681f1;
        p251z9.j.e(aVar, "colors");
        C0681f0 c0681f2 = aVar.f11179t;
        C0681f0 c0681f3 = aVar.f11177r;
        C0681f0 c0681f4 = aVar.f11176q;
        C0681f0 c0681f5 = aVar.g;
        C0681f0 c0681f6 = aVar.f11166e;
        C0681f0 c0681f7 = aVar.f11164c;
        C0681f0 c0681f8 = aVar.f11163b;
        c0698o.V(-2059981350);
        int i11 = (c0698o.g(aVar) ? 4 : 2) | i10;
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            Object objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                c0681f0 = c0681f2;
                c0681f1 = c0681f3;
                a aVar2 = new a(aVar.a(), ((q) c0681f8.getValue()).f21845a, ((q) c0681f7.getValue()).f21845a, aVar.i(), ((q) c0681f6.getValue()).f21845a, aVar.l(), ((q) c0681f5.getValue()).f21845a, aVar.e(), aVar.b(), aVar.d(), aVar.c(), aVar.g(), aVar.k(), aVar.h(), aVar.j(), aVar.f(), ((q) c0681f4.getValue()).f21845a, ((q) c0681f1.getValue()).f21845a, aVar.m(), ((q) c0681f0.getValue()).f21845a);
                c0698o.e0(aVar2);
                objH = aVar2;
            } else {
                c0681f0 = c0681f2;
                c0681f1 = c0681f3;
            }
            a aVar3 = (a) objH;
            aVar3.getClass();
            aVar3.f11162a.setValue(new q(aVar.a()));
            aVar3.f11163b.setValue(new q(((q) c0681f8.getValue()).f21845a));
            aVar3.f11164c.setValue(new q(((q) c0681f7.getValue()).f21845a));
            aVar3.f11165d.setValue(new q(aVar.i()));
            aVar3.f11166e.setValue(new q(((q) c0681f6.getValue()).f21845a));
            aVar3.f11167f.setValue(new q(aVar.l()));
            aVar3.g.setValue(new q(((q) c0681f5.getValue()).f21845a));
            aVar3.f11168h.setValue(new q(aVar.e()));
            aVar3.f11169i.setValue(new q(aVar.b()));
            aVar3.j.setValue(new q(aVar.d()));
            aVar3.f11170k.setValue(new q(aVar.c()));
            aVar3.f11171l.setValue(new q(aVar.g()));
            aVar3.f11172m.setValue(new q(aVar.k()));
            aVar3.f11173n.setValue(new q(aVar.h()));
            aVar3.f11174o.setValue(new q(aVar.j()));
            aVar3.f11175p.setValue(new q(aVar.f()));
            aVar3.f11176q.setValue(new q(((q) c0681f4.getValue()).f21845a));
            aVar3.f11177r.setValue(new q(((q) c0681f1.getValue()).f21845a));
            aVar3.f11178s.setValue(new q(aVar.m()));
            aVar3.f11179t.setValue(new q(((q) c0681f0.getValue()).f21845a));
            C0672b.a(f11187a.a(aVar3), dVar, c0698o, 56);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new a(i10, 6, aVar, dVar);
        }
    }
}
