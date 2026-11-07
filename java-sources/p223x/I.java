package p223x;

import Z.C0672b;
import Z.C0681f0;
import p056f2.AbstractC0939l;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC0939l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0681f0 f23855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0681f0 f23856t;

    public I(Object obj) {
        this.f23855s = C0672b.r(obj);
        this.f23856t = C0672b.r(obj);
    }

    @Override // p056f2.AbstractC0939l
    public final Object i() {
        return this.f23855s.getValue();
    }

    @Override // p056f2.AbstractC0939l
    public final Object j() {
        return this.f23856t.getValue();
    }

    @Override // p056f2.AbstractC0939l
    public final void l(Object obj) {
        this.f23855s.setValue(obj);
    }

    @Override // p056f2.AbstractC0939l
    public final void n() {
    }

    @Override // p056f2.AbstractC0939l
    public final void m(q0 q0Var) {
    }
}
