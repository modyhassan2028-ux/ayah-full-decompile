package p185s8;

import A.EnumC0047u0;
import D0.C0086d;
import D7.a;
import Da.AbstractC0109a;
import F.C0153b;
import Ga.A;
import Ga.s;
import Ga.w;
import I1.I;
import I1.S;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.C0280d0;
import J0.InterfaceC0290m;
import J0.j0;
import J0.z0;
import K0.C0351j0;
import K9.AbstractC0405x;
import K9.H;
import K9.p0;
import M9.e;
import R7.C0483e;
import R7.h;
import R7.i;
import U0.C;
import U0.C0513e;
import U0.C0515g;
import W9.f;
import Y0.j;
import Y0.k;
import Y0.l;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import android.content.ClipData;
import android.content.Context;
import android.database.SQLException;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.ZIndexElement;
import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.Part;
import com.ayah.dao.realm.model.quran.Quarter;
import com.ayah.dao.realm.model.quran.Verse;
import com.google.android.gms.internal.measurement.C0800d;
import com.google.android.gms.internal.measurement.C0805e;
import com.google.android.gms.internal.measurement.C0815g;
import com.google.android.gms.internal.measurement.C0835k;
import com.google.android.gms.internal.measurement.C0840l;
import com.google.android.gms.internal.measurement.C0865q;
import com.google.android.gms.internal.measurement.EnumC0894w;
import com.google.android.gms.internal.measurement.InterfaceC0850n;
import io.realm.RealmList;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import p050e8.b;
import p055f1.p;
import p063g1.o;
import p074h0.d;
import p110k9.y;
import p120l9.m;
import p120l9.n;
import p120l9.r;
import p129m9.g;
import p180s0.q;
import p248z6.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f22468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f22469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f22470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f22471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f22472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f22473f;
    public static Field g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f22474h;

    public static TypedValue A(int i10, Context context, String str) {
        TypedValue typedValueY = y(context, i10);
        if (typedValueY != null) {
            return typedValueY;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    public static void B(ViewGroup viewGroup, float f3) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof i) {
            ((i) background).l(f3);
        }
    }

    public static void C(View view, i iVar) {
        a aVar = iVar.f7325r.f7295b;
        if (aVar == null || !aVar.f1336a) {
            return;
        }
        float fE = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = S.f3689a;
            fE += I.e((View) parent);
        }
        h hVar = iVar.f7325r;
        if (hVar.f7303l != fE) {
            hVar.f7303l = fE;
            iVar.v();
        }
    }

    public static void D(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof i) {
            C(viewGroup, (i) background);
        }
    }

    public static final void F(int i10, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i10);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    public static final C0351j0 G(C0515g c0515g) {
        List list = c0515g.f8061t;
        r rVar = r.f19440r;
        List list2 = list == null ? rVar : list;
        CharSequence charSequence = c0515g.f8060s;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            c cVar = new c((char) 0, 1);
            cVar.f24847s = Parcel.obtain();
            if (list == null) {
                list = rVar;
            }
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                C0513e c0513e = (C0513e) list.get(i10);
                C c10 = (C) c0513e.f8054a;
                int i11 = c0513e.f8055b;
                int i12 = c0513e.f8056c;
                ((Parcel) cVar.f24847s).recycle();
                cVar.f24847s = Parcel.obtain();
                p pVar = c10.f7994a;
                long j = c10.f8003l;
                long j10 = c10.f8000h;
                int i13 = i10;
                long j11 = c10.f7995b;
                List list3 = list;
                int i14 = size;
                long jB = pVar.b();
                long j12 = q.g;
                if (!q.c(jB, j12)) {
                    cVar.E((byte) 1);
                    ((Parcel) cVar.f24847s).writeLong(c10.f7994a.b());
                }
                long j13 = o.f16266c;
                byte b5 = 2;
                if (!o.a(j11, j13)) {
                    cVar.E((byte) 2);
                    cVar.G(j11);
                }
                l lVar = c10.f7996c;
                if (lVar != null) {
                    cVar.E((byte) 3);
                    ((Parcel) cVar.f24847s).writeInt(lVar.f10364r);
                }
                j jVar = c10.f7997d;
                if (jVar != null) {
                    int i15 = jVar.f10356a;
                    cVar.E((byte) 4);
                    cVar.E((i15 != 0 && i15 == 1) ? (byte) 1 : (byte) 0);
                }
                k kVar = c10.f7998e;
                if (kVar != null) {
                    int i16 = kVar.f10357a;
                    cVar.E((byte) 5);
                    if (i16 == 0) {
                        b5 = 0;
                    } else if (i16 == 65535) {
                        b5 = 1;
                    } else if (i16 != 1) {
                        if (i16 == 2) {
                            b5 = 3;
                        } else {
                            b5 = 0;
                        }
                    }
                    cVar.E(b5);
                }
                String str = c10.g;
                if (str != null) {
                    cVar.E((byte) 6);
                    ((Parcel) cVar.f24847s).writeString(str);
                }
                if (!o.a(j10, j13)) {
                    cVar.E((byte) 7);
                    cVar.G(j10);
                }
                p055f1.a aVar = c10.f8001i;
                if (aVar != null) {
                    float f3 = aVar.f15894a;
                    cVar.E((byte) 8);
                    cVar.F(f3);
                }
                p055f1.q qVar = c10.j;
                if (qVar != null) {
                    cVar.E((byte) 9);
                    cVar.F(qVar.f15922a);
                    cVar.F(qVar.f15923b);
                }
                if (!q.c(j, j12)) {
                    cVar.E((byte) 10);
                    ((Parcel) cVar.f24847s).writeLong(j);
                }
                p055f1.l lVar2 = c10.f8004m;
                if (lVar2 != null) {
                    cVar.E((byte) 11);
                    ((Parcel) cVar.f24847s).writeInt(lVar2.f15916a);
                }
                p180s0.I i17 = c10.f8005n;
                if (i17 != null) {
                    cVar.E((byte) 12);
                    ((Parcel) cVar.f24847s).writeLong(i17.f21799a);
                    long j14 = i17.f21800b;
                    cVar.F(Float.intBitsToFloat((int) (j14 >> 32)));
                    cVar.F(Float.intBitsToFloat((int) (j14 & 4294967295L)));
                    cVar.F(i17.f21801c);
                }
                SpannableString spannableString2 = spannableString;
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) cVar.f24847s).marshall(), 0)), i11, i12, 33);
                i10 = i13 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i14;
            }
            charSequence = spannableString;
        }
        return new C0351j0(ClipData.newPlainText("plain text", charSequence));
    }

    public static void H(int i10, String str, List list) {
        if (list.size() == i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i10 + " parameters found " + list.size());
    }

    public static void I(int i10, String str, List list) {
        if (list.size() >= i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i10 + " parameters found " + list.size());
    }

    public static void J(int i10, String str, ArrayList arrayList) {
        if (arrayList.size() <= i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i10 + " parameters found " + arrayList.size());
    }

    public static boolean K(InterfaceC0850n interfaceC0850n) {
        if (interfaceC0850n == null) {
            return false;
        }
        Double dB = interfaceC0850n.b();
        return !dB.isNaN() && dB.doubleValue() >= 0.0d && dB.equals(Double.valueOf(Math.floor(dB.doubleValue())));
    }

    public static EnumC0894w L(String str) {
        EnumC0894w enumC0894w = null;
        if (str != null && !str.isEmpty()) {
            enumC0894w = (EnumC0894w) EnumC0894w.f14443C0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (enumC0894w != null) {
            return enumC0894w;
        }
        throw new IllegalArgumentException(p123m2.c.s("Unsupported commandId ", str));
    }

    public static boolean M(InterfaceC0850n interfaceC0850n, InterfaceC0850n interfaceC0850n2) {
        if (!interfaceC0850n.getClass().equals(interfaceC0850n2.getClass())) {
            return false;
        }
        if ((interfaceC0850n instanceof com.google.android.gms.internal.measurement.r) || (interfaceC0850n instanceof C0840l)) {
            return true;
        }
        if (interfaceC0850n instanceof C0815g) {
            if (Double.isNaN(interfaceC0850n.b().doubleValue()) || Double.isNaN(interfaceC0850n2.b().doubleValue())) {
                return false;
            }
            return interfaceC0850n.b().equals(interfaceC0850n2.b());
        }
        if (interfaceC0850n instanceof C0865q) {
            return interfaceC0850n.h().equals(interfaceC0850n2.h());
        }
        if (interfaceC0850n instanceof C0805e) {
            return interfaceC0850n.d().equals(interfaceC0850n2.d());
        }
        return interfaceC0850n == interfaceC0850n2;
    }

    public static int N(double d5) {
        if (Double.isNaN(d5) || Double.isInfinite(d5) || d5 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d5 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d5))) % 4.294967296E9d);
    }

    public static double O(double d5) {
        if (Double.isNaN(d5)) {
            return 0.0d;
        }
        if (Double.isInfinite(d5) || d5 == 0.0d || d5 == 0.0d) {
            return d5;
        }
        return ((double) (d5 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d5));
    }

    public static Object P(InterfaceC0850n interfaceC0850n) {
        if (InterfaceC0850n.j.equals(interfaceC0850n)) {
            return null;
        }
        if (InterfaceC0850n.f14367i.equals(interfaceC0850n)) {
            return "";
        }
        if (interfaceC0850n instanceof C0835k) {
            return Q((C0835k) interfaceC0850n);
        }
        if (!(interfaceC0850n instanceof C0800d)) {
            return !interfaceC0850n.b().isNaN() ? interfaceC0850n.b() : interfaceC0850n.h();
        }
        ArrayList arrayList = new ArrayList();
        C0800d c0800d = (C0800d) interfaceC0850n;
        int i10 = 0;
        while (i10 < c0800d.o()) {
            if (i10 >= c0800d.o()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 21);
                sb.append("Out of bounds index: ");
                sb.append(i10);
                throw new NoSuchElementException(sb.toString());
            }
            int i11 = i10 + 1;
            Object objP = P(c0800d.p(i10));
            if (objP != null) {
                arrayList.add(objP);
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static HashMap Q(C0835k c0835k) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(c0835k.f14346r.keySet());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            Object objP = P(c0835k.c(str));
            if (objP != null) {
                map.put(str, objP);
            }
        }
        return map;
    }

    public static void R(Aa.a aVar) {
        int iN = N(aVar.U("runtime.counter").b().doubleValue() + 1.0d);
        if (iN > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        aVar.S("runtime.counter", new C0815g(Double.valueOf(iN)));
    }

    public static e a(int i10, int i11, M9.a aVar) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        int i12 = i11 & 2;
        M9.a aVar2 = M9.a.f5830r;
        if (i12 != 0) {
            aVar = aVar2;
        }
        if (i10 == -2) {
            if (aVar != aVar2) {
                return new M9.p(1, aVar);
            }
            M9.i.f5873b.getClass();
            return new e(M9.h.f5872b);
        }
        if (i10 == -1) {
            if (aVar == aVar2) {
                return new M9.p(1, M9.a.f5831s);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == 0) {
            return aVar == aVar2 ? new e(0) : new M9.p(1, aVar);
        }
        if (i10 != Integer.MAX_VALUE) {
            return aVar == aVar2 ? new e(i10) : new M9.p(i10, aVar);
        }
        return new e(Integer.MAX_VALUE);
    }

    public static final long b(float f3, float f7) {
        return (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final void c(C0153b c0153b, A a9, Object obj, l0.r rVar, boolean z10, l0.r rVar2, d dVar, C0698o c0698o, int i10) {
        int i11;
        l0.r rVarQ;
        int i12;
        l0.r rVar3;
        boolean z11;
        l0.r rVarB;
        boolean z12;
        l0.r rVarA;
        l0.r rVar4;
        l0.r rVar5;
        boolean z13;
        l0.r rVarA2;
        p251z9.j.e(c0153b, "<this>");
        p251z9.j.e(a9, "state");
        p251z9.j.e(obj, "key");
        c0698o.V(346306449);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(c0153b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(a9) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.i(obj) ? 256 : 128;
        }
        int i13 = i11 | 27648;
        if ((196608 & i10) == 0) {
            i13 = 93184 | i11;
        }
        if ((1572864 & i10) == 0) {
            i13 |= c0698o.i(dVar) ? 1048576 : 524288;
        }
        if ((599187 & i13) == 599186 && c0698o.x()) {
            c0698o.N();
            rVar4 = rVar;
            z11 = z10;
            rVar5 = rVar2;
        } else {
            c0698o.P();
            int i14 = i10 & 1;
            l0.o oVar = l0.o.f19333a;
            if (i14 == 0 || c0698o.w()) {
                rVarQ = p245z2.a.q(c0153b);
                i12 = i13 & (-458753);
                rVar3 = oVar;
                z11 = true;
            } else {
                c0698o.N();
                i12 = i13 & (-458753);
                rVar3 = rVar;
                z11 = z10;
                rVarQ = rVar2;
            }
            c0698o.q();
            c0698o.T(-1662944964);
            int i15 = i12 & 112;
            boolean z14 = i15 == 32;
            Object objH = c0698o.H();
            Z.S s10 = C0690k.f10683a;
            if (z14 || objH == s10) {
                objH = new Ga.p(a9, 4);
                c0698o.e0(objH);
            }
            c0698o.p(false);
            Z.C cO = C0672b.o((p241y9.a) objH);
            Z.C cO2 = C0672b.o(new C0086d(3, obj, a9));
            if (((Boolean) cO2.getValue()).booleanValue()) {
                c0698o.T(-11568592);
                ZIndexElement zIndexElement = new ZIndexElement(1.0f);
                int iOrdinal = ((EnumC0047u0) cO.getValue()).ordinal();
                if (iOrdinal == 0) {
                    c0698o.T(-1662937274);
                    c0698o.T(-1662936840);
                    boolean z15 = i15 == 32;
                    Object objH2 = c0698o.H();
                    if (z15 || objH2 == s10) {
                        objH2 = new s(a9, 1);
                        c0698o.e0(objH2);
                    }
                    z13 = false;
                    c0698o.p(false);
                    rVarA2 = androidx.compose.ui.graphics.a.a(oVar, (p241y9.c) objH2);
                    c0698o.p(false);
                } else {
                    if (iOrdinal != 1) {
                        c0698o.T(-1663429177);
                        c0698o.p(false);
                        throw new A6.a();
                    }
                    c0698o.T(-1662932538);
                    c0698o.T(-1662932104);
                    boolean z16 = i15 == 32;
                    Object objH3 = c0698o.H();
                    if (z16 || objH3 == s10) {
                        objH3 = new s(a9, 2);
                        c0698o.e0(objH3);
                    }
                    z13 = false;
                    c0698o.p(false);
                    rVarA2 = androidx.compose.ui.graphics.a.a(oVar, (p241y9.c) objH3);
                    c0698o.p(false);
                }
                rVarB = zIndexElement.b(rVarA2);
                c0698o.p(z13);
            } else if (obj.equals(a9.f2968r.getValue())) {
                c0698o.T(-11128268);
                ZIndexElement zIndexElement2 = new ZIndexElement(1.0f);
                int iOrdinal2 = ((EnumC0047u0) cO.getValue()).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        c0698o.T(-1663429177);
                        c0698o.p(false);
                        throw new A6.a();
                    }
                    c0698o.T(-1662917900);
                    c0698o.T(-1662917466);
                    boolean z17 = i15 == 32;
                    Object objH4 = c0698o.H();
                    if (z17 || objH4 == s10) {
                        objH4 = new s(a9, 4);
                        c0698o.e0(objH4);
                    }
                    z12 = false;
                    c0698o.p(false);
                    rVarA = androidx.compose.ui.graphics.a.a(oVar, (p241y9.c) objH4);
                    c0698o.p(false);
                } else {
                    c0698o.T(-1662923084);
                    c0698o.T(-1662922650);
                    boolean z18 = i15 == 32;
                    Object objH5 = c0698o.H();
                    if (z18 || objH5 == s10) {
                        objH5 = new s(a9, 3);
                        c0698o.e0(objH5);
                    }
                    z12 = false;
                    c0698o.p(false);
                    rVarA = androidx.compose.ui.graphics.a.a(oVar, (p241y9.c) objH5);
                    c0698o.p(false);
                }
                rVarB = zIndexElement2.b(rVarA);
                c0698o.p(z12);
            } else {
                c0698o.T(-10714728);
                c0698o.p(false);
                rVarB = rVarQ;
            }
            b.d(a9, obj, rVar3.b(rVarB), z11, ((Boolean) cO2.getValue()).booleanValue(), dVar, c0698o, 466046 & (i12 >> 3));
            rVar4 = rVar3;
            rVar5 = rVarQ;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new w(c0153b, a9, obj, rVar4, z11, rVar5, dVar, i10, 0);
        }
    }

    public static final Object e(InterfaceC0290m interfaceC0290m, p241y9.a aVar, q9.c cVar) {
        Object obj;
        j0 j0VarW;
        Object objO;
        C0280d0 c0280d0;
        l0.q qVar = (l0.q) interfaceC0290m;
        boolean z10 = qVar.f19339r.f19338E;
        if (z10) {
            if (!z10) {
                G0.a.b("visitAncestors called on an unattached node");
            }
            l0.q qVar2 = qVar.f19339r.f19343v;
            J0.I iX = AbstractC0283f.x(interfaceC0290m);
            loop0: while (true) {
                obj = null;
                if (iX == null) {
                    break;
                }
                if ((((l0.q) iX.f3914W.f4067f).f19342u & 524288) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.f19341t & 524288) != 0) {
                            l0.q qVarF = qVar2;
                            p011b0.e eVar = null;
                            while (qVarF != null) {
                                if (qVarF instanceof O0.a) {
                                    obj = qVarF;
                                    break loop0;
                                }
                                if ((qVarF.f19341t & 524288) != 0 && (qVarF instanceof AbstractC0291n)) {
                                    int i10 = 0;
                                    for (l0.q qVar3 = ((AbstractC0291n) qVarF).f4151G; qVar3 != null; qVar3 = qVar3.f19344w) {
                                        if ((qVar3.f19341t & 524288) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                qVarF = qVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new p011b0.e(new l0.q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar.b(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar.b(qVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                qVarF = AbstractC0283f.f(eVar);
                            }
                        }
                        qVar2 = qVar2.f19343v;
                    }
                }
                iX = iX.u();
                qVar2 = (iX == null || (c0280d0 = iX.f3914W) == null) ? null : (z0) c0280d0.f4066e;
            }
            O0.a aVar2 = (O0.a) obj;
            if (aVar2 != null && (objO = aVar2.o((j0VarW = AbstractC0283f.w(interfaceC0290m)), new C0086d(16, aVar, j0VarW), cVar)) == p161p9.a.f21156r) {
                return objO;
            }
        }
        return y.f19095a;
    }

    public static g f(g gVar) {
        p129m9.e eVar = gVar.f19722r;
        eVar.b();
        return eVar.f19718z > 0 ? gVar : g.f19721s;
    }

    public static W9.g g(String str, va.g gVar, f[] fVarArr) {
        p251z9.j.e(str, "serialName");
        if (H9.o.e1(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (gVar.equals(W9.i.f9679c)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        W9.a aVar = new W9.a(str);
        return new W9.g(str, gVar, aVar.f9655b.size(), p120l9.l.o0(fVarArr), aVar);
    }

    public static final void h(int i10, String str) {
        if (str.charAt(i10) == '-') {
            return;
        }
        StringBuilder sbW = p123m2.c.w(i10, "Expected '-' (hyphen) at index ", ", but was '");
        sbW.append(str.charAt(i10));
        sbW.append('\'');
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    public static int i(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final boolean j(p171r0.e eVar, float f3, float f7) {
        float f10 = eVar.f21389a;
        if (f3 > eVar.f21391c || f10 > f3) {
            return false;
        }
        return f7 <= eVar.f21392d && eVar.f21390b <= f7;
    }

    public static Handler k(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return B1.a.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e12) {
            e = e12;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static b l(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? new R7.l() : new C0483e();
        }
        return new R7.l();
    }

    public static final void o(Q2.a aVar, String str) {
        p251z9.j.e(aVar, "<this>");
        p251z9.j.e(str, "sql");
        Q2.c cVarA0 = aVar.a0(str);
        try {
            cVarA0.R();
            p186s9.b.b(cVarA0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p186s9.b.b(cVarA0, th);
                throw th2;
            }
        }
    }

    public static void p(Object obj) {
        LongSparseArray longSparseArray;
        if (!f22471d) {
            try {
                f22470c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f22471d = true;
        }
        Class cls = f22470c;
        if (cls == null) {
            return;
        }
        if (!f22473f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f22472e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f22473f = true;
        }
        Field field = f22472e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static final void q(long j, byte[] bArr, int i10, int i11, int i12) {
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = H9.c.f3616a[(int) ((j >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            bArr[i10] = (byte) (i15 >> 8);
            i10 += 2;
            bArr[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    public static p124m3.g r(Part part, p114l3.b bVar, boolean z10) {
        List list;
        p124m3.j jVarY;
        p251z9.j.e(bVar, "pageTypeDecider");
        if (z10) {
            list = r.f19440r;
        } else {
            RealmList<Verse> verses = part.getVerses();
            ArrayList arrayList = new ArrayList(n.a0(verses, 10));
            for (Verse verse : verses) {
                p251z9.j.b(verse);
                arrayList.add(B0.c.y(verse, bVar));
            }
            list = arrayList;
        }
        if (z10) {
            Verse verseFirst = part.getVerses().first();
            p251z9.j.b(verseFirst);
            jVarY = B0.c.y(verseFirst, bVar);
        } else {
            jVarY = (p124m3.j) m.f0(list);
        }
        int i10 = jVarY.f19585a;
        int iC = jVarY.c();
        int identifier = (int) part.getIdentifier();
        int number = (int) part.getNumber();
        String arabicTitle = part.getArabicTitle();
        String englishTitle = part.getEnglishTitle();
        RealmList<Chapter> chapters = part.getChapters();
        ArrayList arrayList2 = new ArrayList(n.a0(chapters, 10));
        for (Chapter chapter : chapters) {
            p251z9.j.b(chapter);
            arrayList2.add(p017b7.g.b0(chapter, bVar, z10));
        }
        RealmList<Quarter> quarters = part.getQuarters();
        ArrayList arrayList3 = new ArrayList(n.a0(quarters, 10));
        for (Quarter quarter : quarters) {
            p251z9.j.b(quarter);
            arrayList3.add(va.g.q(quarter, bVar, z10));
        }
        return new p124m3.g(identifier, number, arabicTitle, englishTitle, arrayList2, arrayList3, list, i10, iC);
    }

    public static final int s(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static boolean t(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }

    public static final void u(View view) {
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
    }

    public static String v(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("sha256/");
        Da.k kVar = Da.k.f1363u;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        p251z9.j.d(encoded, "getEncoded(...)");
        Da.k kVarS = R7.f.s(encoded);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        int i10 = 0;
        messageDigest.update(kVarS.f1364r, 0, kVarS.a());
        byte[] bArrDigest = messageDigest.digest();
        p251z9.j.b(bArrDigest);
        new Da.k(bArrDigest);
        byte[] bArr = AbstractC0109a.f1345a;
        p251z9.j.e(bArr, "map");
        byte[] bArr2 = new byte[((bArrDigest.length + 2) / 3) * 4];
        int length = bArrDigest.length - (bArrDigest.length % 3);
        int i11 = 0;
        while (i10 < length) {
            byte b5 = bArrDigest[i10];
            int i12 = i10 + 2;
            byte b10 = bArrDigest[i10 + 1];
            i10 += 3;
            byte b11 = bArrDigest[i12];
            bArr2[i11] = bArr[(b5 & 255) >> 2];
            bArr2[i11 + 1] = bArr[((b5 & 3) << 4) | ((b10 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr2[i11 + 2] = bArr[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i11 += 4;
            bArr2[i13] = bArr[b11 & 63];
        }
        int length2 = bArrDigest.length - length;
        if (length2 == 1) {
            byte b12 = bArrDigest[i10];
            bArr2[i11] = bArr[(b12 & 255) >> 2];
            bArr2[i11 + 1] = bArr[(b12 & 3) << 4];
            bArr2[i11 + 2] = 61;
            bArr2[i11 + 3] = 61;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b13 = bArrDigest[i10];
            byte b14 = bArrDigest[i14];
            bArr2[i11] = bArr[(b13 & 255) >> 2];
            bArr2[i11 + 1] = bArr[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr2[i11 + 2] = bArr[(b14 & 15) << 2];
            bArr2[i11 + 3] = 61;
        }
        sb.append(new String(bArr2, H9.a.f3610a));
        return sb.toString();
    }

    public static LinkedHashSet w(Set set, p173r2.j jVar) {
        p251z9.j.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(p120l9.w.g0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(jVar);
        return linkedHashSet;
    }

    public static W1.a x(String str, O8.c cVar, p241y9.c cVar2, int i10) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        R9.e eVar = H.f5322a;
        R9.d dVar = R9.d.f7436t;
        p0 p0VarE = AbstractC0405x.e();
        dVar.getClass();
        P9.d dVarB = AbstractC0405x.b(Y2.a.Z(dVar, p0VarE));
        p251z9.j.e(str, "name");
        return new W1.a(str, cVar, cVar2, dVarB);
    }

    public static TypedValue y(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean z(Context context, int i10, boolean z10) {
        TypedValue typedValueY = y(context, i10);
        if (typedValueY == null || typedValueY.type != 18) {
            return z10;
        }
        return typedValueY.data != 0;
    }

    public abstract void E(p020c.H h7, p020c.H h10, Window window, View view, boolean z10, boolean z11);

    public abstract String m(byte[] bArr, int i10, int i11);

    public abstract int n(String str, byte[] bArr, int i10, int i11);

    public void d(Window window) {
    }
}
