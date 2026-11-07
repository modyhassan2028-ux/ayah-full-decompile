package U5;

import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0059b;
import D.C0076t;
import D4.j;
import H0.I;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import W.AbstractC0542b2;
import W.AbstractC0614y;
import W.F2;
import W.G2;
import W.H2;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.S;
import androidx.compose.foundation.layout.c;
import com.ayah.R;
import j$.time.LocalTime;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k3.h;
import l0.o;
import l0.r;
import p005a4.e;
import p074h0.d;
import p241y9.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f8192a = new d(360834244, new j(18, 0), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f8193b = new d(1958485189, new j(19, 0), false);

    public static final void a(List list, f fVar, p241y9.a aVar, boolean z10, p241y9.a aVar2, p241y9.a aVar3, r rVar, C0698o c0698o, int i10) {
        p241y9.a aVar4 = aVar2;
        p251z9.j.e(list, "reminders");
        p251z9.j.e(fVar, "onToggleReminders");
        p251z9.j.e(aVar, "onBackPressed");
        p251z9.j.e(aVar4, "onAcceptPermissionRationale");
        p251z9.j.e(aVar3, "onCancelPermissionRationale");
        c0698o.V(2013228306);
        int i11 = i10 | (c0698o.i(list) ? 4 : 2) | (c0698o.i(fVar) ? 32 : 16) | (c0698o.i(aVar) ? 256 : 128) | (c0698o.h(z10) ? 2048 : 1024) | (c0698o.i(aVar4) ? 16384 : 8192) | (c0698o.g(rVar) ? 1048576 : 524288);
        if (c0698o.K(i11 & 1, (i11 & 599187) != 599186)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k3.b bVar = (k3.b) it.next();
                h hVar = bVar.f18966a;
                k3.f fVar2 = hVar instanceof k3.f ? (k3.f) hVar : null;
                p110k9.j jVar = fVar2 != null ? new p110k9.j(bVar, fVar2) : null;
                if (jVar != null) {
                    arrayList.add(jVar);
                }
            }
            r rVarB = rVar.b(c.f11828c);
            C0059b c0059b = AbstractC0066i.f979c;
            l0.h hVar2 = l0.c.f19309D;
            C0076t c0076tA = D.r.a(c0059b, hVar2, c0698o, 0);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVarB);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0285h c0285h = C0287j.f4119f;
            C0672b.v(c0698o, c0076tA, c0285h);
            C0285h c0285h2 = C0287j.f4118e;
            C0672b.v(c0698o, interfaceC0687i0M, c0285h2);
            C0285h c0285h3 = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o, rVarC, c0285h4);
            d dVarD = p074h0.j.d(-512831358, new A5.f(aVar, 3, (byte) 0), c0698o);
            float f3 = F2.f8543a;
            AbstractC0614y.b(f8192a, null, dVarD, null, 0.0f, null, F2.a(((p005a4.a) c0698o.k(e.f11187a)).g(), c0698o), c0698o, 390, 186);
            I iD = AbstractC0071n.d(l0.c.f19313r, false);
            int i13 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
            r rVarC2 = l0.a.c(c0698o, o.f19333a);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M2, c0285h2);
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o, i13, c0285h3);
            }
            C0672b.v(c0698o, rVarC2, c0285h4);
            r rVarE = p181s2.r.e(rVar, p181s2.r.d(c0698o));
            C0076t c0076tA2 = D.r.a(c0059b, hVar2, c0698o, 0);
            int i14 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M3 = c0698o.m();
            r rVarC3 = l0.a.c(c0698o, rVarE);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0076tA2, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M3, c0285h2);
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i14))) {
                p123m2.c.y(i14, c0698o, i14, c0285h3);
            }
            C0672b.v(c0698o, rVarC3, c0285h4);
            boolean z11 = false;
            b(null, c0698o, 0);
            c0698o.T(-1975733559);
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                p110k9.j jVar2 = (p110k9.j) obj;
                k3.b bVar2 = (k3.b) jVar2.f19077r;
                k3.f fVar3 = (k3.f) jVar2.f19078s;
                ArrayList arrayList2 = arrayList;
                LocalTime localTime = bVar2.f18967b;
                boolean z12 = bVar2.f18968c;
                int i16 = fVar3.f18973a.f18965r;
                k3.j jVar3 = bVar2.f18969d;
                DateTimeFormatter dateTimeFormatter = p125m4.b.f19616c;
                p251z9.j.d(dateTimeFormatter, "getTimeFormatter(...)");
                p015b4.f.k(localTime, z12, i16, jVar3, fVar3, fVar, dateTimeFormatter, c0698o, (i11 << 12) & 458752);
                arrayList = arrayList2;
                z11 = z11;
            }
            boolean z13 = z11;
            c0698o.p(z13);
            c0698o.p(true);
            if (z10) {
                c0698o.T(1076406579);
                String strM0 = p000a.a.m0(R.string.notification_permissions_title, c0698o);
                String strM1 = p000a.a.m0(R.string.notification_permissions_reminders_description, c0698o);
                boolean z14 = (i11 & 57344) == 16384 ? true : z13;
                Object objH = c0698o.H();
                S s10 = C0690k.f10683a;
                if (z14 || objH == s10) {
                    aVar4 = aVar2;
                    objH = new A5.c(4, aVar4);
                    c0698o.e0(objH);
                } else {
                    aVar4 = aVar2;
                }
                p241y9.a aVar5 = (p241y9.a) objH;
                Object objH2 = c0698o.H();
                if (objH2 == s10) {
                    objH2 = new A5.c(5, aVar3);
                    c0698o.e0(objH2);
                }
                p015b4.f.b(strM0, strM1, aVar5, (p241y9.a) objH2, c0698o, 0);
            } else {
                aVar4 = aVar2;
                c0698o.T(1073467252);
            }
            c0698o.p(z13);
            c0698o.p(true);
            c0698o.p(true);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new P3.c(list, fVar, aVar, z10, aVar4, aVar3, rVar, i10);
        }
    }

    public static final void b(r rVar, C0698o c0698o, int i10) {
        r rVar2;
        C0698o c0698o2 = c0698o;
        c0698o2.V(73376750);
        int i11 = i10 | (c0698o2.e(R.string.suggested_reminders) ? 4 : 2) | 48;
        if (c0698o2.K(i11 & 1, (i11 & 19) != 18)) {
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o2, 0);
            int i12 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            o oVar = o.f19333a;
            r rVarC = l0.a.c(c0698o2, oVar);
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
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o2, i12, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            String upperCase = p000a.a.m0(R.string.suggested_reminders, c0698o2).toUpperCase(Locale.ROOT);
            p251z9.j.d(upperCase, "toUpperCase(...)");
            AbstractC0542b2.b(upperCase, androidx.compose.foundation.layout.b.h(oVar, 16), ((p005a4.a) c0698o2.k(e.f11187a)).h(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(H2.f8580a)).f8564i, c0698o, 48, 0, 65528);
            c0698o2 = c0698o;
            c0698o2.p(true);
            rVar2 = oVar;
        } else {
            c0698o2.N();
            rVar2 = rVar;
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new b(i10, 0, rVar2);
        }
    }
}
