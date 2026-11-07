package androidx.lifecycle;

import K0.RunnableC0354l;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC0771u {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final D f12607z = new D();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12609s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Handler f12612v;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12610t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12611u = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w f12613w = new w(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RunnableC0354l f12614x = new RunnableC0354l(13, this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final T f12615y = new T(this);

    public final void c() {
        int i10 = this.f12609s + 1;
        this.f12609s = i10;
        if (i10 == 1) {
            if (this.f12610t) {
                this.f12613w.d(EnumC0766o.ON_RESUME);
                this.f12610t = false;
            } else {
                Handler handler = this.f12612v;
                p251z9.j.b(handler);
                handler.removeCallbacks(this.f12614x);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0771u
    public final w h() {
        return this.f12613w;
    }
}
