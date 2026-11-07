package J8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements I8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4391b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f4390a = i10;
        this.f4391b = obj;
    }

    @Override // I8.b
    public final Object get() {
        switch (this.f4390a) {
            case 0:
                return new K8.c((p050e8.f) this.f4391b);
            case 1:
                String str = (String) this.f4391b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new p100j8.k("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new p100j8.k(p245z2.a.D("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new p100j8.k(p245z2.a.D("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new p100j8.k(p123m2.c.s("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new p100j8.k(p123m2.c.s("Could not instantiate ", str), e13);
                }
            default:
                return (ComponentRegistrar) this.f4391b;
        }
    }
}
