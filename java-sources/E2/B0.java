package E2;

/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1448f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1450i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f1453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1454n;

    public final void a(int i10) {
        if ((this.f1446d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f1446d));
    }

    public final int b() {
        return this.g ? this.f1444b - this.f1445c : this.f1447e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1443a + ", mData=null, mItemCount=" + this.f1447e + ", mIsMeasuring=" + this.f1450i + ", mPreviousLayoutItemCount=" + this.f1444b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1445c + ", mStructureChanged=" + this.f1448f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.f1451k + '}';
    }
}
