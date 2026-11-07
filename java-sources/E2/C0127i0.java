package E2;

import android.view.View;

/* JADX INFO: renamed from: E2.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0127i0 implements Z0.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1682b;

    public C0127i0(int i10, int i11) {
        this.f1681a = i10;
        this.f1682b = i11;
    }

    @Override // Z0.s
    public int a(int i10) {
        if (i10 >= 0 && i10 <= this.f1682b) {
            K.T.B(i10, this.f1681a, i10);
        }
        return i10;
    }

    @Override // Z0.s
    public int b(int i10) {
        if (i10 >= 0 && i10 <= this.f1681a) {
            K.T.A(i10, this.f1682b, i10);
        }
        return i10;
    }

    public void c(F0 f3) {
        View view = f3.f1486a;
        this.f1681a = view.getLeft();
        this.f1682b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
