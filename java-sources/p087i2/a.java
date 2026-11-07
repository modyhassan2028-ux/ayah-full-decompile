package p087i2;

import Ba.b;
import Z.AbstractC0693l0;
import Z.M0;
import androidx.lifecycle.InterfaceC0771u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import p110k9.c;
import p110k9.l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0693l0 f16736a;

    static {
        Object objB;
        try {
            ClassLoader classLoader = InterfaceC0771u.class.getClassLoader();
            j.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof AbstractC0693l0) {
                        objB = (AbstractC0693l0) objInvoke;
                        break;
                    }
                } else if (!(annotations[i10] instanceof c)) {
                    i10++;
                }
                objB = null;
                break;
            }
        } catch (Throwable th) {
            objB = p110k9.a.b(th);
        }
        AbstractC0693l0 m10 = (AbstractC0693l0) (objB instanceof l ? null : objB);
        if (m10 == null) {
            m10 = new M0(new b(14));
        }
        f16736a = m10;
    }
}
