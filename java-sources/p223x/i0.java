package p223x;

import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements InterfaceC1417f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f24015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f24016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f24017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f24018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC1427p f24019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC1427p f24020f;
    public final AbstractC1427p g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f24021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AbstractC1427p f24022i;

    public i0(InterfaceC1421j interfaceC1421j, v0 v0Var, Object obj, Object obj2, AbstractC1427p abstractC1427p) {
        this.f24015a = interfaceC1421j.a(v0Var);
        this.f24016b = v0Var;
        this.f24017c = obj2;
        this.f24018d = obj;
        this.f24019e = (AbstractC1427p) v0Var.f24111a.e(obj);
        c cVar = v0Var.f24111a;
        this.f24020f = (AbstractC1427p) cVar.e(obj2);
        this.g = abstractC1427p != null ? AbstractC1413d.j(abstractC1427p) : ((AbstractC1427p) cVar.e(obj)).c();
        this.f24021h = -1L;
    }

    public final void a(Object obj) {
        if (j.a(obj, this.f24018d)) {
            return;
        }
        this.f24018d = obj;
        this.f24019e = (AbstractC1427p) this.f24016b.f24111a.e(obj);
        this.f24022i = null;
        this.f24021h = -1L;
    }

    public final void b(Object obj) {
        if (j.a(this.f24017c, obj)) {
            return;
        }
        this.f24017c = obj;
        this.f24020f = (AbstractC1427p) this.f24016b.f24111a.e(obj);
        this.f24022i = null;
        this.f24021h = -1L;
    }

    @Override // p223x.InterfaceC1417f
    public final boolean d() {
        return this.f24015a.d();
    }

    @Override // p223x.InterfaceC1417f
    public final Object e(long j) {
        if (p123m2.c.a(this, j)) {
            return this.f24017c;
        }
        AbstractC1427p abstractC1427pL = this.f24015a.l(j, this.f24019e, this.f24020f, this.g);
        int iB = abstractC1427pL.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (Float.isNaN(abstractC1427pL.a(i10))) {
                M.b("AnimationVector cannot contain a NaN. " + abstractC1427pL + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.f24016b.f24112b.e(abstractC1427pL);
    }

    @Override // p223x.InterfaceC1417f
    public final long f() {
        if (this.f24021h < 0) {
            this.f24021h = this.f24015a.i(this.f24019e, this.f24020f, this.g);
        }
        return this.f24021h;
    }

    @Override // p223x.InterfaceC1417f
    public final v0 g() {
        return this.f24016b;
    }

    @Override // p223x.InterfaceC1417f
    public final Object h() {
        return this.f24017c;
    }

    @Override // p223x.InterfaceC1417f
    public final AbstractC1427p i(long j) {
        if (!p123m2.c.a(this, j)) {
            return this.f24015a.e(j, this.f24019e, this.f24020f, this.g);
        }
        AbstractC1427p abstractC1427p = this.f24022i;
        if (abstractC1427p != null) {
            return abstractC1427p;
        }
        AbstractC1427p abstractC1427pS = this.f24015a.s(this.f24019e, this.f24020f, this.g);
        this.f24022i = abstractC1427pS;
        return abstractC1427pS;
    }

    @Override // p223x.InterfaceC1417f
    public final /* synthetic */ boolean j(long j) {
        return p123m2.c.a(this, j);
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f24018d + " -> " + this.f24017c + ",initial velocity: " + this.g + ", duration: " + (f() / 1000000) + " ms,animationSpec: " + this.f24015a;
    }
}
