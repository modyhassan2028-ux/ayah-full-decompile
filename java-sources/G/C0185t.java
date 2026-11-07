package G;

import A.C0041r0;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import Z.C0672b;
import Z.C0681f0;
import p223x.C1411c;
import p223x.InterfaceC1435y;
import p223x.w0;

/* JADX INFO: renamed from: G.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0185t {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f2732s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f2733t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0402u f2734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p180s0.v f2735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0041r0 f2736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1435y f2737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1435y f2738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1435y f2739f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0681f0 f2740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0681f0 f2741i;
    public final C0681f0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0681f0 f2742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f2743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p205v0.b f2745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1411c f2746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1411c f2747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0681f0 f2748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f2749r;

    static {
        long j = Integer.MAX_VALUE;
        f2732s = (j & 4294967295L) | (j << 32);
    }

    public C0185t(InterfaceC0402u interfaceC0402u, p180s0.v vVar, C0041r0 c0041r0) {
        this.f2734a = interfaceC0402u;
        this.f2735b = vVar;
        this.f2736c = c0041r0;
        Boolean bool = Boolean.FALSE;
        this.f2740h = C0672b.r(bool);
        this.f2741i = C0672b.r(bool);
        this.j = C0672b.r(bool);
        this.f2742k = C0672b.r(bool);
        long j = f2732s;
        this.f2743l = j;
        this.f2744m = 0L;
        this.f2745n = vVar != null ? vVar.b() : null;
        this.f2746o = new C1411c(new p063g1.j(0L), w0.g, null, 12);
        this.f2747p = new C1411c(Float.valueOf(1.0f), w0.f24113a, null, 12);
        this.f2748q = C0672b.r(new p063g1.j(0L));
        this.f2749r = j;
    }

    public final void a() {
        p205v0.b bVar = this.f2745n;
        InterfaceC1435y interfaceC1435y = this.f2737d;
        boolean zBooleanValue = ((Boolean) this.f2741i.getValue()).booleanValue();
        InterfaceC0402u interfaceC0402u = this.f2734a;
        if (zBooleanValue || interfaceC1435y == null || bVar == null) {
            if (b()) {
                if (bVar != null) {
                    bVar.f(1.0f);
                }
                AbstractC0405x.x(interfaceC0402u, null, new C0182p(this, null, 0), 3);
                return;
            }
            return;
        }
        d(true);
        boolean zB = b();
        boolean z10 = !zB;
        if (!zB) {
            bVar.f(0.0f);
        }
        AbstractC0405x.x(interfaceC0402u, null, new r(z10, this, interfaceC1435y, bVar, null), 3);
    }

    public final boolean b() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void c() {
        p180s0.v vVar;
        boolean zBooleanValue = ((Boolean) this.f2740h.getValue()).booleanValue();
        InterfaceC0402u interfaceC0402u = this.f2734a;
        if (zBooleanValue) {
            f(false);
            AbstractC0405x.x(interfaceC0402u, null, new C0182p(this, null, 2), 3);
        }
        if (((Boolean) this.f2741i.getValue()).booleanValue()) {
            d(false);
            AbstractC0405x.x(interfaceC0402u, null, new C0182p(this, null, 3), 3);
        }
        if (b()) {
            e(false);
            AbstractC0405x.x(interfaceC0402u, null, new C0182p(this, null, 4), 3);
        }
        this.g = false;
        g(0L);
        this.f2743l = f2732s;
        p205v0.b bVar = this.f2745n;
        if (bVar != null && (vVar = this.f2735b) != null) {
            vVar.a(bVar);
        }
        this.f2745n = null;
        this.f2737d = null;
        this.f2739f = null;
        this.f2738e = null;
    }

    public final void d(boolean z10) {
        this.f2741i.setValue(Boolean.valueOf(z10));
    }

    public final void e(boolean z10) {
        this.j.setValue(Boolean.valueOf(z10));
    }

    public final void f(boolean z10) {
        this.f2740h.setValue(Boolean.valueOf(z10));
    }

    public final void g(long j) {
        this.f2748q.setValue(new p063g1.j(j));
    }
}
