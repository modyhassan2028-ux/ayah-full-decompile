package H3;

import A.k1;
import H9.o;
import K9.AbstractC0405x;
import K9.H;
import T1.InterfaceC0488e;
import android.content.SharedPreferences;
import com.squareup.moshi.JsonAdapter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0488e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonAdapter f3340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X1.e f3341c = F3.a.f2344a;

    public a(SharedPreferences sharedPreferences, JsonAdapter jsonAdapter) {
        this.f3339a = sharedPreferences;
        this.f3340b = jsonAdapter;
    }

    @Override // T1.InterfaceC0488e
    public final void a() {
        this.f3339a.edit().remove("PREF_BOOKMARK_ID").apply();
    }

    @Override // T1.InterfaceC0488e
    public final Object b(Object obj, k1 k1Var) {
        R9.e eVar = H.f5322a;
        return AbstractC0405x.I(R9.d.f7436t, new B2.d(this, (X1.b) obj, null, 2), k1Var);
    }

    @Override // T1.InterfaceC0488e
    public final Object c(Object obj, p150o9.c cVar) {
        X1.b bVar = (X1.b) obj;
        Map mapA = bVar.a();
        X1.e eVar = this.f3341c;
        boolean z10 = true;
        if (mapA.containsKey(eVar)) {
            Object obj2 = bVar.a().get(eVar);
            Set set = obj2 instanceof Set ? (Set) obj2 : null;
            if (set != null) {
                Set set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        if (!o.V0(String.valueOf(it.next()), "timestamp")) {
                        }
                    }
                    z10 = false;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
