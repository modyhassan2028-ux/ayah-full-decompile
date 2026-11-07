package Y2;

import A.I0;
import A.U0;
import D.AbstractC0066i;
import D.C0076t;
import Da.t;
import Da.x;
import E2.A;
import F.s;
import F9.n;
import I1.S;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.m1;
import O.C0445m;
import O.C0446n;
import O.C0448p;
import O.C0449q;
import O.EnumC0442j;
import O.InterfaceC0441i;
import U0.C0515g;
import U0.I;
import U0.K;
import W.AbstractC0542b2;
import W.AbstractC0607v1;
import W.G2;
import W.H2;
import Y0.l;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.M0;
import Z.X;
import Z0.y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.support.v4.media.session.p;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.measurement.J1;
import com.google.android.gms.internal.measurement.Z1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.realm.RealmFieldTypeConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import l0.o;
import l0.r;
import p005a4.e;
import p120l9.m;
import p150o9.f;
import p150o9.g;
import p150o9.h;
import p150o9.i;
import p151p.C1256n;
import p151p.H0;
import p180s0.F;
import p180s0.L;
import p180s0.q;
import p185s8.u0;
import p224x0.C1441e;
import p224x0.C1442f;
import p224x0.G;
import p251z9.j;
import p251z9.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C1442f f10375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C1442f f10376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f10377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f10378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Thread f10379e;

    public static final C1442f A() {
        C1442f c1442f = f10375a;
        if (c1442f != null) {
            return c1442f;
        }
        C1441e c1441e = new C1441e("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = G.f24154a;
        L l10 = new L(q.f21839b);
        C1256n c1256n = new C1256n(13);
        c1256n.j(19.0f, 6.41f);
        c1256n.e(17.59f, 5.0f);
        c1256n.e(12.0f, 10.59f);
        c1256n.e(6.41f, 5.0f);
        c1256n.e(5.0f, 6.41f);
        c1256n.e(10.59f, 12.0f);
        c1256n.e(5.0f, 17.59f);
        c1256n.e(6.41f, 19.0f);
        c1256n.e(12.0f, 13.41f);
        c1256n.e(17.59f, 19.0f);
        c1256n.e(19.0f, 17.59f);
        c1256n.e(13.41f, 12.0f);
        c1256n.a();
        C1441e.a(c1441e, (ArrayList) c1256n.f20747s, l10);
        C1442f c1442fB = c1441e.b();
        f10375a = c1442fB;
        return c1442fB;
    }

    public static int B(int i10, View view) {
        Context context = view.getContext();
        TypedValue typedValueA = u0.A(i10, view.getContext(), view.getClass().getCanonicalName());
        int i11 = typedValueA.resourceId;
        return i11 != 0 ? context.getColor(i11) : typedValueA.data;
    }

    public static int C(Context context, int i10, int i11) {
        Integer numValueOf;
        TypedValue typedValueY = u0.y(context, i10);
        if (typedValueY != null) {
            int i12 = typedValueY.resourceId;
            numValueOf = Integer.valueOf(i12 != 0 ? context.getColor(i12) : typedValueY.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11;
    }

    public static final int D(Q2.c cVar, String str) {
        j.e(cVar, "stmt");
        int iR = r(cVar, str);
        if (iR >= 0) {
            return iR;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(cVar.getColumnName(i10));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + m.l0(arrayList, null, null, null, null, 63) + ']');
    }

    public static Drawable E(Context context, int i10) {
        return H0.d().f(context, i10);
    }

    public static String F() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String G(Context context, int i10) {
        if (i10 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i10);
        } catch (Exception unused) {
            return p123m2.c.r(i10, "?");
        }
    }

    public static String H(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static final C0515g L(y yVar) {
        C0515g c0515g = yVar.f10953a;
        long j = yVar.f10954b;
        c0515g.getClass();
        return c0515g.subSequence(K.e(j), K.d(j));
    }

    public static String O(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static final C0515g P(y yVar, int i10) {
        C0515g c0515g = yVar.f10953a;
        long j = yVar.f10954b;
        return c0515g.subSequence(K.d(j), Math.min(K.d(j) + i10, yVar.f10953a.f8060s.length()));
    }

    public static final C0515g Q(y yVar, int i10) {
        C0515g c0515g = yVar.f10953a;
        long j = yVar.f10954b;
        return c0515g.subSequence(Math.max(0, K.e(j) - i10), K.e(j));
    }

    public static boolean S(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    public static boolean T(int i10) {
        if (i10 == 0) {
            return false;
        }
        ThreadLocal threadLocal = A1.a.f460a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d5 = ((double) iRed) / 255.0d;
        double dPow = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d9 = ((double) iGreen) / 255.0d;
        double dPow2 = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        double d10 = ((double) iBlue) / 255.0d;
        double dPow3 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d11 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d11;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d11 / 100.0d > 0.5d;
    }

    public static boolean U() {
        if (Build.VERSION.SDK_INT >= 29) {
            return V2.a.a();
        }
        try {
            if (f10378d == null) {
                f10377c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f10378d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f10378d.invoke(null, Long.valueOf(f10377c))).booleanValue();
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
                return false;
            }
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static int V(int i10, float f3, int i11) {
        return A1.a.c(A1.a.e(i11, Math.round(Color.alpha(i11) * f3)), i10);
    }

    public static int W(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return Math.max(0, i11 - i12);
    }

    public static int X(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static h Y(f fVar, g gVar) {
        j.e(gVar, "key");
        return j.a(fVar.getKey(), gVar) ? i.f20380r : fVar;
    }

    public static h Z(f fVar, h hVar) {
        j.e(hVar, "context");
        return hVar == i.f20380r ? fVar : (h) hVar.F(fVar, new p026c5.a(11));
    }

    public static final void a(int i10, int i11, p241y9.a aVar, r rVar, C0698o c0698o, int i12) {
        p241y9.a aVar2;
        C0698o c0698o2;
        r rVar2;
        j.e(aVar, "onClick");
        c0698o.V(-21103630);
        int i13 = (c0698o.e(i10) ? 4 : 2) | i12 | (c0698o.e(i11) ? 32 : 16) | (c0698o.i(aVar) ? 256 : 128) | 3072;
        if (c0698o.K(i13 & 1, (i13 & 1171) != 1170)) {
            o oVar = o.f19333a;
            aVar2 = aVar;
            c0698o2 = c0698o;
            c(p000a.a.m0(i10, c0698o), p000a.a.m0(i11, c0698o), aVar2, oVar, c0698o2, i13 & 8064, 0);
            rVar2 = oVar;
        } else {
            aVar2 = aVar;
            c0698o2 = c0698o;
            c0698o2.N();
            rVar2 = rVar;
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new W4.a(i10, i11, i12, rVar2, aVar2);
        }
    }

    public static final void a0(String str, Bundle bundle) {
        j.e(str, "key");
        bundle.putString(str, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:56:0x014a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void b(int i10, p241y9.a aVar, r rVar, C0698o c0698o, int i11, int i12) {
        int i13;
        r rVar2;
        boolean z10;
        r rVar3;
        C0699o0 c0699o0R;
        boolean z11;
        Object objH;
        int i14;
        C0286i c0286i;
        C0285h c0285h;
        j.e(aVar, "onClick");
        c0698o.V(-684789617);
        if ((i11 & 6) == 0) {
            i13 = (c0698o.e(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0698o.i(aVar) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 == 0) {
            if ((i11 & 384) == 0) {
                rVar2 = rVar;
                i13 |= c0698o.g(rVar2) ? 256 : 128;
            }
            if ((i13 & 147) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0698o.K(i13 & 1, z10)) {
                if (i15 != 0) {
                    rVar3 = o.f19333a;
                } else {
                    rVar3 = rVar2;
                }
                if ((i13 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objH = c0698o.H();
                if (z11 || objH == C0690k.f10683a) {
                    objH = new A5.c(8, aVar);
                    c0698o.e0(objH);
                }
                r rVarB = androidx.compose.foundation.a.c(rVar3, false, null, (p241y9.a) objH, 7).b(androidx.compose.foundation.layout.c.f11826a);
                M0 m10 = e.f11187a;
                r rVarH = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.a(rVarB, ((p005a4.a) c0698o.k(m10)).g(), F.f21774a), 16);
                C0076t c0076tA = D.r.a(AbstractC0066i.f981e, l0.c.f19309D, c0698o, 6);
                i14 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                r rVarC = l0.a.c(c0698o, rVarH);
                InterfaceC0288k.f4142a.getClass();
                c0286i = C0287j.f4115b;
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, c0076tA, C0287j.f4119f);
                C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                c0285h = C0287j.g;
                if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i14))) {
                    p123m2.c.y(i14, c0698o, i14, c0285h);
                }
                C0672b.v(c0698o, rVarC, C0287j.f4117d);
                AbstractC0542b2.b(p000a.a.m0(i10, c0698o), null, ((p005a4.a) c0698o.k(m10)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, U0.L.a(((G2) c0698o.k(H2.f8580a)).g, 0L, n.B(18), null, null, 0L, 0L, null, 16777213), c0698o, 0, 0, 65530);
                c0698o.p(true);
            } else {
                c0698o.N();
                rVar3 = rVar2;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new D4.o(i10, i11, i12, rVar3, aVar);
            }
        }
        i13 |= 384;
        rVar2 = rVar;
        if ((i13 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0698o.K(i13 & 1, z10)) {
            if (i15 != 0) {
                rVar3 = o.f19333a;
            } else {
                rVar3 = rVar2;
            }
            if ((i13 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            objH = c0698o.H();
            if (z11) {
                objH = new A5.c(8, aVar);
                c0698o.e0(objH);
            } else {
                objH = new A5.c(8, aVar);
                c0698o.e0(objH);
            }
            r rVarB2 = androidx.compose.foundation.a.c(rVar3, false, null, (p241y9.a) objH, 7).b(androidx.compose.foundation.layout.c.f11826a);
            M0 m11 = e.f11187a;
            r rVarH2 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.a(rVarB2, ((p005a4.a) c0698o.k(m11)).g(), F.f21774a), 16);
            C0076t c0076tA2 = D.r.a(AbstractC0066i.f981e, l0.c.f19309D, c0698o, 6);
            i14 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
            r rVarC2 = l0.a.c(c0698o, rVarH2);
            InterfaceC0288k.f4142a.getClass();
            c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0076tA2, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M2, C0287j.f4118e);
            c0285h = C0287j.g;
            if (c0698o.f10720O) {
                p123m2.c.y(i14, c0698o, i14, c0285h);
            } else {
                p123m2.c.y(i14, c0698o, i14, c0285h);
            }
            C0672b.v(c0698o, rVarC2, C0287j.f4117d);
            AbstractC0542b2.b(p000a.a.m0(i10, c0698o), null, ((p005a4.a) c0698o.k(m11)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, U0.L.a(((G2) c0698o.k(H2.f8580a)).g, 0L, n.B(18), null, null, 0L, 0L, null, 16777213), c0698o, 0, 0, 65530);
            c0698o.p(true);
        } else {
            c0698o.N();
            rVar3 = rVar2;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new D4.o(i10, i11, i12, rVar3, aVar);
        }
    }

    public static final void b0(Bundle bundle, String str, Bundle bundle2) {
        j.e(str, "key");
        j.e(bundle2, "value");
        bundle.putBundle(str, bundle2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x0107  */
    /* JADX WARN: Code duplicated, block: B:66:0x01af  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void c(String str, String str2, p241y9.a aVar, r rVar, C0698o c0698o, int i10, int i11) {
        int i12;
        r rVar2;
        boolean z10;
        r rVar3;
        C0699o0 c0699o0R;
        r rVar4;
        boolean z11;
        boolean z12;
        Object objH;
        int i13;
        C0286i c0286i;
        C0285h c0285h;
        C0698o c0698o2 = c0698o;
        j.e(str, "title");
        j.e(str2, "subtitle");
        c0698o2.V(-446230068);
        if ((i10 & 6) == 0) {
            i12 = (c0698o2.g(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0698o2.g(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c0698o2.i(aVar) ? 256 : 128;
        }
        int i14 = i11 & 8;
        if (i14 == 0) {
            if ((i10 & 3072) == 0) {
                rVar2 = rVar;
                i12 |= c0698o2.g(rVar2) ? 2048 : 1024;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0698o2.K(i12 & 1, z10)) {
                if (i14 != 0) {
                    rVar4 = o.f19333a;
                } else {
                    rVar4 = rVar2;
                }
                r rVarB = rVar4.b(androidx.compose.foundation.layout.c.f11826a);
                if (aVar != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = (i12 & 896) == 256;
                objH = c0698o2.H();
                if (z12 || objH == C0690k.f10683a) {
                    objH = new A5.c(7, aVar);
                    c0698o2.e0(objH);
                }
                r rVarC = androidx.compose.foundation.a.c(rVarB, z11, null, (p241y9.a) objH, 6);
                M0 m10 = e.f11187a;
                r rVarH = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.a(rVarC, ((p005a4.a) c0698o2.k(m10)).g(), F.f21774a), 16);
                C0076t c0076tA = D.r.a(AbstractC0066i.f981e, l0.c.f19309D, c0698o2, 6);
                i13 = c0698o2.f10721P;
                InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                r rVarC2 = l0.a.c(c0698o2, rVarH);
                InterfaceC0288k.f4142a.getClass();
                c0286i = C0287j.f4115b;
                c0698o2.X();
                if (c0698o2.f10720O) {
                    c0698o2.l(c0286i);
                } else {
                    c0698o2.h0();
                }
                C0672b.v(c0698o2, c0076tA, C0287j.f4119f);
                C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                c0285h = C0287j.g;
                if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i13))) {
                    p123m2.c.y(i13, c0698o2, i13, c0285h);
                }
                C0672b.v(c0698o2, rVarC2, C0287j.f4117d);
                M0 m11 = H2.f8580a;
                AbstractC0542b2.b(str, null, ((p005a4.a) c0698o2.k(m10)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, U0.L.a(((G2) c0698o2.k(m11)).f8563h, 0L, 0L, l.f10360u, null, 0L, 0L, null, 16777211), c0698o, i12 & 14, 0, 65530);
                AbstractC0542b2.b(str2, null, ((p005a4.a) c0698o.k(m10)).h(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, U0.L.a(((G2) c0698o.k(m11)).f8564i, 0L, 0L, l.f10359t, null, 0L, 0L, null, 16777211), c0698o, (i12 >> 3) & 14, 0, 65530);
                c0698o2 = c0698o;
                c0698o2.p(true);
                rVar3 = rVar4;
            } else {
                c0698o2.N();
                rVar3 = rVar2;
            }
            c0699o0R = c0698o2.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new W4.b(str, str2, aVar, rVar3, i10, i11);
            }
        }
        i12 |= 3072;
        rVar2 = rVar;
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0698o2.K(i12 & 1, z10)) {
            if (i14 != 0) {
                rVar4 = o.f19333a;
            } else {
                rVar4 = rVar2;
            }
            r rVarB2 = rVar4.b(androidx.compose.foundation.layout.c.f11826a);
            if (aVar != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i12 & 896) == 256) {
            }
            objH = c0698o2.H();
            if (z12) {
                objH = new A5.c(7, aVar);
                c0698o2.e0(objH);
            } else {
                objH = new A5.c(7, aVar);
                c0698o2.e0(objH);
            }
            r rVarC3 = androidx.compose.foundation.a.c(rVarB2, z11, null, (p241y9.a) objH, 6);
            M0 m12 = e.f11187a;
            r rVarH2 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.a(rVarC3, ((p005a4.a) c0698o2.k(m12)).g(), F.f21774a), 16);
            C0076t c0076tA2 = D.r.a(AbstractC0066i.f981e, l0.c.f19309D, c0698o2, 6);
            i13 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o2.m();
            r rVarC4 = l0.a.c(c0698o2, rVarH2);
            InterfaceC0288k.f4142a.getClass();
            c0286i = C0287j.f4115b;
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, c0076tA2, C0287j.f4119f);
            C0672b.v(c0698o2, interfaceC0687i0M2, C0287j.f4118e);
            c0285h = C0287j.g;
            if (c0698o2.f10720O) {
                p123m2.c.y(i13, c0698o2, i13, c0285h);
            } else {
                p123m2.c.y(i13, c0698o2, i13, c0285h);
            }
            C0672b.v(c0698o2, rVarC4, C0287j.f4117d);
            M0 m13 = H2.f8580a;
            AbstractC0542b2.b(str, null, ((p005a4.a) c0698o2.k(m12)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, U0.L.a(((G2) c0698o2.k(m13)).f8563h, 0L, 0L, l.f10360u, null, 0L, 0L, null, 16777211), c0698o, i12 & 14, 0, 65530);
            AbstractC0542b2.b(str2, null, ((p005a4.a) c0698o.k(m12)).h(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, U0.L.a(((G2) c0698o.k(m13)).f8564i, 0L, 0L, l.f10359t, null, 0L, 0L, null, 16777211), c0698o, (i12 >> 3) & 14, 0, 65530);
            c0698o2 = c0698o;
            c0698o2.p(true);
            rVar3 = rVar4;
        } else {
            c0698o2.N();
            rVar3 = rVar2;
        }
        c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new W4.b(str, str2, aVar, rVar3, i10, i11);
        }
    }

    public static final void c0(String str, String str2, Bundle bundle) {
        j.e(str, "key");
        j.e(str2, "value");
        bundle.putString(str, str2);
    }

    public static final void d(r rVar, List list, fa.a aVar, C0698o c0698o, int i10) {
        c0698o.V(-882086200);
        v vVar = new v();
        c0698o.U(-492369756);
        Object objH = c0698o.H();
        Object obj = C0690k.f10683a;
        if (objH == obj) {
            objH = C0672b.r(p120l9.r.f19440r);
            c0698o.e0(objH);
        }
        c0698o.p(false);
        X x9 = (X) objH;
        c0698o.U(-492369756);
        Object objH2 = c0698o.H();
        if (objH2 == obj) {
            objH2 = C0672b.r(0L);
            c0698o.e0(objH2);
        }
        c0698o.p(false);
        X x10 = (X) objH2;
        c0698o.U(-492369756);
        Object objH3 = c0698o.H();
        if (objH3 == obj) {
            objH3 = C0672b.r(new ia.a(0.0f, 0.0f));
            c0698o.e0(objH3);
        }
        c0698o.p(false);
        X x11 = (X) objH3;
        c0698o.U(-492369756);
        Object objH4 = c0698o.H();
        if (objH4 == obj) {
            objH4 = new ja.a();
            new LinkedHashMap();
            c0698o.e0(objH4);
        }
        c0698o.p(false);
        ja.a aVar2 = (ja.a) objH4;
        C0672b.f(c0698o, p110k9.y.f19095a, new m1(vVar, list, aVar2, x10, x9, aVar, x11, null));
        c0698o.U(1157296644);
        boolean zG = c0698o.g(x11);
        Object objH5 = c0698o.H();
        if (zG || objH5 == obj) {
            objH5 = new U0(x11, 7);
            c0698o.e0(objH5);
        }
        c0698o.p(false);
        p171r0.f.a(androidx.compose.ui.layout.a.d(rVar, (p241y9.c) objH5), new X.L(8, x9, aVar2), c0698o, 0);
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R == null) {
            return;
        }
        c0699o0R.f10749d = new I0(rVar, list, aVar, i10, 7);
    }

    public static final void d0(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final long e(float f3, float f7) {
        return (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static p023c2.b e0(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i10 = byteBufferDuplicate.getShort() & 65535;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                j = -1;
                break;
            }
            int i12 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j10 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i13 = 0; i13 < j10; i13++) {
                int i14 = byteBufferDuplicate.getInt();
                long j11 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i14 || 1701669481 == i14) {
                    byteBufferDuplicate.position((int) (j11 + j));
                    p023c2.b bVar = new p023c2.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f3680u = byteBufferDuplicate;
                    bVar.f3677r = iPosition;
                    int i15 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f3678s = i15;
                    bVar.f3679t = ((ByteBuffer) bVar.f3680u).getShort(i15);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final C0446n f(J1 j10, InterfaceC0441i interfaceC0441i) {
        EnumC0442j enumC0442jD = j10.d();
        A a9 = (A) j10.f14057d;
        boolean z10 = enumC0442jD == EnumC0442j.f6376r;
        return new C0446n(j(a9, z10, true, interfaceC0441i), j(a9, z10, false, interfaceC0441i), z10);
    }

    public static final void f0(com.squareup.moshi.o oVar, com.squareup.moshi.q qVar) {
        int iN = oVar.N();
        switch (dev.zacsweers.moshix.adapters.b.f15710a[AbstractC0607v1.b(iN)]) {
            case 1:
                oVar.b();
                qVar.b();
                while (oVar.w()) {
                    f0(oVar, qVar);
                }
                qVar.X(1, 2, ']');
                oVar.i();
                return;
            case 2:
                oVar.e();
                qVar.e();
                while (oVar.w()) {
                    qVar.w(oVar.j0());
                    f0(oVar, qVar);
                }
                qVar.i();
                oVar.n();
                return;
            case 3:
                qVar.N(oVar.L());
                return;
            case 4:
                boolean z10 = oVar.f15453v;
                oVar.f15453v = true;
                try {
                    qVar.s(oVar.L());
                    return;
                } finally {
                    oVar.f15453v = z10;
                }
            case 5:
                qVar.O(oVar.A());
                return;
            case 6:
                oVar.H();
                qVar.A();
                return;
            case 7:
            case 8:
            case 9:
            case 10:
                throw new A6.a("Unexpected token " + p.G(iN) + " at " + oVar.s());
            default:
                throw new A6.a();
        }
    }

    public static final boolean g(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (j.f(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static void g0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final LinkedHashSet h(com.squareup.moshi.o oVar, com.squareup.moshi.q qVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        oVar.e();
        qVar.e();
        while (oVar.w()) {
            String strJ0 = oVar.j0();
            linkedHashSet.add(strJ0);
            qVar.w(strJ0);
            f0(oVar, qVar);
        }
        qVar.i();
        oVar.n();
        return linkedHashSet;
    }

    public static final Resources h0(C0698o c0698o) {
        c0698o.k(AndroidCompositionLocals_androidKt.f12062a);
        return ((Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b)).getResources();
    }

    public static final C0445m i(J1 j10, A a9, C0445m c0445m) {
        EnumC0442j enumC0442j;
        int i10 = a9.f1435c;
        int i11 = a9.f1434b;
        boolean z10 = j10.f14055b;
        int i12 = z10 ? i11 : i10;
        I i13 = (I) a9.f1437e;
        int i14 = a9.f1436d;
        C0449q c0449q = new C0449q(i12, a9);
        p110k9.h hVar = p110k9.h.f19075s;
        p110k9.g gVarC = p110k9.a.c(hVar, c0449q);
        p110k9.g gVarC2 = p110k9.a.c(hVar, new C0448p(a9, i12, z10 ? i10 : i11, j10, gVarC));
        if (1 != c0445m.f6385c) {
            return (C0445m) gVarC2.getValue();
        }
        if (i12 == i14) {
            return c0445m;
        }
        if (((Number) gVarC.getValue()).intValue() != i13.f8024b.d(i14)) {
            return (C0445m) gVarC2.getValue();
        }
        int i15 = c0445m.f6384b;
        long jI = i13.i(i15);
        if (i14 != -1) {
            if (i12 != i14) {
                EnumC0442j enumC0442j2 = EnumC0442j.f6376r;
                if (i11 < i10) {
                    enumC0442j = EnumC0442j.f6377s;
                } else {
                    enumC0442j = i11 > i10 ? enumC0442j2 : EnumC0442j.f6378t;
                }
                if (!((enumC0442j == enumC0442j2) ^ z10)) {
                }
            }
            return a9.d(i12);
        }
        int i16 = K.f8034c;
        return (i15 == ((int) (jI >> 32)) || i15 == ((int) (4294967295L & jI))) ? (C0445m) gVarC2.getValue() : a9.d(i12);
    }

    public static void i0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = S.f3689a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z10 = onLongClickListener != null;
        boolean z11 = zHasOnClickListeners || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z10);
        checkableImageButton.setImportantForAccessibility(z11 ? 1 : 2);
    }

    public static final C0445m j(A a9, boolean z10, boolean z11, InterfaceC0441i interfaceC0441i) {
        long j;
        long jA = interfaceC0441i.a(z11 ? a9.f1434b : a9.f1435c, a9);
        if (z10 ^ z11) {
            int i10 = K.f8034c;
            j = jA >> 32;
        } else {
            int i11 = K.f8034c;
            j = 4294967295L & jA;
        }
        return a9.d((int) j);
    }

    public static final Da.c j0(Socket socket) throws IOException {
        Ea.c cVar = new Ea.c(socket);
        OutputStream outputStream = socket.getOutputStream();
        j.d(outputStream, "getOutputStream(...)");
        return new Da.c(0, cVar, new Da.c(1, outputStream, cVar));
    }

    public static void k(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static int k0(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static boolean l(int i10, Rect rect, Rect rect2, Rect rect3) {
        int iW;
        int i11;
        int i12;
        boolean zM = m(i10, rect, rect2);
        if (m(i10, rect, rect3) || !zM) {
            return false;
        }
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i10 != 17 && i10 != 66) {
                            iW = W(i10, rect, rect2);
                            if (i10 != 17) {
                                i11 = rect.left;
                                i12 = rect3.left;
                            } else if (i10 != 33) {
                                i11 = rect.top;
                                i12 = rect3.top;
                            } else if (i10 != 66) {
                                i11 = rect3.right;
                                i12 = rect.right;
                            } else {
                                if (i10 == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i11 = rect3.bottom;
                                i12 = rect.bottom;
                            }
                            if (iW < Math.max(1, i11 - i12)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i10 != 17) {
                        iW = W(i10, rect, rect2);
                        if (i10 != 17) {
                            i11 = rect.left;
                            i12 = rect3.left;
                        } else if (i10 != 33) {
                            i11 = rect.top;
                            i12 = rect3.top;
                        } else if (i10 != 66) {
                            i11 = rect3.right;
                            i12 = rect.right;
                        } else {
                            if (i10 == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i11 = rect3.bottom;
                            i12 = rect.bottom;
                        }
                        if (iW < Math.max(1, i11 - i12)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i10 != 17) {
                    iW = W(i10, rect, rect2);
                    if (i10 != 17) {
                        i11 = rect.left;
                        i12 = rect3.left;
                    } else if (i10 != 33) {
                        i11 = rect.top;
                        i12 = rect3.top;
                    } else if (i10 != 66) {
                        i11 = rect3.right;
                        i12 = rect.right;
                    } else {
                        if (i10 == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i11 = rect3.bottom;
                        i12 = rect.bottom;
                    }
                    if (iW < Math.max(1, i11 - i12)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i10 != 17) {
                iW = W(i10, rect, rect2);
                if (i10 != 17) {
                    i11 = rect.left;
                    i12 = rect3.left;
                } else if (i10 != 33) {
                    i11 = rect.top;
                    i12 = rect3.top;
                } else if (i10 != 66) {
                    i11 = rect3.right;
                    i12 = rect.right;
                } else {
                    if (i10 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = rect3.bottom;
                    i12 = rect.bottom;
                }
                if (iW < Math.max(1, i11 - i12)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final Da.d l0(Socket socket) throws IOException {
        Ea.c cVar = new Ea.c(socket);
        InputStream inputStream = socket.getInputStream();
        j.d(inputStream, "getInputStream(...)");
        return new Da.d(0, cVar, new Da.d(1, inputStream, cVar));
    }

    public static boolean m(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final int m0(F.r rVar) {
        ?? r10 = rVar.f2103k;
        int size = r10.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((s) r10.get(i11)).f2121n;
        }
        return (i10 / r10.size()) + rVar.f2109q;
    }

    public static void n(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static String n0(Z1 z10) {
        StringBuilder sb = new StringBuilder(z10.d());
        for (int i10 = 0; i10 < z10.d(); i10++) {
            byte b5 = z10.b(i10);
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

    public static final Da.s o(x xVar) {
        j.e(xVar, "<this>");
        return new Da.s(xVar);
    }

    public static final t p(Da.y yVar) {
        j.e(yVar, "<this>");
        return new t(yVar);
    }

    public static final C0445m q(C0445m c0445m, A a9, int i10) {
        return new C0445m(((I) a9.f1437e).a(i10), i10, c0445m.f6385c);
    }

    public static final int r(Q2.c cVar, String str) {
        j.e(cVar, "<this>");
        int iS = s(cVar, str);
        if (iS >= 0) {
            return iS;
        }
        int iS2 = s(cVar, "`" + str + '`');
        if (iS2 >= 0) {
            return iS2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = cVar.getColumnCount();
        String strConcat = ".".concat(str);
        String strA = p245z2.a.A('`', ".", str);
        for (int i10 = 0; i10 < columnCount; i10++) {
            String columnName = cVar.getColumnName(i10);
            if (columnName.length() >= str.length() + 2 && (H9.v.L0(columnName, strConcat) || (columnName.charAt(0) == '`' && H9.v.L0(columnName, strA)))) {
                return i10;
            }
        }
        return -1;
    }

    public static final int s(Q2.c cVar, String str) {
        j.e(cVar, "<this>");
        j.e(str, "name");
        int columnCount = cVar.getColumnCount();
        for (int i10 = 0; i10 < columnCount; i10++) {
            if (str.equals(cVar.getColumnName(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public static int t(int i10, int i11) {
        return A1.a.e(i10, (Color.alpha(i10) * i11) / 255);
    }

    public static ImageView.ScaleType u(int i10) {
        if (i10 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i10 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i10 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i10 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i10 != 5) {
            return i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static void v(String str, String str2, Object obj) {
        String strO = O(str);
        if (Log.isLoggable(strO, 3)) {
            Log.d(strO, String.format(str2, obj));
        }
    }

    public static void w(String str, String str2, Exception exc) {
        String strO = O(str);
        if (Log.isLoggable(strO, 6)) {
            Log.e(strO, str2, exc);
        }
    }

    public static a x(int i10, double[] dArr, double[][] dArr2) {
        int i11 = dArr.length == 1 ? 2 : i10;
        double d5 = 0.0d;
        if (i11 != 0) {
            if (i11 == 2) {
                double d9 = dArr[0];
                double[] dArr3 = dArr2[0];
                m1.c cVar = new m1.c();
                cVar.f19496f = d9;
                cVar.g = dArr3;
                return cVar;
            }
            m1.b bVar = new m1.b();
            int length = dArr2[0].length;
            bVar.g = dArr;
            bVar.f19495h = dArr2;
            if (length > 2) {
                double d10 = 0.0d;
                int i12 = 0;
                while (i12 < dArr.length) {
                    double d11 = dArr2[i12][0];
                    if (i12 > 0) {
                        Math.hypot(d11 - d5, d11 - d10);
                    }
                    i12++;
                    d10 = d11;
                    d5 = d10;
                }
            }
            return bVar;
        }
        m1.f fVar = new m1.f();
        int length2 = dArr.length;
        int length3 = dArr2[0].length;
        int i13 = length2 - 1;
        Class cls = Double.TYPE;
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, i13, length3);
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, length2, length3);
        for (int i14 = 0; i14 < length3; i14++) {
            int i15 = 0;
            while (i15 < i13) {
                int i16 = i15 + 1;
                double d12 = dArr[i16] - dArr[i15];
                double[] dArr6 = dArr4[i15];
                double d13 = (dArr2[i16][i14] - dArr2[i15][i14]) / d12;
                dArr6[i14] = d13;
                if (i15 == 0) {
                    dArr5[i15][i14] = d13;
                } else {
                    dArr5[i15][i14] = (dArr4[i15 - 1][i14] + d13) * 0.5d;
                }
                i15 = i16;
            }
            dArr5[i13][i14] = dArr4[length2 - 2][i14];
        }
        int i17 = 0;
        while (i17 < i13) {
            int i18 = 0;
            while (i18 < length3) {
                double d14 = dArr4[i17][i18];
                if (d14 == d5) {
                    dArr5[i17][i18] = d5;
                    dArr5[i17 + 1][i18] = d5;
                } else {
                    double d15 = dArr5[i17][i18] / d14;
                    int i19 = i17 + 1;
                    double d16 = dArr5[i19][i18] / d14;
                    double dHypot = Math.hypot(d15, d16);
                    if (dHypot > 9.0d) {
                        double d17 = 3.0d / dHypot;
                        double[] dArr7 = dArr5[i17];
                        double[] dArr8 = dArr4[i17];
                        dArr7[i18] = d15 * d17 * dArr8[i18];
                        dArr5[i19][i18] = d17 * d16 * dArr8[i18];
                    }
                }
                i18++;
                d5 = 0.0d;
            }
            i17++;
            d5 = 0.0d;
        }
        fVar.f19503f = dArr;
        fVar.g = dArr2;
        fVar.f19504h = dArr5;
        return fVar;
    }

    public static f y(f fVar, g gVar) {
        j.e(gVar, "key");
        if (j.a(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static N0.a z(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new N0.a(Z6.a.c(view));
        }
        return null;
    }

    public abstract double I(double d5);

    public abstract void J(double d5, double[] dArr);

    public abstract void K(double d5, float[] fArr);

    public abstract double M(double d5);

    public abstract void N(double d5, double[] dArr);

    public abstract double[] R();
}
