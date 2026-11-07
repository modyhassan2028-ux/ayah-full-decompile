package V4;

import D.AbstractC0066i;
import D.C0076t;
import D.P;
import D.r;
import D4.j;
import D4.l;
import F9.n;
import G4.i;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import U0.L;
import W.AbstractC0542b2;
import W.G2;
import W.H2;
import W.S;
import W.V0;
import Z.C0672b;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.M0;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.ayah.R;
import com.google.android.gms.internal.measurement.B1;
import l0.o;
import p055f1.k;
import p074h0.d;
import p241y9.c;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f8415a = new d(1929195087, new A5.d(14), false);

    static {
        new d(1187408171, new j(20, (byte) 0), false);
    }

    public static final void a(T4.a aVar, c cVar, p241y9.a aVar2, c cVar2, c cVar3, p241y9.a aVar3, e eVar, p241y9.a aVar4, C0698o c0698o, int i10) {
        p251z9.j.e(cVar, "onJumpToAyah");
        p251z9.j.e(aVar2, "onStartNewKhatmah");
        p251z9.j.e(cVar2, "onKhatmahDayComplete");
        p251z9.j.e(cVar3, "onRestartKhatmah");
        p251z9.j.e(aVar3, "onShowDayInfo");
        p251z9.j.e(eVar, "onToggleReminders");
        p251z9.j.e(aVar4, "onDeleteKhatmah");
        c0698o.V(-1275318618);
        int i11 = i10 | (c0698o.i(aVar) ? 4 : 2) | (c0698o.i(cVar) ? 32 : 16) | (c0698o.i(aVar2) ? 256 : 128) | (c0698o.i(cVar2) ? 2048 : 1024) | (c0698o.i(cVar3) ? 16384 : 8192) | (c0698o.i(aVar3) ? 131072 : 65536) | (c0698o.i(eVar) ? 1048576 : 524288) | (c0698o.i(aVar4) ? 8388608 : 4194304);
        if (!c0698o.K(i11 & 1, (4793491 & i11) != 4793490)) {
            c0698o.N();
        } else if (aVar == null) {
            c0698o.T(264161555);
            C0076t c0076tA = r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, o.f19333a);
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
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            B1.d(0, c0698o);
            b(aVar2, null, c0698o, (i11 >> 6) & 14);
            c0698o.p(true);
            c0698o.p(false);
        } else {
            c0698o.T(264275201);
            int i13 = i11 >> 9;
            X4.a.g(aVar, cVar, aVar3, eVar, cVar2, aVar2, cVar3, aVar4, null, c0698o, (i11 & 126) | (i13 & 896) | (i13 & 7168) | ((i11 << 3) & 57344) | (458752 & (i11 << 9)) | ((i11 << 6) & 3670016) | (i11 & 29360128));
            c0698o.p(false);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new i(aVar, cVar, aVar2, cVar2, cVar3, aVar3, eVar, aVar4, i10);
        }
    }

    public static final void b(p241y9.a aVar, l0.r rVar, C0698o c0698o, int i10) {
        int i11;
        l0.r rVar2;
        p241y9.a aVar2 = aVar;
        C0698o c0698o2 = c0698o;
        p251z9.j.e(aVar2, "onStartNewKhatmah");
        c0698o2.V(1692859113);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c0698o2.i(aVar2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if (c0698o2.K(i12 & 1, (i12 & 19) != 18)) {
            FillElement fillElement = androidx.compose.foundation.layout.c.f11828c;
            C0076t c0076tA = r.a(AbstractC0066i.f981e, l0.c.f19310E, c0698o2, 54);
            int i13 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            l0.r rVarC = l0.a.c(c0698o2, fillElement);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, c0076tA, C0287j.f4119f);
            C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o2, i13, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            String strM0 = p000a.a.m0(R.string.no_khatmah_message, c0698o2);
            L lA = L.a(((G2) c0698o2.k(H2.f8580a)).f8563h, 0L, n.B(18), null, null, 0L, 0L, null, 16777213);
            M0 m10 = p005a4.e.f11187a;
            long jK = ((p005a4.a) c0698o2.k(m10)).k();
            float f3 = 240;
            o oVar = o.f19333a;
            AbstractC0542b2.b(strM0, b.l(androidx.compose.foundation.layout.c.n(oVar, f3), 0.0f, 0.0f, 0.0f, 32, 7), jK, 0L, null, null, 0L, new k(3), 0L, 0, false, 0, 0, lA, c0698o, 48, 0, 65016);
            P p10 = S.f8804a;
            rVar2 = oVar;
            aVar2 = aVar;
            V0.d(aVar2, androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.n(rVar2, f3), 48), false, null, S.a(((p005a4.a) c0698o.k(m10)).l(), 0L, c0698o, 14), null, null, null, f8415a, c0698o, (i12 & 14) | 805306416, 492);
            c0698o2 = c0698o;
            c0698o2.p(true);
        } else {
            c0698o2.N();
            rVar2 = rVar;
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new l(i10, 3, aVar2, rVar2);
        }
    }
}
