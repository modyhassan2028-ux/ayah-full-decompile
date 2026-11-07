package I1;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class C0 extends F9.n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Window f3672f;
    public final O8.c g;

    public C0(Window window, O8.c cVar) {
        this.f3672f = window;
        this.g = cVar;
    }

    @Override // F9.n
    public final void E(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                if (i11 == 1) {
                    Z(4);
                } else if (i11 == 2) {
                    Z(2);
                } else if (i11 == 8) {
                    ((p248z6.c) this.g.f6511r).I();
                }
            }
        }
    }

    @Override // F9.n
    public final boolean F() {
        return (this.f3672f.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // F9.n
    public final void R(boolean z10) {
        if (!z10) {
            a0(8192);
            return;
        }
        Window window = this.f3672f;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        Z(8192);
    }

    @Override // F9.n
    public final void S() {
        this.f3672f.getDecorView().setTag(356039078, 2);
        a0(2048);
        Z(4096);
    }

    @Override // F9.n
    public final void T(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                if (i11 == 1) {
                    a0(4);
                    this.f3672f.clearFlags(1024);
                } else if (i11 == 2) {
                    a0(2);
                } else if (i11 == 8) {
                    ((p248z6.c) this.g.f6511r).L();
                }
            }
        }
    }

    public final void Z(int i10) {
        View decorView = this.f3672f.getDecorView();
        decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
    }

    public final void a0(int i10) {
        View decorView = this.f3672f.getDecorView();
        decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
    }
}
