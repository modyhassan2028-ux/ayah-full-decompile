package i7;

/* JADX INFO: loaded from: classes.dex */
public abstract class L1 extends H1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17029t;

    public L1(Q1 q10) {
        super(q10);
        this.f17001s.f17090I++;
    }

    public final void p() {
        if (!this.f17029t) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (this.f17029t) {
            throw new IllegalStateException("Can't initialize twice");
        }
        r();
        this.f17001s.f17091J++;
        this.f17029t = true;
    }

    public abstract void r();
}
