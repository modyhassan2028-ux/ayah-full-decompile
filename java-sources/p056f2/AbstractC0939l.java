package p056f2;

import H8.e;
import U6.y;
import Y6.a;
import Z.C0672b;
import android.content.Context;
import android.view.View;
import i7.C1014r0;
import i7.C1023u0;
import i7.D0;
import i7.X;
import p074h0.i;
import p123m2.c;
import p223x.q0;
import p251z9.j;

/* JADX INFO: renamed from: f2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0939l implements D0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f16104r;

    public AbstractC0939l(C1023u0 c1023u0) {
        y.f(c1023u0);
        this.f16104r = c1023u0;
    }

    @Override // i7.D0
    public X b() {
        throw null;
    }

    @Override // i7.D0
    public C1014r0 c() {
        throw null;
    }

    @Override // i7.D0
    public Context d() {
        throw null;
    }

    @Override // i7.D0
    public a e() {
        throw null;
    }

    @Override // i7.D0
    public e f() {
        throw null;
    }

    public abstract void g(i iVar);

    public String h() {
        return null;
    }

    public abstract Object i();

    public abstract Object j();

    public boolean k() {
        int i10;
        X x9 = (X) this.f16104r;
        View view = x9.f16041c.f16145X;
        if (view != null) {
            i10 = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i10 = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(c.r(visibility, "Unknown visibility "));
                    }
                    i10 = 3;
                }
            }
        } else {
            i10 = 0;
        }
        int i11 = x9.f16039a;
        if (i10 != i11) {
            return (i10 == 2 || i11 == 2) ? false : true;
        }
        return true;
    }

    public abstract void l(Object obj);

    public abstract void m(q0 q0Var);

    public abstract void n();

    public void o() {
        C1014r0 c1014r0 = ((C1023u0) this.f16104r).f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
    }

    public AbstractC0939l() {
        this.f16104r = C0672b.r(Boolean.FALSE);
    }

    public AbstractC0939l(X x9) {
        j.e(x9, "operation");
        this.f16104r = x9;
    }
}
