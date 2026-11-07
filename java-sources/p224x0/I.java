package p224x0;

import J0.K;
import W.C0557f1;
import Z.C0672b;
import Z.C0675c0;
import Z.C0681f0;
import p063g1.m;
import p151p.V;
import p171r0.i;
import p180s0.C1303l;
import p215w0.b;

/* JADX INFO: loaded from: classes.dex */
public final class I extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0681f0 f24155e = C0672b.r(new i(0));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0681f0 f24156f = C0672b.r(Boolean.FALSE);
    public final E g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0675c0 f24157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f24158i;
    public C1303l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24159k;

    public I(C1439c c1439c) {
        E e10 = new E(c1439c);
        e10.f24138f = new C0557f1(19, this);
        this.g = e10;
        this.f24157h = new C0675c0(0);
        this.f24158i = 1.0f;
        this.f24159k = -1;
    }

    @Override // p215w0.b
    public final void a(float f3) {
        this.f24158i = f3;
    }

    @Override // p215w0.b
    public final void b(C1303l c1303l) {
        this.j = c1303l;
    }

    @Override // p215w0.b
    public final long d() {
        return ((i) this.f24155e.getValue()).f21400a;
    }

    @Override // p215w0.b
    public final void e(K k7) {
        p196u0.b bVar = k7.f3942r;
        C1303l c1303l = this.j;
        E e10 = this.g;
        if (c1303l == null) {
            c1303l = (C1303l) e10.g.getValue();
        }
        if (((Boolean) this.f24156f.getValue()).booleanValue() && k7.getLayoutDirection() == m.f16262s) {
            long jI = bVar.I();
            p074h0.i iVar = bVar.f22795s;
            long jV = iVar.v();
            iVar.p().q();
            try {
                ((V) iVar.f16422s).w(-1.0f, 1.0f, jI);
                e10.e(k7, this.f24158i, c1303l);
                iVar.p().n();
                iVar.J(jV);
            } catch (Throwable th) {
                iVar.p().n();
                iVar.J(jV);
                throw th;
            }
        } else {
            e10.e(k7, this.f24158i, c1303l);
        }
        this.f24159k = this.f24157h.g();
    }
}
