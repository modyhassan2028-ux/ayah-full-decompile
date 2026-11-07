package I1;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f3770c;

    public o0() {
        this.f3770c = n0.d();
    }

    @Override // I1.r0
    public B0 b() {
        a();
        B0 b0H = B0.h(null, this.f3770c.build());
        b0H.f3671a.r(this.f3772b);
        return b0H;
    }

    @Override // I1.r0
    public void d(A1.c cVar) {
        this.f3770c.setMandatorySystemGestureInsets(cVar.e());
    }

    @Override // I1.r0
    public void e(A1.c cVar) {
        this.f3770c.setStableInsets(cVar.e());
    }

    @Override // I1.r0
    public void f(A1.c cVar) {
        this.f3770c.setSystemGestureInsets(cVar.e());
    }

    @Override // I1.r0
    public void g(A1.c cVar) {
        this.f3770c.setSystemWindowInsets(cVar.e());
    }

    @Override // I1.r0
    public void h(A1.c cVar) {
        this.f3770c.setTappableElementInsets(cVar.e());
    }

    public o0(B0 b5) {
        WindowInsets.Builder builderD;
        super(b5);
        WindowInsets windowInsetsG = b5.g();
        if (windowInsetsG != null) {
            builderD = n0.e(windowInsetsG);
        } else {
            builderD = n0.d();
        }
        this.f3770c = builderD;
    }
}
