package B0;

import D.AbstractC0071n;
import F9.n;
import J0.AbstractC0283f;
import J0.C0298v;
import K.T;
import K0.AbstractC0359n0;
import U0.C;
import U0.D;
import U0.E;
import U0.L;
import U0.u;
import U0.v;
import U0.w;
import U6.C0532j;
import V0.q;
import V0.s;
import W2.y;
import Y0.k;
import Z.C0698o;
import Z.C0699o0;
import Z0.B;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ayah.R;
import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.Page;
import com.ayah.dao.realm.model.quran.Part;
import com.ayah.dao.realm.model.quran.Quarter;
import com.ayah.dao.realm.model.quran.Section;
import com.ayah.dao.realm.model.quran.Verse;
import com.ayah.dao.realm.model.quran.VerseHighlight;
import com.ayah.dao.realm.model.quran.VerseMarker;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.AbstractC0828i2;
import com.google.android.gms.internal.measurement.C0833j2;
import com.google.android.gms.internal.measurement.C0872r2;
import com.google.android.gms.internal.measurement.D2;
import com.google.android.gms.internal.measurement.InterfaceC0858o2;
import com.google.android.gms.internal.measurement.K2;
import com.google.android.gms.internal.measurement.O2;
import com.google.android.gms.internal.measurement.V2;
import com.google.android.gms.internal.measurement.W1;
import com.google.android.gms.internal.measurement.Z1;
import io.realm.RealmList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import l0.o;
import l0.r;
import p017b7.g;
import p055f1.i;
import p055f1.p;
import p055f1.t;
import p063g1.f;
import p063g1.m;
import p085i0.h;
import p085i0.l;
import p180s0.F;
import p180s0.I;
import p224x0.C1442f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C1442f f586a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C1442f f587b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f588c = true;

    public static p005a4.a A(C0698o c0698o) {
        return (p005a4.a) c0698o.k(p005a4.e.f11187a);
    }

    public static final float C(Layout layout, int i10, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        q qVar = s.f8399a;
        if (layout.getEllipsisCount(i10) <= 0 || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment == null ? -1 : X0.d.f9816a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float D(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        q qVar = s.f8399a;
        if (layout.getEllipsisCount(i10) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i10) != -1 || layout.getWidth() >= layout.getLineRight(i10)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment != null ? X0.d.f9816a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final long H(KeyEvent keyEvent) {
        return g.C(keyEvent.getKeyCode());
    }

    public static final ViewParent M(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final int O(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final void P(String str) {
        j.e(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                n.n(16);
                String string = Integer.toString(cCharAt, 16);
                j.d(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i10);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void Q(String str, String str2) {
        j.e(str, "value");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                n.n(16);
                String string = Integer.toString(cCharAt, 16);
                j.d(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i10);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(la.c.i(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static String V(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }

    public static final p085i0.g Y(C0698o c0698o) {
        c0698o.T(-796079677);
        p085i0.g gVar = (p085i0.g) va.g.H(new Object[0], p085i0.g.f16720e, h.f16725s, c0698o, 3072, 4);
        gVar.f16723c = (p085i0.j) c0698o.k(l.f16731a);
        c0698o.p(false);
        return gVar;
    }

    public static final void a(r rVar, long j, float f3, float f7, C0698o c0698o, int i10) {
        r rVar2;
        float f10;
        float f11;
        float density;
        c0698o.V(-1249392198);
        int i11 = i10 | 6 | (c0698o.f(j) ? 32 : 16) | 3072;
        if (c0698o.K(i11 & 1, (i11 & 1171) != 1170)) {
            c0698o.P();
            int i12 = i10 & 1;
            r rVarL = o.f19333a;
            if (i12 == 0 || c0698o.w()) {
                f11 = 0;
                rVar2 = rVarL;
            } else {
                c0698o.N();
                rVar2 = rVar;
                f11 = f7;
            }
            c0698o.q();
            if (f11 != 0.0f) {
                rVarL = androidx.compose.foundation.layout.b.l(rVarL, f11, 0.0f, 0.0f, 0.0f, 14);
            }
            if (f.a(f3, 0.0f)) {
                c0698o.T(-129273423);
                density = 1.0f / ((p063g1.c) c0698o.k(AbstractC0359n0.f5118h)).getDensity();
                c0698o.p(false);
            } else {
                c0698o.T(-129206866);
                c0698o.p(false);
                density = f3;
            }
            AbstractC0071n.a(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.d(rVar2.b(rVarL).b(androidx.compose.foundation.layout.c.f11826a), density), j, F.f21774a), c0698o, 0);
            f10 = f11;
        } else {
            c0698o.N();
            rVar2 = rVar;
            f10 = f7;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new P.a(rVar2, j, f3, f10, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0108  */
    /* JADX WARN: Code duplicated, block: B:79:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0113  */
    public static final L a0(L l10, m mVar) {
        long j;
        p055f1.r rVar;
        int i10;
        int i11;
        t tVar;
        C c10 = l10.f8037a;
        p pVar = E.f8011d;
        p pVarA = c10.f7994a.a(D.f8007r);
        long j10 = c10.f7995b;
        p063g1.p[] pVarArr = p063g1.o.f16265b;
        if ((j10 & 1095216660480L) == 0) {
            j10 = E.f8008a;
        }
        long j11 = j10;
        Y0.l lVar = c10.f7996c;
        if (lVar == null) {
            lVar = Y0.l.f10359t;
        }
        Y0.l lVar2 = lVar;
        Y0.j jVar = c10.f7997d;
        Y0.j jVar2 = new Y0.j(jVar != null ? jVar.f10356a : 0);
        k kVar = c10.f7998e;
        k kVar2 = new k(kVar != null ? kVar.f10357a : 65535);
        Y0.e eVar = c10.f7999f;
        if (eVar == null) {
            eVar = Y0.e.f10347a;
        }
        Y0.e eVar2 = eVar;
        String str = c10.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j12 = c10.f8000h;
        if ((j12 & 1095216660480L) == 0) {
            j12 = E.f8009b;
        }
        long j13 = j12;
        p055f1.a aVar = c10.f8001i;
        p055f1.a aVar2 = new p055f1.a(aVar != null ? aVar.f15894a : 0.0f);
        p055f1.q qVar = c10.j;
        if (qVar == null) {
            qVar = p055f1.q.f15921c;
        }
        p055f1.q qVar2 = qVar;
        p012b1.c cVarC = c10.f8002k;
        if (cVarC == null) {
            p012b1.c cVar = p012b1.c.f13144t;
            cVarC = p012b1.e.f13147a.c();
        }
        p012b1.c cVar2 = cVarC;
        long j14 = c10.f8003l;
        if (j14 == 16) {
            j14 = E.f8010c;
        }
        long j15 = j14;
        p055f1.l lVar3 = c10.f8004m;
        if (lVar3 == null) {
            lVar3 = p055f1.l.f15913b;
        }
        p055f1.l lVar4 = lVar3;
        I i12 = c10.f8005n;
        if (i12 == null) {
            i12 = I.f21798d;
        }
        I i13 = i12;
        p196u0.c cVar3 = c10.f8006o;
        if (cVar3 == null) {
            cVar3 = p196u0.f.f22800b;
        }
        C c11 = new C(pVarA, j11, lVar2, jVar2, kVar2, eVar2, str2, j13, aVar2, qVar2, cVar2, j15, lVar4, i13, null, cVar3);
        u uVar = l10.f8038b;
        int i14 = v.f8133b;
        int i15 = uVar.f8124a;
        int i16 = 5;
        if (i15 == Integer.MIN_VALUE) {
            i15 = 5;
        }
        int i17 = uVar.f8125b;
        if (i17 != 3) {
            if (i17 == Integer.MIN_VALUE) {
                int iOrdinal = mVar.ordinal();
                if (iOrdinal == 0) {
                    i17 = 1;
                } else {
                    if (iOrdinal != 1) {
                        throw new A6.a();
                    }
                    i16 = 2;
                }
            }
            j = uVar.f8126c;
            if ((j & 1095216660480L) == 0) {
                j = v.f8132a;
            }
            rVar = uVar.f8127d;
            if (rVar == null) {
                rVar = p055f1.r.f15924c;
            }
            long j16 = j;
            w wVar = uVar.f8128e;
            i iVar = uVar.f8129f;
            i10 = uVar.g;
            if (i10 == 0) {
                i10 = p055f1.e.f15899b;
            }
            i11 = uVar.f8130h;
            if (i11 == Integer.MIN_VALUE) {
                i11 = 1;
            }
            tVar = uVar.f8131i;
            if (tVar == null) {
                tVar = t.f15928c;
            }
            return new L(c11, new u(i15, i17, j16, rVar, wVar, iVar, i10, i11, tVar), l10.f8039c);
        }
        int iOrdinal2 = mVar.ordinal();
        if (iOrdinal2 == 0) {
            i16 = 4;
        } else if (iOrdinal2 != 1) {
            throw new A6.a();
        }
        i17 = i16;
        j = uVar.f8126c;
        if ((j & 1095216660480L) == 0) {
            j = v.f8132a;
        }
        rVar = uVar.f8127d;
        if (rVar == null) {
            rVar = p055f1.r.f15924c;
        }
        long j17 = j;
        w wVar2 = uVar.f8128e;
        i iVar2 = uVar.f8129f;
        i10 = uVar.g;
        if (i10 == 0) {
            i10 = p055f1.e.f15899b;
        }
        i11 = uVar.f8130h;
        if (i11 == Integer.MIN_VALUE) {
            i11 = 1;
        }
        tVar = uVar.f8131i;
        if (tVar == null) {
            tVar = t.f15928c;
        }
        return new L(c11, new u(i15, i17, j17, rVar, wVar2, iVar2, i10, i11, tVar), l10.f8039c);
    }

    public static final boolean b(p141o0.d dVar, long j) {
        if (!dVar.f19339r.f19338E) {
            return false;
        }
        C0298v c0298v = (C0298v) AbstractC0283f.x(dVar).f3914W.f4064c;
        if (!c0298v.f4178d0.f19338E) {
            return false;
        }
        long jG = c0298v.G(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jG >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jG & 4294967295L));
        long j10 = dVar.f20213H;
        float f3 = ((int) (j10 >> 32)) + fIntBitsToFloat;
        float f7 = ((int) (j10 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f3) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f7;
    }

    public static final p063g1.k b0(p171r0.e eVar) {
        return new p063g1.k(Math.round(eVar.f21389a), Math.round(eVar.f21390b), Math.round(eVar.f21391c), Math.round(eVar.f21392d));
    }

    public static final boolean c(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = p120l9.r.f19440r;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iE = AbstractC0813f2.E(arrayList);
                int i10 = 0;
                while (i10 < iE) {
                    i10++;
                    Object obj2 = arrayList.get(i10);
                    R0.p pVar = (R0.p) obj2;
                    R0.p pVar2 = (R0.p) obj;
                    arrayList2.add(new p171r0.c((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (pVar2.e().b() >> 32)) - Float.intBitsToFloat((int) (pVar.e().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (pVar2.e().b() & 4294967295L)) - Float.intBitsToFloat((int) (pVar.e().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((p171r0.c) p120l9.m.f0(list)).f21387a;
            } else {
                if (list.isEmpty()) {
                    p086i1.a.b("Empty collection can't be reduced.");
                }
                Object objF0 = p120l9.m.f0(list);
                int iE2 = AbstractC0813f2.E(list);
                if (1 <= iE2) {
                    int i11 = 1;
                    while (true) {
                        objF0 = new p171r0.c(p171r0.c.h(((p171r0.c) objF0).f21387a, ((p171r0.c) list.get(i11)).f21387a));
                        if (i11 == iE2) {
                            break;
                        }
                        i11++;
                    }
                }
                j = ((p171r0.c) objF0).f21387a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void d0(Window window, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            B1.b.f(window, z10);
        } else {
            if (i10 >= 30) {
                B1.b.e(window, z10);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static boolean f(A1.e[] eVarArr, A1.e[] eVarArr2) {
        if (eVarArr == null || eVarArr2 == null || eVarArr.length != eVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            A1.e eVar = eVarArr[i10];
            char c10 = eVar.f467a;
            A1.e eVar2 = eVarArr2[i10];
            if (c10 != eVar2.f467a || eVar.f468b.length != eVar2.f468b.length) {
                return false;
            }
        }
        return true;
    }

    public static void g(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static E9.b g0(E9.d dVar, int i10) {
        j.e(dVar, "<this>");
        boolean z10 = i10 > 0;
        Integer numValueOf = Integer.valueOf(i10);
        if (!z10) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i11 = dVar.f1995r;
        int i12 = dVar.f1996s;
        if (dVar.f1997t <= 0) {
            i10 = -i10;
        }
        return new E9.b(i11, i12, i10);
    }

    public static void h(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void h0(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            y.b(viewGroup, z10);
        } else if (f588c) {
            try {
                y.b(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f588c = false;
            }
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static E9.d i0(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new E9.d(i10, i11 - 1, 1);
        }
        E9.d dVar = E9.d.f2002u;
        return E9.d.f2002u;
    }

    public static double j(double d5, double d9, double d10) {
        if (d9 <= d10) {
            if (d5 < d9) {
                return d9;
            }
            return d5 > d10 ? d10 : d5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d10 + " is less than minimum " + d9 + '.');
    }

    public static float k(float f3, float f7, float f10) {
        if (f7 <= f10) {
            if (f3 < f7) {
                return f7;
            }
            return f3 > f10 ? f10 : f3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f10 + " is less than minimum " + f7 + '.');
    }

    public static int l(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long m(long j, long j10, long j11) {
        if (j10 <= j11) {
            if (j < j10) {
                return j10;
            }
            return j > j11 ? j11 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j11 + " is less than minimum " + j10 + '.');
    }

    public static int m0(byte[] bArr, int i10, W1 w9) {
        int i11 = i10 + 1;
        byte b5 = bArr[i10];
        if (b5 < 0) {
            return n0(b5, bArr, i11, w9);
        }
        w9.f14151a = b5;
        return i11;
    }

    public static Comparable n(Float f3, E9.a aVar) {
        float f7 = aVar.f1994b;
        float f10 = aVar.f1993a;
        if (f10 <= f7) {
            if (!E9.a.a(f3, Float.valueOf(f10)) || E9.a.a(Float.valueOf(f10), f3)) {
                return (!E9.a.a(Float.valueOf(f7), f3) || E9.a.a(f3, Float.valueOf(f7))) ? f3 : Float.valueOf(f7);
            }
            return Float.valueOf(f10);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar + '.');
    }

    public static int n0(int i10, byte[] bArr, int i11, W1 w9) {
        byte b5 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b5 >= 0) {
            w9.f14151a = i13 | (b5 << 7);
            return i12;
        }
        int i14 = i13 | ((b5 & 127) << 7);
        int i15 = i11 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            w9.f14151a = i14 | (b10 << 14);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 14);
        int i17 = i11 + 3;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            w9.f14151a = i16 | (b11 << 21);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 21);
        int i19 = i11 + 4;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            w9.f14151a = i18 | (b12 << 28);
            return i19;
        }
        int i20 = i18 | ((b12 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                w9.f14151a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static final void o(B b5, String str, String str2) {
        j.e(str2, "value");
        ArrayList arrayList = (ArrayList) b5.f10875s;
        arrayList.add(str);
        arrayList.add(H9.o.t1(str2).toString());
    }

    public static int o0(byte[] bArr, int i10, W1 w9) {
        long j = bArr[i10];
        int i11 = i10 + 1;
        if (j >= 0) {
            w9.f14152b = j;
            return i11;
        }
        int i12 = i10 + 2;
        byte b5 = bArr[i11];
        long j10 = (j & 127) | (((long) (b5 & 127)) << 7);
        int i13 = 7;
        while (b5 < 0) {
            int i14 = i12 + 1;
            byte b10 = bArr[i12];
            i13 += 7;
            j10 |= ((long) (b10 & 127)) << i13;
            b5 = b10;
            i12 = i14;
        }
        w9.f14152b = j10;
        return i12;
    }

    public static int p0(int i10, byte[] bArr) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static final boolean q(p171r0.e eVar, float f3, float f7) {
        float f10 = eVar.f21389a;
        if (f3 > eVar.f21391c || f10 > f3) {
            return false;
        }
        return f7 <= eVar.f21392d && eVar.f21390b <= f7;
    }

    public static long q0(int i10, byte[] bArr) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public static float[] r(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i10, length);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3 A[PHI: r5
      0x00a3: PHI (r5v6 byte) = (r5v5 byte), (r5v9 byte) binds: [B:45:0x009e, B:47:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00bb A[SYNTHETIC] */
    public static int r0(byte[] bArr, int i10, W1 w9) throws C0872r2 {
        int iM0 = m0(bArr, i10, w9);
        int i11 = w9.f14151a;
        if (i11 < 0) {
            throw new C0872r2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            w9.f14153c = "";
            return iM0;
        }
        int i12 = V2.f14145a;
        int length = bArr.length;
        if ((((length - iM0) - i11) | iM0 | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iM0), Integer.valueOf(i11)));
        }
        int i13 = iM0 + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (iM0 < i13) {
            byte b5 = bArr[iM0];
            if (b5 < 0) {
                break;
            }
            iM0++;
            cArr[i14] = (char) b5;
            i14++;
        }
        while (iM0 < i13) {
            int i15 = iM0 + 1;
            byte b10 = bArr[iM0];
            if (b10 >= 0) {
                cArr[i14] = (char) b10;
                i14++;
                iM0 = i15;
                while (iM0 < i13) {
                    byte b11 = bArr[iM0];
                    if (b11 < 0) {
                        break;
                    }
                    iM0++;
                    cArr[i14] = (char) b11;
                    i14++;
                }
            } else if (b10 < -32) {
                if (i15 >= i13) {
                    throw new C0872r2("Protocol message had invalid UTF-8.");
                }
                int i16 = i14 + 1;
                iM0 += 2;
                byte b12 = bArr[i15];
                if (b10 < -62 || p000a.a.u0(b12)) {
                    throw new C0872r2("Protocol message had invalid UTF-8.");
                }
                cArr[i14] = (char) ((b12 & 63) | ((b10 & 31) << 6));
                i14 = i16;
            } else {
                if (b10 < -16) {
                    if (i15 >= i13 - 1) {
                        throw new C0872r2("Protocol message had invalid UTF-8.");
                    }
                    int i17 = i14 + 1;
                    int i18 = iM0 + 2;
                    byte b13 = bArr[i15];
                    iM0 += 3;
                    byte b14 = bArr[i18];
                    if (!p000a.a.u0(b13)) {
                        if (b10 != -32) {
                            if (b10 != -19) {
                                if (!p000a.a.u0(b14)) {
                                    cArr[i14] = (char) (((b13 & 63) << 6) | ((b10 & 15) << 12) | (b14 & 63));
                                    i14 = i17;
                                }
                            } else if (b13 < -96) {
                                b10 = -19;
                                if (!p000a.a.u0(b14)) {
                                    cArr[i14] = (char) (((b13 & 63) << 6) | ((b10 & 15) << 12) | (b14 & 63));
                                    i14 = i17;
                                }
                            }
                        } else if (b13 >= -96) {
                            b10 = -32;
                            if (b10 != -19) {
                                if (!p000a.a.u0(b14)) {
                                    cArr[i14] = (char) (((b13 & 63) << 6) | ((b10 & 15) << 12) | (b14 & 63));
                                    i14 = i17;
                                }
                            } else if (b13 < -96) {
                                b10 = -19;
                                if (!p000a.a.u0(b14)) {
                                    cArr[i14] = (char) (((b13 & 63) << 6) | ((b10 & 15) << 12) | (b14 & 63));
                                    i14 = i17;
                                }
                            }
                        }
                    }
                    throw new C0872r2("Protocol message had invalid UTF-8.");
                }
                if (i15 >= i13 - 2) {
                    throw new C0872r2("Protocol message had invalid UTF-8.");
                }
                byte b15 = bArr[i15];
                int i19 = iM0 + 3;
                byte b16 = bArr[iM0 + 2];
                iM0 += 4;
                byte b17 = bArr[i19];
                if (p000a.a.u0(b15) || (((b15 + 112) + (b10 << 28)) >> 30) != 0 || p000a.a.u0(b16) || p000a.a.u0(b17)) {
                    throw new C0872r2("Protocol message had invalid UTF-8.");
                }
                int i20 = ((b15 & 63) << 12) | ((b10 & 7) << 18) | ((b16 & 63) << 6) | (b17 & 63);
                cArr[i14] = (char) ((i20 >>> 10) + 55232);
                cArr[i14 + 1] = (char) ((i20 & 1023) + 56320);
                i14 += 2;
            }
        }
        w9.f14153c = new String(cArr, 0, i14);
        return i13;
    }

    public static p013b2.t s(Context context) {
        ProviderInfo providerInfo;
        F1.g gVar;
        ApplicationInfo applicationInfo;
        C0532j cVar = Build.VERSION.SDK_INT >= 28 ? new p013b2.c(20) : new C0532j(20);
        PackageManager packageManager = context.getPackageManager();
        i(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            gVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrL = cVar.l(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrL) {
                    arrayList.add(signature.toByteArray());
                }
                gVar = new F1.g(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                gVar = null;
            }
        }
        if (gVar == null) {
            return null;
        }
        return new p013b2.t(new p013b2.s(context, gVar));
    }

    public static int s0(byte[] bArr, int i10, W1 w9) throws C0872r2 {
        int iM0 = m0(bArr, i10, w9);
        int i11 = w9.f14151a;
        if (i11 < 0) {
            throw new C0872r2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iM0) {
            throw new C0872r2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            w9.f14153c = Z1.f14184t;
            return iM0;
        }
        w9.f14153c = Z1.e(bArr, iM0, i11);
        return iM0 + i11;
    }

    public static String t(Object obj, String str) {
        j.e(obj, "value");
        return str + " value: " + obj;
    }

    public static int t0(Object obj, K2 k7, byte[] bArr, int i10, int i11, W1 w9) throws C0872r2 {
        int iN0 = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iN0 = n0(i12, bArr, iN0, w9);
            i12 = w9.f14151a;
        }
        int i13 = iN0;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new C0872r2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = w9.f14154d + 1;
        w9.f14154d = i14;
        if (i14 >= 100) {
            throw new C0872r2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        k7.c(obj, bArr, i13, i15, w9);
        w9.f14154d--;
        w9.f14153c = obj;
        return i15;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    public static A1.e[] u(String str) {
        int i10;
        String strTrim;
        float[] fArrR;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i13 < str.length()) {
            while (i13 < str.length()) {
                char cCharAt = str.charAt(i13);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i12, i13).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i11) != 'z' || strTrim.charAt(i11) == 'Z') {
                                fArrR = new float[i11];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i14 = i11;
                                    int i15 = 1;
                                    while (i15 < length) {
                                        int i16 = i11;
                                        int i17 = i16;
                                        int i18 = i17;
                                        int i19 = i18;
                                        for (int i20 = i15; i20 < strTrim.length(); i20++) {
                                            char cCharAt2 = strTrim.charAt(i20);
                                            if (cCharAt2 == ' ') {
                                                i16 = 0;
                                                i18 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i16 = 0;
                                                        i18 = 1;
                                                        break;
                                                    case '-':
                                                        if (i20 == i15 || i16 != 0) {
                                                            i16 = 0;
                                                        } else {
                                                            i16 = 0;
                                                            i18 = 1;
                                                            i19 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i17 == 0) {
                                                            i16 = 0;
                                                            i17 = 1;
                                                        } else {
                                                            i16 = 0;
                                                            i18 = 1;
                                                            i19 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i16 = 0;
                                                        break;
                                                }
                                            } else {
                                                i16 = 1;
                                            }
                                            if (i18 != 0) {
                                                if (i15 < i20) {
                                                    fArr[i14] = Float.parseFloat(strTrim.substring(i15, i20));
                                                    i14++;
                                                }
                                                if (i19 != 0) {
                                                    i15 = i20;
                                                } else {
                                                    i15 = i20 + 1;
                                                }
                                                i11 = 0;
                                            }
                                        }
                                        if (i15 < i20) {
                                            fArr[i14] = Float.parseFloat(strTrim.substring(i15, i20));
                                            i14++;
                                        }
                                        if (i19 != 0) {
                                            i15 = i20;
                                        } else {
                                            i15 = i20 + 1;
                                        }
                                        i11 = 0;
                                    }
                                    fArrR = r(fArr, i14);
                                    i11 = 0;
                                } catch (NumberFormatException e10) {
                                    throw new RuntimeException(p245z2.a.D("error in parsing \"", strTrim, "\""), e10);
                                }
                            }
                            arrayList.add(new A1.e(strTrim.charAt(i11), fArrR));
                        }
                        i12 = i13;
                        i13++;
                        i11 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i13++;
            }
            strTrim = str.substring(i12, i13).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i11) != 'z') {
                    fArrR = new float[i11];
                } else {
                    fArrR = new float[i11];
                }
                arrayList.add(new A1.e(strTrim.charAt(i11), fArrR));
            }
            i12 = i13;
            i13++;
            i11 = 0;
        }
        if (i13 - i12 != 1 || i12 >= str.length()) {
            i10 = 0;
        } else {
            i10 = 0;
            arrayList.add(new A1.e(str.charAt(i12), new float[0]));
        }
        return (A1.e[]) arrayList.toArray(new A1.e[i10]);
    }

    public static int u0(Object obj, K2 k7, byte[] bArr, int i10, int i11, int i12, W1 w9) throws C0872r2 {
        D2 d5 = (D2) k7;
        int i13 = w9.f14154d + 1;
        w9.f14154d = i13;
        if (i13 >= 100) {
            throw new C0872r2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iT = d5.t(obj, bArr, i10, i11, i12, w9);
        w9.f14154d--;
        w9.f14153c = obj;
        return iT;
    }

    public static Path v(String str) {
        Path path = new Path();
        try {
            A1.e.b(u(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing ".concat(str), e10);
        }
    }

    public static int v0(int i10, byte[] bArr, int i11, int i12, InterfaceC0858o2 interfaceC0858o2, W1 w9) {
        C0833j2 c0833j2 = (C0833j2) interfaceC0858o2;
        int iM0 = m0(bArr, i11, w9);
        c0833j2.e(w9.f14151a);
        while (iM0 < i12) {
            int iM1 = m0(bArr, iM0, w9);
            if (i10 != w9.f14151a) {
                break;
            }
            iM0 = m0(bArr, iM1, w9);
            c0833j2.e(w9.f14151a);
        }
        return iM0;
    }

    public static A1.e[] w(A1.e[] eVarArr) {
        A1.e[] eVarArr2 = new A1.e[eVarArr.length];
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10] = new A1.e(eVarArr[i10]);
        }
        return eVarArr2;
    }

    public static int w0(byte[] bArr, int i10, InterfaceC0858o2 interfaceC0858o2, W1 w9) throws C0872r2 {
        C0833j2 c0833j2 = (C0833j2) interfaceC0858o2;
        int iM0 = m0(bArr, i10, w9);
        int i11 = w9.f14151a + iM0;
        while (iM0 < i11) {
            iM0 = m0(bArr, iM0, w9);
            c0833j2.e(w9.f14151a);
        }
        if (iM0 == i11) {
            return iM0;
        }
        throw new C0872r2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static final long x(long j, boolean z10, int i10, float f3) {
        int iH = ((z10 || i10 == 2 || i10 == 4 || i10 == 5) && p063g1.a.d(j)) ? p063g1.a.h(j) : Integer.MAX_VALUE;
        if (p063g1.a.j(j) != iH) {
            iH = l(T.p(f3), p063g1.a.j(j), iH);
        }
        return AbstractC0813f2.A(0, iH, 0, p063g1.a.g(j));
    }

    public static int x0(K2 k7, int i10, byte[] bArr, int i11, int i12, InterfaceC0858o2 interfaceC0858o2, W1 w9) throws C0872r2 {
        AbstractC0828i2 abstractC0828i2A = k7.a();
        K2 k10 = k7;
        byte[] bArr2 = bArr;
        int i13 = i12;
        W1 w10 = w9;
        int iT0 = t0(abstractC0828i2A, k10, bArr2, i11, i13, w10);
        k10.b(abstractC0828i2A);
        w10.f14153c = abstractC0828i2A;
        interfaceC0858o2.add(abstractC0828i2A);
        while (iT0 < i13) {
            W1 w11 = w10;
            int i14 = i13;
            int iM0 = m0(bArr2, iT0, w11);
            if (i10 != w11.f14151a) {
                break;
            }
            byte[] bArr3 = bArr2;
            K2 k11 = k10;
            AbstractC0828i2 abstractC0828i2A2 = k11.a();
            iT0 = t0(abstractC0828i2A2, k11, bArr3, iM0, i14, w11);
            k10 = k11;
            bArr2 = bArr3;
            i13 = i14;
            w10 = w11;
            k10.b(abstractC0828i2A2);
            w10.f14153c = abstractC0828i2A2;
            interfaceC0858o2.add(abstractC0828i2A2);
        }
        return iT0;
    }

    public static p124m3.j y(Verse verse, p114l3.b bVar) {
        j.e(bVar, "pageTypeDecider");
        int verseID = (int) verse.getVerseID();
        int number = (int) verse.getNumber();
        String text = verse.getText();
        String textWithoutTashkil = verse.getTextWithoutTashkil();
        String uthmanicHafsText = verse.getUthmanicHafsText();
        String hafsSmartText = verse.getHafsSmartText();
        String searchableText = verse.getSearchableText();
        Part part = verse.getPart();
        j.b(part);
        int number2 = (int) part.getNumber();
        Quarter quarter = verse.getQuarter();
        j.b(quarter);
        int identifier = (int) quarter.getIdentifier();
        Section section = verse.getSection();
        j.b(section);
        int identifier2 = (int) section.getIdentifier();
        Page page1405 = verse.getPage1405();
        j.b(page1405);
        int number3 = (int) page1405.getNumber();
        Page page1441 = verse.getPage1441();
        j.b(page1441);
        int number4 = (int) page1441.getNumber();
        Chapter chapter = verse.getChapter();
        j.b(chapter);
        int number5 = (int) chapter.getNumber();
        Chapter chapter2 = verse.getChapter();
        j.b(chapter2);
        p124m3.a aVarB0 = g.b0(chapter2, bVar, true);
        VerseMarker marker1405 = verse.getMarker1405();
        j.b(marker1405);
        p124m3.l lVar = new p124m3.l(marker1405.getNumberCodePoint(), (int) marker1405.getLine(), marker1405.getCenterX(), marker1405.getCenterY());
        VerseMarker marker1441 = verse.getMarker1441();
        j.b(marker1441);
        p124m3.l lVar2 = new p124m3.l(marker1441.getNumberCodePoint(), (int) marker1441.getLine(), marker1441.getCenterX(), marker1441.getCenterY());
        RealmList<VerseHighlight> highlights1405 = verse.getHighlights1405();
        ArrayList arrayList = new ArrayList(p120l9.n.a0(highlights1405, 10));
        Iterator<VerseHighlight> it = highlights1405.iterator();
        while (it.hasNext()) {
            VerseHighlight next = it.next();
            j.b(next);
            Iterator<VerseHighlight> it2 = it;
            arrayList.add(new p124m3.k(next.getLeft(), next.getRight(), (int) next.getLine()));
            lVar2 = lVar2;
            it = it2;
        }
        p124m3.l lVar3 = lVar2;
        RealmList<VerseHighlight> highlights1441 = verse.getHighlights1441();
        ArrayList arrayList2 = new ArrayList(p120l9.n.a0(highlights1441, 10));
        for (Iterator<VerseHighlight> it3 = highlights1441.iterator(); it3.hasNext(); it3 = it3) {
            VerseHighlight next2 = it3.next();
            j.b(next2);
            ArrayList arrayList3 = arrayList;
            arrayList2.add(new p124m3.k(next2.getLeft(), next2.getRight(), (int) next2.getLine()));
            arrayList = arrayList3;
        }
        return new p124m3.j(verseID, number, text, textWithoutTashkil, uthmanicHafsText, hafsSmartText, searchableText, number2, identifier, identifier2, number3, number4, number5, aVarB0, lVar, lVar3, arrayList, arrayList2, bVar);
    }

    public static int y0(int i10, byte[] bArr, int i11, int i12, O2 o10, W1 w9) throws C0872r2 {
        if ((i10 >>> 3) == 0) {
            throw new C0872r2("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iO0 = o0(bArr, i11, w9);
            o10.d(i10, Long.valueOf(w9.f14152b));
            return iO0;
        }
        if (i13 == 1) {
            o10.d(i10, Long.valueOf(q0(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iM0 = m0(bArr, i11, w9);
            int i14 = w9.f14151a;
            if (i14 < 0) {
                throw new C0872r2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iM0) {
                throw new C0872r2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                o10.d(i10, Z1.f14184t);
            } else {
                o10.d(i10, Z1.e(bArr, iM0, i14));
            }
            return iM0 + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new C0872r2("Protocol message contained an invalid tag (zero).");
            }
            o10.d(i10, Integer.valueOf(p0(i11, bArr)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        O2 o2A = O2.a();
        int i16 = w9.f14154d + 1;
        w9.f14154d = i16;
        if (i16 >= 100) {
            throw new C0872r2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i17 = 0;
        while (i11 < i12) {
            int iM1 = m0(bArr, i11, w9);
            int i18 = w9.f14151a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iM1;
                break;
            }
            i11 = y0(i18, bArr, iM1, i12, o2A, w9);
            i17 = i18;
        }
        w9.f14154d--;
        if (i11 > i12 || i17 != i15) {
            throw new C0872r2("Failed to parse the message.");
        }
        o10.d(i10, o2A);
        return i11;
    }

    public static ka.k z(SSLSession sSLSession) throws IOException {
        Object objI;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        ka.f fVarB = ka.f.f19124b.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        ka.y.f19288s.getClass();
        ka.y yVarC = ka.b.c(protocol);
        try {
            objI = la.e.i(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objI = p120l9.r.f19440r;
        }
        return new ka.k(yVarC, fVarB, la.e.i(sSLSession.getLocalCertificates()), new B3.f(14, objI));
    }

    public static int z0(int i10, byte[] bArr, int i11, int i12, W1 w9) throws C0872r2 {
        if ((i10 >>> 3) == 0) {
            throw new C0872r2("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return o0(bArr, i11, w9);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return m0(bArr, i11, w9) + w9.f14151a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new C0872r2("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = m0(bArr, i11, w9);
            i15 = w9.f14151a;
            if (i15 == i14) {
                break;
            }
            i11 = z0(i15, bArr, i11, i12, w9);
        }
        if (i11 > i12 || i15 != i14) {
            throw new C0872r2("Failed to parse the message.");
        }
        return i11;
    }

    public abstract int B(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int E();

    public abstract InputFilter[] F(InputFilter[] inputFilterArr);

    public abstract int G();

    public abstract int I();

    public abstract int J();

    public abstract int K(View view);

    public abstract int L(CoordinatorLayout coordinatorLayout);

    public abstract int N();

    public abstract boolean R();

    public abstract boolean S(float f3);

    public abstract boolean T(View view);

    public abstract boolean U(float f3, float f7);

    public abstract void W(int i10);

    public abstract void X(Typeface typeface, boolean z10);

    public abstract c Z(String str, p241y9.c cVar);

    public abstract void c0(boolean z10);

    public abstract int d(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float e(int i10);

    public abstract void e0(boolean z10);

    public abstract boolean f0(View view, float f3);

    public abstract void j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10);

    public abstract void k0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11);

    public abstract TransformationMethod l0(TransformationMethod transformationMethod);

    public abstract Object p();
}
