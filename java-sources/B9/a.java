package B9;

import A.C0029l;
import A.C0037p;
import D.AbstractC0060c;
import D.AbstractC0066i;
import D.InterfaceC0064g;
import D.P;
import F.A;
import F.C0152a;
import F.D;
import F2.C0162g;
import F2.u;
import F2.w;
import F9.n;
import K.v0;
import K0.AbstractC0359n0;
import K0.c1;
import K9.AbstractC0405x;
import L2.b;
import N9.AbstractC0419l;
import O.C0435c;
import O.C0436d;
import O.C0437e;
import O.C0438f;
import O.C0440h;
import O.C0443k;
import O.InterfaceC0444l;
import O.y;
import P9.d;
import R0.m;
import R0.v;
import U0.C;
import U0.C0511c;
import U0.C0515g;
import U0.K;
import U0.L;
import U6.C0532j;
import X1.e;
import Y0.k;
import Y0.l;
import Y9.M;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.C0709z;
import Z0.B;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ka.p;
import l0.g;
import l0.r;
import p055f1.q;
import p104k1.t;
import p122m0.f;
import p122m0.o;
import p150o9.h;
import p150o9.i;
import p151p.C1256n;
import p151p.V;
import p180s0.C1294c;
import p180s0.C1297f;
import p180s0.F;
import p180s0.I;
import p185s8.u0;
import p214w.S;
import p223x.C1431u;
import p224x0.C1441e;
import p224x0.C1442f;
import p224x0.G;
import p232y.C1452f;
import p232y.C1453g;
import p232y.Y;
import p251z9.j;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C1442f f652a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C1442f f653b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f654c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f656e;

    public a() {
        new ConcurrentHashMap();
    }

    public static final String[] A(o oVar) {
        j.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((f) oVar).f19470b.toArray(new String[0]);
    }

    public static final h B(u uVar, boolean z10, c cVar) {
        if (!uVar.g()) {
            d dVar = uVar.f2320a;
            if (dVar != null) {
                return dVar.f6772r;
            }
            j.k("coroutineScope");
            throw null;
        }
        if (cVar.getContext().i(w.f2332r) != null) {
            throw new ClassCastException();
        }
        if (z10) {
            h hVar = uVar.f2321b;
            if (hVar != null) {
                return hVar;
            }
            j.k("transactionContext");
            throw null;
        }
        d dVar2 = uVar.f2320a;
        if (dVar2 != null) {
            return dVar2.f6772r;
        }
        j.k("coroutineScope");
        throw null;
    }

    public static final int C(String str, Bundle bundle) {
        int i10 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i10 != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10;
        }
        n.J(str);
        throw null;
    }

    public static final Object D(R0.j jVar, v vVar) {
        Object objG = jVar.f7108r.g(vVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final long E(B b5) {
        DragEvent dragEvent = (DragEvent) b5.f10875s;
        float x9 = dragEvent.getX();
        float y10 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x9)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L);
    }

    public static final Bundle F(String str, Bundle bundle) {
        j.e(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        n.J(str);
        throw null;
    }

    public static final ArrayList G(String str, Bundle bundle) {
        j.e(str, "key");
        ArrayList arrayListC = Build.VERSION.SDK_INT >= 34 ? E1.a.c(bundle, str, p171r0.a.d(p251z9.w.a(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (arrayListC != null) {
            return arrayListC;
        }
        n.J(str);
        throw null;
    }

    public static int I(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 32) {
            return 5;
        }
        if (i10 == 64) {
            return 6;
        }
        if (i10 == 128) {
            return 7;
        }
        if (i10 == 256) {
            return 8;
        }
        if (i10 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(p123m2.c.r(i10, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final e J(String str) {
        j.e(str, "name");
        return new e(str);
    }

    public static final boolean K(String str, Bundle bundle) {
        j.e(str, "key");
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static final float L(float f3, float f7, float f10) {
        return (f10 * f7) + ((1 - f10) * f3);
    }

    public static final int M(int i10, float f3, int i11) {
        return i10 + ((int) Math.round(((double) (i11 - i10)) * ((double) f3)));
    }

    public static p024c3.e P(String str) {
        if (str != null && !H9.o.e1(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                Integer numValueOf = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    String strGroup2 = matcher.group(2);
                    Integer numValueOf2 = strGroup2 == null ? null : Integer.valueOf(Integer.parseInt(strGroup2));
                    if (numValueOf2 != null) {
                        int iIntValue2 = numValueOf2.intValue();
                        String strGroup3 = matcher.group(3);
                        Integer numValueOf3 = strGroup3 == null ? null : Integer.valueOf(Integer.parseInt(strGroup3));
                        if (numValueOf3 != null) {
                            int iIntValue3 = numValueOf3.intValue();
                            String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                            j.d(strGroup4, "description");
                            return new p024c3.e(iIntValue, iIntValue2, iIntValue3, strGroup4);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final Object Q(u uVar, boolean z10, boolean z11, p241y9.c cVar) {
        if (!uVar.f2326h && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
        if (uVar.g() && !uVar.h() && uVar.f2327i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
        L2.c cVar2 = new L2.c(uVar, z11, z10, cVar, (p150o9.c) null);
        Thread.interrupted();
        return AbstractC0405x.C(i.f20380r, new B2.d(cVar2, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object R(u uVar, boolean z10, boolean z11, p241y9.c cVar, p150o9.c cVar2) {
        L2.d dVar;
        u uVar2;
        boolean z12;
        boolean z13;
        p241y9.c cVar3;
        if (cVar2 instanceof L2.d) {
            dVar = (L2.d) cVar2;
            int i10 = dVar.f5466w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f5466w = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new L2.d(cVar2);
            }
        } else {
            dVar = new L2.d(cVar2);
        }
        L2.d dVar2 = dVar;
        Object obj = dVar2.f5465v;
        int i11 = dVar2.f5466w;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(obj);
            if (uVar.g() && uVar.j() && uVar.h()) {
                b bVar = new b(z11, z10, uVar, null, cVar, 1);
                dVar2.f5466w = 1;
                Object objK = uVar.k(z10, bVar, dVar2);
                if (objK != aVar) {
                    return objK;
                }
            } else {
                dVar2.f5461r = uVar;
                dVar2.f5462s = cVar;
                dVar2.f5463t = z10;
                dVar2.f5464u = z11;
                dVar2.f5466w = 2;
                h hVarB = B(uVar, z11, dVar2);
                if (hVarB != aVar) {
                    uVar2 = uVar;
                    z12 = z10;
                    obj = hVarB;
                    z13 = z11;
                    cVar3 = cVar;
                }
            }
        }
        if (i11 == 1) {
            p110k9.a.e(obj);
            return obj;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
            return obj;
        }
        boolean z14 = dVar2.f5464u;
        boolean z15 = dVar2.f5463t;
        p241y9.c cVar4 = dVar2.f5462s;
        u uVar3 = dVar2.f5461r;
        p110k9.a.e(obj);
        z13 = z14;
        z12 = z15;
        cVar3 = cVar4;
        uVar2 = uVar3;
        L2.c cVar5 = new L2.c((p150o9.c) null, uVar2, z12, z13, cVar3);
        dVar2.f5461r = null;
        dVar2.f5462s = null;
        dVar2.f5466w = 3;
        Object objI = AbstractC0405x.I((h) obj, cVar5, dVar2);
        return objI == aVar ? aVar : objI;
    }

    public static final int S(File file) throws IOException {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            channel.close();
            return i10;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p181s2.o.e(channel, th);
                throw th2;
            }
        }
    }

    public static final void T(Object[] objArr, int i10, int i11) {
        j.e(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    public static int U(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d5 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d5 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d5);
    }

    public static int V(float f3) {
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f3);
    }

    public static long W(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d5);
    }

    public static final e Z(String str) {
        j.e(str, "name");
        return new e(str);
    }

    public static final f a(String str) {
        Set setSingleton = Collections.singleton(str);
        j.d(setSingleton, "singleton(...)");
        return new f(setSingleton);
    }

    public static final e a0(String str) {
        j.e(str, "name");
        return new e(str);
    }

    public static final void b(InterfaceC0444l interfaceC0444l, l0.e eVar, p074h0.d dVar, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(476043083);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0698o.g(interfaceC0444l) : c0698o.i(interfaceC0444l) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.i(dVar) ? 256 : 128;
        }
        boolean z10 = true;
        if (c0698o.K(i11 & 1, (i11 & 147) != 146)) {
            boolean z11 = (i11 & 112) == 32;
            if ((i11 & 14) != 4 && ((i11 & 8) == 0 || !c0698o.g(interfaceC0444l))) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object objH = c0698o.H();
            if (z12 || objH == C0690k.f10683a) {
                objH = new C0443k(eVar, interfaceC0444l);
                c0698o.e0(objH);
            }
            p104k1.i.a((C0443k) objH, null, new t(false, p104k1.u.f18954r, false), dVar, c0698o, ((i11 << 3) & 7168) | 384, 2);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new v0(interfaceC0444l, eVar, dVar, i10, 1);
        }
    }

    public static int b0(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:73:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:80:0x0185  */
    /* JADX WARN: Code duplicated, block: B:83:0x019c  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void c(int i10, int i11, C0037p c0037p, InterfaceC0064g interfaceC0064g, P p10, A a9, C0698o c0698o, l0.d dVar, r rVar, C1452f c1452f, p241y9.c cVar, boolean z10) {
        r rVar2;
        int i12;
        A a10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        C0037p c0037p2;
        InterfaceC0064g interfaceC0064g2;
        P p11;
        l0.d dVar2;
        C1452f c1452f2;
        boolean z12;
        r rVar3;
        A a11;
        C0699o0 c0699o0R;
        r rVar4;
        A a12;
        P p12;
        InterfaceC0064g interfaceC0064g3;
        l0.d dVar3;
        p063g1.c cVar2;
        boolean zD;
        Object objH;
        C1431u c1431u;
        boolean zG;
        Object objH2;
        C1453g c1453g;
        boolean zG2;
        Object c1452f3;
        C1452f c1452f4;
        l0.d dVar4;
        C1452f c1452f5;
        r rVar5;
        A a13;
        int i19;
        C0037p c0037p3;
        boolean z13;
        c0698o.V(53695811);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
            rVar2 = rVar;
        } else if ((i10 & 6) == 0) {
            rVar2 = rVar;
            i12 = i10 | (c0698o.g(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            a10 = a9;
            int i21 = c0698o.g(a10) ? 32 : 16;
            i13 = i12 | i21;
            i14 = i13 | 11648;
            i15 = i11 & 32;
            if (i15 != 0) {
                i14 = 208256 | i13;
            } else if ((i10 & 196608) == 0) {
                if (c0698o.g(dVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i14 |= i16;
            }
            int i22 = 46661632 | i14;
            if (c0698o.i(cVar)) {
                i17 = 536870912;
            } else {
                i17 = 268435456;
            }
            i18 = i22 | i17;
            if ((306783379 & i18) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0698o.K(i18 & 1, z11)) {
                c0698o.P();
                if ((i10 & 1) != 0 || c0698o.w()) {
                    if (i20 != 0) {
                        rVar4 = l0.o.f19333a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i11 & 2) != 0) {
                        a12 = D.a(c0698o);
                        i18 &= -113;
                    } else {
                        a12 = a10;
                    }
                    float f3 = 0;
                    p12 = new P(f3, f3, f3, f3);
                    interfaceC0064g3 = AbstractC0066i.f979c;
                    if (i15 != 0) {
                        dVar3 = l0.c.f19309D;
                    } else {
                        dVar3 = dVar;
                    }
                    float f7 = S.f23464a;
                    cVar2 = (p063g1.c) c0698o.k(AbstractC0359n0.f5118h);
                    zD = c0698o.d(cVar2.getDensity());
                    objH = c0698o.H();
                    Object obj = C0690k.f10683a;
                    if (zD || objH == obj) {
                        objH = new C1431u(new V(cVar2));
                        c0698o.e0(objH);
                    }
                    c1431u = (C1431u) objH;
                    zG = c0698o.g(c1431u);
                    objH2 = c0698o.H();
                    if (zG || objH2 == obj) {
                        objH2 = new C0037p(c1431u);
                        c0698o.e0(objH2);
                    }
                    C0037p c0037p4 = (C0037p) objH2;
                    C0709z c0709z = Y.f24465a;
                    c0698o.T(282942128);
                    c1453g = (C1453g) c0698o.k(Y.f24465a);
                    if (c1453g == null) {
                        c0698o.p(false);
                        c1452f4 = null;
                    } else {
                        zG2 = c0698o.g(c1453g);
                        Object objH3 = c0698o.H();
                        if (!zG2 || objH3 == obj) {
                            c1452f3 = new C1452f(c1453g.f24513a, c1453g.f24514b, c1453g.f24515c, c1453g.f24516d);
                            c0698o.e0(c1452f3);
                        } else {
                            c1452f3 = objH3;
                        }
                        c0698o.p(false);
                        c1452f4 = (C1452f) c1452f3;
                    }
                    dVar4 = dVar3;
                    c1452f5 = c1452f4;
                    rVar5 = rVar4;
                    a13 = a12;
                    i19 = i18 & (-238608385);
                    c0037p3 = c0037p4;
                    z13 = true;
                } else {
                    c0698o.N();
                    if ((i11 & 2) != 0) {
                        i18 &= -113;
                    }
                    i19 = i18 & (-238608385);
                    c0037p3 = c0037p;
                    p12 = p10;
                    dVar4 = dVar;
                    c1452f5 = c1452f;
                    z13 = z10;
                    rVar5 = rVar2;
                    a13 = a10;
                    interfaceC0064g3 = interfaceC0064g;
                }
                c0698o.q();
                n.a((i19 & 14) | 24576 | (i19 & 112) | 1576320 | ((i19 << 12) & 1879048192), (i19 >> 18) & 7168, c0037p3, interfaceC0064g3, p12, a13, c0698o, dVar4, rVar5, c1452f5, cVar, z13);
                c0037p2 = c0037p3;
                interfaceC0064g2 = interfaceC0064g3;
                c1452f2 = c1452f5;
                z12 = z13;
                p11 = p12;
                dVar2 = dVar4;
                rVar3 = rVar5;
                a11 = a13;
            } else {
                c0698o.N();
                c0037p2 = c0037p;
                interfaceC0064g2 = interfaceC0064g;
                p11 = p10;
                dVar2 = dVar;
                c1452f2 = c1452f;
                z12 = z10;
                rVar3 = rVar2;
                a11 = a10;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0152a(rVar3, a11, p11, interfaceC0064g2, dVar2, c0037p2, z12, c1452f2, cVar, i10, i11);
            }
        }
        a10 = a9;
        i13 = i12 | i21;
        i14 = i13 | 11648;
        i15 = i11 & 32;
        if (i15 != 0) {
            i14 = 208256 | i13;
        } else if ((i10 & 196608) == 0) {
            if (c0698o.g(dVar)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i14 |= i16;
        }
        int i23 = 46661632 | i14;
        if (c0698o.i(cVar)) {
            i17 = 536870912;
        } else {
            i17 = 268435456;
        }
        i18 = i23 | i17;
        if ((306783379 & i18) != 306783378) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0698o.K(i18 & 1, z11)) {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    rVar4 = l0.o.f19333a;
                } else {
                    rVar4 = rVar2;
                }
                if ((i11 & 2) != 0) {
                    a12 = D.a(c0698o);
                    i18 &= -113;
                } else {
                    a12 = a10;
                }
                float f10 = 0;
                p12 = new P(f10, f10, f10, f10);
                interfaceC0064g3 = AbstractC0066i.f979c;
                if (i15 != 0) {
                    dVar3 = l0.c.f19309D;
                } else {
                    dVar3 = dVar;
                }
                float f11 = S.f23464a;
                cVar2 = (p063g1.c) c0698o.k(AbstractC0359n0.f5118h);
                zD = c0698o.d(cVar2.getDensity());
                objH = c0698o.H();
                Object obj2 = C0690k.f10683a;
                if (zD) {
                    objH = new C1431u(new V(cVar2));
                    c0698o.e0(objH);
                } else {
                    objH = new C1431u(new V(cVar2));
                    c0698o.e0(objH);
                }
                c1431u = (C1431u) objH;
                zG = c0698o.g(c1431u);
                objH2 = c0698o.H();
                if (zG) {
                    objH2 = new C0037p(c1431u);
                    c0698o.e0(objH2);
                } else {
                    objH2 = new C0037p(c1431u);
                    c0698o.e0(objH2);
                }
                C0037p c0037p5 = (C0037p) objH2;
                C0709z c0709z2 = Y.f24465a;
                c0698o.T(282942128);
                c1453g = (C1453g) c0698o.k(Y.f24465a);
                if (c1453g == null) {
                    c0698o.p(false);
                    c1452f4 = null;
                } else {
                    zG2 = c0698o.g(c1453g);
                    Object objH4 = c0698o.H();
                    if (zG2) {
                        c1452f3 = new C1452f(c1453g.f24513a, c1453g.f24514b, c1453g.f24515c, c1453g.f24516d);
                        c0698o.e0(c1452f3);
                    } else {
                        c1452f3 = new C1452f(c1453g.f24513a, c1453g.f24514b, c1453g.f24515c, c1453g.f24516d);
                        c0698o.e0(c1452f3);
                    }
                    c0698o.p(false);
                    c1452f4 = (C1452f) c1452f3;
                }
                dVar4 = dVar3;
                c1452f5 = c1452f4;
                rVar5 = rVar4;
                a13 = a12;
                i19 = i18 & (-238608385);
                c0037p3 = c0037p5;
                z13 = true;
            } else {
                if (i20 != 0) {
                    rVar4 = l0.o.f19333a;
                } else {
                    rVar4 = rVar2;
                }
                if ((i11 & 2) != 0) {
                    a12 = D.a(c0698o);
                    i18 &= -113;
                } else {
                    a12 = a10;
                }
                float f12 = 0;
                p12 = new P(f12, f12, f12, f12);
                interfaceC0064g3 = AbstractC0066i.f979c;
                if (i15 != 0) {
                    dVar3 = l0.c.f19309D;
                } else {
                    dVar3 = dVar;
                }
                float f13 = S.f23464a;
                cVar2 = (p063g1.c) c0698o.k(AbstractC0359n0.f5118h);
                zD = c0698o.d(cVar2.getDensity());
                objH = c0698o.H();
                Object obj3 = C0690k.f10683a;
                if (zD) {
                    objH = new C1431u(new V(cVar2));
                    c0698o.e0(objH);
                } else {
                    objH = new C1431u(new V(cVar2));
                    c0698o.e0(objH);
                }
                c1431u = (C1431u) objH;
                zG = c0698o.g(c1431u);
                objH2 = c0698o.H();
                if (zG) {
                    objH2 = new C0037p(c1431u);
                    c0698o.e0(objH2);
                } else {
                    objH2 = new C0037p(c1431u);
                    c0698o.e0(objH2);
                }
                C0037p c0037p6 = (C0037p) objH2;
                C0709z c0709z3 = Y.f24465a;
                c0698o.T(282942128);
                c1453g = (C1453g) c0698o.k(Y.f24465a);
                if (c1453g == null) {
                    c0698o.p(false);
                    c1452f4 = null;
                } else {
                    zG2 = c0698o.g(c1453g);
                    Object objH5 = c0698o.H();
                    if (zG2) {
                        c1452f3 = new C1452f(c1453g.f24513a, c1453g.f24514b, c1453g.f24515c, c1453g.f24516d);
                        c0698o.e0(c1452f3);
                    } else {
                        c1452f3 = new C1452f(c1453g.f24513a, c1453g.f24514b, c1453g.f24515c, c1453g.f24516d);
                        c0698o.e0(c1452f3);
                    }
                    c0698o.p(false);
                    c1452f4 = (C1452f) c1452f3;
                }
                dVar4 = dVar3;
                c1452f5 = c1452f4;
                rVar5 = rVar4;
                a13 = a12;
                i19 = i18 & (-238608385);
                c0037p3 = c0037p6;
                z13 = true;
            }
            c0698o.q();
            n.a((i19 & 14) | 24576 | (i19 & 112) | 1576320 | ((i19 << 12) & 1879048192), (i19 >> 18) & 7168, c0037p3, interfaceC0064g3, p12, a13, c0698o, dVar4, rVar5, c1452f5, cVar, z13);
            c0037p2 = c0037p3;
            interfaceC0064g2 = interfaceC0064g3;
            c1452f2 = c1452f5;
            z12 = z13;
            p11 = p12;
            dVar2 = dVar4;
            rVar3 = rVar5;
            a11 = a13;
        } else {
            c0698o.N();
            c0037p2 = c0037p;
            interfaceC0064g2 = interfaceC0064g;
            p11 = p10;
            dVar2 = dVar;
            c1452f2 = c1452f;
            z12 = z10;
            rVar3 = rVar2;
            a11 = a10;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0152a(rVar3, a11, p11, interfaceC0064g2, dVar2, c0037p2, z12, c1452f2, cVar, i10, i11);
        }
    }

    public static final C0515g c0(SpannableStringBuilder spannableStringBuilder) {
        StringBuilder sb = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb.append(spannableStringBuilder.toString());
        Object[] spans = spannableStringBuilder.getSpans(0, sb.length(), ForegroundColorSpan.class);
        j.d(spans, "getSpans(...)");
        for (Object obj : spans) {
            ForegroundColorSpan foregroundColorSpan = (ForegroundColorSpan) obj;
            arrayList.add(new C0511c(new C(F.c(foregroundColorSpan.getForegroundColor()), 0L, (l) null, (Y0.j) null, (k) null, (Y0.e) null, (String) null, 0L, (p055f1.a) null, (q) null, (p012b1.c) null, 0L, (p055f1.l) null, (I) null, 65534), spannableStringBuilder.getSpanStart(foregroundColorSpan), spannableStringBuilder.getSpanEnd(foregroundColorSpan), ""));
        }
        String string = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((C0511c) arrayList.get(i10)).a(sb.length()));
        }
        return new C0515g(string, arrayList2);
    }

    public static final void d(InterfaceC0444l interfaceC0444l, boolean z10, p055f1.j jVar, boolean z11, long j, float f3, SuspendPointerInputElement suspendPointerInputElement, C0698o c0698o, int i10) {
        int i11;
        long j10;
        int i12;
        long j11;
        boolean z12;
        c0698o.V(-466280168);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0698o.g(interfaceC0444l) : c0698o.i(interfaceC0444l) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.h(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(jVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.h(z11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= 8192;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0698o.g(suspendPointerInputElement) ? 1048576 : 524288;
        }
        if (c0698o.K(i11 & 1, (533651 & i11) != 533650)) {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                i12 = i11 & (-57345);
                j11 = 9205357640488583168L;
            } else {
                c0698o.N();
                i12 = i11 & (-57345);
                j11 = j;
            }
            c0698o.q();
            p055f1.j jVar2 = p055f1.j.f15910s;
            p055f1.j jVar3 = p055f1.j.f15909r;
            if (z10) {
                float f7 = y.f6430a;
                z12 = (jVar == jVar3 && !z11) || (jVar == jVar2 && z11);
            } else {
                float f10 = y.f6430a;
                z12 = !((jVar == jVar3 && !z11) || (jVar == jVar2 && z11));
            }
            g gVar = z12 ? l0.a.f19301b : l0.a.f19300a;
            int i13 = i12 & 14;
            boolean zH = (i13 == 4 || ((i12 & 8) != 0 && c0698o.i(interfaceC0444l))) | ((i12 & 112) == 32) | c0698o.h(z12);
            Object objH = c0698o.H();
            if (zH || objH == C0690k.f10683a) {
                objH = new C0437e(interfaceC0444l, z10, z12);
                c0698o.e0(objH);
            }
            long j12 = j11;
            g gVar2 = gVar;
            j10 = j12;
            b(interfaceC0444l, gVar2, p074h0.j.d(1365123137, new C0435c((c1) c0698o.k(AbstractC0359n0.f5128s), j10, z12, m.a(suspendPointerInputElement, false, (p241y9.c) objH), interfaceC0444l), c0698o), c0698o, i13 | 384);
        } else {
            c0698o.N();
            j10 = j;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0436d(interfaceC0444l, z10, jVar, z11, j10, f3, suspendPointerInputElement, i10);
        }
    }

    public static final long d0(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final void e(r rVar, p241y9.a aVar, boolean z10, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(2111672474);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | (c0698o.i(aVar) ? 32 : 16) | (c0698o.h(z10) ? 256 : 128);
        if (c0698o.K(i12 & 1, (i12 & 147) != 146)) {
            AbstractC0060c.a(c0698o, l0.a.a(androidx.compose.foundation.layout.c.k(rVar, y.f6430a, y.f6431b), new C0440h(aVar, z10)));
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0438f(rVar, aVar, z10, i10, 0);
        }
    }

    public static final long e0(long j, long j10) {
        int iC;
        int iE = K.e(j);
        int iD = K.d(j);
        if ((K.e(j10) < K.d(j)) && (K.e(j) < K.d(j10))) {
            if ((K.e(j10) <= K.e(j)) && (K.d(j) <= K.d(j10))) {
                iE = K.e(j10);
                iD = iE;
            } else {
                if ((K.e(j) <= K.e(j10)) && (K.d(j10) <= K.d(j))) {
                    iC = K.c(j10);
                } else {
                    int iE2 = K.e(j10);
                    if (iE >= K.d(j10) || iE2 > iE) {
                        iD = K.e(j10);
                    } else {
                        iE = K.e(j10);
                        iC = K.c(j10);
                    }
                }
                iD -= iC;
            }
        } else if (iD > K.e(j10)) {
            iE -= K.c(j10);
            iC = K.c(j10);
            iD -= iC;
        }
        return va.g.e(iE, iD);
    }

    public static final String f(Object[] objArr, int i10, int i11, p120l9.f fVar) {
        StringBuilder sb = new StringBuilder((i11 * 3) + 2);
        sb.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == fVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        j.d(string, "toString(...)");
        return string;
    }

    public static final e g(String str) {
        j.e(str, "name");
        return new e(str);
    }

    public static float h(float f3, float f7, float f10) {
        if (f3 < f7) {
            return f7;
        }
        return f3 > f10 ? f10 : f3;
    }

    public static int i(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static final long j(int i10, C0698o c0698o) {
        Context context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
        Resources resourcesH0 = Y2.a.h0(c0698o);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = p244z1.j.f24770a;
        return F.c(resourcesH0.getColor(i10, theme));
    }

    public static final H2.j k(u uVar, String[] strArr, p241y9.c cVar) {
        C0162g c0162gD = uVar.d();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        j.e(strArr2, "tables");
        F2.K k7 = c0162gD.f2278b;
        k7.getClass();
        p129m9.g gVar = new p129m9.g();
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = k7.f2244c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            j.d(lowerCase, "toLowerCase(...)");
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                gVar.addAll(set);
            } else {
                gVar.add(str);
            }
        }
        String[] strArr3 = (String[]) u0.f(gVar).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr3[i10];
            LinkedHashMap linkedHashMap2 = k7.f2247f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            j.d(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i10] = num.intValue();
        }
        p110k9.j jVar = new p110k9.j(strArr3, iArr);
        String[] strArr4 = (String[]) jVar.f19077r;
        int[] iArr2 = (int[]) jVar.f19078s;
        j.e(strArr4, "resolvedTableNames");
        j.e(iArr2, "tableIds");
        return new H2.j(AbstractC0419l.g(new C4.e(new C0029l(k7, iArr2, strArr4, (p150o9.c) null, 1)), -1), uVar, cVar, 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final C1297f q(p152p0.c cVar, float f3) {
        int iCeil = ((int) Math.ceil(f3)) * 2;
        C1297f c1297fF = n.f2551a;
        C1294c c1294cA = n.f2552b;
        p196u0.b bVar = n.f2553c;
        if (c1297fF == null || c1294cA == null) {
            c1297fF = F.f(iCeil, iCeil, 1);
            n.f2551a = c1297fF;
            c1294cA = F.a(c1297fF);
            n.f2552b = c1294cA;
        } else {
            Bitmap bitmap = c1297fF.f21826a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                c1297fF = F.f(iCeil, iCeil, 1);
                n.f2551a = c1297fF;
                c1294cA = F.a(c1297fF);
                n.f2552b = c1294cA;
            }
        }
        C1297f c1297f = c1297fF;
        C1294c c1294c = c1294cA;
        if (bVar == null) {
            bVar = new p196u0.b();
            n.f2553c = bVar;
        }
        p196u0.b bVar2 = bVar;
        p196u0.a aVar = bVar2.f22794r;
        p063g1.m layoutDirection = cVar.f20809r.getLayoutDirection();
        Bitmap bitmap2 = c1297f.f21826a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        p063g1.c cVar2 = aVar.f22790a;
        p063g1.m mVar = aVar.f22791b;
        p180s0.o oVar = aVar.f22792c;
        long j = aVar.f22793d;
        aVar.f22790a = cVar;
        aVar.f22791b = layoutDirection;
        aVar.f22792c = c1294c;
        aVar.f22793d = jFloatToRawIntBits;
        c1294c.q();
        p123m2.c.k(bVar2, p180s0.q.f21839b, 0L, bVar2.f22795s.v(), 58);
        p123m2.c.k(bVar2, F.d(4278190080L), 0L, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 120);
        p123m2.c.e(bVar2, F.d(4278190080L), f3, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 0, 120);
        c1294c.n();
        aVar.f22790a = cVar2;
        aVar.f22791b = mVar;
        aVar.f22792c = oVar;
        aVar.f22793d = j;
        return c1297f;
    }

    public static final void r(Q2.a aVar) {
        j.e(aVar, "connection");
        p129m9.b bVar = new p129m9.b(10);
        Q2.c cVarA0 = aVar.a0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarA0.R()) {
            try {
                bVar.add(cVarA0.j(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p186s9.b.b(cVarA0, th);
                    throw th2;
                }
            }
        }
        p186s9.b.b(cVarA0, null);
        ListIterator listIterator = AbstractC0813f2.o(bVar).listIterator(0);
        while (true) {
            J0.r rVar = (J0.r) listIterator;
            if (!rVar.hasNext()) {
                return;
            }
            String str = (String) rVar.next();
            if (H9.v.R0(str, "room_fts_content_sync_", false)) {
                u0.o(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final float s(float f3) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f3)) & 8589934591L) / ((long) 3))) + 709952852);
        float f7 = fIntBitsToFloat - ((fIntBitsToFloat - (f3 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f7 - ((f7 - (f3 / (f7 * f7))) * 0.33333334f);
    }

    public static List t(Context context) {
        j.e(context, "context");
        List listS = p120l9.l.S(new ia.d[]{ia.d.f17714c, ia.d.f17715d});
        p072ga.g gVar = new p072ga.g();
        List listS2 = p120l9.l.S(new Integer[]{Integer.valueOf(context.getColor(com.ayah.R.color.green_bookmark)), Integer.valueOf(context.getColor(com.ayah.R.color.red_bookmark)), Integer.valueOf(context.getColor(com.ayah.R.color.blue_bookmark)), Integer.valueOf(context.getColor(com.ayah.R.color.orange_bookmark)), Integer.valueOf(context.getColor(com.ayah.R.color.purple_bookmark)), Integer.valueOf(context.getColor(com.ayah.R.color.yellow_bookmark))});
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j.e(timeUnit, "timeUnit");
        p083ha.b bVar = new p083ha.b();
        long jConvert = timeUnit.convert(100L, timeUnit);
        bVar.f16487a = jConvert;
        bVar.f16488b = (jConvert / ((long) 30)) / 1000.0f;
        p072ga.b bVar2 = new p072ga.b(45, 30.0f, 50.0f, listS, listS2, p120l9.l.S(new ia.c[]{ia.b.f17713b, ia.b.f17712a}), new p072ga.f(1.0d), gVar, bVar);
        p083ha.b bVar3 = new p083ha.b();
        long jConvert2 = timeUnit.convert(100L, timeUnit);
        bVar3.f16487a = jConvert2;
        long j = 10;
        bVar3.f16488b = (jConvert2 / j) / 1000.0f;
        p072ga.b bVarA = p072ga.b.a(bVar2, 10, 55.0f, 65.0f, null, bVar3, 8177);
        p083ha.b bVar4 = new p083ha.b();
        long jConvert3 = timeUnit.convert(100L, timeUnit);
        bVar4.f16487a = jConvert3;
        bVar4.f16488b = (jConvert3 / ((long) 40)) / 1000.0f;
        p072ga.b bVarA2 = p072ga.b.a(bVar2, 120, 50.0f, 60.0f, null, bVar4, 8177);
        p083ha.b bVar5 = new p083ha.b();
        long jConvert4 = timeUnit.convert(100L, timeUnit);
        bVar5.f16487a = jConvert4;
        bVar5.f16488b = (jConvert4 / j) / 1000.0f;
        return p120l9.l.S(new p072ga.b[]{bVar2, bVarA, bVarA2, p072ga.b.a(bVar2, 10, 65.0f, 80.0f, null, bVar5, 8177)});
    }

    public static final void v(U9.c cVar, X9.a aVar, String str) {
        j.e(cVar, "<this>");
        C0532j c0532jQ = aVar.q();
        cVar.getClass();
        c0532jQ.getClass();
        p251z9.y.d(1, null);
        M.f(str, null);
        throw null;
    }

    public static N.b w(N.b bVar, p063g1.m mVar, L l10, p063g1.c cVar, Y0.d dVar) {
        if (bVar != null && mVar == ((p063g1.m) bVar.f5891c) && B0.c.a0(l10, mVar).equals((L) bVar.f5892d) && cVar.getDensity() == ((p063g1.d) bVar.f5894f).f16247r && dVar == ((Y0.d) bVar.g)) {
            return bVar;
        }
        N.b bVar2 = N.b.f5888h;
        if (bVar2 != null && mVar == ((p063g1.m) bVar2.f5891c) && B0.c.a0(l10, mVar).equals((L) bVar2.f5892d) && cVar.getDensity() == ((p063g1.d) bVar2.f5894f).f16247r && dVar == ((Y0.d) bVar2.g)) {
            return bVar2;
        }
        N.b bVar3 = new N.b(mVar, B0.c.a0(l10, mVar), new p063g1.d(cVar.getDensity(), cVar.n()), dVar);
        N.b.f5888h = bVar3;
        return bVar3;
    }

    public static p x(String str) {
        j.e(str, "<this>");
        H9.k kVarB = p.f19193b.b(0, str);
        if (kVarB == null) {
            throw new IllegalArgumentException(p245z2.a.A('\"', "No subtype found for: \"", str));
        }
        if (kVarB.f3639d == null) {
            kVarB.f3639d = new H9.i(0, kVarB);
        }
        H9.i iVar = kVarB.f3639d;
        j.b(iVar);
        String str2 = (String) iVar.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        j.d(lowerCase, "toLowerCase(...)");
        if (kVarB.f3639d == null) {
            kVarB.f3639d = new H9.i(0, kVarB);
        }
        H9.i iVar2 = kVarB.f3639d;
        j.b(iVar2);
        String lowerCase2 = ((String) iVar2.get(2)).toLowerCase(locale);
        j.d(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        int i10 = kVarB.a().f1996s;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= str.length()) {
                return new p(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            H9.k kVarB2 = p.f19194c.b(i11, str);
            if (kVarB2 == null) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(i11);
                j.d(strSubstring, "substring(...)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(p245z2.a.F(sb, str, '\"').toString());
            }
            H9.j jVar = kVarB2.f3638c;
            H9.h hVarC = jVar.c(1);
            String str3 = hVarC != null ? hVarC.f3630a : null;
            if (str3 == null) {
                i10 = kVarB2.a().f1996s;
            } else {
                H9.h hVarC2 = jVar.c(2);
                String strSubstring2 = hVarC2 != null ? hVarC2.f3630a : null;
                if (strSubstring2 == null) {
                    H9.h hVarC3 = jVar.c(3);
                    j.b(hVarC3);
                    strSubstring2 = hVarC3.f3630a;
                } else if (H9.o.o1(strSubstring2, '\'') && strSubstring2.length() > 0 && n.u(strSubstring2.charAt(H9.o.Y0(strSubstring2)), '\'', false) && strSubstring2.length() > 2) {
                    strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                    j.d(strSubstring2, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(strSubstring2);
                i10 = kVarB2.a().f1996s;
            }
        }
    }

    public static final long y(long j) {
        return (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
    }

    public static final C1442f z() {
        C1442f c1442f = f652a;
        if (c1442f != null) {
            return c1442f;
        }
        C1441e c1441e = new C1441e("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = G.f24154a;
        p180s0.L l10 = new p180s0.L(p180s0.q.f21839b);
        C1256n c1256n = new C1256n(13);
        ArrayList arrayList = (ArrayList) c1256n.f20747s;
        c1256n.j(12.0f, 2.0f);
        c1256n.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        c1256n.m(4.48f, 10.0f, 10.0f, 10.0f);
        c1256n.m(10.0f, -4.48f, 10.0f, -10.0f);
        arrayList.add(new p224x0.p(17.52f, 2.0f, 12.0f, 2.0f));
        c1256n.a();
        c1256n.j(10.0f, 17.0f);
        c1256n.f(-5.0f, -5.0f);
        c1256n.f(1.41f, -1.41f);
        c1256n.e(10.0f, 14.17f);
        c1256n.f(7.59f, -7.59f);
        c1256n.e(19.0f, 8.0f);
        c1256n.f(-9.0f, 9.0f);
        c1256n.a();
        C1441e.a(c1441e, arrayList, l10);
        C1442f c1442fB = c1441e.b();
        f652a = c1442fB;
        return c1442fB;
    }

    public float H(View view) {
        if (f654c) {
            try {
                return W2.A.a(view);
            } catch (NoSuchMethodError unused) {
                f654c = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void N(Throwable th);

    public abstract void O(Aa.a aVar);

    public void X(View view, float f3) {
        if (f654c) {
            try {
                W2.A.b(view, f3);
                return;
            } catch (NoSuchMethodError unused) {
                f654c = false;
            }
        }
        view.setAlpha(f3);
    }

    public void Y(View view, int i10) {
        if (!f656e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f655d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f656e = true;
        }
        Field field = f655d;
        if (field != null) {
            try {
                f655d.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract Typeface l(Context context, p244z1.d dVar, Resources resources, int i10);

    public abstract Typeface m(Context context, F1.l[] lVarArr, int i10);

    public Typeface n(Context context, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface o(Context context, InputStream inputStream) {
        File fileC = n.C(context);
        if (fileC == null) {
            return null;
        }
        try {
            if (n.r(fileC, inputStream)) {
                return Typeface.createFromFile(fileC.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileC.delete();
        }
    }

    public Typeface p(Context context, Resources resources, int i10, String str, int i11) {
        File fileC = n.C(context);
        if (fileC == null) {
            return null;
        }
        try {
            if (n.q(fileC, resources, i10)) {
                return Typeface.createFromFile(fileC.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileC.delete();
        }
    }

    public F1.l u(F1.l[] lVarArr, int i10) {
        new R7.f(1);
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        F1.l lVar = null;
        int i12 = Integer.MAX_VALUE;
        for (F1.l lVar2 : lVarArr) {
            int iAbs = (Math.abs(lVar2.f2178c - i11) * 2) + (lVar2.f2179d == z10 ? 0 : 1);
            if (lVar == null || i12 > iAbs) {
                lVar = lVar2;
                i12 = iAbs;
            }
        }
        return lVar;
    }
}
