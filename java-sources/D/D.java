package D;

import I1.AbstractC0244b0;
import I1.B0;
import I1.l0;
import I1.y0;
import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0244b0 implements Runnable, I1.r, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f0 f873t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f874u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f875v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public B0 f876w;

    public D(f0 f0Var) {
        super(!f0Var.f971r ? 1 : 0);
        this.f873t = f0Var;
    }

    @Override // I1.AbstractC0244b0
    public final void d(l0 l0Var) {
        this.f874u = false;
        this.f875v = false;
        B0 b5 = this.f876w;
        if (l0Var.f3759a.b() != 0 && b5 != null) {
            y0 y0Var = b5.f3671a;
            f0 f0Var = this.f873t;
            f0Var.f970q.f(AbstractC0060c.f(y0Var.g(8)));
            f0Var.f969p.f(AbstractC0060c.f(y0Var.g(8)));
            f0.a(f0Var, b5);
        }
        this.f876w = null;
    }

    @Override // I1.AbstractC0244b0
    public final void e(l0 l0Var) {
        this.f874u = true;
        this.f875v = true;
    }

    @Override // I1.AbstractC0244b0
    public final B0 f(B0 b5, List list) {
        f0 f0Var = this.f873t;
        f0.a(f0Var, b5);
        return f0Var.f971r ? B0.f3670b : b5;
    }

    @Override // I1.AbstractC0244b0
    public final M.k g(l0 l0Var, M.k kVar) {
        this.f874u = false;
        return kVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // I1.r
    public final B0 p(View view, B0 b5) {
        this.f876w = b5;
        f0 f0Var = this.f873t;
        b0 b0Var = f0Var.f969p;
        y0 y0Var = b5.f3671a;
        b0Var.f(AbstractC0060c.f(y0Var.g(8)));
        if (this.f874u) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f875v) {
            f0Var.f970q.f(AbstractC0060c.f(y0Var.g(8)));
            f0.a(f0Var, b5);
        }
        return f0Var.f971r ? B0.f3670b : b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f874u) {
            this.f874u = false;
            this.f875v = false;
            B0 b5 = this.f876w;
            if (b5 != null) {
                f0 f0Var = this.f873t;
                f0Var.f970q.f(AbstractC0060c.f(b5.f3671a.g(8)));
                f0.a(f0Var, b5);
                this.f876w = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
