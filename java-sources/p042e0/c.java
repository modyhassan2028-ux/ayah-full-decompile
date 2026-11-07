package p042e0;

import Da.r;
import p054f0.a;
import p120l9.e;

/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f15716t = new c(m.f15739e, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f15717r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f15718s;

    public c(m mVar, int i10) {
        this.f15717r = mVar;
        this.f15718s = i10;
    }

    public final c a(Object obj, a aVar) {
        r rVarU = this.f15717r.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return rVarU == null ? this : new c((m) rVarU.f1388t, this.f15718s + rVarU.f1387s);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f15717r.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f15717r.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
