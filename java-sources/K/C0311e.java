package K;

import Z.C0690k;
import Z.C0698o;

/* JADX INFO: renamed from: K.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0311e extends p251z9.k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0311e f4622r = new C0311e(3);

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        l0.r rVar = (l0.r) obj;
        C0698o c0698o = (C0698o) obj2;
        ((Number) obj3).intValue();
        c0698o.T(-2126899193);
        long j = ((O.U) c0698o.k(O.V.f6342a)).f6340a;
        boolean zF = c0698o.f(j);
        Object objH = c0698o.H();
        if (zF || objH == C0690k.f10683a) {
            objH = new C0310d(j, 0);
            c0698o.e0(objH);
        }
        l0.r rVarB = rVar.b(androidx.compose.ui.draw.a.b(l0.o.f19333a, (p241y9.c) objH));
        c0698o.p(false);
        return rVarB;
    }
}
