package i7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: i7.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0994k0 extends E2.N0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1003n0 f17439h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0994k0(C1003n0 c1003n0) {
        super(20);
        this.f17439h = c1003n0;
    }

    @Override // E2.N0
    public final Object c(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        U6.y.c(str);
        C1003n0 c1003n0 = this.f17439h;
        c1003n0.p();
        U6.y.c(str);
        C0999m c0999m = c1003n0.f17001s.f17106t;
        Q1.U(c0999m);
        p074h0.i iVarU0 = c0999m.u0(str);
        if (iVarU0 == null) {
            return null;
        }
        X x9 = ((C1023u0) c1003n0.f16104r).f17584w;
        C1023u0.m(x9);
        x9.f17178E.b(str, "Populate EES config from database on cache miss. appId");
        c1003n0.w(str, c1003n0.x(str, (byte[]) iVarU0.f16422s));
        C0994k0 c0994k0 = c1003n0.f17473A;
        synchronized (((B) c0994k0.g)) {
            Set setEntrySet = ((LinkedHashMap) ((p151p.V) c0994k0.f1594f).f20603r).entrySet();
            p251z9.j.d(setEntrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = ((LinkedHashMap) ((p151p.V) c0994k0.f1594f).f20603r).entrySet();
            p251z9.j.d(setEntrySet2, "<get-entries>(...)");
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (com.google.android.gms.internal.measurement.E) linkedHashMap.get(str);
    }
}
