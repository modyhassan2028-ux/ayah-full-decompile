package androidx.lifecycle;

import U6.C0532j;
import android.os.Bundle;
import android.view.View;
import com.ayah.R;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R7.f f12625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0532j f12626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H8.e f12627c = new H8.e(19);

    static {
        int i10 = 18;
        f12625a = new R7.f(i10);
        f12626b = new C0532j(i10);
    }

    public static final void a(P p10, L5.c cVar, w wVar) {
        AutoCloseable autoCloseable;
        p251z9.j.e(cVar, "registry");
        p251z9.j.e(wVar, "lifecycle");
        p123m2.d dVar = p10.f12640a;
        if (dVar != null) {
            synchronized (dVar.f19523a) {
                autoCloseable = (AutoCloseable) dVar.f19524b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        I i10 = (I) autoCloseable;
        if (i10 == null || i10.f12622t) {
            return;
        }
        i10.E(cVar, wVar);
        EnumC0767p enumC0767p = wVar.f12672c;
        if (enumC0767p == EnumC0767p.f12662s || enumC0767p.compareTo(EnumC0767p.f12664u) >= 0) {
            cVar.M();
        } else {
            wVar.a(new C0759h(cVar, wVar));
        }
    }

    public static final H b(p105k2.c cVar) {
        H h7;
        p251z9.j.e(cVar, "<this>");
        M2.e eVar = (M2.e) cVar.a(f12625a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        V v10 = (V) cVar.a(f12626b);
        if (v10 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) cVar.a(f12627c);
        String str = (String) cVar.a(T.f12644b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        M2.d dVarD = eVar.b().D();
        Bundle bundle2 = null;
        L l10 = dVarD instanceof L ? (L) dVarD : null;
        if (l10 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = f(v10).f12632b;
        H h10 = (H) linkedHashMap.get(str);
        if (h10 != null) {
            return h10;
        }
        l10.b();
        Bundle bundle3 = l10.f12630c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                l10.f12630c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            h7 = new H();
        } else {
            ClassLoader classLoader = H.class.getClassLoader();
            p251z9.j.b(classLoader);
            bundle.setClassLoader(classLoader);
            p129m9.e eVar2 = new p129m9.e(bundle.size());
            for (String str2 : bundle.keySet()) {
                p251z9.j.b(str2);
                eVar2.put(str2, bundle.get(str2));
            }
            h7 = new H(eVar2.b());
        }
        linkedHashMap.put(str, h7);
        return h7;
    }

    public static final void c(M2.e eVar) {
        EnumC0767p enumC0767p = eVar.h().f12672c;
        if (enumC0767p != EnumC0767p.f12662s && enumC0767p != EnumC0767p.f12663t) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eVar.b().D() == null) {
            L l10 = new L(eVar.b(), (V) eVar);
            eVar.b().L("androidx.lifecycle.internal.SavedStateHandlesProvider", l10);
            eVar.h().a(new C0756e(1, l10));
        }
    }

    public static final InterfaceC0771u d(View view) {
        p251z9.j.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC0771u interfaceC0771u = tag instanceof InterfaceC0771u ? (InterfaceC0771u) tag : null;
            if (interfaceC0771u != null) {
                return interfaceC0771u;
            }
            Object objM = B0.c.M(view);
            view = objM instanceof View ? (View) objM : null;
        }
        return null;
    }

    public static final V e(View view) {
        p251z9.j.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            V v10 = tag instanceof V ? (V) tag : null;
            if (v10 != null) {
                return v10;
            }
            Object objM = B0.c.M(view);
            view = objM instanceof View ? (View) objM : null;
        }
        return null;
    }

    public static final M f(V v10) {
        T tE = C0532j.e(v10, new J(0), 4);
        return (M) ((Aa.a) tE.f12645a).x("androidx.lifecycle.internal.SavedStateHandlesVM", p251z9.w.a(M.class));
    }

    public static final void g(View view, InterfaceC0771u interfaceC0771u) {
        p251z9.j.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0771u);
    }

    public static final void h(View view, V v10) {
        p251z9.j.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, v10);
    }
}
