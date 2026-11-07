package E2;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1627c;

    public W(int i10, String str, String str2) {
        this.f1625a = i10;
        this.f1626b = str;
        this.f1627c = str2;
    }

    public static W b(AbstractC0135m0 abstractC0135m0, int i10) {
        if (i10 == 0) {
            return new V(abstractC0135m0, 0);
        }
        if (i10 == 1) {
            return new V(abstractC0135m0, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract void a(Q2.a aVar);

    public abstract void c(Q2.a aVar);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i10);

    public abstract void r(Q2.a aVar);

    public abstract void s(Q2.a aVar);

    public abstract void t(Q2.a aVar);

    public abstract void u(Q2.a aVar);

    public abstract F2.v v(Q2.a aVar);

    public W(AbstractC0135m0 abstractC0135m0) {
        this.f1625a = Integer.MIN_VALUE;
        this.f1627c = new Rect();
        this.f1626b = abstractC0135m0;
    }

    public W(p013b2.i iVar) {
        this.f1625a = 0;
        this.f1627c = new p013b2.d();
        this.f1626b = iVar;
    }
}
