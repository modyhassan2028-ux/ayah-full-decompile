package i7;

import p056f2.AbstractC0939l;

/* JADX INFO: loaded from: classes.dex */
public abstract class C0 extends AbstractC0939l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16847s;

    public C0(C1023u0 c1023u0) {
        super(c1023u0);
        ((C1023u0) this.f16104r).R++;
    }

    public abstract boolean p();

    public final void q() {
        if (!this.f16847s) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void r() {
        if (this.f16847s) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (p()) {
            return;
        }
        ((C1023u0) this.f16104r).T.incrementAndGet();
        this.f16847s = true;
    }
}
