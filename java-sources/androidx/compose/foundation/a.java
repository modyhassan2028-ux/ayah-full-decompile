package androidx.compose.foundation;

import A.C0037p;
import A.EnumC0047u0;
import A.T0;
import B.j;
import R0.g;
import android.view.KeyEvent;
import com.google.android.gms.internal.measurement.B1;
import l0.o;
import l0.r;
import p180s0.J;
import p232y.C1452f;
import p232y.D;
import p232y.O;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final r a(r rVar, long j, J j10) {
        return rVar.b(new BackgroundElement(j, j10));
    }

    public static r b(r rVar, j jVar, p232y.J j, boolean z10, g gVar, p241y9.a aVar, int i10) {
        r rVarB;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        g gVar2 = gVar;
        if (j instanceof O) {
            rVarB = new ClickableElement(jVar, (O) j, z11, null, gVar2, aVar);
        } else if (j == null) {
            rVarB = new ClickableElement(jVar, null, z11, null, gVar2, aVar);
        } else {
            o oVar = o.f19333a;
            rVarB = jVar != null ? f.a(oVar, jVar, j).b(new ClickableElement(jVar, null, z11, null, gVar2, aVar)) : l0.a.a(oVar, new c(j, z11, null, gVar2, aVar));
        }
        return rVar.b(rVarB);
    }

    public static r c(r rVar, boolean z10, String str, p241y9.a aVar, int i10) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return l0.a.a(rVar, new b(z10, str, aVar));
    }

    public static final r d(r rVar, j jVar, p241y9.a aVar) {
        return rVar.b(new CombinedClickableElement(jVar, null, aVar, null));
    }

    public static final r e(r rVar, boolean z10, j jVar) {
        return rVar.b(z10 ? new FocusableElement(jVar) : o.f19333a);
    }

    public static r f(r rVar, j jVar) {
        return rVar.b(new HoverableElement(jVar));
    }

    public static final boolean g(KeyEvent keyEvent) {
        long jH = B0.c.H(keyEvent);
        int i10 = B0.a.f584n;
        if (B0.a.a(jH, B0.a.f578f) ? true : B0.a.a(jH, B0.a.f580i) ? true : B0.a.a(jH, B0.a.f583m)) {
            return true;
        }
        return B0.a.a(jH, B0.a.f579h);
    }

    public static r h(r rVar, T0 t2, EnumC0047u0 enumC0047u0, boolean z10, C0037p c0037p, j jVar, boolean z11, C1452f c1452f) {
        float f3 = p232y.r.f24583a;
        EnumC0047u0 enumC0047u1 = EnumC0047u0.f424r;
        o oVar = o.f19333a;
        return rVar.b(enumC0047u0 == enumC0047u1 ? B1.m(oVar, D.f24418u) : B1.m(oVar, D.f24416s)).b(new ScrollingContainerElement(c0037p, enumC0047u0, t2, jVar, c1452f, z10, z11));
    }
}
