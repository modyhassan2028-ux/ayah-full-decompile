package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0755d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0755d f12651c = new C0755d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12652a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f12653b = new HashMap();

    public static void b(HashMap map, C0754c c0754c, EnumC0766o enumC0766o, Class cls) {
        EnumC0766o enumC0766o2 = (EnumC0766o) map.get(c0754c);
        if (enumC0766o2 == null || enumC0766o == enumC0766o2) {
            if (enumC0766o2 == null) {
                map.put(c0754c, enumC0766o);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0754c.f12650b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0766o2 + ", new value " + enumC0766o);
    }

    public final C0753b a(Class cls, Method[] methodArr) {
        int i10;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f12652a;
        if (superclass != null) {
            C0753b c0753bA = (C0753b) map2.get(superclass);
            if (c0753bA == null) {
                c0753bA = a(superclass, null);
            }
            map.putAll(c0753bA.f12648b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0753b c0753bA2 = (C0753b) map2.get(cls2);
            if (c0753bA2 == null) {
                c0753bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0753bA2.f12648b.entrySet()) {
                b(map, (C0754c) entry.getKey(), (EnumC0766o) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            A a9 = (A) method.getAnnotation(A.class);
            if (a9 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC0771u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                EnumC0766o enumC0766oValue = a9.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0766o.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0766oValue != EnumC0766o.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0754c(i10, method), enumC0766oValue, cls);
                z10 = true;
            }
        }
        C0753b c0753b = new C0753b(map);
        map2.put(cls, c0753b);
        this.f12653b.put(cls, Boolean.valueOf(z10));
        return c0753b;
    }
}
