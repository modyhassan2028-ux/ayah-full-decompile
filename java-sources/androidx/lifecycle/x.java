package androidx.lifecycle;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f12678a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f12679b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0770t interfaceC0770t) {
        try {
            p251z9.j.b(constructor.newInstance(interfaceC0770t));
            throw new ClassCastException();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x010f  */
    /* JADX WARN: Code duplicated, block: B:66:0x011f  */
    /* JADX WARN: Code duplicated, block: B:72:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0143  */
    /* JADX WARN: Code duplicated, block: B:86:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor declaredConstructor;
        boolean zBooleanValue;
        I1.V vH;
        Class cls2;
        boolean z10;
        HashMap map = f12678a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r10 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r10 != null ? r10.getName() : "";
                p251z9.j.b(name);
                if (name.length() != 0) {
                    p251z9.j.b(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    p251z9.j.d(canonicalName, "substring(...)");
                }
                p251z9.j.b(canonicalName);
                String strConcat = H9.v.P0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap map2 = f12679b;
            if (declaredConstructor != null) {
                map2.put(cls, AbstractC0813f2.K(declaredConstructor));
            } else {
                C0755d c0755d = C0755d.f12651c;
                HashMap map3 = c0755d.f12653b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((A) declaredMethods[i11].getAnnotation(A.class)) != null) {
                                c0755d.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i11++;
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0770t.class.isAssignableFrom(superclass)) {
                        p251z9.j.b(superclass);
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            p251z9.j.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            vH = p251z9.j.h(cls.getInterfaces());
                            while (vH.hasNext()) {
                                cls2 = (Class) vH.next();
                                if (cls2 == null && InterfaceC0770t.class.isAssignableFrom(cls2)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    p251z9.j.b(cls2);
                                    if (b(cls2) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        p251z9.j.b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        vH = p251z9.j.h(cls.getInterfaces());
                        while (vH.hasNext()) {
                            cls2 = (Class) vH.next();
                            if (cls2 == null) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                p251z9.j.b(cls2);
                                if (b(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(cls2);
                                    p251z9.j.b(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i10 = 2;
        }
        map.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
