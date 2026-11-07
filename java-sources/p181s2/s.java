package p181s2;

import D.AbstractC0071n;
import H0.I;
import J0.C0285h;
import J0.C0287j;
import J0.InterfaceC0288k;
import Z.C0672b;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ListIterator;
import l0.a;
import l0.r;
import p056f2.AbstractC0939l;
import p074h0.d;
import p120l9.m;
import p173r2.C1287g;
import p173r2.H;
import p173r2.i;
import p173r2.y;
import p214w.C1390c;
import p214w.v;
import p214w.w;
import p216w1.q;
import p216w1.u;
import p223x.q0;
import p223x.t0;
import p223x.u0;
import p241y9.c;
import p241y9.e;
import p244z1.b;
import p244z1.g;
import p244z1.h;
import p251z9.j;
import u.E;
import u.M;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final void a(Object obj, r rVar, u0 u0Var, String str, d dVar, C0698o c0698o, int i10) {
        u0 u0Var2;
        C0698o c0698o2;
        r rVar2;
        d dVar2;
        String str2;
        c0698o.V(-310686752);
        int i11 = (c0698o.g(obj) ? 4 : 2) | i10 | (c0698o.g(rVar) ? 32 : 16) | 3072;
        if (c0698o.K(i11 & 1, (i11 & 9363) != 9362)) {
            u0Var2 = u0Var;
            c0698o2 = c0698o;
            b(t0.e(obj, "Crossfade", c0698o, (i11 & 14) | 48), rVar, u0Var2, null, dVar, c0698o2, i11 & 58352);
            rVar2 = rVar;
            dVar2 = dVar;
            str2 = "Crossfade";
        } else {
            u0Var2 = u0Var;
            c0698o2 = c0698o;
            rVar2 = rVar;
            dVar2 = dVar;
            c0698o2.N();
            str2 = str;
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new v(obj, rVar2, u0Var2, str2, dVar2, i10);
        }
    }

    public static final void b(q0 q0Var, r rVar, u0 u0Var, c cVar, d dVar, C0698o c0698o, int i10) {
        c cVar2;
        Object obj;
        AbstractC0939l abstractC0939l = q0Var.f24065a;
        c0698o.V(679005231);
        int i11 = (i10 & 6) == 0 ? (c0698o.g(q0Var) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.i(u0Var) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i12 |= c0698o.i(dVar) ? 16384 : 8192;
        }
        int i13 = 0;
        if (c0698o.K(i12 & 1, (i12 & 9363) != 9362)) {
            C1390c c1390c = C1390c.f23482x;
            Object objH = c0698o.H();
            Object obj2 = C0690k.f10683a;
            if (objH == obj2) {
                obj = objH;
                p093j0.r rVar2 = new p093j0.r();
                rVar2.add(abstractC0939l.i());
                c0698o.e0(rVar2);
                obj = rVar2;
            }
            obj = objH;
            p093j0.r rVar3 = (p093j0.r) obj;
            Object objH2 = c0698o.H();
            if (objH2 == obj2) {
                long[] jArr = M.f22699a;
                objH2 = new E();
                c0698o.e0(objH2);
            }
            E e10 = (E) objH2;
            C0681f0 c0681f0 = q0Var.f24068d;
            if (j.a(abstractC0939l.i(), c0681f0.getValue())) {
                c0698o.T(860925177);
                if (rVar3.size() == 1 && j.a(rVar3.get(0), c0681f0.getValue())) {
                    c0698o.T(861249809);
                    c0698o.p(false);
                } else {
                    c0698o.T(861059531);
                    boolean z10 = (i12 & 14) == 4;
                    Object objH3 = c0698o.H();
                    if (z10 || objH3 == obj2) {
                        objH3 = new w(q0Var, i13);
                        c0698o.e0(objH3);
                    }
                    m.s0(rVar3, (c) objH3);
                    e10.a();
                    c0698o.p(false);
                }
                c0698o.p(false);
            } else {
                c0698o.T(861255761);
                c0698o.p(false);
            }
            if (e10.b(c0681f0.getValue())) {
                c0698o.T(862059281);
                c0698o.p(false);
            } else {
                c0698o.T(861316428);
                ListIterator listIterator = rVar3.listIterator();
                int i14 = 0;
                while (true) {
                    J0.r rVar4 = (J0.r) listIterator;
                    if (!rVar4.hasNext()) {
                        i14 = -1;
                        break;
                    } else if (j.a(rVar4.next(), c0681f0.getValue())) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 == -1) {
                    rVar3.add(c0681f0.getValue());
                } else {
                    rVar3.set(i14, c0681f0.getValue());
                }
                e10.a();
                int size = rVar3.size();
                for (int i15 = 0; i15 < size; i15++) {
                    Object obj3 = rVar3.get(i15);
                    e10.l(obj3, p074h0.j.d(-1426421288, new G.E(q0Var, u0Var, obj3, dVar), c0698o));
                }
                c0698o.p(false);
            }
            I iD = AbstractC0071n.d(l0.c.f19313r, false);
            int i16 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = a.c(c0698o, rVar);
            InterfaceC0288k.f4142a.getClass();
            p241y9.a aVar = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(aVar);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i16))) {
                p123m2.c.y(i16, c0698o, i16, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            c0698o.T(-187474512);
            int size2 = rVar3.size();
            for (int i17 = 0; i17 < size2; i17++) {
                Object obj4 = rVar3.get(i17);
                c0698o.R(-1081865889, obj4);
                e eVar = (e) e10.g(obj4);
                if (eVar == null) {
                    c0698o.T(821932266);
                } else {
                    c0698o.T(-1081864713);
                    eVar.invoke(c0698o, 0);
                }
                c0698o.p(false);
                c0698o.p(false);
            }
            c0698o.p(false);
            c0698o.p(true);
            cVar2 = c1390c;
        } else {
            c0698o.N();
            cVar2 = cVar;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p074h0.c(q0Var, rVar, u0Var, cVar2, dVar, i10, 2);
        }
    }

    public static int c(Context context, String str) {
        boolean zA;
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        u uVar = new u(context);
        if (i10 >= 24) {
            zA = q.a(uVar.f23622a);
        } else {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i11 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                num.getClass();
                zA = ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i11), packageName)).intValue() == 0;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
        }
        return zA ? 0 : -1;
    }

    public static void d(y yVar, String str, List list, d dVar, int i10) {
        if ((i10 & 2) != 0) {
            list = p120l9.r.f19440r;
        }
        H h7 = yVar.f21503f;
        h7.getClass();
        j jVar = new j((i) h7.b(i.d(i.class)), str, dVar);
        for (C1287g c1287g : list) {
            c1287g.getClass();
            jVar.f21498c.put("type", c1287g.f21438a);
        }
        yVar.f21504h.add(jVar.a());
    }

    public static ColorStateList e(Context context, int i10) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        g gVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        h hVar = new h(resources, theme);
        synchronized (p244z1.j.f24772c) {
            try {
                SparseArray sparseArray = (SparseArray) p244z1.j.f24771b.get(hVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (gVar = (g) sparseArray.get(i10)) == null) {
                    colorStateList = null;
                } else {
                    if (gVar.f24766b.equals(resources.getConfiguration())) {
                        if (theme != null || gVar.f24767c != 0) {
                            if (theme == null || gVar.f24767c != theme.hashCode()) {
                            }
                        }
                        colorStateList = gVar.f24765a;
                    }
                    sparseArray.remove(i10);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = p244z1.j.f24770a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            try {
                colorStateListA = b.a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i10, theme);
        }
        p244z1.j.a(hVar, i10, colorStateListA, theme);
        return colorStateListA;
    }

    public static final Object f(X1.b bVar, X1.e eVar, Serializable serializable) {
        j.e(bVar, "<this>");
        j.e(eVar, "key");
        Object objC = bVar.c(eVar);
        return objC == null ? serializable : objC;
    }
}
