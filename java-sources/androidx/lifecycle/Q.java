package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Q f12641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final R7.f f12642e = new R7.f(19);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Application f12643c;

    public Q(Application application) {
        super(1);
        this.f12643c = application;
    }

    @Override // androidx.lifecycle.J, androidx.lifecycle.S
    public final P a(Class cls) {
        Application application = this.f12643c;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.J, androidx.lifecycle.S
    public final P b(Class cls, p105k2.d dVar) {
        if (this.f12643c != null) {
            return a(cls);
        }
        Application application = (Application) dVar.f18958a.get(f12642e);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC0752a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return p000a.a.y(cls);
    }

    public final P d(Class cls, Application application) {
        if (!AbstractC0752a.class.isAssignableFrom(cls)) {
            return p000a.a.y(cls);
        }
        try {
            P p10 = (P) cls.getConstructor(Application.class).newInstance(application);
            p251z9.j.b(p10);
            return p10;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Cannot create an instance of " + cls, e13);
        }
    }
}
