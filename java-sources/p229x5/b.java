package p229x5;

import D.AbstractC0066i;
import D.C0076t;
import D.r;
import G4.f;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import W.V0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import l0.a;
import l0.c;
import l0.o;
import p110k9.y;
import p241y9.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24380r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p210v5.b f24381s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f24382t;

    public /* synthetic */ b(p210v5.b bVar, e eVar) {
        this.f24381s = bVar;
        this.f24382t = eVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24380r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0076t c0076tA = r.a(AbstractC0066i.f979c, c.f19309D, c0698o, 0);
                    int i10 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                    o oVar = o.f19333a;
                    l0.r rVarC = a.c(c0698o, oVar);
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
                    c0698o.T(1525047329);
                    p210v5.b bVar = this.f24381s;
                    int i11 = 0;
                    for (Object obj3 : bVar.f23342b) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            AbstractC0813f2.T();
                            throw null;
                        }
                        p210v5.a aVar = (p210v5.a) obj3;
                        e eVar = this.f24382t;
                        boolean zG = c0698o.g(eVar) | c0698o.g(aVar);
                        Object objH = c0698o.H();
                        if (zG || objH == C0690k.f10683a) {
                            objH = new f(29, eVar, aVar);
                            c0698o.e0(objH);
                        }
                        a.a(aVar, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH, 7), null, c0698o, 0);
                        if (i11 != bVar.f23342b.size() - 1) {
                            c0698o.T(891892049);
                            V0.g(null, (float) 0.3d, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).i(), c0698o, 48, 1);
                        } else {
                            c0698o.T(890818736);
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
                a.b(this.f24381s, this.f24382t, (C0698o) obj, C0672b.y(1));
                return y.f19095a;
        }
    }

    public /* synthetic */ b(p210v5.b bVar, e eVar, int i10) {
        this.f24381s = bVar;
        this.f24382t = eVar;
    }
}
