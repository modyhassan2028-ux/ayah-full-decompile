package p186s9;

import java.lang.reflect.Method;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f22492a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        j.b(methods);
        int length = methods.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methods[i10];
            if (j.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                j.d(parameterTypes, "getParameterTypes(...)");
                if (j.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i10++;
        }
        f22492a = method;
        int length2 = methods.length;
        for (int i11 = 0; i11 < length2 && !j.a(methods[i11].getName(), "getSuppressed"); i11++) {
        }
    }
}
