package p026c5;

import F9.n;
import N9.b0;
import U0.L;
import W.AbstractC0542b2;
import W.C0;
import W.G2;
import W.H2;
import Y0.l;
import Z.C0690k;
import Z.C0698o;
import Z.S;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.c;
import com.ayah.R;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.B1;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import l0.o;
import p110k9.y;
import p120l9.k;
import p120l9.w;
import p150o9.b;
import p150o9.d;
import p150o9.f;
import p150o9.h;
import p150o9.i;
import p151p.C1256n;
import p173r2.A;
import p180s0.q;
import p224x0.C1441e;
import p224x0.C1442f;
import p224x0.G;
import p241y9.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f13464r;

    public /* synthetic */ a(int i10) {
        this.f13464r = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        b bVar;
        Bundle bundleP;
        int i10 = this.f13464r;
        o oVar = o.f19333a;
        y yVar = y.f19095a;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0542b2.b(p000a.a.m0(R.string.library, c0698o), null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).m(), 0L, l.f10360u, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(H2.f8580a)).f8562f, c0698o, 196608, 0, 65498);
                } else {
                    c0698o.N();
                }
                return yVar;
            case 1:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C0.b(Y2.a.A(), p000a.a.m0(R.string.close, c0698o2), null, ((p005a4.a) c0698o2.k(p005a4.e.f11187a)).l(), c0698o2, 0, 4);
                } else {
                    c0698o2.N();
                }
                return yVar;
            case 2:
                C0698o c0698o3 = (C0698o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c0698o3.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String upperCase = p000a.a.m0(R.string.edit, c0698o3).toUpperCase(Locale.ROOT);
                    j.d(upperCase, "toUpperCase(...)");
                    AbstractC0542b2.b(upperCase, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, L.a(((G2) c0698o3.k(H2.f8580a)).j, ((p005a4.a) c0698o3.k(p005a4.e.f11187a)).l(), n.B(14), l.f10360u, null, 0L, 0L, null, 16777208), c0698o3, 0, 0, 65534);
                } else {
                    c0698o3.N();
                }
                return yVar;
            case 3:
                C0698o c0698o4 = (C0698o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c0698o4.K(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C0.b(B1.A(), p000a.a.m0(R.string.previous_ayah, c0698o4), c.j(oVar, 24), ((p005a4.a) c0698o4.k(p005a4.e.f11187a)).l(), c0698o4, 384, 0);
                } else {
                    c0698o4.N();
                }
                return yVar;
            case 4:
                C0698o c0698o5 = (C0698o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c0698o5.K(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C1442f c1442fB = AbstractC0813f2.f14244r;
                    if (c1442fB == null) {
                        C1441e c1441e = new C1441e("AutoMirrored.Filled.ArrowForward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i11 = G.f24154a;
                        p180s0.L l10 = new p180s0.L(q.f21839b);
                        C1256n c1256n = new C1256n(13);
                        ArrayList arrayList = (ArrayList) c1256n.f20747s;
                        c1256n.j(12.0f, 4.0f);
                        c1256n.f(-1.41f, 1.41f);
                        c1256n.e(16.17f, 11.0f);
                        arrayList.add(new p224x0.l(4.0f));
                        c1256n.o(2.0f);
                        c1256n.d(12.17f);
                        c1256n.f(-5.58f, 5.59f);
                        c1256n.e(12.0f, 20.0f);
                        c1256n.f(8.0f, -8.0f);
                        c1256n.a();
                        C1441e.a(c1441e, arrayList, l10);
                        c1442fB = c1441e.b();
                        AbstractC0813f2.f14244r = c1442fB;
                    }
                    C0.b(c1442fB, p000a.a.m0(R.string.next_ayah, c0698o5), c.j(oVar, 24), ((p005a4.a) c0698o5.k(p005a4.e.f11187a)).l(), c0698o5, 384, 0);
                } else {
                    c0698o5.N();
                }
                return yVar;
            case 5:
                int iIntValue6 = ((Integer) obj).intValue();
                p047e5.j jVar = (p047e5.j) obj2;
                j.e(jVar, "item");
                return jVar.a() + "_" + iIntValue6;
            case 6:
                C0698o c0698o6 = (C0698o) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c0698o6.K(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    AbstractC0542b2.b(p000a.a.m0(R.string.edit_library, c0698o6), null, ((p005a4.a) c0698o6.k(p005a4.e.f11187a)).m(), 0L, l.f10360u, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o6.k(H2.f8580a)).f8562f, c0698o6, 196608, 0, 65498);
                } else {
                    c0698o6.N();
                }
                return yVar;
            case 7:
                C0698o c0698o7 = (C0698o) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c0698o7.K(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    C0.b(Y2.a.A(), p000a.a.m0(R.string.close, c0698o7), null, ((p005a4.a) c0698o7.k(p005a4.e.f11187a)).l(), c0698o7, 0, 4);
                } else {
                    c0698o7.N();
                }
                return yVar;
            case 8:
                C0698o c0698o8 = (C0698o) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c0698o8.K(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    C1442f c1442fB2 = Y2.a.f10376b;
                    if (c1442fB2 == null) {
                        C1441e c1441e2 = new C1441e("Outlined.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = G.f24154a;
                        p180s0.L l11 = new p180s0.L(q.f21839b);
                        C1256n c1256n2 = new C1256n(13);
                        c1256n2.j(18.0f, 16.08f);
                        c1256n2.c(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
                        c1256n2.e(8.91f, 12.7f);
                        c1256n2.c(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
                        c1256n2.m(-0.04f, -0.47f, -0.09f, -0.7f);
                        c1256n2.f(7.05f, -4.11f);
                        c1256n2.c(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
                        c1256n2.c(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                        c1256n2.m(-1.34f, -3.0f, -3.0f, -3.0f);
                        c1256n2.m(-3.0f, 1.34f, -3.0f, 3.0f);
                        c1256n2.c(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
                        c1256n2.e(8.04f, 9.81f);
                        c1256n2.b(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
                        c1256n2.c(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                        c1256n2.m(1.34f, 3.0f, 3.0f, 3.0f);
                        c1256n2.c(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
                        c1256n2.f(7.12f, 4.16f);
                        c1256n2.c(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
                        c1256n2.c(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
                        c1256n2.m(2.92f, -1.31f, 2.92f, -2.92f);
                        c1256n2.c(0.0f, -1.61f, -1.31f, -2.92f, -2.92f, -2.92f);
                        c1256n2.a();
                        c1256n2.j(18.0f, 4.0f);
                        c1256n2.c(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                        c1256n2.m(-0.45f, 1.0f, -1.0f, 1.0f);
                        c1256n2.m(-1.0f, -0.45f, -1.0f, -1.0f);
                        c1256n2.m(0.45f, -1.0f, 1.0f, -1.0f);
                        c1256n2.a();
                        c1256n2.j(6.0f, 13.0f);
                        c1256n2.c(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        c1256n2.m(0.45f, -1.0f, 1.0f, -1.0f);
                        c1256n2.m(1.0f, 0.45f, 1.0f, 1.0f);
                        c1256n2.m(-0.45f, 1.0f, -1.0f, 1.0f);
                        c1256n2.a();
                        c1256n2.j(18.0f, 20.02f);
                        c1256n2.c(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        c1256n2.m(0.45f, -1.0f, 1.0f, -1.0f);
                        c1256n2.m(1.0f, 0.45f, 1.0f, 1.0f);
                        c1256n2.m(-0.45f, 1.0f, -1.0f, 1.0f);
                        c1256n2.a();
                        C1441e.a(c1441e2, (ArrayList) c1256n2.f20747s, l11);
                        c1442fB2 = c1441e2.b();
                        Y2.a.f10376b = c1442fB2;
                    }
                    C0.b(c1442fB2, "", null, ((p005a4.a) c0698o8.k(p005a4.e.f11187a)).l(), c0698o8, 48, 4);
                } else {
                    c0698o8.N();
                }
                return yVar;
            case 9:
                C0698o c0698o9 = (C0698o) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c0698o9.K(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    C1442f c1442fB3 = n.f2554d;
                    if (c1442fB3 == null) {
                        C1441e c1441e3 = new C1441e("Filled.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = G.f24154a;
                        p180s0.L l12 = new p180s0.L(q.f21839b);
                        C1256n c1256n3 = new C1256n(13);
                        c1256n3.j(19.0f, 6.41f);
                        c1256n3.e(17.59f, 5.0f);
                        c1256n3.e(12.0f, 10.59f);
                        c1256n3.e(6.41f, 5.0f);
                        c1256n3.e(5.0f, 6.41f);
                        c1256n3.e(10.59f, 12.0f);
                        c1256n3.e(5.0f, 17.59f);
                        c1256n3.e(6.41f, 19.0f);
                        c1256n3.e(12.0f, 13.41f);
                        c1256n3.e(17.59f, 19.0f);
                        c1256n3.e(19.0f, 17.59f);
                        c1256n3.e(13.41f, 12.0f);
                        c1256n3.a();
                        C1441e.a(c1441e3, (ArrayList) c1256n3.f20747s, l12);
                        c1442fB3 = c1441e3.b();
                        n.f2554d = c1442fB3;
                    }
                    C0.b(c1442fB3, p000a.a.m0(R.string.close_sheet, c0698o9), null, ((p005a4.a) c0698o9.k(p005a4.e.f11187a)).l(), c0698o9, 0, 4);
                } else {
                    c0698o9.N();
                }
                return yVar;
            case 10:
                String str = (String) obj;
                f fVar = (f) obj2;
                j.e(str, "acc");
                j.e(fVar, "element");
                if (str.length() == 0) {
                    return fVar.toString();
                }
                return str + ", " + fVar;
            case 11:
                h hVar = (h) obj;
                f fVar2 = (f) obj2;
                j.e(hVar, "acc");
                j.e(fVar2, "element");
                h hVarA = hVar.A(fVar2.getKey());
                i iVar = i.f20380r;
                if (hVarA == iVar) {
                    return fVar2;
                }
                d dVar = d.f20379r;
                p150o9.e eVar = (p150o9.e) hVarA.i(dVar);
                if (eVar == null) {
                    bVar = new b(fVar2, hVarA);
                } else {
                    h hVarA2 = hVarA.A(dVar);
                    if (hVarA2 == iVar) {
                        return new b(eVar, fVar2);
                    }
                    bVar = new b(eVar, new b(fVar2, hVarA2));
                }
                return bVar;
            case 12:
                C0698o c0698o10 = (C0698o) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c0698o10.K(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    C0.a(n.M(2131230910, c0698o10), p000a.a.m0(R.string.playback_options, c0698o10), null, ((p005a4.a) c0698o10.k(p005a4.e.f11187a)).l(), c0698o10, 0, 4);
                } else {
                    c0698o10.N();
                }
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                C0698o c0698o11 = (C0698o) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c0698o11.K(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    C0.a(n.M(2131230937, c0698o11), p000a.a.m0(R.string.previous_verse, c0698o11), null, ((p005a4.a) c0698o11.k(p005a4.e.f11187a)).l(), c0698o11, 0, 4);
                } else {
                    c0698o11.N();
                }
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                C0698o c0698o12 = (C0698o) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c0698o12.K(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    C0.a(n.M(2131230926, c0698o12), p000a.a.m0(R.string.pause, c0698o12), null, ((p005a4.a) c0698o12.k(p005a4.e.f11187a)).l(), c0698o12, 0, 4);
                } else {
                    c0698o12.N();
                }
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                C0698o c0698o13 = (C0698o) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c0698o13.K(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    C0.a(n.M(2131230927, c0698o13), p000a.a.m0(R.string.play, c0698o13), null, ((p005a4.a) c0698o13.k(p005a4.e.f11187a)).l(), c0698o13, 0, 4);
                } else {
                    c0698o13.N();
                }
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                C0698o c0698o14 = (C0698o) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (c0698o14.K(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    C0.a(n.M(2131230936, c0698o14), p000a.a.m0(R.string.next_verse, c0698o14), null, ((p005a4.a) c0698o14.k(p005a4.e.f11187a)).l(), c0698o14, 0, 4);
                } else {
                    c0698o14.N();
                }
                return yVar;
            case 17:
                C0698o c0698o15 = (C0698o) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (c0698o15.K(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    C0.a(n.M(2131230910, c0698o15), p000a.a.m0(R.string.playback_options, c0698o15), null, ((p005a4.a) c0698o15.k(p005a4.e.f11187a)).l(), c0698o15, 0, 4);
                } else {
                    c0698o15.N();
                }
                return yVar;
            case 18:
                C0698o c0698o16 = (C0698o) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (c0698o16.K(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    C0.a(n.M(2131230928, c0698o16), p000a.a.m0(R.string.play, c0698o16), null, ((p005a4.a) c0698o16.k(p005a4.e.f11187a)).l(), c0698o16, 0, 4);
                } else {
                    c0698o16.N();
                }
                return yVar;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                C0698o c0698o17 = (C0698o) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (c0698o17.K(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    Object objH = c0698o17.H();
                    S s10 = C0690k.f10683a;
                    if (objH == s10) {
                        objH = new Ba.b(3);
                        c0698o17.e0(objH);
                    }
                    p241y9.a aVar = (p241y9.a) objH;
                    Object objH2 = c0698o17.H();
                    if (objH2 == s10) {
                        objH2 = new Ba.b(3);
                        c0698o17.e0(objH2);
                    }
                    p157p5.c.d("محمد المنشاوي", aVar, (p241y9.a) objH2, c0698o17, 438);
                } else {
                    c0698o17.N();
                }
                return yVar;
            case 20:
                C0698o c0698o18 = (C0698o) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (c0698o18.K(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    C0.a(n.M(2131230904, c0698o18), p000a.a.m0(R.string.stop_audio, c0698o18), null, ((p005a4.a) c0698o18.k(p005a4.e.f11187a)).h(), c0698o18, 0, 4);
                } else {
                    c0698o18.N();
                }
                return yVar;
            case 21:
                A a9 = (A) obj2;
                p197u2.h hVar2 = a9.f21412b;
                LinkedHashMap linkedHashMap = hVar2.f22859m;
                k<p173r2.j> kVar = hVar2.f22854f;
                LinkedHashMap linkedHashMap2 = hVar2.f22858l;
                ArrayList arrayList2 = new ArrayList();
                Bundle bundleP2 = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                for (Map.Entry entry : w.k0(hVar2.f22865s.f21434a).entrySet()) {
                    ((p173r2.G) entry.getValue()).getClass();
                }
                if (arrayList2.isEmpty()) {
                    bundleP = null;
                } else {
                    bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                    Y2.a.d0(bundleP2, "android-support-nav:controller:navigatorState:names", arrayList2);
                    Y2.a.b0(bundleP, "android-support-nav:controller:navigatorState", bundleP2);
                }
                if (!kVar.isEmpty()) {
                    if (bundleP == null) {
                        bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    for (p173r2.j jVar2 : kVar) {
                        j.e(jVar2, "entry");
                        int i14 = jVar2.f21442s.f21493s.f1641a;
                        String str2 = jVar2.f21446w;
                        p197u2.d dVar2 = jVar2.f21448y;
                        Bundle bundleA = dVar2.a();
                        Bundle bundleP3 = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                        dVar2.f22832h.J(bundleP3);
                        Bundle bundleP4 = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                        Y2.a.c0("nav-entry-state:id", str2, bundleP4);
                        bundleP4.putInt("nav-entry-state:destination-id", i14);
                        if (bundleA == null) {
                            bundleA = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                        }
                        Y2.a.b0(bundleP4, "nav-entry-state:args", bundleA);
                        Y2.a.b0(bundleP4, "nav-entry-state:saved-state", bundleP3);
                        arrayList3.add(bundleP4);
                    }
                    bundleP.putParcelableArrayList("android-support-nav:controller:backStack", arrayList3);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundleP == null) {
                        bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList4 = new ArrayList();
                    int i15 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int iIntValue20 = ((Number) entry2.getKey()).intValue();
                        String str3 = (String) entry2.getValue();
                        int i16 = i15 + 1;
                        iArr[i15] = iIntValue20;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList4.add(str3);
                        i15 = i16;
                    }
                    bundleP.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    Y2.a.d0(bundleP, "android-support-nav:controller:backStackIds", arrayList4);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundleP == null) {
                        bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        k kVar2 = (k) entry3.getValue();
                        arrayList5.add(str4);
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        Iterator it = kVar2.iterator();
                        while (it.hasNext()) {
                            b0 b0Var = ((p173r2.k) it.next()).f21449a;
                            b0Var.getClass();
                            Bundle bundleP5 = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                            Y2.a.c0("nav-entry-state:id", (String) b0Var.f6165b, bundleP5);
                            bundleP5.putInt("nav-entry-state:destination-id", b0Var.f6164a);
                            Bundle bundleP6 = (Bundle) b0Var.f6166c;
                            if (bundleP6 == null) {
                                bundleP6 = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                            }
                            Y2.a.b0(bundleP5, "nav-entry-state:args", bundleP6);
                            Y2.a.b0(bundleP5, "nav-entry-state:saved-state", (Bundle) b0Var.f6167d);
                            arrayList6.add(bundleP5);
                        }
                        String str5 = "android-support-nav:controller:backStackStates:" + str4;
                        j.e(str5, "key");
                        bundleP.putParcelableArrayList(str5, arrayList6);
                    }
                    Y2.a.d0(bundleP, "android-support-nav:controller:backStackStates", arrayList5);
                }
                if (a9.f21415e) {
                    if (bundleP == null) {
                        bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                    }
                    bundleP.putBoolean("android-support-nav:controller:deepLinkHandled", a9.f21415e);
                }
                return bundleP;
            default:
                C0698o c0698o19 = (C0698o) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (c0698o19.K(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    C0.a(n.M(2131230925, c0698o19), null, c.n(oVar, 56), ((p005a4.a) c0698o19.k(p005a4.e.f11187a)).l(), c0698o19, 432, 0);
                } else {
                    c0698o19.N();
                }
                return yVar;
        }
    }
}
