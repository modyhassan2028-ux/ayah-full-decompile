package G;

import Z.C0672b;
import Z.C0681f0;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f2589b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public H f2592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2593f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2590c = -1;
    public final C0681f0 g = C0672b.r(null);

    public H(Object obj, I i10) {
        this.f2588a = obj;
        this.f2589b = i10;
    }

    public final H a() {
        if (this.f2593f) {
            C.a.c("Pin should not be called on an already disposed item ");
        }
        if (this.f2591d == 0) {
            this.f2589b.f2594r.add(this);
            H h7 = (H) this.g.getValue();
            if (h7 != null) {
                h7.a();
            } else {
                h7 = null;
            }
            this.f2592e = h7;
        }
        this.f2591d++;
        return this;
    }

    public final void b() {
        if (this.f2593f) {
            return;
        }
        if (this.f2591d <= 0) {
            C.a.c("Release should only be called once");
        }
        int i10 = this.f2591d - 1;
        this.f2591d = i10;
        if (i10 == 0) {
            this.f2589b.f2594r.remove(this);
            H h7 = this.f2592e;
            if (h7 != null) {
                h7.b();
            }
            this.f2592e = null;
        }
    }
}
