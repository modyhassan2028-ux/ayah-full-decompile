package X5;

import D.AbstractC0066i;
import D.C0076t;
import D.r;
import G4.f;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import l0.o;
import p110k9.y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9974r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ V5.a f9975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f9976t;

    public /* synthetic */ b(V5.a aVar, p241y9.e eVar) {
        this.f9975s = aVar;
        this.f9976t = eVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9974r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0076t c0076tA = r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
                    int i10 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                    o oVar = o.f19333a;
                    l0.r rVarC = l0.a.c(c0698o, oVar);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, c0076tA, C0287j.f4119f);
                    C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i10))) {
                        p123m2.c.y(i10, c0698o, i10, c0285h);
                    }
                    C0672b.v(c0698o, rVarC, C0287j.f4117d);
                    c0698o.T(-1367740983);
                    V5.a aVar = this.f9975s;
                    int i11 = 0;
                    for (Object obj3 : aVar.f8417b) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            AbstractC0813f2.T();
                            throw null;
                        }
                        p124m3.j jVar = (p124m3.j) obj3;
                        p241y9.e eVar = this.f9976t;
                        boolean zG = c0698o.g(eVar) | c0698o.i(jVar);
                        Object objH = c0698o.H();
                        if (zG || objH == C0690k.f10683a) {
                            objH = new f(12, eVar, jVar);
                            c0698o.e0(objH);
                        }
                        a.d(jVar, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH, 7), null, c0698o, 0);
                        if (i11 != aVar.f8417b.size() - 1) {
                            c0698o.T(-1285474715);
                            B0.c.a(null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).i(), (float) 0.3d, 0.0f, c0698o, 384);
                        } else {
                            c0698o.T(-1286957414);
                        }
                        c0698o.p(false);
                        i11 = i12;
                    }
                    c0698o.p(false);
                    c0698o.p(true);
                } else {
                    c0698o.N();
                }
                return y.f19095a;
            default:
                ((Integer) obj2).getClass();
                a.a(this.f9975s, this.f9976t, (C0698o) obj, C0672b.y(1));
                return y.f19095a;
        }
    }

    public /* synthetic */ b(V5.a aVar, p241y9.e eVar, int i10) {
        this.f9975s = aVar;
        this.f9976t = eVar;
    }
}
