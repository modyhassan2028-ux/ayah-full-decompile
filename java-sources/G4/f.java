package G4;

import A.C0040q0;
import E4.u;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import W.C2;
import Z.C0673b0;
import Z.X;
import Z9.o;
import android.text.SpannableStringBuilder;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import com.ayah.feature.navigator.NavigationWrapper;
import com.ayah.feature.reminder.ReminderSettingsActivity;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import j$.time.LocalTime;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import p110k9.y;
import p120l9.s;
import p120l9.w;
import p173r2.A;
import p181s2.q;
import p251z9.v;
import ra.B;
import ra.EnumC1290b;
import ra.p;
import ra.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2818t;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f2816r = i10;
        this.f2817s = obj;
        this.f2818t = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.LinkedHashMap, java.util.Map] */
    @Override // p241y9.a
    public final Object invoke() {
        String[] strArrNames;
        long jA;
        ?? r10 = 0;
        xVarArr = null;
        x[] xVarArr = null;
        switch (this.f2816r) {
            case 0:
                p241y9.c cVar = (p241y9.c) this.f2817s;
                E4.a aVar = (E4.a) this.f2818t;
                cVar.e(new z3.k(aVar.f1846b, aVar.f1847c, aVar.f1845a));
                return y.f19095a;
            case 1:
                X x9 = (X) this.f2817s;
                X x10 = (X) this.f2818t;
                Boolean bool = Boolean.FALSE;
                x9.setValue(bool);
                x10.setValue(bool);
                return y.f19095a;
            case 2:
                ((H4.d) this.f2817s).e((p124m3.j) this.f2818t);
                return y.f19095a;
            case 3:
                ((H4.d) this.f2817s).e((p124m3.d) this.f2818t);
                return y.f19095a;
            case 4:
                ((p241y9.c) this.f2817s).e((u) this.f2818t);
                return y.f19095a;
            case 5:
                ((H4.d) this.f2817s).e(((z3.l) this.f2818t).f24800b);
                return y.f19095a;
            case 6:
                H9.m mVar = (H9.m) this.f2817s;
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f2818t;
                mVar.getClass();
                Matcher matcher = mVar.f3641r.matcher(spannableStringBuilder);
                p251z9.j.d(matcher, "matcher(...)");
                return p000a.a.e(matcher, 0, spannableStringBuilder);
            case 7:
                ((p241y9.c) this.f2817s).e(((N3.b) this.f2818t).f6006f);
                return y.f19095a;
            case 8:
                ((p241y9.c) this.f2817s).e((N3.a) this.f2818t);
                return y.f19095a;
            case 9:
                ((p241y9.c) this.f2817s).e((N3.c) this.f2818t);
                return y.f19095a;
            case 10:
                X x11 = (X) this.f2817s;
                ReminderSettingsActivity reminderSettingsActivity = (ReminderSettingsActivity) this.f2818t;
                int i10 = ReminderSettingsActivity.f13864a0;
                x11.setValue(Boolean.FALSE);
                reminderSettingsActivity.f13868Z.S("android.permission.POST_NOTIFICATIONS");
                return y.f19095a;
            case 11:
                ((p241y9.c) this.f2817s).e((p095j3.a) this.f2818t);
                return y.f19095a;
            case 12:
                p241y9.e eVar = (p241y9.e) this.f2817s;
                p124m3.j jVar = (p124m3.j) this.f2818t;
                eVar.invoke(Integer.valueOf(jVar.f19585a), Integer.valueOf(jVar.c()));
                return y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                ((p241y9.c) this.f2817s).e((String) this.f2818t);
                return y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                ((p241y9.c) this.f2817s).e((p095j3.c) this.f2818t);
                return y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                ((p241y9.e) this.f2817s).invoke((p095j3.c) this.f2818t, null);
                return y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                A a9 = (A) this.f2817s;
                p241y9.a aVar2 = (p241y9.a) this.f2818t;
                Iterator it = p120l9.m.v0(a9.f21412b.f22854f).iterator();
                if (it.hasNext()) {
                    it.next();
                }
                for (Object obj : (G9.a) G9.k.a0(it)) {
                    if (!(((p173r2.j) obj).f21442s instanceof p173r2.x)) {
                        r10 = obj;
                        if (((p173r2.j) r10) == null) {
                            aVar2.invoke();
                        } else {
                            a9.b();
                        }
                        return y.f19095a;
                    }
                }
                if (((p173r2.j) r10) == null) {
                    aVar2.invoke();
                } else {
                    a9.b();
                }
                return y.f19095a;
            case 17:
                InterfaceC0402u interfaceC0402u = (InterfaceC0402u) this.f2817s;
                KhatmahWrapper khatmahWrapper = (KhatmahWrapper) this.f2818t;
                int i11 = KhatmahWrapper.f13794v;
                AbstractC0405x.x(interfaceC0402u, null, new C0040q0(khatmahWrapper, (p150o9.c) r10, 16), 3);
                return y.f19095a;
            case 18:
                ((p241y9.c) this.f2817s).e(((p047e5.b) this.f2818t).f15790b.f19987a);
                return y.f19095a;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                ((p241y9.c) this.f2817s).e(Integer.valueOf(((p047e5.f) this.f2818t).f15809e.f19585a));
                return y.f19095a;
            case 20:
                W9.f fVar = (W9.f) this.f2817s;
                Z9.b bVar = (Z9.b) this.f2818t;
                ?? linkedHashMap = new LinkedHashMap();
                bVar.f11043a.getClass();
                p009aa.i.h(fVar, bVar);
                int iD = fVar.d();
                for (int i12 = 0; i12 < iD; i12++) {
                    List listI = fVar.i(i12);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listI) {
                        if (obj2 instanceof o) {
                            arrayList.add(obj2);
                        }
                    }
                    o oVar = (o) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (oVar != null && (strArrNames = oVar.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = p251z9.j.a(fVar.c(), W9.h.f9678d) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                String str3 = "The suggested name '" + str + "' for " + str2 + ' ' + fVar.e(i12) + " is already one of the names for " + str2 + ' ' + fVar.e(((Number) w.f0(str, linkedHashMap)).intValue()) + " in " + fVar;
                                p251z9.j.e(str3, "message");
                                throw new U9.e(str3);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i12));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? s.f19441r : linkedHashMap;
            case 21:
                p241y9.c cVar2 = (p241y9.c) this.f2817s;
                C2 c10 = (C2) this.f2818t;
                LocalTime localTimeOf = LocalTime.of(c10.f(), c10.g());
                p251z9.j.d(localTimeOf, "of(...)");
                cVar2.e(localTimeOf);
                return y.f19095a;
            case 22:
                ((p241y9.c) this.f2817s).e((p048e6.b) this.f2818t);
                return y.f19095a;
            case 23:
                NavigationWrapper navigationWrapper = (NavigationWrapper) this.f2817s;
                r5.b bVar2 = (r5.b) this.f2818t;
                int i13 = NavigationWrapper.f13816u;
                navigationWrapper.getNavigationPresenter().a(bVar2.f21571b);
                return y.f19095a;
            case 24:
                p pVar = (p) this.f2817s;
                x xVar = (x) this.f2818t;
                try {
                    pVar.f21711r.b(xVar);
                    break;
                } catch (IOException e10) {
                    ua.e eVar2 = ua.e.f22996a;
                    ua.e.f22996a.j("Http2Connection.Listener failure for " + pVar.f21713t, 4, e10);
                    try {
                        xVar.c(EnumC1290b.PROTOCOL_ERROR, e10);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return y.f19095a;
            case 25:
                ra.o oVar2 = (ra.o) this.f2817s;
                B b5 = (B) this.f2818t;
                v vVar = new v();
                p pVar2 = oVar2.f21694s;
                synchronized (pVar2.f21708N) {
                    synchronized (pVar2) {
                        try {
                            B b10 = pVar2.f21703I;
                            B b11 = new B();
                            b11.b(b10);
                            b11.b(b5);
                            vVar.f24886r = b11;
                            jA = ((long) b11.a()) - ((long) b10.a());
                            if (jA != 0 && !pVar2.f21712s.isEmpty()) {
                                xVarArr = (x[]) pVar2.f21712s.values().toArray(new x[0]);
                            }
                            B b12 = (B) vVar.f24886r;
                            p251z9.j.e(b12, "<set-?>");
                            pVar2.f21703I = b12;
                            na.c.c(pVar2.f21695A, pVar2.f21713t + " onSettings", new f(26, pVar2, vVar));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        pVar2.f21708N.b((B) vVar.f24886r);
                    } catch (IOException e11) {
                        EnumC1290b enumC1290b = EnumC1290b.PROTOCOL_ERROR;
                        pVar2.b(enumC1290b, enumC1290b, e11);
                    }
                    break;
                }
                if (xVarArr != null) {
                    for (x xVar2 : xVarArr) {
                        synchronized (xVar2) {
                            xVar2.f21752e += jA;
                            if (jA > 0) {
                                xVar2.notifyAll();
                            }
                            break;
                        }
                    }
                }
                return y.f19095a;
            case 26:
                p pVar3 = (p) this.f2817s;
                pVar3.f21711r.a(pVar3, (B) ((v) this.f2818t).f24886r);
                return y.f19095a;
            case 27:
                ((q) this.f2817s).e((p173r2.j) this.f2818t, false);
                return y.f19095a;
            case 28:
                ((p241y9.c) this.f2817s).e(Float.valueOf(((C0673b0) this.f2818t).g()));
                return y.f19095a;
            default:
                p241y9.e eVar3 = (p241y9.e) this.f2817s;
                p210v5.a aVar3 = (p210v5.a) this.f2818t;
                eVar3.invoke(Integer.valueOf(aVar3.f23336a), Integer.valueOf(aVar3.f23339d));
                return y.f19095a;
        }
    }
}
