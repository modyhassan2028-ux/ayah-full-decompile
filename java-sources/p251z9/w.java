package p251z9;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f24887a;

    static {
        x xVar = null;
        try {
            xVar = (x) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (xVar == null) {
            xVar = new x();
        }
        f24887a = xVar;
    }

    public static e a(Class cls) {
        f24887a.getClass();
        return new e(cls);
    }

    public static A b(Class cls) {
        e eVarA = a(cls);
        List list = Collections.EMPTY_LIST;
        f24887a.getClass();
        return new A(eVarA, list);
    }
}
