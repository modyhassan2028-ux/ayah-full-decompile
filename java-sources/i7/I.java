package i7;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends E {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17002s;

    public I(C1023u0 c1023u0) {
        super(c1023u0);
        ((C1023u0) this.f16104r).R++;
    }

    public final void p() {
        if (!this.f17002s) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (this.f17002s) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (r()) {
            return;
        }
        ((C1023u0) this.f16104r).T.incrementAndGet();
        this.f17002s = true;
    }

    public abstract boolean r();
}
