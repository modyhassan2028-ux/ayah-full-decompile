package com.google.android.gms.internal.measurement;

import D.AbstractC0066i;
import D.AbstractC0071n;
import D.U;
import D.W;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import W.AbstractC0542b2;
import W.C0585o;
import Z.C0672b;
import Z.C0690k;
import Z.C0694m;
import Z.C0695m0;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0674c;
import Z.InterfaceC0687i0;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.InputEvent;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.datastore.preferences.protobuf.C0733g;
import com.ayah.R;
import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.ChapterHeader;
import com.ayah.dao.realm.model.quran.Page;
import com.ayah.dao.realm.model.quran.PageHeader;
import com.ayah.dao.realm.model.quran.Verse;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import io.realm.RealmFieldTypeConstants;
import io.realm.RealmList;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import l0.o;
import l0.r;
import p110k9.y;
import p123m2.c;
import p196u0.d;
import p224x0.C1442f;
import p251z9.j;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0813f2 implements W0.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static C1442f f14244r;

    public static long A(int i10, int i11, int i12, int i13) {
        int i14 = 262142;
        int iMin = Math.min(i10, 262142);
        int iMin2 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
        int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i14 = 65534;
            } else if (i15 < 65535) {
                i14 = 32766;
            } else {
                if (i15 >= 262143) {
                    p063g1.b.l(i15);
                    throw new A6.a();
                }
                i14 = 8190;
            }
        }
        return p063g1.b.a(iMin, iMin2, Math.min(i14, i12), i13 != Integer.MAX_VALUE ? Math.min(i14, i13) : Integer.MAX_VALUE);
    }

    public static p124m3.d B(Page page, p114l3.b bVar, boolean z10) {
        List list;
        List list2;
        p251z9.j.e(bVar, "pageTypeDecider");
        p120l9.r rVar = p120l9.r.f19440r;
        if (z10) {
            list = rVar;
        } else {
            RealmList<Verse> verses1405 = page.getVerses1405();
            ArrayList arrayList = new ArrayList(p120l9.n.a0(verses1405, 10));
            for (Verse verse : verses1405) {
                p251z9.j.b(verse);
                arrayList.add(B0.c.y(verse, bVar));
            }
            list = arrayList;
        }
        if (z10) {
            list2 = rVar;
        } else {
            RealmList<Verse> verses1441 = page.getVerses1441();
            ArrayList arrayList2 = new ArrayList(p120l9.n.a0(verses1441, 10));
            for (Verse verse2 : verses1441) {
                p251z9.j.b(verse2);
                arrayList2.add(B0.c.y(verse2, bVar));
            }
            list2 = arrayList2;
        }
        p124m3.j jVarY = (p124m3.j) p120l9.m.g0(list);
        if (jVarY == null) {
            Verse verseLast = page.getVerses1405().last();
            p251z9.j.b(verseLast);
            jVarY = B0.c.y(verseLast, bVar);
        }
        p124m3.j jVar = jVarY;
        p124m3.j jVarY2 = (p124m3.j) p120l9.m.g0(list2);
        if (jVarY2 == null) {
            Verse verseLast2 = page.getVerses1441().last();
            p251z9.j.b(verseLast2);
            jVarY2 = B0.c.y(verseLast2, bVar);
        }
        p124m3.j jVar2 = jVarY2;
        int identifier = (int) page.getIdentifier();
        int number = (int) page.getNumber();
        boolean zIsRight = page.isRight();
        PageHeader header1405 = page.getHeader1405();
        p251z9.j.b(header1405);
        p124m3.f fVarS = p050e8.b.s(header1405, bVar);
        PageHeader header1441 = page.getHeader1441();
        p251z9.j.b(header1441);
        p124m3.f fVarS2 = p050e8.b.s(header1441, bVar);
        RealmList<ChapterHeader> chapterHeaders1405 = page.getChapterHeaders1405();
        ArrayList arrayList3 = new ArrayList(p120l9.n.a0(chapterHeaders1405, 10));
        for (ChapterHeader chapterHeader : chapterHeaders1405) {
            p251z9.j.b(chapterHeader);
            Chapter chapter = chapterHeader.getChapter();
            p251z9.j.b(chapter);
            int i10 = number;
            int number2 = (int) chapter.getNumber();
            Page page2 = chapterHeader.getPage();
            p251z9.j.b(page2);
            int i11 = identifier;
            arrayList3.add(new p124m3.b(chapterHeader.getCenterX(), chapterHeader.getCenterY(), number2, (int) page2.getNumber(), (int) chapterHeader.getLine()));
            number = i10;
            identifier = i11;
        }
        int i12 = identifier;
        int i13 = number;
        RealmList<ChapterHeader> chapterHeaders1441 = page.getChapterHeaders1441();
        ArrayList arrayList4 = new ArrayList(p120l9.n.a0(chapterHeaders1441, 10));
        Iterator<ChapterHeader> it = chapterHeaders1441.iterator();
        while (it.hasNext()) {
            ChapterHeader next = it.next();
            p251z9.j.b(next);
            Chapter chapter2 = next.getChapter();
            p251z9.j.b(chapter2);
            int number3 = (int) chapter2.getNumber();
            Page page3 = next.getPage();
            p251z9.j.b(page3);
            Iterator<ChapterHeader> it2 = it;
            arrayList4.add(new p124m3.b(next.getCenterX(), next.getCenterY(), number3, (int) page3.getNumber(), (int) next.getLine()));
            it = it2;
        }
        return new p124m3.d(i12, i13, zIsRight, fVarS, fVarS2, arrayList3, arrayList4, list, list2, bVar, jVar, jVar2);
    }

    public static Object C(Object obj, Class cls) {
        if (obj instanceof p051e9.a) {
            return cls.cast(obj);
        }
        if (obj instanceof p051e9.b) {
            return C(((p051e9.b) obj).c(), cls);
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + p051e9.a.class + " or " + p051e9.b.class);
    }

    public static int E(List list) {
        p251z9.j.e(list, "<this>");
        return list.size() - 1;
    }

    public static p150o9.c H(p150o9.c cVar) {
        p150o9.c cVarIntercepted;
        p251z9.j.e(cVar, "<this>");
        q9.c cVar2 = cVar instanceof q9.c ? (q9.c) cVar : null;
        return (cVar2 == null || (cVarIntercepted = cVar2.intercepted()) == null) ? cVar : cVarIntercepted;
    }

    public static G9.j I(p241y9.e eVar) {
        G9.j jVar = new G9.j();
        jVar.f2940u = r(jVar, jVar, eVar);
        return jVar;
    }

    public static String J(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + String.valueOf(string2).length() + 9);
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i11] = string;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = str.indexOf("%s", i12)) != -1) {
            sb3.append((CharSequence) str, i12, iIndexOf);
            sb3.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb3.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb3.append(", ");
                sb3.append(objArr[i13]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static List K(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        p251z9.j.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List L(Object... objArr) {
        return objArr.length > 0 ? p120l9.l.S(objArr) : p120l9.r.f19440r;
    }

    public static ArrayList M(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new p120l9.j(objArr, true));
    }

    public static final List O(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : K(list.get(0));
        }
        return p120l9.r.f19440r;
    }

    public static final void P(Z.A0 a9, InterfaceC0674c interfaceC0674c, int i10) {
        while (true) {
            int i11 = a9.f10579v;
            if (i10 > i11 && i10 < a9.f10578u) {
                return;
            }
            if (i11 == 0 && i10 == 0) {
                return;
            }
            a9.J();
            if (a9.w(a9.f10579v)) {
                interfaceC0674c.u();
            }
            a9.i();
        }
    }

    public static void T() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static Object U(p241y9.e eVar, Object obj, p150o9.c cVar) {
        p251z9.j.e(eVar, "<this>");
        p150o9.h context = cVar.getContext();
        Object dVar = context == p150o9.i.f20380r ? new p161p9.d(cVar) : new p161p9.e(cVar, context);
        p251z9.y.b(2, eVar);
        return eVar.invoke(obj, dVar);
    }

    public static int V(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    public static String W(Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strT;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                strT = "null";
            } else {
                try {
                    strT = obj.toString();
                } catch (Exception e10) {
                    String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (Throwable) e10);
                    strT = p123m2.c.t("<", str, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i11] = strT;
            i11++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + 29);
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = "expected a non-null reference".indexOf("%s", i12)) == -1) {
                break;
            }
            sb.append((CharSequence) "expected a non-null reference", i12, iIndexOf);
            sb.append(objArr[i10]);
            i10++;
            i12 = iIndexOf + 2;
        }
        sb.append((CharSequence) "expected a non-null reference", i12, 29);
        if (i10 < length2) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static InterfaceC0850n X(C0800d c0800d, Aa.a aVar, ArrayList arrayList, boolean z10) {
        InterfaceC0850n interfaceC0850nA;
        p185s8.u0.I(1, "reduce", arrayList);
        p185s8.u0.J(2, "reduce", arrayList);
        InterfaceC0850n interfaceC0850nC = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
        if (!(interfaceC0850nC instanceof AbstractC0820h)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            interfaceC0850nA = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1));
            if (interfaceC0850nA instanceof C0810f) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c0800d.o() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC0850nA = null;
        }
        AbstractC0820h abstractC0820h = (AbstractC0820h) interfaceC0850nC;
        int iO = c0800d.o();
        int i10 = z10 ? 0 : iO - 1;
        int i11 = z10 ? iO - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (interfaceC0850nA == null) {
            interfaceC0850nA = c0800d.p(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (c0800d.r(i10)) {
                interfaceC0850nA = abstractC0820h.a(aVar, Arrays.asList(interfaceC0850nA, c0800d.p(i10), new C0815g(Double.valueOf(i10)), c0800d));
                if (interfaceC0850nA instanceof C0810f) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return interfaceC0850nA;
    }

    public static C0793b2 Y() {
        String str;
        ClassLoader classLoader = AbstractC0813f2.class.getClassLoader();
        if (C0793b2.class.equals(C0793b2.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!C0793b2.class.getPackage().equals(AbstractC0813f2.class.getPackage())) {
                throw new IllegalArgumentException(C0793b2.class.getName());
            }
            str = C0793b2.class.getPackage().getName() + ".BlazeGenerated" + C0793b2.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    p245z2.a.H(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e10) {
                    throw new IllegalStateException(e10);
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (InstantiationException e12) {
                throw new IllegalStateException(e12);
            } catch (NoSuchMethodException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new AbstractC0813f2[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e14) {
                        Logger.getLogger(C0788a2.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(C0793b2.class.getSimpleName()), (Throwable) e14);
                    }
                }
                if (arrayList.size() == 1) {
                    return (C0793b2) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (C0793b2) C0793b2.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(e15);
                } catch (NoSuchMethodException e16) {
                    throw new IllegalStateException(e16);
                } catch (InvocationTargetException e17) {
                    throw new IllegalStateException(e17);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static C0800d Z(C0800d c0800d, Aa.a aVar, C0845m c0845m, Boolean bool, Boolean bool2) {
        C0800d c0800d2 = new C0800d();
        Iterator itN = c0800d.n();
        while (itN.hasNext()) {
            int iIntValue = ((Integer) itN.next()).intValue();
            if (c0800d.r(iIntValue)) {
                InterfaceC0850n interfaceC0850nA = c0845m.a(aVar, Arrays.asList(c0800d.p(iIntValue), new C0815g(Double.valueOf(iIntValue)), c0800d));
                if (interfaceC0850nA.d().equals(bool)) {
                    break;
                }
                if (bool2 == null || interfaceC0850nA.d().equals(bool2)) {
                    c0800d2.q(iIntValue, interfaceC0850nA);
                }
            }
        }
        return c0800d2;
    }

    public static final void a(p241y9.a aVar, p104k1.n nVar, p074h0.d dVar, C0698o c0698o, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        p063g1.m mVar;
        c0698o.V(-2032877254);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(nVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.i(dVar) ? 256 : 128;
        }
        int i12 = i11;
        if (c0698o.K(i12 & 1, (i12 & 147) != 146)) {
            View view = (View) c0698o.k(AndroidCompositionLocals_androidKt.f12067f);
            p063g1.c cVar = (p063g1.c) c0698o.k(AbstractC0359n0.f5118h);
            p063g1.m mVar2 = (p063g1.m) c0698o.k(AbstractC0359n0.f5123n);
            C0694m c0694mT = C0672b.t(c0698o);
            Z.X xU = C0672b.u(dVar, c0698o);
            UUID uuid = (UUID) va.g.H(new Object[0], null, p104k1.c.f18903s, c0698o, 3072, 6);
            boolean zG = c0698o.g(view) | c0698o.g(cVar);
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (zG || objH == obj) {
                z10 = true;
                z11 = false;
                mVar = mVar2;
                p104k1.o oVar = new p104k1.o(aVar, nVar, view, mVar, cVar, uuid);
                p074h0.d dVar2 = new p074h0.d(488261145, new C0585o(xU, 1), true);
                p104k1.m mVar3 = oVar.f18943x;
                mVar3.setParentCompositionContext(c0694mT);
                mVar3.f18929A.setValue(dVar2);
                mVar3.f18933E = true;
                if (mVar3.f11982u == null && !mVar3.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                mVar3.d();
                c0698o.e0(oVar);
                objH = oVar;
            } else {
                z10 = true;
                mVar = mVar2;
                z11 = false;
            }
            p104k1.o oVar2 = (p104k1.o) objH;
            boolean zI = c0698o.i(oVar2);
            Object objH2 = c0698o.H();
            if (zI || objH2 == obj) {
                objH2 = new p104k1.a(oVar2, 0);
                c0698o.e0(objH2);
            }
            C0672b.d(oVar2, (p241y9.c) objH2, c0698o);
            boolean zI2 = c0698o.i(oVar2) | ((i12 & 14) == 4 ? z10 : z11);
            if ((i12 & 112) != 32) {
                z10 = z11;
            }
            boolean zG2 = zI2 | z10 | c0698o.g(mVar);
            Object objH3 = c0698o.H();
            if (zG2 || objH3 == obj) {
                Object f3 = new W.F1(oVar2, aVar, nVar, mVar, 1);
                c0698o.e0(f3);
                objH3 = f3;
            }
            C0672b.h((p241y9.a) objH3, c0698o);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new K.v0(aVar, nVar, dVar, i10, 4);
        }
    }

    public static final void b(final int i10, final NumberFormat numberFormat, final l0.r rVar, final boolean z10, final int i11, C0698o c0698o, final int i12) {
        C0698o c0698o2;
        p110k9.j jVar;
        boolean z11;
        boolean z12;
        long jK;
        c0698o.V(-520794795);
        int i13 = i12 | (c0698o.e(i10) ? 4 : 2) | (c0698o.i(numberFormat) ? 32 : 16) | (c0698o.h(z10) ? 2048 : 1024) | (c0698o.e(i11) ? 16384 : 8192);
        if (c0698o.K(i13 & 1, (i13 & 9363) != 9362)) {
            H0.I iD = AbstractC0071n.d(l0.c.f19313r, false);
            int i14 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVar);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i14))) {
                p123m2.c.y(i14, c0698o, i14, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            if (z10) {
                c0698o.T(-621355064);
                float f3 = i11 > 0 ? 0.3f : 1.0f;
                Z.M0 m10 = p005a4.e.f11187a;
                jVar = new p110k9.j(new p180s0.q(p180s0.q.b(((p005a4.a) c0698o.k(m10)).l(), f3)), new p180s0.q(((p005a4.a) c0698o.k(m10)).l()));
                c0698o.p(false);
            } else {
                c0698o.T(-621193523);
                Z.M0 m11 = p005a4.e.f11187a;
                jVar = new p110k9.j(new p180s0.q(((p180s0.q) ((p005a4.a) c0698o.k(m11)).f11164c.getValue()).f21845a), new p180s0.q(((p005a4.a) c0698o.k(m11)).c()));
                c0698o.p(false);
            }
            final long j = ((p180s0.q) jVar.f19077r).f21845a;
            final long j10 = ((p180s0.q) jVar.f19078s).f21845a;
            final float f7 = i11 / 4.0f;
            FillElement fillElement = androidx.compose.foundation.layout.c.f11828c;
            boolean zF = c0698o.f(j) | c0698o.f(j10) | c0698o.d(f7);
            Object objH = c0698o.H();
            if (zF || objH == C0690k.f10683a) {
                objH = new p241y9.c() { // from class: L4.a
                    @Override // p241y9.c
                    public final Object e(Object obj) {
                        d dVar = (d) obj;
                        j.e(dVar, "$this$Canvas");
                        c.e(dVar, j, Float.intBitsToFloat((int) (dVar.b() >> 32)) / 2, 0L, 0, 124);
                        c.d(dVar, j10, -90.0f, 360 * f7, true, 0L, 0L, null, 1008);
                        return y.f19095a;
                    }
                };
                c0698o.e0(objH);
            }
            p171r0.f.a(fillElement, (p241y9.c) objH, c0698o, 6);
            if (i11 == 0) {
                c0698o.T(-620868457);
                if (z10) {
                    c0698o.T(-620839782);
                    jK = ((p005a4.a) c0698o.k(p005a4.e.f11187a)).a();
                    c0698o.p(false);
                } else {
                    c0698o.T(-620789376);
                    jK = ((p005a4.a) c0698o.k(p005a4.e.f11187a)).k();
                    c0698o.p(false);
                }
                String str = numberFormat.format(Integer.valueOf(i10));
                p251z9.j.d(str, "format(...)");
                z11 = true;
                z12 = false;
                AbstractC0542b2.b(str, androidx.compose.foundation.layout.a.f11825a.a(l0.o.f19333a, l0.c.f19317v), jK, F9.n.B(12), Y0.l.f10362w, null, 0L, null, 0L, 0, false, 0, 0, ((W.G2) c0698o.k(W.H2.f8580a)).f8567m, c0698o, 199680, 0, 65488);
                c0698o2 = c0698o;
            } else {
                c0698o2 = c0698o;
                z11 = true;
                z12 = false;
                c0698o2.T(-622523609);
            }
            c0698o2.p(z12);
            c0698o2.p(z11);
        } else {
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p241y9.e(i10, numberFormat, rVar, z10, i11, i12) { // from class: L4.b

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ int f5517r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ NumberFormat f5518s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ r f5519t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ boolean f5520u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ int f5521v;

                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = C0672b.y(385);
                    AbstractC0813f2.b(this.f5517r, this.f5518s, this.f5519t, this.f5520u, this.f5521v, (C0698o) obj, iY);
                    return y.f19095a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0083  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    public static final void c(final int i10, final l0.r rVar, int i11, final boolean z10, boolean z11, float f3, final NumberFormat numberFormat, final p074h0.d dVar, C0698o c0698o, final int i12, final int i13) {
        int i14;
        int i15;
        int i16;
        boolean z12;
        int i17;
        int i18;
        float f7;
        int i19;
        int i20;
        boolean z13;
        final int i21;
        final boolean z14;
        final float f10;
        C0699o0 c0699o0R;
        C0695m0[] c0695m0Arr;
        int i22;
        int i23;
        int i24;
        c0698o.V(-41373446);
        if ((i12 & 6) == 0) {
            i14 = (c0698o.e(i10) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c0698o.g(rVar) ? 32 : 16;
        }
        int i25 = i13 & 4;
        if (i25 == 0) {
            if ((i12 & 384) == 0) {
                i15 = i11;
                i14 |= c0698o.e(i15) ? 256 : 128;
            }
            if ((i12 & 3072) == 0) {
                if (c0698o.h(z10)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i14 |= i24;
            }
            i16 = i13 & 16;
            if (i16 != 0) {
                if ((i12 & 24576) == 0) {
                    z12 = z11;
                    if (c0698o.h(z12)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i14 |= i17;
                }
                i18 = i13 & 32;
                if (i18 != 0) {
                    if ((196608 & i12) == 0) {
                        f7 = f3;
                        if (c0698o.d(f7)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i14 |= i19;
                    }
                    if ((1572864 & i12) == 0) {
                        if (c0698o.i(numberFormat)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i14 |= i23;
                    }
                    if ((12582912 & i12) != 0) {
                        if (c0698o.i(dVar)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i14 |= i22;
                    }
                    i20 = i14;
                    if ((4793491 & i14) != 4793490) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0698o.K(i20 & 1, z13)) {
                        c0698o.P();
                        if ((i12 & 1) != 0 || c0698o.w()) {
                            if (i25 != 0) {
                                i15 = 0;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if (i18 != 0) {
                                f7 = 16;
                            }
                        } else {
                            c0698o.N();
                        }
                        final int i26 = i15;
                        final float f11 = f7;
                        c0698o.q();
                        if (z12) {
                            c0695m0Arr = new C0695m0[]{AbstractC0359n0.f5123n.a(p063g1.m.f16262s)};
                        } else {
                            c0695m0Arr = new C0695m0[0];
                        }
                        C0672b.b((C0695m0[]) Arrays.copyOf(c0695m0Arr, c0695m0Arr.length), p074h0.j.d(-312756806, new p241y9.e() { // from class: M4.d
                            @Override // p241y9.e
                            public final Object invoke(Object obj, Object obj2) {
                                C0698o c0698o2 = (C0698o) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (c0698o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    l0.i iVar = l0.c.f19307B;
                                    float f12 = 16;
                                    r rVarK = androidx.compose.foundation.layout.b.k(rVar, f12, f12, f11, f12);
                                    W wA = U.a(AbstractC0066i.f977a, iVar, c0698o2, 48);
                                    int i27 = c0698o2.f10721P;
                                    InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                                    r rVarC = l0.a.c(c0698o2, rVarK);
                                    InterfaceC0288k.f4142a.getClass();
                                    C0286i c0286i = C0287j.f4115b;
                                    c0698o2.X();
                                    if (c0698o2.f10720O) {
                                        c0698o2.l(c0286i);
                                    } else {
                                        c0698o2.h0();
                                    }
                                    C0672b.v(c0698o2, wA, C0287j.f4119f);
                                    C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                                    C0285h c0285h = C0287j.g;
                                    if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i27))) {
                                        p123m2.c.y(i27, c0698o2, i27, c0285h);
                                    }
                                    C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                                    AbstractC0813f2.b(i10, numberFormat, androidx.compose.foundation.layout.c.j(o.f19333a, 32), z10, i26, c0698o2, 384);
                                    dVar.invoke(c0698o2, 0);
                                    c0698o2.p(true);
                                } else {
                                    c0698o2.N();
                                }
                                return y.f19095a;
                            }
                        }, c0698o), c0698o, 56);
                        z14 = z12;
                        f10 = f11;
                        i21 = i26;
                    } else {
                        c0698o.N();
                        i21 = i15;
                        z14 = z12;
                        f10 = f7;
                    }
                    c0699o0R = c0698o.r();
                    if (c0699o0R != null) {
                        c0699o0R.f10749d = new p241y9.e() { // from class: M4.e
                            @Override // p241y9.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC0813f2.c(i10, rVar, i21, z10, z14, f10, numberFormat, dVar, (C0698o) obj, C0672b.y(i12 | 1), i13);
                                return y.f19095a;
                            }
                        };
                    }
                }
                i14 |= 196608;
                f7 = f3;
                if ((1572864 & i12) == 0) {
                    if (c0698o.i(numberFormat)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
                if ((12582912 & i12) != 0) {
                    if (c0698o.i(dVar)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i14 |= i22;
                }
                i20 = i14;
                if ((4793491 & i14) != 4793490) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0698o.K(i20 & 1, z13)) {
                    c0698o.P();
                    if ((i12 & 1) != 0) {
                        if (i25 != 0) {
                            i15 = 0;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            f7 = 16;
                        }
                    } else {
                        if (i25 != 0) {
                            i15 = 0;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            f7 = 16;
                        }
                    }
                    final int i27 = i15;
                    final float f12 = f7;
                    c0698o.q();
                    if (z12) {
                        c0695m0Arr = new C0695m0[]{AbstractC0359n0.f5123n.a(p063g1.m.f16262s)};
                    } else {
                        c0695m0Arr = new C0695m0[0];
                    }
                    C0672b.b((C0695m0[]) Arrays.copyOf(c0695m0Arr, c0695m0Arr.length), p074h0.j.d(-312756806, new p241y9.e() { // from class: M4.d
                        @Override // p241y9.e
                        public final Object invoke(Object obj, Object obj2) {
                            C0698o c0698o2 = (C0698o) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c0698o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                                l0.i iVar = l0.c.f19307B;
                                float f13 = 16;
                                r rVarK = androidx.compose.foundation.layout.b.k(rVar, f13, f13, f12, f13);
                                W wA = U.a(AbstractC0066i.f977a, iVar, c0698o2, 48);
                                int i28 = c0698o2.f10721P;
                                InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                                r rVarC = l0.a.c(c0698o2, rVarK);
                                InterfaceC0288k.f4142a.getClass();
                                C0286i c0286i = C0287j.f4115b;
                                c0698o2.X();
                                if (c0698o2.f10720O) {
                                    c0698o2.l(c0286i);
                                } else {
                                    c0698o2.h0();
                                }
                                C0672b.v(c0698o2, wA, C0287j.f4119f);
                                C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                                C0285h c0285h = C0287j.g;
                                if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i28))) {
                                    p123m2.c.y(i28, c0698o2, i28, c0285h);
                                }
                                C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                                AbstractC0813f2.b(i10, numberFormat, androidx.compose.foundation.layout.c.j(o.f19333a, 32), z10, i27, c0698o2, 384);
                                dVar.invoke(c0698o2, 0);
                                c0698o2.p(true);
                            } else {
                                c0698o2.N();
                            }
                            return y.f19095a;
                        }
                    }, c0698o), c0698o, 56);
                    z14 = z12;
                    f10 = f12;
                    i21 = i27;
                } else {
                    c0698o.N();
                    i21 = i15;
                    z14 = z12;
                    f10 = f7;
                }
                c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new p241y9.e() { // from class: M4.e
                        @Override // p241y9.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC0813f2.c(i10, rVar, i21, z10, z14, f10, numberFormat, dVar, (C0698o) obj, C0672b.y(i12 | 1), i13);
                            return y.f19095a;
                        }
                    };
                }
            }
            i14 |= 24576;
            z12 = z11;
            i18 = i13 & 32;
            if (i18 != 0) {
                if ((196608 & i12) == 0) {
                    f7 = f3;
                    if (c0698o.d(f7)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i14 |= i19;
                }
                if ((1572864 & i12) == 0) {
                    if (c0698o.i(numberFormat)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
                if ((12582912 & i12) != 0) {
                    if (c0698o.i(dVar)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i14 |= i22;
                }
                i20 = i14;
                if ((4793491 & i14) != 4793490) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0698o.K(i20 & 1, z13)) {
                    c0698o.P();
                    if ((i12 & 1) != 0) {
                        if (i25 != 0) {
                            i15 = 0;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            f7 = 16;
                        }
                    } else {
                        if (i25 != 0) {
                            i15 = 0;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            f7 = 16;
                        }
                    }
                    final int i28 = i15;
                    final float f13 = f7;
                    c0698o.q();
                    if (z12) {
                        c0695m0Arr = new C0695m0[]{AbstractC0359n0.f5123n.a(p063g1.m.f16262s)};
                    } else {
                        c0695m0Arr = new C0695m0[0];
                    }
                    C0672b.b((C0695m0[]) Arrays.copyOf(c0695m0Arr, c0695m0Arr.length), p074h0.j.d(-312756806, new p241y9.e() { // from class: M4.d
                        @Override // p241y9.e
                        public final Object invoke(Object obj, Object obj2) {
                            C0698o c0698o2 = (C0698o) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c0698o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                                l0.i iVar = l0.c.f19307B;
                                float f14 = 16;
                                r rVarK = androidx.compose.foundation.layout.b.k(rVar, f14, f14, f13, f14);
                                W wA = U.a(AbstractC0066i.f977a, iVar, c0698o2, 48);
                                int i29 = c0698o2.f10721P;
                                InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                                r rVarC = l0.a.c(c0698o2, rVarK);
                                InterfaceC0288k.f4142a.getClass();
                                C0286i c0286i = C0287j.f4115b;
                                c0698o2.X();
                                if (c0698o2.f10720O) {
                                    c0698o2.l(c0286i);
                                } else {
                                    c0698o2.h0();
                                }
                                C0672b.v(c0698o2, wA, C0287j.f4119f);
                                C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                                C0285h c0285h = C0287j.g;
                                if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i29))) {
                                    p123m2.c.y(i29, c0698o2, i29, c0285h);
                                }
                                C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                                AbstractC0813f2.b(i10, numberFormat, androidx.compose.foundation.layout.c.j(o.f19333a, 32), z10, i28, c0698o2, 384);
                                dVar.invoke(c0698o2, 0);
                                c0698o2.p(true);
                            } else {
                                c0698o2.N();
                            }
                            return y.f19095a;
                        }
                    }, c0698o), c0698o, 56);
                    z14 = z12;
                    f10 = f13;
                    i21 = i28;
                } else {
                    c0698o.N();
                    i21 = i15;
                    z14 = z12;
                    f10 = f7;
                }
                c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new p241y9.e() { // from class: M4.e
                        @Override // p241y9.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC0813f2.c(i10, rVar, i21, z10, z14, f10, numberFormat, dVar, (C0698o) obj, C0672b.y(i12 | 1), i13);
                            return y.f19095a;
                        }
                    };
                }
            }
            i14 |= 196608;
            f7 = f3;
            if ((1572864 & i12) == 0) {
                if (c0698o.i(numberFormat)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
            if ((12582912 & i12) != 0) {
                if (c0698o.i(dVar)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i14 |= i22;
            }
            i20 = i14;
            if ((4793491 & i14) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0698o.K(i20 & 1, z13)) {
                c0698o.P();
                if ((i12 & 1) != 0) {
                    if (i25 != 0) {
                        i15 = 0;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        f7 = 16;
                    }
                } else {
                    if (i25 != 0) {
                        i15 = 0;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        f7 = 16;
                    }
                }
                final int i29 = i15;
                final float f14 = f7;
                c0698o.q();
                if (z12) {
                    c0695m0Arr = new C0695m0[]{AbstractC0359n0.f5123n.a(p063g1.m.f16262s)};
                } else {
                    c0695m0Arr = new C0695m0[0];
                }
                C0672b.b((C0695m0[]) Arrays.copyOf(c0695m0Arr, c0695m0Arr.length), p074h0.j.d(-312756806, new p241y9.e() { // from class: M4.d
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        C0698o c0698o2 = (C0698o) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (c0698o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                            l0.i iVar = l0.c.f19307B;
                            float f15 = 16;
                            r rVarK = androidx.compose.foundation.layout.b.k(rVar, f15, f15, f14, f15);
                            W wA = U.a(AbstractC0066i.f977a, iVar, c0698o2, 48);
                            int i210 = c0698o2.f10721P;
                            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                            r rVarC = l0.a.c(c0698o2, rVarK);
                            InterfaceC0288k.f4142a.getClass();
                            C0286i c0286i = C0287j.f4115b;
                            c0698o2.X();
                            if (c0698o2.f10720O) {
                                c0698o2.l(c0286i);
                            } else {
                                c0698o2.h0();
                            }
                            C0672b.v(c0698o2, wA, C0287j.f4119f);
                            C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                            C0285h c0285h = C0287j.g;
                            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i210))) {
                                p123m2.c.y(i210, c0698o2, i210, c0285h);
                            }
                            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                            AbstractC0813f2.b(i10, numberFormat, androidx.compose.foundation.layout.c.j(o.f19333a, 32), z10, i29, c0698o2, 384);
                            dVar.invoke(c0698o2, 0);
                            c0698o2.p(true);
                        } else {
                            c0698o2.N();
                        }
                        return y.f19095a;
                    }
                }, c0698o), c0698o, 56);
                z14 = z12;
                f10 = f14;
                i21 = i29;
            } else {
                c0698o.N();
                i21 = i15;
                z14 = z12;
                f10 = f7;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new p241y9.e() { // from class: M4.e
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC0813f2.c(i10, rVar, i21, z10, z14, f10, numberFormat, dVar, (C0698o) obj, C0672b.y(i12 | 1), i13);
                        return y.f19095a;
                    }
                };
            }
        }
        i14 |= 384;
        i15 = i11;
        if ((i12 & 3072) == 0) {
            if (c0698o.h(z10)) {
                i24 = 2048;
            } else {
                i24 = 1024;
            }
            i14 |= i24;
        }
        i16 = i13 & 16;
        if (i16 != 0) {
            if ((i12 & 24576) == 0) {
                z12 = z11;
                if (c0698o.h(z12)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i14 |= i17;
            }
            i18 = i13 & 32;
            if (i18 != 0) {
                if ((196608 & i12) == 0) {
                    f7 = f3;
                    if (c0698o.d(f7)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i14 |= i19;
                }
                if ((1572864 & i12) == 0) {
                    if (c0698o.i(numberFormat)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
                if ((12582912 & i12) != 0) {
                    if (c0698o.i(dVar)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i14 |= i22;
                }
                i20 = i14;
                if ((4793491 & i14) != 4793490) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0698o.K(i20 & 1, z13)) {
                    c0698o.P();
                    if ((i12 & 1) != 0) {
                        if (i25 != 0) {
                            i15 = 0;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            f7 = 16;
                        }
                    } else {
                        if (i25 != 0) {
                            i15 = 0;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if (i18 != 0) {
                            f7 = 16;
                        }
                    }
                    final int i210 = i15;
                    final float f15 = f7;
                    c0698o.q();
                    if (z12) {
                        c0695m0Arr = new C0695m0[]{AbstractC0359n0.f5123n.a(p063g1.m.f16262s)};
                    } else {
                        c0695m0Arr = new C0695m0[0];
                    }
                    C0672b.b((C0695m0[]) Arrays.copyOf(c0695m0Arr, c0695m0Arr.length), p074h0.j.d(-312756806, new p241y9.e() { // from class: M4.d
                        @Override // p241y9.e
                        public final Object invoke(Object obj, Object obj2) {
                            C0698o c0698o2 = (C0698o) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c0698o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                                l0.i iVar = l0.c.f19307B;
                                float f16 = 16;
                                r rVarK = androidx.compose.foundation.layout.b.k(rVar, f16, f16, f15, f16);
                                W wA = U.a(AbstractC0066i.f977a, iVar, c0698o2, 48);
                                int i211 = c0698o2.f10721P;
                                InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                                r rVarC = l0.a.c(c0698o2, rVarK);
                                InterfaceC0288k.f4142a.getClass();
                                C0286i c0286i = C0287j.f4115b;
                                c0698o2.X();
                                if (c0698o2.f10720O) {
                                    c0698o2.l(c0286i);
                                } else {
                                    c0698o2.h0();
                                }
                                C0672b.v(c0698o2, wA, C0287j.f4119f);
                                C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                                C0285h c0285h = C0287j.g;
                                if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i211))) {
                                    p123m2.c.y(i211, c0698o2, i211, c0285h);
                                }
                                C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                                AbstractC0813f2.b(i10, numberFormat, androidx.compose.foundation.layout.c.j(o.f19333a, 32), z10, i210, c0698o2, 384);
                                dVar.invoke(c0698o2, 0);
                                c0698o2.p(true);
                            } else {
                                c0698o2.N();
                            }
                            return y.f19095a;
                        }
                    }, c0698o), c0698o, 56);
                    z14 = z12;
                    f10 = f15;
                    i21 = i210;
                } else {
                    c0698o.N();
                    i21 = i15;
                    z14 = z12;
                    f10 = f7;
                }
                c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new p241y9.e() { // from class: M4.e
                        @Override // p241y9.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC0813f2.c(i10, rVar, i21, z10, z14, f10, numberFormat, dVar, (C0698o) obj, C0672b.y(i12 | 1), i13);
                            return y.f19095a;
                        }
                    };
                }
            }
            i14 |= 196608;
            f7 = f3;
            if ((1572864 & i12) == 0) {
                if (c0698o.i(numberFormat)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
            if ((12582912 & i12) != 0) {
                if (c0698o.i(dVar)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i14 |= i22;
            }
            i20 = i14;
            if ((4793491 & i14) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0698o.K(i20 & 1, z13)) {
                c0698o.P();
                if ((i12 & 1) != 0) {
                    if (i25 != 0) {
                        i15 = 0;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        f7 = 16;
                    }
                } else {
                    if (i25 != 0) {
                        i15 = 0;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        f7 = 16;
                    }
                }
                final int i211 = i15;
                final float f16 = f7;
                c0698o.q();
                if (z12) {
                    c0695m0Arr = new C0695m0[]{AbstractC0359n0.f5123n.a(p063g1.m.f16262s)};
                } else {
                    c0695m0Arr = new C0695m0[0];
                }
                C0672b.b((C0695m0[]) Arrays.copyOf(c0695m0Arr, c0695m0Arr.length), p074h0.j.d(-312756806, new p241y9.e() { // from class: M4.d
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        C0698o c0698o2 = (C0698o) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (c0698o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                            l0.i iVar = l0.c.f19307B;
                            float f17 = 16;
                            r rVarK = androidx.compose.foundation.layout.b.k(rVar, f17, f17, f16, f17);
                            W wA = U.a(AbstractC0066i.f977a, iVar, c0698o2, 48);
                            int i212 = c0698o2.f10721P;
                            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                            r rVarC = l0.a.c(c0698o2, rVarK);
                            InterfaceC0288k.f4142a.getClass();
                            C0286i c0286i = C0287j.f4115b;
                            c0698o2.X();
                            if (c0698o2.f10720O) {
                                c0698o2.l(c0286i);
                            } else {
                                c0698o2.h0();
                            }
                            C0672b.v(c0698o2, wA, C0287j.f4119f);
                            C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                            C0285h c0285h = C0287j.g;
                            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i212))) {
                                p123m2.c.y(i212, c0698o2, i212, c0285h);
                            }
                            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                            AbstractC0813f2.b(i10, numberFormat, androidx.compose.foundation.layout.c.j(o.f19333a, 32), z10, i211, c0698o2, 384);
                            dVar.invoke(c0698o2, 0);
                            c0698o2.p(true);
                        } else {
                            c0698o2.N();
                        }
                        return y.f19095a;
                    }
                }, c0698o), c0698o, 56);
                z14 = z12;
                f10 = f16;
                i21 = i211;
            } else {
                c0698o.N();
                i21 = i15;
                z14 = z12;
                f10 = f7;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new p241y9.e() { // from class: M4.e
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC0813f2.c(i10, rVar, i21, z10, z14, f10, numberFormat, dVar, (C0698o) obj, C0672b.y(i12 | 1), i13);
                        return y.f19095a;
                    }
                };
            }
        }
        i14 |= 24576;
        z12 = z11;
        i18 = i13 & 32;
        if (i18 != 0) {
            if ((196608 & i12) == 0) {
                f7 = f3;
                if (c0698o.d(f7)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i14 |= i19;
            }
            if ((1572864 & i12) == 0) {
                if (c0698o.i(numberFormat)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
            if ((12582912 & i12) != 0) {
                if (c0698o.i(dVar)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i14 |= i22;
            }
            i20 = i14;
            if ((4793491 & i14) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0698o.K(i20 & 1, z13)) {
                c0698o.P();
                if ((i12 & 1) != 0) {
                    if (i25 != 0) {
                        i15 = 0;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        f7 = 16;
                    }
                } else {
                    if (i25 != 0) {
                        i15 = 0;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if (i18 != 0) {
                        f7 = 16;
                    }
                }
                final int i212 = i15;
                final float f17 = f7;
                c0698o.q();
                if (z12) {
                    c0695m0Arr = new C0695m0[]{AbstractC0359n0.f5123n.a(p063g1.m.f16262s)};
                } else {
                    c0695m0Arr = new C0695m0[0];
                }
                C0672b.b((C0695m0[]) Arrays.copyOf(c0695m0Arr, c0695m0Arr.length), p074h0.j.d(-312756806, new p241y9.e() { // from class: M4.d
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        C0698o c0698o2 = (C0698o) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (c0698o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                            l0.i iVar = l0.c.f19307B;
                            float f18 = 16;
                            r rVarK = androidx.compose.foundation.layout.b.k(rVar, f18, f18, f17, f18);
                            W wA = U.a(AbstractC0066i.f977a, iVar, c0698o2, 48);
                            int i213 = c0698o2.f10721P;
                            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                            r rVarC = l0.a.c(c0698o2, rVarK);
                            InterfaceC0288k.f4142a.getClass();
                            C0286i c0286i = C0287j.f4115b;
                            c0698o2.X();
                            if (c0698o2.f10720O) {
                                c0698o2.l(c0286i);
                            } else {
                                c0698o2.h0();
                            }
                            C0672b.v(c0698o2, wA, C0287j.f4119f);
                            C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                            C0285h c0285h = C0287j.g;
                            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i213))) {
                                p123m2.c.y(i213, c0698o2, i213, c0285h);
                            }
                            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                            AbstractC0813f2.b(i10, numberFormat, androidx.compose.foundation.layout.c.j(o.f19333a, 32), z10, i212, c0698o2, 384);
                            dVar.invoke(c0698o2, 0);
                            c0698o2.p(true);
                        } else {
                            c0698o2.N();
                        }
                        return y.f19095a;
                    }
                }, c0698o), c0698o, 56);
                z14 = z12;
                f10 = f17;
                i21 = i212;
            } else {
                c0698o.N();
                i21 = i15;
                z14 = z12;
                f10 = f7;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new p241y9.e() { // from class: M4.e
                    @Override // p241y9.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC0813f2.c(i10, rVar, i21, z10, z14, f10, numberFormat, dVar, (C0698o) obj, C0672b.y(i12 | 1), i13);
                        return y.f19095a;
                    }
                };
            }
        }
        i14 |= 196608;
        f7 = f3;
        if ((1572864 & i12) == 0) {
            if (c0698o.i(numberFormat)) {
                i23 = 1048576;
            } else {
                i23 = 524288;
            }
            i14 |= i23;
        }
        if ((12582912 & i12) != 0) {
            if (c0698o.i(dVar)) {
                i22 = 8388608;
            } else {
                i22 = 4194304;
            }
            i14 |= i22;
        }
        i20 = i14;
        if ((4793491 & i14) != 4793490) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0698o.K(i20 & 1, z13)) {
            c0698o.P();
            if ((i12 & 1) != 0) {
                if (i25 != 0) {
                    i15 = 0;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if (i18 != 0) {
                    f7 = 16;
                }
            } else {
                if (i25 != 0) {
                    i15 = 0;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if (i18 != 0) {
                    f7 = 16;
                }
            }
            final int i213 = i15;
            final float f18 = f7;
            c0698o.q();
            if (z12) {
                c0695m0Arr = new C0695m0[]{AbstractC0359n0.f5123n.a(p063g1.m.f16262s)};
            } else {
                c0695m0Arr = new C0695m0[0];
            }
            C0672b.b((C0695m0[]) Arrays.copyOf(c0695m0Arr, c0695m0Arr.length), p074h0.j.d(-312756806, new p241y9.e() { // from class: M4.d
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    C0698o c0698o2 = (C0698o) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c0698o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                        l0.i iVar = l0.c.f19307B;
                        float f19 = 16;
                        r rVarK = androidx.compose.foundation.layout.b.k(rVar, f19, f19, f18, f19);
                        W wA = U.a(AbstractC0066i.f977a, iVar, c0698o2, 48);
                        int i214 = c0698o2.f10721P;
                        InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                        r rVarC = l0.a.c(c0698o2, rVarK);
                        InterfaceC0288k.f4142a.getClass();
                        C0286i c0286i = C0287j.f4115b;
                        c0698o2.X();
                        if (c0698o2.f10720O) {
                            c0698o2.l(c0286i);
                        } else {
                            c0698o2.h0();
                        }
                        C0672b.v(c0698o2, wA, C0287j.f4119f);
                        C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                        C0285h c0285h = C0287j.g;
                        if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i214))) {
                            p123m2.c.y(i214, c0698o2, i214, c0285h);
                        }
                        C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                        AbstractC0813f2.b(i10, numberFormat, androidx.compose.foundation.layout.c.j(o.f19333a, 32), z10, i213, c0698o2, 384);
                        dVar.invoke(c0698o2, 0);
                        c0698o2.p(true);
                    } else {
                        c0698o2.N();
                    }
                    return y.f19095a;
                }
            }, c0698o), c0698o, 56);
            z14 = z12;
            f10 = f18;
            i21 = i213;
        } else {
            c0698o.N();
            i21 = i15;
            z14 = z12;
            f10 = f7;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p241y9.e() { // from class: M4.e
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0813f2.c(i10, rVar, i21, z10, z14, f10, numberFormat, dVar, (C0698o) obj, C0672b.y(i12 | 1), i13);
                    return y.f19095a;
                }
            };
        }
    }

    public static final void f(final int i10, int i11, int i12, final int i13, final int i14, final String str, final String str2, final l0.r rVar, final boolean z10, final NumberFormat numberFormat, C0698o c0698o, final int i15) {
        final int i16;
        int i17;
        int i18;
        int i19;
        l0.r rVar2;
        boolean z11;
        p251z9.j.e(str, "codePoints");
        c0698o.V(426705628);
        if ((i15 & 48) == 0) {
            i16 = i11;
            i17 = (c0698o.e(i16) ? 32 : 16) | i15;
        } else {
            i16 = i11;
            i17 = i15;
        }
        if ((i15 & 384) == 0) {
            i18 = i12;
            i17 |= c0698o.e(i18) ? 256 : 128;
        } else {
            i18 = i12;
        }
        if ((i15 & 3072) == 0) {
            i17 |= c0698o.e(i13) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i19 = i14;
            i17 |= c0698o.e(i19) ? 16384 : 8192;
        } else {
            i19 = i14;
        }
        if ((196608 & i15) == 0) {
            i17 |= c0698o.g(str) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i17 |= c0698o.g(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i15) == 0) {
            rVar2 = rVar;
            i17 |= c0698o.g(rVar2) ? 8388608 : 4194304;
        } else {
            rVar2 = rVar;
        }
        if ((100663296 & i15) == 0) {
            z11 = z10;
            i17 |= c0698o.h(z11) ? 67108864 : 33554432;
        } else {
            z11 = z10;
        }
        if ((805306368 & i15) == 0) {
            i17 |= c0698o.i(numberFormat) ? 536870912 : 268435456;
        }
        int i20 = 1;
        if (c0698o.K(i17 & 1, (306783377 & i17) != 306783376)) {
            c0698o.P();
            if ((i15 & 1) != 0 && !c0698o.w()) {
                c0698o.N();
            }
            c0698o.q();
            String str3 = numberFormat.format(Integer.valueOf(i16));
            p251z9.j.d(str3, "format(...)");
            String str4 = numberFormat.format(Integer.valueOf(i18));
            p251z9.j.d(str4, "format(...)");
            p074h0.d dVarD = p074h0.j.d(603218475, new G4.k(i20, str, p000a.a.n0(R.string.quarter_info_format, new Object[]{str2, str3, str4}, c0698o)), c0698o);
            int i21 = i17 >> 9;
            c(i13, rVar2, i19, z11, true, 4, numberFormat, dVarD, c0698o, ((i17 >> 6) & 896) | (i21 & 14) | 12804096 | ((i17 >> 18) & 112) | ((i17 >> 15) & 7168) | (3670016 & i21), 0);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            final int i22 = i18;
            c0699o0R.f10749d = new p241y9.e() { // from class: N4.c
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0813f2.f(i10, i16, i22, i13, i14, str, str2, rVar, z10, numberFormat, (C0698o) obj, C0672b.y(i15 | 1));
                    return y.f19095a;
                }
            };
        }
    }

    public static final void i(p124m3.h hVar, String str, l0.r rVar, boolean z10, NumberFormat numberFormat, C0698o c0698o, int i10) {
        p251z9.j.e(hVar, "quarterDao");
        p124m3.j jVar = hVar.g;
        c0698o.V(-1398565472);
        int i11 = i10 | (c0698o.i(hVar) ? 4 : 2) | (c0698o.g(str) ? 32 : 16) | (c0698o.g(rVar) ? 256 : 128) | (c0698o.h(z10) ? 2048 : 1024) | (c0698o.i(numberFormat) ? 16384 : 8192);
        if (c0698o.K(i11 & 1, (i11 & 9363) != 9362)) {
            c0698o.P();
            if ((i10 & 1) != 0 && !c0698o.w()) {
                c0698o.N();
            }
            c0698o.q();
            f(jVar.f19595m, jVar.f19586b, jVar.c(), hVar.f19576b, hVar.f19577c, jVar.f19590f, str, rVar, z10, numberFormat, c0698o, 2146959360 & (i11 << 15));
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new N4.b(hVar, str, rVar, z10, numberFormat, i10, 0);
        }
    }

    public static final void j(l0.r rVar, p074h0.d dVar, C0698o c0698o, int i10) {
        c0698o.V(-2105228848);
        int i11 = (c0698o.g(rVar) ? 4 : 2) | i10;
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVar);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, O.E.f6281a, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            dVar.invoke(c0698o, 6);
            c0698o.p(true);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new O.F(rVar, dVar, i10);
        }
    }

    public static final void k(l0.r rVar, p241y9.e eVar, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(-1177876616);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(eVar) ? 32 : 16;
        }
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            p104k1.d dVar = p104k1.d.f18907b;
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVar);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            int i13 = (((((i11 << 3) & 112) | (((i11 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, dVar, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            eVar.invoke(c0698o, Integer.valueOf((i13 >> 6) & 14));
            c0698o.p(true);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G.C(i10, 7, rVar, eVar);
        }
    }

    public static final JsonAdapter l(com.squareup.moshi.C c10, p251z9.A a9) {
        boolean z10;
        JsonAdapter jsonAdapterB = c10.b(F9.n.p(a9, false), V8.d.f8425a, null);
        return ((jsonAdapterB instanceof NullSafeJsonAdapter) || ((z10 = jsonAdapterB instanceof NonNullJsonAdapter)) || z10) ? jsonAdapterB : new NonNullJsonAdapter(jsonAdapterB);
    }

    public static ArrayList m(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new p120l9.j(objArr, true));
    }

    public static int n(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        p251z9.j.e(arrayList, "<this>");
        int size2 = arrayList.size();
        int i10 = 0;
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i11 = size - 1;
        while (i10 <= i11) {
            int i12 = (i10 + i11) >>> 1;
            int i13 = p185s8.u0.i((Comparable) arrayList.get(i12), comparable);
            if (i13 < 0) {
                i10 = i12 + 1;
            } else {
                if (i13 <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static p129m9.b o(p129m9.b bVar) {
        bVar.g();
        bVar.f19700t = true;
        return bVar.f19699s > 0 ? bVar : p129m9.b.f19697u;
    }

    public static final Bundle p(p110k9.j... jVarArr) {
        Bundle bundle = new Bundle(jVarArr.length);
        for (p110k9.j jVar : jVarArr) {
            String str = (String) jVar.f19077r;
            Object obj = jVar.f19078s;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                p251z9.j.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p150o9.c r(p150o9.c cVar, p150o9.c cVar2, p241y9.e eVar) {
        p251z9.j.e(eVar, "<this>");
        if (eVar instanceof q9.a) {
            return ((q9.a) eVar).create(cVar, cVar2);
        }
        p150o9.h context = cVar2.getContext();
        return context == p150o9.i.f20380r ? new p161p9.b(cVar2, cVar, eVar) : new p161p9.c(cVar2, context, eVar, cVar);
    }

    public static final Y0.f s(Context context) {
        R7.f fVar = new R7.f(17);
        context.getApplicationContext();
        return new Y0.f(fVar, new Y0.a(Build.VERSION.SDK_INT >= 31 ? Y0.m.f10365a.a(context) : 0));
    }

    public static final File t(Context context, String str) {
        p251z9.j.e(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static String u(C0733g c0733g) {
        StringBuilder sb = new StringBuilder(c0733g.size());
        for (int i10 = 0; i10 < c0733g.size(); i10++) {
            byte b5 = c0733g.b(i10);
            if (b5 == 34) {
                sb.append("\\\"");
            } else if (b5 == 39) {
                sb.append("\\'");
            } else if (b5 != 92) {
                switch (b5) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        sb.append("\\r");
                        break;
                    default:
                        if (b5 < 32 || b5 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b5 >>> 6) & 3) + 48));
                            sb.append((char) (((b5 >>> 3) & 7) + 48));
                            sb.append((char) ((b5 & 7) + 48));
                        } else {
                            sb.append((char) b5);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final int v(int i10, List list) {
        int i11;
        byte b5;
        int i12 = ((U0.r) p120l9.m.m0(list)).f8117c;
        if (i10 > ((U0.r) p120l9.m.m0(list)).f8117c) {
            p002a1.a.a("Index " + i10 + " should be less or equal than last line's end " + i12);
        }
        int size = list.size() - 1;
        int i13 = 0;
        while (true) {
            if (i13 > size) {
                i11 = -(i13 + 1);
                break;
            }
            i11 = (i13 + size) >>> 1;
            U0.r rVar = (U0.r) list.get(i11);
            if (rVar.f8116b > i10) {
                b5 = 1;
            } else {
                b5 = rVar.f8117c <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b5 >= 0) {
                if (b5 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i13 = i11 + 1;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            return i11;
        }
        StringBuilder sbW = p123m2.c.w(i11, "Found paragraph index ", " should be in range [0, ");
        sbW.append(list.size());
        sbW.append(").\nDebug info: index=");
        sbW.append(i10);
        sbW.append(", paragraphs=[");
        sbW.append(p086i1.a.a(31, null, list));
        sbW.append(']');
        p002a1.a.a(sbW.toString());
        return i11;
    }

    public static final int w(int i10, List list) {
        byte b5;
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            U0.r rVar = (U0.r) list.get(i12);
            if (rVar.f8118d > i10) {
                b5 = 1;
            } else {
                b5 = rVar.f8119e <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b5 < 0) {
                i11 = i12 + 1;
            } else {
                if (b5 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int x(ArrayList arrayList, float f3) {
        byte b5;
        if (f3 <= 0.0f) {
            return 0;
        }
        if (f3 >= ((U0.r) p120l9.m.m0(arrayList)).g) {
            return E(arrayList);
        }
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            U0.r rVar = (U0.r) arrayList.get(i11);
            if (rVar.f8120f > f3) {
                b5 = 1;
            } else {
                b5 = rVar.g <= f3 ? (byte) -1 : (byte) 0;
            }
            if (b5 < 0) {
                i10 = i11 + 1;
            } else {
                if (b5 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void y(ArrayList arrayList, long j, p241y9.c cVar) {
        int size = arrayList.size();
        for (int iV = v(U0.K.e(j), arrayList); iV < size; iV++) {
            U0.r rVar = (U0.r) arrayList.get(iV);
            if (rVar.f8116b >= U0.K.d(j)) {
                return;
            }
            if (rVar.f8116b != rVar.f8117c) {
                cVar.e(rVar);
            }
        }
    }

    public static long z(int i10, int i11, int i12, int i13) {
        int i14 = 262142;
        int iMin = Math.min(i12, 262142);
        int iMin2 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
        int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i14 = 65534;
            } else if (i15 < 65535) {
                i14 = 32766;
            } else {
                if (i15 >= 262143) {
                    p063g1.b.l(i15);
                    throw new A6.a();
                }
                i14 = 8190;
            }
        }
        return p063g1.b.a(Math.min(i14, i10), i11 != Integer.MAX_VALUE ? Math.min(i14, i11) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public abstract Object D(I0.f fVar);

    public abstract Object F(p150o9.c cVar);

    public abstract p124m3.j G();

    public abstract int N(int i10);

    public abstract int Q(int i10);

    public abstract Object R(Uri uri, InputEvent inputEvent, p150o9.c cVar);

    public abstract Object S(Uri uri, p150o9.c cVar);

    @Override // W0.d
    public int d(int i10) {
        return Q(i10);
    }

    @Override // W0.d
    public int e(int i10) {
        return N(i10);
    }

    @Override // W0.d
    public int g(int i10) {
        int iN = N(i10);
        if (iN == -1 || N(iN) == -1) {
            return -1;
        }
        return iN;
    }

    @Override // W0.d
    public int h(int i10) {
        int iQ = Q(i10);
        if (iQ == -1 || Q(iQ) == -1) {
            return -1;
        }
        return iQ;
    }

    public abstract boolean q(I0.f fVar);
}
