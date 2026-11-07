package p056f2;

import A6.a;
import java.lang.reflect.InvocationTargetException;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O f15937b = new O(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f15938a;

    public D(K k7) {
        this.f15938a = k7;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        O o10 = f15937b;
        O o11 = (O) o10.get(classLoader);
        if (o11 == null) {
            o11 = new O(0);
            o10.put(classLoader, o11);
        }
        Class cls = (Class) o11.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        o11.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new a(p245z2.a.D("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new a(p245z2.a.D("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public final AbstractComponentCallbacksC0947u a(String str) {
        try {
            return (AbstractComponentCallbacksC0947u) c(this.f15938a.f15982w.f16173s.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new a(p245z2.a.D("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new a(p245z2.a.D("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new a(p245z2.a.D("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new a(p245z2.a.D("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }
}
