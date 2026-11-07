package p050e8;

import A.C0023i;
import A.U0;
import D.AbstractC0071n;
import D0.C0096n;
import G.a0;
import Ga.A;
import Ga.k;
import Ga.m;
import Ga.n;
import H0.I;
import H0.InterfaceC0219s;
import H9.v;
import I1.InterfaceC0260m;
import I1.Q;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import J0.j0;
import K.W;
import K.g0;
import K.t0;
import K0.P;
import K0.c1;
import K9.InterfaceC0402u;
import O.C0438f;
import O.InterfaceC0444l;
import O.N;
import O.O;
import O8.c;
import Q0.h;
import R0.i;
import R4.a;
import U0.C0509a;
import U0.G;
import U0.H;
import U0.K;
import U0.L;
import U0.p;
import Y9.V;
import Z.AbstractC0693l0;
import Z.C0672b;
import Z.C0675c0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.C0707x;
import Z.InterfaceC0687i0;
import Z.S;
import Z.X;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PointF;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0771u;
import com.ayah.R;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.PageHeader;
import com.ayah.dao.realm.model.quran.Part;
import com.ayah.dao.realm.model.quran.Quarter;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.K1;
import io.realm.RealmList;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ka.s;
import p001a0.J;
import p020c.F;
import p035d3.l;
import p063g1.d;
import p110k9.y;
import p120l9.r;
import p171r0.e;
import p171r0.f;
import p180s0.q;
import p185s8.u0;
import p251z9.j;
import u.E;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f15833a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f15834b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f15835c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f15836d;

    public static final long A(W w9, e eVar, int i10) {
        t0 t0VarD = w9.d();
        p pVar = t0VarD != null ? t0VarD.f4794a.f8024b : null;
        InterfaceC0219s interfaceC0219sC = w9.c();
        return (pVar == null || interfaceC0219sC == null) ? K.f8033b : pVar.h(eVar.h(interfaceC0219sC.A(0L)), i10, G.f8014b);
    }

    public static S2.b C(c cVar, SQLiteDatabase sQLiteDatabase) {
        j.e(cVar, "refHolder");
        S2.b bVar = (S2.b) cVar.f6511r;
        if (bVar != null && bVar.f7472r.equals(sQLiteDatabase)) {
            return bVar;
        }
        S2.b bVar2 = new S2.b(sQLiteDatabase);
        cVar.f6511r = bVar2;
        return bVar2;
    }

    public static boolean E(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static boolean F(byte b5) {
        return b5 > -65;
    }

    public static final boolean G(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static boolean H(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean I(N n6, boolean z10) {
        InterfaceC0219s interfaceC0219sC;
        W w9 = n6.f6311d;
        if (w9 == null || (interfaceC0219sC = w9.c()) == null) {
            return false;
        }
        e eVarO = B1.O(interfaceC0219sC);
        long j = n6.j(z10);
        float f3 = eVarO.f21389a;
        float f7 = eVarO.f21391c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f3 > fIntBitsToFloat || fIntBitsToFloat > f7) {
            return false;
        }
        float f10 = eVarO.f21390b;
        float f11 = eVarO.f21392d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f10 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f11;
    }

    public static final boolean J(int i10) {
        return Character.isWhitespace(i10) || i10 == 160;
    }

    public static final boolean K(int i10) {
        int type;
        return (!J(i10) || (type = Character.getType(i10)) == 14 || type == 13 || i10 == 10) ? false : true;
    }

    public static a0 Q(String str) throws ProtocolException {
        int i10;
        String strSubstring;
        j.e(str, "statusLine");
        boolean zR0 = v.R0(str, "HTTP/1.", false);
        s sVar = s.f19247t;
        s sVar2 = s.f19248u;
        if (zR0) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                sVar = sVar2;
            }
        } else if (v.R0(str, "ICY ", false)) {
            i10 = 4;
        } else {
            if (!v.R0(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i10 = 12;
            sVar = sVar2;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        String strSubstring2 = str.substring(i10, i11);
        j.d(strSubstring2, "substring(...)");
        Integer numS0 = v.S0(strSubstring2);
        if (numS0 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numS0.intValue();
        if (str.length() <= i11) {
            strSubstring = "";
        } else {
            if (str.charAt(i11) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i10 + 4);
            j.d(strSubstring, "substring(...)");
        }
        return new a0(sVar, iIntValue, strSubstring);
    }

    public static void R(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static int S(Context context, int i10, int i11) {
        TypedValue typedValueY = u0.y(context, i10);
        return (typedValueY == null || typedValueY.type != 16) ? i11 : typedValueY.data;
    }

    public static TimeInterpolator T(Context context, int i10, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!E(strValueOf, "cubic-bezier") && !E(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!E(strValueOf, "cubic-bezier")) {
            if (E(strValueOf, "path")) {
                return new PathInterpolator(B0.c.v(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(x(0, strArrSplit), x(1, strArrSplit), x(2, strArrSplit), x(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static final void Y(J j, int i10, Object obj) {
        j.f11084m[(j.f11085n - j.f11081i[j.j - 1].f11080b) + i10] = obj;
    }

    public static final void Z(J j, int i10, Object obj, int i11, Object obj2) {
        int i12 = j.f11085n - j.f11081i[j.j - 1].f11080b;
        Object[] objArr = j.f11084m;
        objArr[i10 + i12] = obj;
        objArr[i12 + i11] = obj2;
    }

    public static d a() {
        return new d(1.0f, 1.0f);
    }

    public static C0509a b(String str, L l10, long j, p063g1.c cVar, Y0.d dVar, int i10, int i11) {
        r rVar = r.f19440r;
        return new C0509a(new p022c1.c(str, l10, rVar, rVar, dVar, cVar), i10, 1, j);
    }

    public static final void c(boolean z10, p241y9.e eVar, C0698o c0698o, int i10) {
        c0698o.V(-642000585);
        int i11 = (i10 & 6) == 0 ? (c0698o.h(z10) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(eVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c0698o.x()) {
            c0698o.N();
        } else {
            X xU = C0672b.u(eVar, c0698o);
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (objH == obj) {
                Object c0707x = new C0707x(C0672b.m(c0698o));
                c0698o.e0(c0707x);
                objH = c0707x;
            }
            InterfaceC0402u interfaceC0402u = ((C0707x) objH).f10851r;
            Object objH2 = c0698o.H();
            Object obj2 = objH2;
            if (objH2 == obj) {
                p241y9.e eVar2 = (p241y9.e) xU.getValue();
                p032d.d dVar = new p032d.d(z10);
                dVar.f15522d = interfaceC0402u;
                dVar.f15523e = eVar2;
                c0698o.e0(dVar);
                obj2 = dVar;
            }
            p032d.d dVar2 = (p032d.d) obj2;
            boolean zG = c0698o.g((p241y9.e) xU.getValue()) | c0698o.g(interfaceC0402u);
            Object objH3 = c0698o.H();
            if (zG || objH3 == obj) {
                dVar2.f15523e = (p241y9.e) xU.getValue();
                dVar2.f15522d = interfaceC0402u;
                c0698o.e0(y.f19095a);
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            boolean zI = ((i11 & 14) == 4) | c0698o.i(dVar2);
            Object objH4 = c0698o.H();
            Context context = null;
            if (zI || objH4 == obj) {
                objH4 = new a(dVar2, z10, (p150o9.c) null);
                c0698o.e0(objH4);
            }
            C0672b.f(c0698o, boolValueOf, (p241y9.e) objH4);
            F f3 = (F) c0698o.k(p032d.c.f15521a);
            if (f3 == null) {
                c0698o.T(544166745);
                View view = (View) c0698o.k(AndroidCompositionLocals_androidKt.f12067f);
                j.e(view, "<this>");
                while (true) {
                    if (view == null) {
                        f3 = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                    F f7 = tag instanceof F ? (F) tag : null;
                    if (f7 != null) {
                        f3 = f7;
                        break;
                    } else {
                        Object objM = B0.c.M(view);
                        view = objM instanceof View ? (View) objM : null;
                    }
                }
                c0698o.p(false);
            } else {
                c0698o.T(544164296);
                c0698o.p(false);
            }
            if (f3 == null) {
                c0698o.T(544168748);
                for (Context baseContext = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof F) {
                        context = baseContext;
                        break;
                    }
                }
                f3 = (F) context;
                c0698o.p(false);
            } else {
                c0698o.T(544164377);
                c0698o.p(false);
            }
            if (f3 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            Object objA = f3.a();
            Object obj3 = (InterfaceC0771u) c0698o.k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zI2 = c0698o.i(objA) | c0698o.i(obj3) | c0698o.i(dVar2);
            Object objH5 = c0698o.H();
            if (zI2 || objH5 == obj) {
                objH5 = new C0023i(objA, obj3, dVar2, 15);
                c0698o.e0(objH5);
            }
            C0672b.c(obj3, objA, (p241y9.c) objH5, c0698o);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new K.F(z10, eVar, i10);
        }
    }

    public static final void d(A a9, Object obj, l0.r rVar, boolean z10, boolean z11, p074h0.d dVar, C0698o c0698o, int i10) {
        int i11;
        boolean z12;
        j.e(a9, "state");
        j.e(obj, "key");
        c0698o.V(1129341741);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(a9) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(obj) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(rVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.h(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            z12 = z11;
            i11 |= c0698o.h(z12) ? 16384 : 8192;
        } else {
            z12 = z11;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0698o.i(dVar) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c0698o.x()) {
            c0698o.N();
        } else {
            c0698o.T(-1931630163);
            Object objH = c0698o.H();
            S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = C0672b.r(new p171r0.c(0L));
                c0698o.e0(objH);
            }
            X x9 = (X) objH;
            c0698o.p(false);
            c0698o.T(-1931627297);
            Object objH2 = c0698o.H();
            if (objH2 == s10) {
                objH2 = new U0(x9, 1);
                c0698o.e0(objH2);
            }
            c0698o.p(false);
            l0.r rVarD = androidx.compose.ui.layout.a.d(rVar, (p241y9.c) objH2);
            I iD = AbstractC0071n.d(l0.c.f19313r, false);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVarD);
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
            if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            c0698o.T(871986030);
            int i13 = i11 & 14;
            boolean zG = (i13 == 4) | c0698o.g(obj);
            Object objH3 = c0698o.H();
            if (zG || objH3 == s10) {
                objH3 = new k(a9, obj, new F.k(x9, 2));
                c0698o.e0(objH3);
            }
            c0698o.p(false);
            dVar.i((k) objH3, Boolean.valueOf(z12), c0698o, Integer.valueOf((i11 >> 9) & 1008));
            c0698o.p(true);
            HashSet hashSet = a9.f2967q;
            Boolean boolValueOf = Boolean.valueOf(z10);
            c0698o.T(-1931613769);
            boolean zI = ((i11 & 7168) == 2048) | (i13 == 4) | c0698o.i(obj);
            Object objH4 = c0698o.H();
            if (zI || objH4 == s10) {
                objH4 = new m(z10, a9, obj, null);
                c0698o.e0(objH4);
            }
            c0698o.p(false);
            C0672b.g(hashSet, boolValueOf, (p241y9.e) objH4, c0698o);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new n(a9, obj, rVar, z10, z12, dVar, i10);
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [y9.a, z9.k] */
    public static final void d0(R0.p pVar, int i10, h hVar) {
        p011b0.e eVar = new p011b0.e(new R0.p[16]);
        List listG = pVar.g(false, false);
        while (true) {
            eVar.d(eVar.f13127t, listG);
            while (true) {
                int i11 = eVar.f13127t;
                if (i11 == 0) {
                    return;
                }
                R0.p pVar2 = (R0.p) eVar.l(i11 - 1);
                boolean zK = P.k(pVar2);
                R0.j jVar = pVar2.f7119d;
                E e10 = jVar.f7108r;
                if (!zK && !e10.c(R0.s.f7163i)) {
                    j0 j0VarC = pVar2.c();
                    if (j0VarC == null) {
                        throw android.support.v4.media.session.p.s("Expected semantics node to have a coordinator.");
                    }
                    p063g1.k kVarB0 = B0.c.b0(H0.a0.c(j0VarC));
                    if (kVarB0.f16256a < kVarB0.f16258c && kVarB0.f16257b < kVarB0.f16259d) {
                        Object objG = jVar.f7108r.g(i.f7088e);
                        if (objG == null) {
                            objG = null;
                        }
                        p241y9.e eVar2 = (p241y9.e) objG;
                        Object objG2 = e10.g(R0.s.f7173t);
                        R0.h hVar2 = (R0.h) (objG2 != null ? objG2 : null);
                        if (eVar2 == null || hVar2 == null || ((Number) hVar2.f7081b.invoke()).floatValue() <= 0.0f) {
                            listG = pVar2.g(false, false);
                        } else {
                            int i12 = i10 + 1;
                            hVar.e(new Q0.i(pVar2, i12, kVarB0, j0VarC));
                            d0(pVar2, i12, hVar);
                        }
                    }
                }
            }
        }
    }

    public static final void e(p124m3.a aVar, String str, l0.r rVar, boolean z10, NumberFormat numberFormat, C0698o c0698o, int i10) {
        j.e(aVar, "chapterDao");
        c0698o.V(1931954807);
        int i11 = 2;
        int i12 = i10 | (c0698o.i(aVar) ? 4 : 2) | (c0698o.g(str) ? 32 : 16) | (c0698o.g(rVar) ? 256 : 128) | (c0698o.h(z10) ? 2048 : 1024) | (c0698o.i(numberFormat) ? 16384 : 8192);
        if (c0698o.K(i12 & 1, (i12 & 9363) != 9362)) {
            c0698o.P();
            if ((i10 & 1) != 0 && !c0698o.w()) {
                c0698o.N();
            }
            c0698o.q();
            int i13 = aVar.f19529c ? R.string.makki : R.string.madani;
            String str2 = numberFormat.format(Integer.valueOf(aVar.a().f19541b));
            j.d(str2, "format(...)");
            String str3 = numberFormat.format(Integer.valueOf(aVar.f19537m));
            j.d(str3, "format(...)");
            AbstractC0813f2.c(aVar.f19528b, rVar, 0, z10, false, 0.0f, numberFormat, p074h0.j.d(-521990394, new G4.k(i11, p000a.a.n0(R.string.sura_info_format, new Object[]{str2, str3, p000a.a.m0(i13, c0698o)}, c0698o), str), c0698o), c0698o, ((i12 >> 3) & 112) | 12582912 | (i12 & 7168) | ((i12 << 6) & 3670016), 52);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new N4.b(aVar, str, rVar, z10, numberFormat, i10, 1);
        }
    }

    public static int e0(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 5;
        }
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x010f  */
    public static final void f(boolean z10, p055f1.j jVar, N n6, C0698o c0698o, int i10) {
        int i11;
        float fE;
        t0 t0VarD;
        c0698o.V(-1344558920);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.h(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(jVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.i(n6) ? 256 : 128;
        }
        if (c0698o.K(i11 & 1, (i11 & 147) != 146)) {
            int i12 = i11 & 14;
            boolean zG = (i12 == 4) | c0698o.g(n6);
            Object objH = c0698o.H();
            S s10 = C0690k.f10683a;
            if (zG || objH == s10) {
                objH = new O.K(n6, z10);
                c0698o.e0(objH);
            }
            g0 g0Var = (g0) objH;
            boolean zI = (i12 == 4) | c0698o.i(n6);
            Object objH2 = c0698o.H();
            if (zI || objH2 == s10) {
                objH2 = new O(n6, z10);
                c0698o.e0(objH2);
            }
            InterfaceC0444l interfaceC0444l = (InterfaceC0444l) objH2;
            boolean zF = K.f(n6.k().f10954b);
            int i13 = (int) (z10 ? n6.k().f10954b >> 32 : n6.k().f10954b & 4294967295L);
            W w9 = n6.f6311d;
            if (w9 == null || (t0VarD = w9.d()) == null) {
                fE = 0.0f;
            } else {
                U0.I i14 = t0VarD.f4794a;
                if (i13 >= 0) {
                    H h7 = i14.f8023a;
                    p pVar = i14.f8024b;
                    if (h7.f8015a.f8060s.length() == 0) {
                        fE = 0.0f;
                    } else {
                        int iMin = Math.min(pVar.d(i13), Math.min(pVar.f8107b - 1, pVar.f8111f - 1));
                        if (i13 > pVar.c(iMin, false)) {
                            fE = 0.0f;
                        } else {
                            pVar.m(iMin);
                            ArrayList arrayList = pVar.f8112h;
                            U0.r rVar = (U0.r) arrayList.get(AbstractC0813f2.w(iMin, arrayList));
                            C0509a c0509a = rVar.f8115a;
                            int i15 = iMin - rVar.f8118d;
                            V0.r rVar2 = c0509a.f8045d;
                            fE = rVar2.e(i15) - rVar2.g(i15);
                        }
                    }
                } else {
                    fE = 0.0f;
                }
            }
            boolean zI2 = c0698o.i(g0Var);
            Object objH3 = c0698o.H();
            if (zI2 || objH3 == s10) {
                objH3 = new A.N(2, g0Var);
                c0698o.e0(objH3);
            }
            B9.a.d(interfaceC0444l, z10, jVar, zF, 0L, fE, new SuspendPointerInputElement(g0Var, null, (PointerInputEventHandler) objH3, 6), c0698o, (i11 << 3) & 1008);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0438f(z10, jVar, n6, i10);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object] */
    public static final void g(final F.A a9, final l0.r rVar, C0698o c0698o, final int i10) {
        p241y9.e eVar;
        C0699o0 c0699o0R;
        Object next;
        j.e(a9, "listState");
        c0698o.V(-1743883240);
        int i11 = (c0698o.g(a9) ? 4 : 2) | i10 | (c0698o.g(rVar) ? 32 : 16);
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (objH == obj) {
                objH = C0672b.m(c0698o);
                c0698o.e0(objH);
            }
            InterfaceC0402u interfaceC0402u = (InterfaceC0402u) objH;
            int i12 = a9.g().f2106n;
            Iterator it = a9.g().f2103k.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int i13 = ((F.s) next).f2121n;
                    while (true) {
                        Object next2 = it.next();
                        int i14 = ((F.s) next2).f2121n;
                        if (i13 < i14) {
                            i13 = i14;
                            next = next2;
                        }
                        if (!it.hasNext()) {
                            break;
                        } else {
                            i12 = i12;
                        }
                    }
                }
            } else {
                next = null;
            }
            F.s sVar = (F.s) next;
            if (sVar != null) {
                int i15 = sVar.f2121n;
                int i16 = a9.g().f2105m;
                float f3 = i16 / i12;
                final float f7 = (i16 / i15) * f3;
                final float fG = ((C0675c0) a9.f2012d.f1158s).g() * f3;
                int i17 = (i15 * i12) / i16;
                AbstractC0693l0 abstractC0693l0 = p005a4.e.f11187a;
                final long j = ((q) ((p005a4.a) c0698o.k(abstractC0693l0)).f11164c.getValue()).f21845a;
                final long jL = ((p005a4.a) c0698o.k(abstractC0693l0)).l();
                boolean zE = ((i11 & 14) == 4) | c0698o.e(i16) | c0698o.e(i12) | c0698o.i(interfaceC0402u) | c0698o.e(i17);
                Object objH2 = c0698o.H();
                if (zE || objH2 == obj) {
                    Object kVar = new M4.k(i16, i12, interfaceC0402u, a9, i17);
                    c0698o.e0(kVar);
                    objH2 = kVar;
                }
                C0096n c0096n = D0.I.f1055a;
                l0.r rVarB = rVar.b(new SuspendPointerInputElement(y.f19095a, null, (PointerInputEventHandler) objH2, 6));
                boolean zF = c0698o.f(j) | c0698o.f(jL) | c0698o.d(fG) | c0698o.d(f7);
                Object objH3 = c0698o.H();
                if (zF || objH3 == obj) {
                    objH3 = new p241y9.c() { // from class: M4.h
                        @Override // p241y9.c
                        public final Object e(Object obj2) {
                            p196u0.d dVar = (p196u0.d) obj2;
                            p251z9.j.e(dVar, "$this$Canvas");
                            p123m2.c.k(dVar, j, 0L, 0L, 126);
                            p123m2.c.k(dVar, jL, (((long) Float.floatToRawIntBits(fG)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (4294967295L & ((long) Float.floatToRawIntBits(f7))) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.b() >> 32))) << 32), 120);
                            return y.f19095a;
                        }
                    };
                    c0698o.e0(objH3);
                }
                f.a(rVarB, (p241y9.c) objH3, c0698o, 0);
            } else {
                final int i18 = 0;
                c0699o0R = c0698o.r();
                if (c0699o0R == null) {
                    return;
                } else {
                    eVar = new p241y9.e(a9, rVar, i10, i18) { // from class: M4.g

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        public final /* synthetic */ int f5727r;

                        /* JADX INFO: renamed from: s, reason: collision with root package name */
                        public final /* synthetic */ F.A f5728s;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        public final /* synthetic */ l0.r f5729t;

                        {
                            this.f5727r = i18;
                        }

                        @Override // p241y9.e
                        public final Object invoke(Object obj2, Object obj3) {
                            int i19 = this.f5727r;
                            C0698o c0698o2 = (C0698o) obj2;
                            ((Integer) obj3).getClass();
                            switch (i19) {
                                case 0:
                                    p050e8.b.g(this.f5728s, this.f5729t, c0698o2, C0672b.y(1));
                                    break;
                                default:
                                    p050e8.b.g(this.f5728s, this.f5729t, c0698o2, C0672b.y(1));
                                    break;
                            }
                            return y.f19095a;
                        }
                    };
                }
            }
            c0699o0R.f10749d = eVar;
        }
        c0698o.N();
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            final int i19 = 1;
            eVar = new p241y9.e(a9, rVar, i10, i19) { // from class: M4.g

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ int f5727r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ F.A f5728s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ l0.r f5729t;

                {
                    this.f5727r = i19;
                }

                @Override // p241y9.e
                public final Object invoke(Object obj2, Object obj3) {
                    int i110 = this.f5727r;
                    C0698o c0698o2 = (C0698o) obj2;
                    ((Integer) obj3).getClass();
                    switch (i110) {
                        case 0:
                            p050e8.b.g(this.f5728s, this.f5729t, c0698o2, C0672b.y(1));
                            break;
                        default:
                            p050e8.b.g(this.f5728s, this.f5729t, c0698o2, C0672b.y(1));
                            break;
                    }
                    return y.f19095a;
                }
            };
            c0699o0R.f10749d = eVar;
        }
    }

    public static final int h(W w9, long j, c1 c1Var) {
        long jA;
        int iY;
        t0 t0VarD = w9.d();
        if (t0VarD != null) {
            p pVar = t0VarD.f4794a.f8024b;
            InterfaceC0219s interfaceC0219sC = w9.c();
            if (interfaceC0219sC != null && (iY = y(pVar, (jA = interfaceC0219sC.A(j)), c1Var)) != -1) {
                return pVar.g(p171r0.c.a(jA, (pVar.b(iY) + pVar.f(iY)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long i(W w9, e eVar, e eVar2, int i10) {
        long jA = A(w9, eVar, i10);
        if (K.b(jA)) {
            return K.f8033b;
        }
        long jA2 = A(w9, eVar2, i10);
        if (K.b(jA2)) {
            return K.f8033b;
        }
        int i11 = (int) (jA >> 32);
        int i12 = (int) (jA2 & 4294967295L);
        return g.e(Math.min(i11, i11), Math.max(i12, i12));
    }

    public static final boolean j(U0.I i10, int i11) {
        p pVar = i10.f8024b;
        int iD = pVar.d(i11);
        return i11 == i10.f(iD) || i11 == pVar.c(iD, false) ? i10.g(i11) != i10.a(i11) : i10.a(i11) != i10.a(i11 - 1);
    }

    public static final long k(PointF pointF) {
        float f3 = pointF.x;
        float f7 = pointF.y;
        return (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
    }

    public static void l(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static final String o(BookType bookType) {
        j.e(bookType, "<this>");
        String str = bookType.f13685a;
        String str2 = bookType.f13686b;
        if (str2.length() == 0) {
            return android.support.v4.media.session.p.z(str, ".db");
        }
        return str + "-" + str2 + ".db";
    }

    public static boolean p(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = I1.S.f3689a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = Q.f3685d;
        Q q10 = (Q) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (q10 == null) {
            q10 = new Q();
            q10.f3686a = null;
            q10.f3687b = null;
            q10.f3688c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, q10);
        }
        WeakReference weakReference2 = q10.f3688c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        q10.f3688c = new WeakReference(keyEvent);
        if (q10.f3687b == null) {
            q10.f3687b = new SparseArray();
        }
        SparseArray sparseArray = q10.f3687b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw android.support.v4.media.session.p.u(size, arrayList);
    }

    public static boolean q(InterfaceC0260m interfaceC0260m, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0260m != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0260m.d(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f15833a) {
                            try {
                                f15834b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f15833a = true;
                        }
                        Method method = f15834b;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (I1.S.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f15835c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f15836d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f15835c = true;
                }
                Field field = f15836d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (I1.S.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && I1.S.c(view, keyEvent)) || interfaceC0260m.d(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static p124m3.f s(PageHeader pageHeader, p114l3.b bVar) {
        j.e(bVar, "pageTypeDecider");
        Quarter quarter = pageHeader.getQuarter();
        p124m3.h hVarQ = quarter != null ? g.q(quarter, bVar, true) : null;
        Part part = pageHeader.getPart();
        j.b(part);
        p124m3.g gVarR = u0.r(part, bVar, true);
        RealmList<Chapter> chapters = pageHeader.getChapters();
        ArrayList arrayList = new ArrayList(p120l9.n.a0(chapters, 10));
        for (Chapter chapter : chapters) {
            j.b(chapter);
            arrayList.add(p017b7.g.b0(chapter, bVar, true));
        }
        return new p124m3.f(gVarR, hVarQ, arrayList);
    }

    public static p018b9.f t(AppCompatActivity appCompatActivity, androidx.lifecycle.S s10) {
        ((l) ((p018b9.a) AbstractC0813f2.C(appCompatActivity, p018b9.a.class))).getClass();
        H8.e eVar = new H8.e(26);
        s10.getClass();
        return new p018b9.f(s10, eVar);
    }

    public static final F9.c u(W9.f fVar) {
        j.e(fVar, "<this>");
        if (fVar instanceof W9.b) {
            return null;
        }
        if (fVar instanceof V) {
            return u(((V) fVar).f10487a);
        }
        return null;
    }

    public static float x(int i10, String[] strArr) {
        float f3 = Float.parseFloat(strArr[i10]);
        if (f3 >= 0.0f && f3 <= 1.0f) {
            return f3;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f3);
    }

    public static final int y(p pVar, long j, c1 c1Var) {
        float f3 = c1Var != null ? c1Var.f() : 0.0f;
        int i10 = (int) (4294967295L & j);
        int iE = pVar.e(Float.intBitsToFloat(i10));
        if (Float.intBitsToFloat(i10) < pVar.f(iE) - f3 || Float.intBitsToFloat(i10) > pVar.b(iE) + f3) {
            return -1;
        }
        int i11 = (int) (j >> 32);
        if (Float.intBitsToFloat(i11) < (-f3) || Float.intBitsToFloat(i11) > pVar.f8109d + f3) {
            return -1;
        }
        return iE;
    }

    public static E1.e z(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new E1.e(new E1.h(K1.f(configuration))) : E1.e.a(configuration.locale);
    }

    public abstract Context B();

    public boolean D() {
        return false;
    }

    public abstract void L();

    public abstract boolean N(int i10, KeyEvent keyEvent);

    public boolean O(KeyEvent keyEvent) {
        return false;
    }

    public boolean P() {
        return false;
    }

    public abstract void U(boolean z10);

    public abstract void V(boolean z10);

    public abstract void W();

    public abstract void X();

    public abstract void a0(boolean z10);

    public abstract void b0(CharSequence charSequence);

    public p130n.a c0(L5.c cVar) {
        return null;
    }

    public boolean m() {
        return false;
    }

    public abstract boolean n();

    public abstract void r(boolean z10);

    public abstract void v(R7.y yVar, float f3, float f7);

    public abstract int w();

    public void M() {
    }
}
