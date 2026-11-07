package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class N implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f12633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f12634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f12635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f12636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L5.c f12637e;

    public N() {
        this.f12634b = new Q(null);
    }

    @Override // androidx.lifecycle.S
    public final P a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.S
    public final P b(Class cls, p105k2.d dVar) {
        LinkedHashMap linkedHashMap = dVar.f18958a;
        String str = (String) linkedHashMap.get(T.f12644b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(K.f12625a) == null || linkedHashMap.get(K.f12626b) == null) {
            if (this.f12636d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(Q.f12642e);
        boolean zIsAssignableFrom = AbstractC0752a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? O.a(cls, O.f12639b) : O.a(cls, O.f12638a);
        if (constructorA == null) {
            return this.f12634b.b(cls, dVar);
        }
        return (!zIsAssignableFrom || application == null) ? O.b(cls, constructorA, K.b(dVar)) : O.b(cls, constructorA, application, K.b(dVar));
    }

    @Override // androidx.lifecycle.S
    public final P c(p251z9.e eVar, p105k2.d dVar) {
        return b(p171r0.a.d(eVar), dVar);
    }

    public final P d(Class cls, String str) {
        H h7;
        AutoCloseable autoCloseable;
        Application application;
        w wVar = this.f12636d;
        if (wVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0752a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.f12633a == null) ? O.a(cls, O.f12639b) : O.a(cls, O.f12638a);
        if (constructorA == null) {
            if (this.f12633a != null) {
                return this.f12634b.a(cls);
            }
            if (J.f12623b == null) {
                J.f12623b = new J(1);
            }
            p251z9.j.b(J.f12623b);
            return p000a.a.y(cls);
        }
        L5.c cVar = this.f12637e;
        p251z9.j.b(cVar);
        Bundle bundle = this.f12635c;
        Bundle bundleM = cVar.m(str);
        if (bundleM != null) {
            bundle = bundleM;
        }
        if (bundle == null) {
            h7 = new H();
        } else {
            ClassLoader classLoader = H.class.getClassLoader();
            p251z9.j.b(classLoader);
            bundle.setClassLoader(classLoader);
            p129m9.e eVar = new p129m9.e(bundle.size());
            for (String str2 : bundle.keySet()) {
                p251z9.j.b(str2);
                eVar.put(str2, bundle.get(str2));
            }
            h7 = new H(eVar.b());
        }
        I i10 = new I(str, h7);
        i10.E(cVar, wVar);
        EnumC0767p enumC0767p = wVar.f12672c;
        if (enumC0767p == EnumC0767p.f12662s || enumC0767p.compareTo(EnumC0767p.f12664u) >= 0) {
            cVar.M();
        } else {
            wVar.a(new C0759h(cVar, wVar));
        }
        P pB = (!zIsAssignableFrom || (application = this.f12633a) == null) ? O.b(cls, constructorA, h7) : O.b(cls, constructorA, application, h7);
        pB.getClass();
        p123m2.d dVar = pB.f12640a;
        if (dVar == null) {
            return pB;
        }
        if (dVar.f19526d) {
            p123m2.d.a(i10);
            return pB;
        }
        synchronized (dVar.f19523a) {
            autoCloseable = (AutoCloseable) dVar.f19524b.put("androidx.lifecycle.savedstate.vm.tag", i10);
        }
        p123m2.d.a(autoCloseable);
        return pB;
    }

    public N(Application application, M2.e eVar, Bundle bundle) {
        Q q10;
        this.f12637e = eVar.b();
        this.f12636d = eVar.h();
        this.f12635c = bundle;
        this.f12633a = application;
        if (application != null) {
            if (Q.f12641d == null) {
                Q.f12641d = new Q(application);
            }
            q10 = Q.f12641d;
            p251z9.j.b(q10);
        } else {
            q10 = new Q(null);
        }
        this.f12634b = q10;
    }
}
