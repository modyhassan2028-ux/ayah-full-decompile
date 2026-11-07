package A4;

import D.AbstractC0066i;
import D.C0061d;
import D.C0076t;
import D.C0077u;
import D.r;
import J0.C0285h;
import J0.C0287j;
import J0.InterfaceC0288k;
import K9.InterfaceC0402u;
import W.AbstractC0591q;
import W.EnumC0565h1;
import W.P;
import W.T0;
import W.V0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.L0;
import Z.X;
import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.foundation.layout.FillElement;
import com.ayah.feature.audioconfig.AudioConfigWrapper;
import com.ayah.feature.library.edit.view.EditLibraryComposePage;
import com.ayah.feature.library.view.LibraryComposePage;
import com.ayah.feature.reminder.ReminderSettingsActivity;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import j$.time.LocalTime;
import java.text.NumberFormat;
import java.util.List;
import p110k9.y;
import p180s0.F;
import p181s2.s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f511t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f512u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f513v;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f509r = i10;
        this.f511t = obj;
        this.f510s = obj2;
        this.f512u = obj3;
        this.f513v = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v15 */
    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        boolean z10;
        boolean z11;
        C0698o c0698o;
        ?? r10;
        boolean z12;
        boolean z13;
        int i10 = this.f509r;
        Object obj4 = C0690k.f10683a;
        boolean z14 = true;
        y yVar = y.f19095a;
        Object obj5 = this.f513v;
        Object obj6 = this.f512u;
        Object obj7 = this.f510s;
        Object obj8 = this.f511t;
        switch (i10) {
            case 0:
                L0 l10 = (L0) obj8;
                X x9 = (X) obj7;
                AudioConfigWrapper audioConfigWrapper = (AudioConfigWrapper) obj6;
                NumberFormat numberFormat = (NumberFormat) obj5;
                C0698o c0698o2 = (C0698o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i11 = AudioConfigWrapper.f13759u;
                p251z9.j.e((C0077u) obj, "$this$BottomSheetScaffold");
                if (c0698o2.K(iIntValue & 1, (iIntValue & 17) != 16)) {
                    B4.a aVar = (B4.a) p120l9.m.g0((List) l10.getValue());
                    if (aVar != null) {
                        p124m3.j jVar = aVar.f614a;
                        c0698o2.T(-1234377675);
                        if (x9.getValue() == B4.b.f618r) {
                            c0698o2.T(-1234335019);
                            Object objH = c0698o2.H();
                            if (objH == obj4) {
                                objH = new e(numberFormat, 0);
                                c0698o2.e0(objH);
                            }
                            p241y9.c cVar = (p241y9.c) objH;
                            boolean zI = c0698o2.i(audioConfigWrapper);
                            Object objH2 = c0698o2.H();
                            if (zI || objH2 == obj4) {
                                r10 = 0;
                                objH2 = new f(0, audioConfigWrapper);
                                c0698o2.e0(objH2);
                            } else {
                                r10 = 0;
                            }
                            p241y9.f fVar = (p241y9.f) objH2;
                            Object objH3 = c0698o2.H();
                            if (objH3 == obj4) {
                                objH3 = new g(x9, r10);
                                c0698o2.e0(objH3);
                            }
                            D4.k.a(aVar, cVar, fVar, (p241y9.c) objH3, null, c0698o2, 3120);
                            C0698o c0698o3 = c0698o2;
                            c0698o3.p(r10);
                            c0698o = c0698o3;
                            z11 = r10;
                        } else {
                            C0698o c0698o4 = c0698o2;
                            c0698o4.T(-1233848722);
                            p124m3.j jVar2 = x9.getValue() == B4.b.f619s ? jVar : aVar.f615b;
                            C4.i audioConfigPresenter = audioConfigWrapper.getAudioConfigPresenter();
                            int i12 = jVar.f19595m;
                            audioConfigPresenter.getClass();
                            C4.e eVar = new C4.e(new C4.h(audioConfigPresenter, i12, null));
                            int i13 = jVar2.f19585a;
                            boolean zI2 = c0698o4.i(audioConfigWrapper);
                            Object objH4 = c0698o4.H();
                            if (zI2 || objH4 == obj4) {
                                objH4 = new A3.e(3, audioConfigWrapper, x9);
                                c0698o4.e0(objH4);
                            }
                            p241y9.c cVar2 = (p241y9.c) objH4;
                            Object objH5 = c0698o4.H();
                            if (objH5 == obj4) {
                                z10 = false;
                                objH5 = new h(x9, 0);
                                c0698o4.e0(objH5);
                            } else {
                                z10 = false;
                            }
                            D4.k.b(eVar, i13, cVar2, (p241y9.a) objH5, null, c0698o4, 3072);
                            c0698o4.p(z10);
                            c0698o = c0698o4;
                            z11 = z10;
                        }
                        c0698o.p(z11);
                    } else {
                        c0698o2.T(-1233044241);
                        l0.h hVar = l0.c.f19310E;
                        C0061d c0061d = AbstractC0066i.f981e;
                        FillElement fillElement = androidx.compose.foundation.layout.c.f11828c;
                        C0076t c0076tA = r.a(c0061d, hVar, c0698o2, 54);
                        int i14 = c0698o2.f10721P;
                        InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                        l0.r rVarC = l0.a.c(c0698o2, fillElement);
                        InterfaceC0288k.f4142a.getClass();
                        p241y9.a aVar2 = C0287j.f4115b;
                        c0698o2.X();
                        if (c0698o2.f10720O) {
                            c0698o2.l(aVar2);
                        } else {
                            c0698o2.h0();
                        }
                        C0672b.v(c0698o2, c0076tA, C0287j.f4119f);
                        C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                        C0285h c0285h = C0287j.g;
                        if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i14))) {
                            p123m2.c.y(i14, c0698o2, i14, c0285h);
                        }
                        C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                        T0.b(null, ((p005a4.a) c0698o2.k(p005a4.e.f11187a)).l(), 0.0f, 0L, 0, c0698o2, 0, 29);
                        c0698o2.p(true);
                        c0698o2.p(false);
                    }
                } else {
                    c0698o2.N();
                }
                return yVar;
            case 1:
                ReminderSettingsActivity reminderSettingsActivity = (ReminderSettingsActivity) obj8;
                X x10 = (X) obj7;
                X x11 = (X) obj6;
                X x12 = (X) obj5;
                k3.h hVar2 = (k3.h) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                LocalTime localTime = (LocalTime) obj3;
                int i15 = ReminderSettingsActivity.f13864a0;
                p251z9.j.e(hVar2, "reminderIdentifier");
                p251z9.j.e(localTime, "time");
                if (!zBooleanValue) {
                    reminderSettingsActivity.t(hVar2, localTime);
                } else if (N7.f.a((AlarmManager) reminderSettingsActivity.f13866X.getValue())) {
                    if (Build.VERSION.SDK_INT < 33 || s.c(reminderSettingsActivity, "android.permission.POST_NOTIFICATIONS") == 0) {
                        reminderSettingsActivity.t(hVar2, localTime);
                        if (hVar2 instanceof k3.f) {
                            x12.setValue(new p110k9.j(hVar2, localTime));
                        }
                    } else {
                        x10.setValue(hVar2);
                        if (p216w1.b.g(reminderSettingsActivity)) {
                            x11.setValue(Boolean.TRUE);
                        } else {
                            reminderSettingsActivity.f13868Z.S("android.permission.POST_NOTIFICATIONS");
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 31) {
                    reminderSettingsActivity.startActivity(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM"));
                }
                return yVar;
            case 2:
                P p10 = (P) obj8;
                X x13 = (X) obj7;
                Context context = (Context) obj6;
                X x14 = (X) obj5;
                C0698o c0698o5 = (C0698o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = EditLibraryComposePage.f13797v;
                p251z9.j.e((D.P) obj, "it");
                if (c0698o5.K(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zG = c0698o5.g(p10);
                    Object objH6 = c0698o5.H();
                    if (zG || objH6 == obj4) {
                        objH6 = new j(p10, x13, null, 2);
                        c0698o5.e0(objH6);
                    }
                    C0672b.f(c0698o5, yVar, (p241y9.e) objH6);
                    if (((Boolean) x13.getValue()).booleanValue()) {
                        c0698o5.T(-2006083003);
                        EnumC0565h1 enumC0565h1B = p10.f8750a.b();
                        boolean zG2 = c0698o5.g(p10) | c0698o5.i(context);
                        Object objH7 = c0698o5.H();
                        if (zG2 || objH7 == obj4) {
                            objH7 = new l(p10, x14, context, (p150o9.c) null);
                            c0698o5.e0(objH7);
                        }
                        C0672b.f(c0698o5, enumC0565h1B, (p241y9.e) objH7);
                        z12 = false;
                    } else {
                        z12 = false;
                        c0698o5.T(-2010675901);
                    }
                    c0698o5.p(z12);
                    boolean zI3 = c0698o5.i(context);
                    Object objH8 = c0698o5.H();
                    if (zI3 || objH8 == obj4) {
                        objH8 = new A3.e(10, x14, context);
                        c0698o5.e0(objH8);
                    }
                    C0672b.d(yVar, (p241y9.c) objH8, c0698o5);
                } else {
                    c0698o5.N();
                }
                return yVar;
            case 3:
                LibraryComposePage libraryComposePage = (LibraryComposePage) obj8;
                C4.g gVar = (C4.g) obj7;
                InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj6;
                P p11 = (P) obj5;
                C0698o c0698o6 = (C0698o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = LibraryComposePage.f13804x;
                p251z9.j.e((C0077u) obj, "$this$BottomSheetScaffold");
                if (c0698o6.K(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    p107k5.e libraryPagePresenter = libraryComposePage.getLibraryPagePresenter();
                    p106k4.a ayahTextFormatter = libraryComposePage.getAyahTextFormatter();
                    boolean zI4 = c0698o6.i(libraryComposePage);
                    Object objH9 = c0698o6.H();
                    if (zI4 || objH9 == obj4) {
                        Object cVar3 = new E5.c(1, libraryComposePage, LibraryComposePage.class, "jumpToAyah", "jumpToAyah(I)V", 0, 0, 12);
                        c0698o6.e0(cVar3);
                        objH9 = cVar3;
                    }
                    p241y9.c cVar4 = (p241y9.c) ((p251z9.h) objH9);
                    boolean zI5 = c0698o6.i(libraryComposePage);
                    Object objH10 = c0698o6.H();
                    if (zI5 || objH10 == obj4) {
                        objH10 = new E5.a(15, libraryComposePage);
                        c0698o6.e0(objH10);
                    }
                    p241y9.c cVar5 = (p241y9.c) objH10;
                    boolean zI6 = c0698o6.i(interfaceC0402u) | c0698o6.g(p11);
                    Object objH11 = c0698o6.H();
                    if (zI6 || objH11 == obj4) {
                        objH11 = new I4.c(interfaceC0402u, p11, 7);
                        c0698o6.e0(objH11);
                    }
                    p241y9.a aVar3 = (p241y9.a) objH11;
                    boolean zI7 = c0698o6.i(libraryComposePage);
                    Object objH12 = c0698o6.H();
                    if (zI7 || objH12 == obj4) {
                        objH12 = new B3.f(15, libraryComposePage);
                        c0698o6.e0(objH12);
                    }
                    p241y9.a aVar4 = (p241y9.a) objH12;
                    boolean zI8 = c0698o6.i(libraryComposePage);
                    Object objH13 = c0698o6.H();
                    if (zI8 || objH13 == obj4) {
                        Object bVar = new p116l5.b(3, libraryComposePage, LibraryComposePage.class, "shareText", "shareText(Lcom/ayah/common/data/dao/quran/quran/VerseDao;Lcom/ayah/common/data/source/json/model/booklist/BookType;Ljava/util/List;)V", 0, 0, 0);
                        c0698o6.e0(bVar);
                        objH13 = bVar;
                    }
                    p241y9.f fVar2 = (p241y9.f) ((p251z9.h) objH13);
                    boolean zI9 = c0698o6.i(libraryComposePage);
                    Object objH14 = c0698o6.H();
                    if (zI9 || objH14 == obj4) {
                        Object bVar2 = new p116l5.b(3, libraryComposePage, LibraryComposePage.class, "shareImage", "shareImage(Lcom/ayah/common/data/dao/quran/quran/VerseDao;Lcom/ayah/common/data/source/json/model/booklist/BookType;Ljava/util/List;)V", 0, 0, 1);
                        c0698o6.e0(bVar2);
                        objH14 = bVar2;
                    }
                    p026c5.b.a(libraryPagePresenter, gVar, ayahTextFormatter, cVar4, cVar5, aVar3, aVar4, fVar2, (p241y9.f) ((p251z9.h) objH14), androidx.compose.ui.input.nestedscroll.a.a(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f11828c, ((p005a4.a) c0698o6.k(p005a4.e.f11187a)).d(), F.f21774a), K0.P.q(c0698o6), null), c0698o6, 0);
                } else {
                    c0698o6.N();
                }
                return yVar;
            default:
                List list = (List) obj8;
                p241y9.a aVar5 = (p241y9.a) obj7;
                p241y9.c cVar6 = (p241y9.c) obj6;
                p241y9.c cVar7 = (p241y9.c) obj5;
                C0698o c0698o7 = (C0698o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                p251z9.j.e((C0077u) obj, "$this$DropdownMenuFork");
                if (c0698o7.K(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    int i18 = 0;
                    for (Object obj9 : list) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            AbstractC0813f2.T();
                            throw null;
                        }
                        r5.a aVar6 = (r5.a) obj9;
                        boolean z15 = z14;
                        p074h0.d dVarD = p074h0.j.d(1741761118, new I4.a(13, cVar7, aVar6), c0698o7);
                        boolean zG3 = c0698o7.g(aVar5) | c0698o7.g(cVar6) | c0698o7.i(aVar6);
                        Object objH15 = c0698o7.H();
                        if (zG3 || objH15 == obj4) {
                            objH15 = new W4.d(aVar5, cVar6, aVar6, 2);
                            c0698o7.e0(objH15);
                        }
                        AbstractC0591q.b(dVarD, (p241y9.a) objH15, null, p074h0.j.d(1836065378, new G4.m(13, aVar6), c0698o7), false, null, null, c0698o7, 24582, 492);
                        if (i18 < list.size() - 1) {
                            c0698o7.T(670307704);
                            V0.g(null, 0.0f, 0L, c0698o7, 48, 5);
                            z13 = false;
                        } else {
                            z13 = false;
                            c0698o7.T(667399284);
                        }
                        c0698o7.p(z13);
                        i18 = i19;
                        z14 = z15;
                    }
                } else {
                    c0698o7.N();
                }
                return yVar;
        }
    }
}
