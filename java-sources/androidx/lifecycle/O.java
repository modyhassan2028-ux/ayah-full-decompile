package androidx.lifecycle;

import android.app.Application;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f12638a = AbstractC0813f2.L(Application.class, H.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f12639b = AbstractC0813f2.K(H.class);

    public static final Constructor a(Class cls, List list) {
        p251z9.j.e(list, "signature");
        I1.V vH = p251z9.j.h(cls.getConstructors());
        while (vH.hasNext()) {
            Constructor constructor = (Constructor) vH.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            p251z9.j.d(parameterTypes, "getParameterTypes(...)");
            List listO0 = p120l9.l.o0(parameterTypes);
            if (list.equals(listO0)) {
                return constructor;
            }
            if (list.size() == listO0.size() && listO0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final P b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (P) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
