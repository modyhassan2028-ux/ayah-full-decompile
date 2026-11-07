package p251z9;

import F9.c;
import H9.o;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p074h0.b;
import p110k9.j;
import p120l9.l;
import p120l9.n;
import p120l9.w;
import p241y9.a;
import p241y9.d;
import p241y9.f;
import p241y9.g;
import p241y9.h;
import p241y9.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f24875b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f24876a;

    static {
        int i10 = 0;
        List listS = l.S(new Class[]{a.class, p241y9.c.class, p241y9.e.class, f.class, g.class, h.class, i.class, b.class, b.class, b.class, b.class, b.class, p241y9.b.class, b.class, b.class, b.class, b.class, b.class, b.class, b.class, b.class, b.class, d.class});
        ArrayList arrayList = new ArrayList(n.a0(listS, 10));
        for (Object obj : listS) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC0813f2.T();
                throw null;
            }
            arrayList.add(new j((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f24875b = w.j0(arrayList);
    }

    public e(Class cls) {
        j.e(cls, "jClass");
        this.f24876a = cls;
    }

    @Override // p251z9.d
    public final Class a() {
        return this.f24876a;
    }

    public final String b() {
        String strC;
        Class cls = this.f24876a;
        j.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strC2 = y.c(cls.getName());
            return strC2 == null ? cls.getCanonicalName() : strC2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strC = y.c(componentType.getName())) != null) {
            strConcat = strC.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strE;
        Class cls = this.f24876a;
        j.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strE2 = y.e(cls.getName());
                return strE2 == null ? cls.getSimpleName() : strE2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strE = y.e(componentType.getName())) != null) {
                strConcat = strE.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return o.q1(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return o.p1('$', simpleName, simpleName);
        }
        return o.q1(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean d(Object obj) {
        Class clsE = this.f24876a;
        j.e(clsE, "jClass");
        Map map = f24875b;
        j.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsE);
        if (num != null) {
            return y.d(num.intValue(), obj);
        }
        if (clsE.isPrimitive()) {
            clsE = p171r0.a.e(w.a(clsE));
        }
        return clsE.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && p171r0.a.e(this).equals(p171r0.a.e((c) obj));
    }

    public final int hashCode() {
        return p171r0.a.e(this).hashCode();
    }

    public final String toString() {
        return this.f24876a + " (Kotlin reflection is not available)";
    }
}
