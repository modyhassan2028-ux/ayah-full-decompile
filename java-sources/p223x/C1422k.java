package p223x;

import Z.C0672b;
import Z.C0681f0;
import Z.L0;

/* JADX INFO: renamed from: x.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1422k implements L0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v0 f24027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0681f0 f24028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC1427p f24029t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f24030u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f24031v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24032w;

    public /* synthetic */ C1422k(v0 v0Var, Object obj, AbstractC1427p abstractC1427p, int i10) {
        this(v0Var, obj, (i10 & 4) != 0 ? null : abstractC1427p, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // Z.L0
    public final Object getValue() {
        return this.f24028s.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f24028s.getValue() + ", velocity=" + this.f24027r.f24112b.e(this.f24029t) + ", isRunning=" + this.f24032w + ", lastFrameTimeNanos=" + this.f24030u + ", finishedTimeNanos=" + this.f24031v + ')';
    }

    public C1422k(v0 v0Var, Object obj, AbstractC1427p abstractC1427p, long j, long j10, boolean z10) {
        AbstractC1427p abstractC1427pJ;
        this.f24027r = v0Var;
        this.f24028s = C0672b.r(obj);
        if (abstractC1427p != null) {
            abstractC1427pJ = AbstractC1413d.j(abstractC1427p);
        } else {
            abstractC1427pJ = (AbstractC1427p) v0Var.f24111a.e(obj);
            abstractC1427pJ.d();
        }
        this.f24029t = abstractC1427pJ;
        this.f24030u = j;
        this.f24031v = j10;
        this.f24032w = z10;
    }
}
