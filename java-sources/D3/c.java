package D3;

import K9.AbstractC0405x;
import K9.H;
import K9.p0;
import P9.d;
import R9.e;
import android.content.Context;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p110k9.o;
import p120l9.r;
import p120l9.s;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f1169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f1170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f1171d;

    public c(Context context) {
        this.f1168a = context;
        int i10 = 1;
        this.f1169b = p110k9.a.d(new Ba.b(i10));
        p0 p0VarE = AbstractC0405x.e();
        e eVar = H.f5322a;
        d dVarB = AbstractC0405x.b(Y2.a.Z(p0VarE, R9.d.f7436t));
        this.f1170c = new AtomicReference(s.f19441r);
        this.f1171d = new AtomicReference(r.f19440r);
        AbstractC0405x.x(dVarB, null, new a(this, null, i10), 3);
    }

    public final Object a(q9.c cVar) {
        Collection collection = (Collection) this.f1171d.get();
        if (!collection.isEmpty()) {
            return collection;
        }
        e eVar = H.f5322a;
        Object objI = AbstractC0405x.I(R9.d.f7436t, new a(this, null, 2), cVar);
        return objI == p161p9.a.f21156r ? objI : (List) objI;
    }

    public final Object b(q9.c cVar) {
        Map map = (Map) this.f1170c.get();
        if (!map.isEmpty()) {
            return map;
        }
        e eVar = H.f5322a;
        Object objI = AbstractC0405x.I(R9.d.f7436t, new b(this, null, 0), cVar);
        return objI == p161p9.a.f21156r ? objI : (Map) objI;
    }
}
