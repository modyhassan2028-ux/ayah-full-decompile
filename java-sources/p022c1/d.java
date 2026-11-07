package p022c1;

import J0.T;
import N9.b0;
import Z.C;
import Z.C0672b;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import p055f1.l;
import p171r0.i;
import p180s0.F;
import p180s0.H;
import p180s0.I;
import p180s0.L;
import p180s0.q;
import p196u0.c;
import p196u0.f;
import p251z9.j;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class d extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f13428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f13429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public I f13431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f13432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F f13433f;
    public C g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i f13434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f13435i;

    public final b0 a() {
        b0 b0Var = this.f13428a;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this);
        this.f13428a = b0Var2;
        return b0Var2;
    }

    public final void b(int i10) {
        if (i10 == this.f13430c) {
            return;
        }
        a().d(i10);
        this.f13430c = i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    public final void c(F f3, long j, float f7) {
        if (f3 == null) {
            this.g = null;
            this.f13433f = null;
            this.f13434h = null;
            setShader(null);
            return;
        }
        if (f3 instanceof L) {
            d(g.D(((L) f3).f21813e, f7));
            return;
        }
        if (f3 instanceof H) {
            if (j.a(this.f13433f, f3)) {
                i iVar = this.f13434h;
                if (!(iVar == null ? false : i.a(iVar.f21400a, j))) {
                    if (j != 9205357640488583168L) {
                        this.f13433f = f3;
                        this.f13434h = new i(j);
                        this.g = C0672b.o(new T(f3, j, 1));
                    }
                }
            } else {
                if (j != 9205357640488583168L) {
                    this.f13433f = f3;
                    this.f13434h = new i(j);
                    this.g = C0672b.o(new T(f3, j, 1));
                }
            }
            b0 b0VarA = a();
            C c10 = this.g;
            b0VarA.h(c10 != null ? (Shader) c10.getValue() : null);
            this.f13432e = null;
            i.b(this, f7);
        }
    }

    public final void d(long j) {
        q qVar = this.f13432e;
        if (qVar == null ? false : q.c(qVar.f21845a, j)) {
            return;
        }
        if (j != 16) {
            this.f13432e = new q(j);
            setColor(F.u(j));
            this.g = null;
            this.f13433f = null;
            this.f13434h = null;
            setShader(null);
        }
    }

    public final void e(c cVar) {
        if (cVar == null || j.a(this.f13435i, cVar)) {
            return;
        }
        this.f13435i = cVar;
        if (cVar.equals(f.f22800b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (cVar instanceof p196u0.g) {
            a().l(1);
            p196u0.g gVar = (p196u0.g) cVar;
            a().k(gVar.f22801b);
            b0 b0VarA = a();
            ((Paint) b0VarA.f6165b).setStrokeMiter(gVar.f22802c);
            a().j(gVar.f22804e);
            a().i(gVar.f22803d);
            ((Paint) a().f6165b).setPathEffect(null);
        }
    }

    public final void f(I i10) {
        if (i10 == null || j.a(this.f13431d, i10)) {
            return;
        }
        this.f13431d = i10;
        if (i10.equals(I.f21798d)) {
            clearShadowLayer();
            return;
        }
        I i11 = this.f13431d;
        float f3 = i11.f21801c;
        if (f3 == 0.0f) {
            f3 = Float.MIN_VALUE;
        }
        setShadowLayer(f3, Float.intBitsToFloat((int) (i11.f21800b >> 32)), Float.intBitsToFloat((int) (this.f13431d.f21800b & 4294967295L)), F.u(this.f13431d.f21799a));
    }

    public final void g(l lVar) {
        if (lVar == null || j.a(this.f13429b, lVar)) {
            return;
        }
        this.f13429b = lVar;
        int i10 = lVar.f15916a;
        setUnderlineText((i10 | 1) == i10);
        int i11 = this.f13429b.f15916a;
        setStrikeThruText((i11 | 2) == i11);
    }
}
