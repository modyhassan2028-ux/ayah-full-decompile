package G4;

import D.AbstractC0060c;
import D.AbstractC0066i;
import D.C0061d;
import D.U;
import D.W;
import D0.u;
import F2.t;
import H9.o;
import H9.v;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K9.InterfaceC0392j;
import K9.a0;
import K9.h0;
import K9.r;
import W.AbstractC0542b2;
import W.C0;
import W.G2;
import W.H2;
import W.V0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.M0;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.ayah.R;
import com.ayah.feature.navigator.NavigationWrapper;
import com.ayah.feature.reminder.ReminderSettingsActivity;
import io.realm.RealmFieldTypeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import p110k9.y;
import p151p.C1256n;
import p180s0.L;
import p180s0.q;
import p224x0.C1441e;
import p224x0.C1442f;
import p224x0.G;
import p251z9.s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2853r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2854s;

    public /* synthetic */ m(int i10, int i11, Object obj) {
        this.f2853r = i11;
        this.f2854s = obj;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:149:0x044e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x0450 A[LOOP:3: B:139:0x0420->B:150:0x0450, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x0444 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0313  */
    /* JADX WARN: Code duplicated, block: B:89:0x0327 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x032e  */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x032e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        String strM0;
        Object next;
        String str;
        p110k9.j jVar;
        String str2;
        boolean z10;
        Object next2;
        int i10 = this.f2853r;
        a0 a0Var = null;
        int i11 = 2;
        y yVar = y.f19095a;
        Object obj3 = this.f2854s;
        switch (i10) {
            case 0:
                E4.a aVar = (E4.a) obj3;
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (aVar.f1850f) {
                        c0698o.T(-524524963);
                        strM0 = p000a.a.m0(R.string.mark_as_unstarred, c0698o);
                        c0698o.p(false);
                    } else {
                        c0698o.T(-524450625);
                        strM0 = p000a.a.m0(R.string.mark_as_starred, c0698o);
                        c0698o.p(false);
                    }
                    String str3 = strM0;
                    if (aVar.f1850f) {
                        c0698o.T(-524339490);
                        C1442f c1442fB = p017b7.g.f13325c;
                        if (c1442fB == null) {
                            C1441e c1441e = new C1441e("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i12 = G.f24154a;
                            L l10 = new L(q.f21839b);
                            C1256n c1256n = new C1256n(13);
                            c1256n.j(12.0f, 17.27f);
                            c1256n.e(18.18f, 21.0f);
                            c1256n.f(-1.64f, -7.03f);
                            c1256n.e(22.0f, 9.24f);
                            c1256n.f(-7.19f, -0.61f);
                            c1256n.e(12.0f, 2.0f);
                            c1256n.e(9.19f, 8.63f);
                            c1256n.e(2.0f, 9.24f);
                            c1256n.f(5.46f, 4.73f);
                            c1256n.e(5.82f, 21.0f);
                            c1256n.a();
                            C1441e.a(c1441e, (ArrayList) c1256n.f20747s, l10);
                            c1442fB = c1441e.b();
                            p017b7.g.f13325c = c1442fB;
                        }
                        C0.b(c1442fB, str3, null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).l(), c0698o, 0, 4);
                        c0698o.p(false);
                    } else {
                        c0698o.T(-524169579);
                        C0.a(F9.n.M(2131230938, c0698o), str3, null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).l(), c0698o, 0, 4);
                        c0698o.p(false);
                    }
                } else {
                    c0698o.N();
                }
                return yVar;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                p251z9.j.e(charSequence, "$this$DelimitedRangesSequence");
                int iD1 = o.d1(charSequence, (char[]) obj3, iIntValue2, false);
                if (iD1 < 0) {
                    return null;
                }
                return new p110k9.j(Integer.valueOf(iD1), 1);
            case 2:
                List list = (List) obj3;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                p251z9.j.e(charSequence2, "$this$DelimitedRangesSequence");
                if (list.size() == 1) {
                    String str4 = (String) p120l9.m.w0(list);
                    int iC1 = o.c1(charSequence2, str4, iIntValue3, 4);
                    if (iC1 < 0) {
                        jVar = null;
                    } else {
                        jVar = new p110k9.j(Integer.valueOf(iC1), str4);
                    }
                } else {
                    int i13 = iIntValue3 >= 0 ? iIntValue3 : 0;
                    E9.d dVar = new E9.d(i13, charSequence2.length(), 1);
                    boolean z11 = charSequence2 instanceof String;
                    boolean z12 = false;
                    int i14 = dVar.f1997t;
                    int i15 = dVar.f1996s;
                    if (z11) {
                        if ((i14 <= 0 || i13 > i15) && (i14 >= 0 || i15 > i13)) {
                            jVar = null;
                        } else {
                            int i16 = i13;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str5 = (String) next2;
                                        z10 = z12;
                                        if (!v.N0(0, i16, str5.length(), str5, (String) charSequence2, z10)) {
                                            z12 = z10;
                                        }
                                    } else {
                                        z10 = z12;
                                        next2 = null;
                                    }
                                }
                                String str6 = (String) next2;
                                if (str6 != null) {
                                    jVar = new p110k9.j(Integer.valueOf(i16), str6);
                                } else if (i16 != i15) {
                                    i16 += i14;
                                    z12 = z10;
                                } else {
                                    jVar = null;
                                }
                            }
                        }
                    } else if ((i14 <= 0 || i13 > i15) && (i14 >= 0 || i15 > i13)) {
                        jVar = null;
                    } else {
                        int i17 = i13;
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    jVar = new p110k9.j(Integer.valueOf(i17), str);
                                } else if (i17 != i15) {
                                    i17 += i14;
                                } else {
                                    jVar = null;
                                }
                            } while (!o.i1(str2, 0, charSequence2, i17, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                jVar = new p110k9.j(Integer.valueOf(i17), str);
                            } else if (i17 != i15) {
                                i17 += i14;
                            } else {
                                jVar = null;
                            }
                        }
                    }
                }
                if (jVar != null) {
                    return new p110k9.j(jVar.f19077r, Integer.valueOf(((String) jVar.f19078s).length()));
                }
                return null;
            case 3:
                s sVar = (s) obj3;
                D0.v vVar = (D0.v) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                if (!p171r0.c.b(u.g(vVar, false), 0L)) {
                    vVar.a();
                }
                sVar.f24883r = fFloatValue;
                return yVar;
            case 4:
                int iIntValue4 = ((Integer) obj).intValue();
                p150o9.f fVar = (p150o9.f) obj2;
                p150o9.g key = fVar.getKey();
                p150o9.f fVarI = ((O9.s) obj3).f6557s.i(key);
                if (key == r.f5392s) {
                    a0 a0Var2 = (a0) fVarI;
                    a0 parent = (a0) fVar;
                    while (parent != null) {
                        if (parent != a0Var2 && (parent instanceof P9.q)) {
                            InterfaceC0392j interfaceC0392j = (InterfaceC0392j) h0.f5372s.get((P9.q) parent);
                            parent = interfaceC0392j != null ? interfaceC0392j.getParent() : null;
                        } else {
                            a0Var = parent;
                            if (a0Var == a0Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + a0Var + ", expected child of " + a0Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (a0Var2 != null) {
                                iIntValue4++;
                            }
                        }
                    }
                    if (a0Var == a0Var2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + a0Var + ", expected child of " + a0Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (a0Var2 != null) {
                        iIntValue4++;
                    }
                } else if (fVar != fVarI) {
                    iIntValue4 = Integer.MIN_VALUE;
                } else {
                    iIntValue4++;
                }
                return Integer.valueOf(iIntValue4);
            case 5:
                ReminderSettingsActivity reminderSettingsActivity = (ReminderSettingsActivity) obj3;
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i18 = ReminderSettingsActivity.f13864a0;
                if (c0698o2.K(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    L5.c cVarS = reminderSettingsActivity.s();
                    p208v3.c cVar = (p208v3.c) cVarS.f5532s;
                    p005a4.e.a(false, p074h0.j.d(-1760428138, new I4.a(i11, reminderSettingsActivity, C0672b.k(new C4.g(new C4.g(cVar.f23329a.f4265f, cVar, 25), cVarS, 12), p120l9.r.f19440r, null, c0698o2, 48, 2)), c0698o2), c0698o2, 48);
                } else {
                    c0698o2.N();
                }
                return yVar;
            case 6:
                p095j3.c cVar2 = (p095j3.c) obj;
                p251z9.j.e(cVar2, "khatmahPlan");
                ((p241y9.e) obj3).invoke(cVar2, (p095j3.b) obj2);
                return yVar;
            case 7:
                ((Integer) obj2).getClass();
                p068g6.b.e((p124m3.j) obj3, (C0698o) obj, C0672b.y(1));
                return yVar;
            case 8:
                ((Integer) obj2).getClass();
                p068g6.b.d((SpannableStringBuilder) obj3, (C0698o) obj, C0672b.y(1));
                return yVar;
            case 9:
                p136n5.e eVar = (p136n5.e) obj3;
                C0698o c0698o3 = (C0698o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c0698o3.K(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    C0061d c0061d = AbstractC0066i.g;
                    l0.i iVar = l0.c.f19307B;
                    l0.r rVarJ = androidx.compose.foundation.layout.b.j(androidx.compose.foundation.layout.c.f11826a, 16, 0.0f, 2);
                    W wA = U.a(c0061d, iVar, c0698o3, 54);
                    int i19 = c0698o3.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o3.m();
                    l0.r rVarC = l0.a.c(c0698o3, rVarJ);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o3.X();
                    if (c0698o3.f10720O) {
                        c0698o3.l(c0286i);
                    } else {
                        c0698o3.h0();
                    }
                    C0672b.v(c0698o3, wA, C0287j.f4119f);
                    C0672b.v(c0698o3, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o3.f10720O || !p251z9.j.a(c0698o3.H(), Integer.valueOf(i19))) {
                        p123m2.c.y(i19, c0698o3, i19, c0285h);
                    }
                    C0672b.v(c0698o3, rVarC, C0287j.f4117d);
                    boolean zI = c0698o3.i(eVar);
                    Object objH = c0698o3.H();
                    if (zI || objH == C0690k.f10683a) {
                        t tVar = new t(0, eVar, p136n5.e.class, "onSettingsPressed", "onSettingsPressed()V", 0, 0, 14);
                        c0698o3.e0(tVar);
                        objH = tVar;
                    }
                    p241y9.a aVar2 = (p241y9.a) ((p251z9.h) objH);
                    float f3 = 52;
                    l0.o oVar = l0.o.f19333a;
                    V0.h(aVar2, androidx.compose.foundation.layout.c.n(oVar, f3), false, null, p157p5.c.f20996f, c0698o3, 196656, 28);
                    p215w0.b bVarM = F9.n.M(2131230937, c0698o3);
                    String strM1 = p000a.a.m0(R.string.previous_verse, c0698o3);
                    M0 m10 = p005a4.e.f11187a;
                    C0.a(bVarM, strM1, androidx.compose.foundation.layout.c.n(oVar, f3), ((p005a4.a) c0698o3.k(m10)).c(), c0698o3, 384, 0);
                    C0.a(F9.n.M(2131230927, c0698o3), p000a.a.m0(R.string.play, c0698o3), androidx.compose.foundation.layout.c.n(oVar, f3), ((p005a4.a) c0698o3.k(m10)).c(), c0698o3, 384, 0);
                    C0.a(F9.n.M(2131230936, c0698o3), p000a.a.m0(R.string.next_verse, c0698o3), androidx.compose.foundation.layout.c.n(oVar, f3), ((p005a4.a) c0698o3.k(m10)).c(), c0698o3, 384, 0);
                    AbstractC0060c.a(c0698o3, androidx.compose.foundation.layout.c.n(oVar, f3));
                    c0698o3.p(true);
                } else {
                    c0698o3.N();
                }
                return yVar;
            case 10:
                String str7 = (String) obj;
                String str8 = (String) obj2;
                p251z9.j.e(str7, "key");
                p251z9.j.e(str8, "value");
                ((Bundle) obj3).putString(str7, str8);
                return yVar;
            case 11:
                NavigationWrapper navigationWrapper = (NavigationWrapper) obj3;
                C0698o c0698o4 = (C0698o) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i20 = NavigationWrapper.f13816u;
                if (c0698o4.K(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p005a4.e.a(false, p074h0.j.d(726524425, new I4.a(10, navigationWrapper, p125m4.b.f19615b), c0698o4), c0698o4, 48);
                } else {
                    c0698o4.N();
                }
                return yVar;
            case 12:
                ((Integer) obj2).getClass();
                p181s2.o.a((p181s2.q) obj3, (C0698o) obj, C0672b.y(1));
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                r5.a aVar3 = (r5.a) obj3;
                C0698o c0698o5 = (C0698o) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c0698o5.K(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    if (aVar3.f21569c != null) {
                        c0698o5.T(1815211970);
                        C0.a(F9.n.M(2131230843, c0698o5), null, null, B9.a.j(p017b7.g.K(aVar3.f21569c.f16444a.f16442c).f5681r, c0698o5), c0698o5, 48, 4);
                    } else {
                        c0698o5.T(1812599104);
                    }
                    c0698o5.p(false);
                } else {
                    c0698o5.N();
                }
                return yVar;
            default:
                p210v5.a aVar4 = (p210v5.a) obj3;
                C0698o c0698o6 = (C0698o) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c0698o6.K(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    AbstractC0542b2.b(aVar4.f23340e, androidx.compose.foundation.layout.b.l(l0.o.f19333a, 0.0f, 0.0f, 0.0f, 8, 7), ((p005a4.a) c0698o6.k(p005a4.e.f11187a)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o6.k(H2.f8580a)).j, c0698o6, 48, 0, 65528);
                } else {
                    c0698o6.N();
                }
                return yVar;
        }
    }

    public /* synthetic */ m(int i10, Object obj) {
        this.f2853r = i10;
        this.f2854s = obj;
    }
}
