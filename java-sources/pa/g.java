package pa;

import Da.j;
import Da.t;
import H9.m;
import ka.p;
import ka.w;

/* JADX INFO: loaded from: classes.dex */
public final class g extends w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f21177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f21178t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final t f21179u;

    public g(String str, long j, t tVar) {
        this.f21177s = str;
        this.f21178t = j;
        this.f21179u = tVar;
    }

    @Override // ka.w
    public final long b() {
        return this.f21178t;
    }

    @Override // ka.w
    public final p e() {
        String str = this.f21177s;
        if (str == null) {
            return null;
        }
        m mVar = p.f19193b;
        try {
            return B9.a.x(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // ka.w
    public final j i() {
        return this.f21179u;
    }
}
