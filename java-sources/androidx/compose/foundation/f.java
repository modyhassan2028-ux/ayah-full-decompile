package androidx.compose.foundation;

import A.M;
import B.j;
import Z.M0;
import l0.r;
import p232y.J;
import p232y.L;
import p232y.O;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M0 f11784a = new M0(L.f24435s);

    public static final r a(r rVar, j jVar, J j) {
        if (j == null) {
            return rVar;
        }
        return j instanceof O ? rVar.b(new IndicationModifierElement(jVar, (O) j)) : l0.a.a(rVar, new M(5, j, jVar));
    }
}
