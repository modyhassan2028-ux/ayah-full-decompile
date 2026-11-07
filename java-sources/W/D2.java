package W;

import Z.C0672b;
import Z.C0675c0;
import Z.C0681f0;

/* JADX INFO: loaded from: classes.dex */
public final class D2 implements C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0681f0 f8501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0681f0 f8502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0675c0 f8503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0675c0 f8504e;

    public D2(int i10, int i11, boolean z10) {
        if (i10 < 0 || i10 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i11 < 0 || i11 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.f8500a = z10;
        this.f8501b = C0672b.r(new B2(0));
        this.f8502c = C0672b.r(Boolean.valueOf(i10 >= 12));
        this.f8503d = new C0675c0(i10 % 12);
        this.f8504e = new C0675c0(i11);
    }

    @Override // W.C2
    public final void a(boolean z10) {
        this.f8502c.setValue(Boolean.valueOf(z10));
    }

    @Override // W.C2
    public final void b(int i10) {
        a(i10 >= 12);
        this.f8503d.h(i10 % 12);
    }

    @Override // W.C2
    public final int c() {
        return ((B2) this.f8501b.getValue()).f8479a;
    }

    @Override // W.C2
    public final boolean d() {
        return this.f8500a;
    }

    @Override // W.C2
    public final void e(int i10) {
        this.f8504e.h(i10);
    }

    @Override // W.C2
    public final int f() {
        return this.f8503d.g() + (i() ? 12 : 0);
    }

    @Override // W.C2
    public final int g() {
        return this.f8504e.g();
    }

    @Override // W.C2
    public final void h(int i10) {
        this.f8501b.setValue(new B2(i10));
    }

    @Override // W.C2
    public final boolean i() {
        return ((Boolean) this.f8502c.getValue()).booleanValue();
    }
}
