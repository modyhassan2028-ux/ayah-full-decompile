package p214w;

import Z.C0672b;
import Z.C0681f0;
import l0.e;
import p063g1.l;
import p063g1.m;
import p223x.j0;
import p223x.l0;
import p223x.q0;
import u.E;
import u.M;

/* JADX INFO: renamed from: w.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1401n implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f23517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f23518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0681f0 f23519c = C0672b.r(new l(0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f23520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j0 f23521e;

    public C1401n(q0 q0Var, e eVar, m mVar) {
        this.f23517a = q0Var;
        this.f23518b = eVar;
        long[] jArr = M.f22699a;
        this.f23520d = new E();
    }

    public static final long d(C1401n c1401n) {
        j0 j0Var = c1401n.f23521e;
        return j0Var != null ? ((l) j0Var.getValue()).f16260a : ((l) c1401n.f23519c.getValue()).f16260a;
    }

    @Override // p223x.l0
    public final Object a() {
        return this.f23517a.f().a();
    }

    @Override // p223x.l0
    public final boolean b(Object obj, Object obj2) {
        return obj.equals(a()) && obj2.equals(c());
    }

    @Override // p223x.l0
    public final Object c() {
        return this.f23517a.f().c();
    }
}
