package I1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public class E0 extends F9.n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WindowInsetsController f3675f;
    public final O8.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Window f3676h;

    public E0(WindowInsetsController windowInsetsController, O8.c cVar) {
        this.f3675f = windowInsetsController;
        this.g = cVar;
    }

    @Override // F9.n
    public final void E(int i10) {
        if ((i10 & 8) != 0) {
            ((p248z6.c) this.g.f6511r).I();
        }
        this.f3675f.hide(i10 & (-9));
    }

    @Override // F9.n
    public boolean F() {
        this.f3675f.setSystemBarsAppearance(0, 0);
        return (this.f3675f.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // F9.n
    public final void Q(boolean z10) {
        Window window = this.f3676h;
        if (z10) {
            if (window != null) {
                Z(16);
            }
            this.f3675f.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                a0(16);
            }
            this.f3675f.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // F9.n
    public final void R(boolean z10) {
        Window window = this.f3676h;
        if (z10) {
            if (window != null) {
                Z(8192);
            }
            this.f3675f.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                a0(8192);
            }
            this.f3675f.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // F9.n
    public void S() {
        Window window = this.f3676h;
        if (window == null) {
            this.f3675f.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        a0(2048);
        Z(4096);
    }

    @Override // F9.n
    public final void T(int i10) {
        if ((i10 & 8) != 0) {
            ((p248z6.c) this.g.f6511r).L();
        }
        this.f3675f.show(i10 & (-9));
    }

    public final void Z(int i10) {
        View decorView = this.f3676h.getDecorView();
        decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
    }

    public final void a0(int i10) {
        View decorView = this.f3676h.getDecorView();
        decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
    }

    public E0(Window window, O8.c cVar) {
        this(window.getInsetsController(), cVar);
        this.f3676h = window;
    }
}
