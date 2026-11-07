package p173r2;

import B3.f;
import L5.c;
import M2.e;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.InterfaceC0762k;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.K;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import p013b2.n;
import p110k9.a;
import p197u2.d;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC0771u, V, InterfaceC0762k, e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f21441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public v f21442s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Bundle f21443t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EnumC0767p f21444u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o f21445v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f21446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Bundle f21447x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f21448y = new d(this);

    public j(n nVar, v vVar, Bundle bundle, EnumC0767p enumC0767p, o oVar, String str, Bundle bundle2) {
        this.f21441r = nVar;
        this.f21442s = vVar;
        this.f21443t = bundle;
        this.f21444u = enumC0767p;
        this.f21445v = oVar;
        this.f21446w = str;
        this.f21447x = bundle2;
        a.d(new f(19, this));
    }

    @Override // M2.e
    public final c b() {
        return (c) this.f21448y.f22832h.f5533t;
    }

    public final void c(EnumC0767p enumC0767p) {
        d dVar = this.f21448y;
        dVar.getClass();
        dVar.f22834k = enumC0767p;
        dVar.b();
    }

    @Override // androidx.lifecycle.InterfaceC0762k
    public final S e() {
        return this.f21448y.f22835l;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof j)) {
            j jVar = (j) obj;
            Bundle bundle = jVar.f21443t;
            if (p251z9.j.a(this.f21446w, jVar.f21446w) && p251z9.j.a(this.f21442s, jVar.f21442s) && p251z9.j.a(this.f21448y.j, jVar.f21448y.j) && p251z9.j.a(b(), jVar.b())) {
                Bundle bundle2 = this.f21443t;
                if (p251z9.j.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!p251z9.j.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    @Override // androidx.lifecycle.InterfaceC0762k
    public final p105k2.d f() {
        Application application;
        d dVar = this.f21448y;
        dVar.getClass();
        p105k2.d dVar2 = new p105k2.d(0);
        j jVar = dVar.f22826a;
        LinkedHashMap linkedHashMap = dVar2.f18958a;
        linkedHashMap.put(K.f12625a, jVar);
        linkedHashMap.put(K.f12626b, jVar);
        Bundle bundleA = dVar.a();
        if (bundleA != null) {
            linkedHashMap.put(K.f12627c, bundleA);
        }
        n nVar = this.f21441r;
        if (nVar == null) {
            application = null;
        } else {
            Context context = nVar.f13172a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(Q.f12642e, application2);
        }
        return dVar2;
    }

    @Override // androidx.lifecycle.V
    public final U g() {
        d dVar = this.f21448y;
        if (!dVar.f22833i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (dVar.j.f12672c == EnumC0767p.f12661r) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        o oVar = dVar.f22830e;
        if (oVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = dVar.f22831f;
        p251z9.j.e(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = oVar.f21462b;
        U u8 = (U) linkedHashMap.get(str);
        if (u8 != null) {
            return u8;
        }
        U u10 = new U();
        linkedHashMap.put(str, u10);
        return u10;
    }

    @Override // androidx.lifecycle.InterfaceC0771u
    public final w h() {
        return this.f21448y.j;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f21442s.hashCode() + (this.f21446w.hashCode() * 31);
        Bundle bundle = this.f21443t;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return b().hashCode() + ((this.f21448y.j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.f21448y.toString();
    }
}
