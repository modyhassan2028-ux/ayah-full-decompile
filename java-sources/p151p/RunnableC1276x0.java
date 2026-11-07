package p151p;

/* JADX INFO: renamed from: p.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1276x0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A0 f20801s;

    public /* synthetic */ RunnableC1276x0(A0 a9, int i10) {
        this.f20800r = i10;
        this.f20801s = a9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20800r) {
            case 0:
                C1261p0 c1261p0 = this.f20801s.f20526t;
                if (c1261p0 != null) {
                    c1261p0.setListSelectionHidden(true);
                    c1261p0.requestLayout();
                }
                break;
            default:
                A0 a9 = this.f20801s;
                C1261p0 c1261p1 = a9.f20526t;
                if (c1261p1 != null && c1261p1.isAttachedToWindow() && a9.f20526t.getCount() > a9.f20526t.getChildCount() && a9.f20526t.getChildCount() <= a9.f20511D) {
                    a9.Q.setInputMethodMode(2);
                    a9.d();
                    break;
                }
                break;
        }
    }
}
