package M2;

import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.InterfaceC0769s;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.K;
import androidx.lifecycle.P;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p020c.C0782g;
import p056f2.AbstractComponentCallbacksC0947u;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0769s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f5673s;

    public /* synthetic */ b(int i10, Object obj) {
        this.f5672r = i10;
        this.f5673s = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0769s
    public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
        View view;
        int i10 = this.f5672r;
        Object obj = this.f5673s;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                if (enumC0766o != EnumC0766o.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0771u.h().f(this);
                Bundle bundleM = eVar.b().m("androidx.savedstate.Restarter");
                if (bundleM == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    String str = stringArrayList.get(i11);
                    i11++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        j.b(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                j.b(objNewInstance);
                                if (!(eVar instanceof V)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + eVar).toString());
                                }
                                U uG = ((V) eVar).g();
                                L5.c cVarB = eVar.b();
                                uG.getClass();
                                LinkedHashMap linkedHashMap = uG.f12646a;
                                for (String str3 : new HashSet(linkedHashMap.keySet())) {
                                    j.e(str3, "key");
                                    P p10 = (P) linkedHashMap.get(str3);
                                    if (p10 != null) {
                                        K.a(p10, cVarB, eVar.h());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    cVarB.M();
                                }
                            } catch (Exception e10) {
                                throw new RuntimeException(p123m2.c.s("Failed to instantiate ", str2), e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(p245z2.a.D("Class ", str2, " wasn't found"), e12);
                    }
                }
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i12 = ComponentActivity.f11367K;
                if (componentActivity.f11381v == null) {
                    C0782g c0782g = (C0782g) componentActivity.getLastNonConfigurationInstance();
                    if (c0782g != null) {
                        componentActivity.f11381v = c0782g.f13377a;
                    }
                    if (componentActivity.f11381v == null) {
                        componentActivity.f11381v = new U();
                    }
                }
                componentActivity.f12313r.f(this);
                return;
            case 2:
                if (enumC0766o == EnumC0766o.ON_DESTROY) {
                    p030c9.j jVar = (p030c9.j) obj;
                    jVar.f13593a = null;
                    jVar.f13594b = null;
                    return;
                }
                return;
            default:
                if (enumC0766o != EnumC0766o.ON_STOP || (view = ((AbstractComponentCallbacksC0947u) obj).f16145X) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
        }
    }
}
