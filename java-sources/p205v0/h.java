package p205v0;

import B1.a;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.layer.ViewLayer;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import p063g1.c;
import p063g1.l;
import p063g1.m;
import p085i0.f;
import p180s0.AbstractC1295d;
import p180s0.C1294c;
import p180s0.F;
import p180s0.o;
import p180s0.p;
import p180s0.q;
import p196u0.b;

/* JADX INFO: loaded from: classes.dex */
public final class h implements d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final g f23069y = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DrawChildContainer f23070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f23071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewLayer f23072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f23073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f23074f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23076i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23077k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f23079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23080n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f23081o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f23083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f23084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f23085s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f23086t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f23087u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f23088v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f23089w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f23090x;

    public h(DrawChildContainer drawChildContainer) {
        p pVar = new p();
        b bVar = new b();
        this.f23070b = drawChildContainer;
        this.f23071c = pVar;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, pVar, bVar);
        this.f23072d = viewLayer;
        this.f23073e = drawChildContainer.getResources();
        this.f23074f = new Rect();
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.f23076i = 0L;
        View.generateViewId();
        this.f23079m = 3;
        this.f23080n = 0;
        this.f23081o = 1.0f;
        this.f23083q = 1.0f;
        this.f23084r = 1.0f;
        long j = q.f21839b;
        this.f23088v = j;
        this.f23089w = j;
    }

    @Override // p205v0.d
    public final Matrix A() {
        return this.f23072d.getMatrix();
    }

    @Override // p205v0.d
    public final void B(int i10, int i11, long j) {
        boolean zA = l.a(this.f23076i, j);
        ViewLayer viewLayer = this.f23072d;
        if (zA) {
            int i12 = this.g;
            if (i12 != i10) {
                viewLayer.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f23075h;
            if (i13 != i11) {
                viewLayer.offsetTopAndBottom(i11 - i13);
            }
        } else {
            if (this.f23078l || viewLayer.getClipToOutline()) {
                this.j = true;
            }
            int i14 = (int) (j >> 32);
            int i15 = (int) (4294967295L & j);
            viewLayer.layout(i10, i11, i10 + i14, i11 + i15);
            this.f23076i = j;
            if (this.f23082p) {
                viewLayer.setPivotX(i14 / 2.0f);
                viewLayer.setPivotY(i15 / 2.0f);
            }
        }
        this.g = i10;
        this.f23075h = i11;
    }

    @Override // p205v0.d
    public final void C(o oVar) {
        Rect rect;
        boolean z10 = this.j;
        ViewLayer viewLayer = this.f23072d;
        if (z10) {
            if ((this.f23078l || viewLayer.getClipToOutline()) && !this.f23077k) {
                rect = this.f23074f;
                rect.left = 0;
                rect.top = 0;
                rect.right = viewLayer.getWidth();
                rect.bottom = viewLayer.getHeight();
            } else {
                rect = null;
            }
            viewLayer.setClipBounds(rect);
        }
        if (AbstractC1295d.a(oVar).isHardwareAccelerated()) {
            this.f23070b.a(oVar, viewLayer, viewLayer.getDrawingTime());
        }
    }

    @Override // p205v0.d
    public final float D() {
        return 0.0f;
    }

    @Override // p205v0.d
    public final float E() {
        return this.f23087u;
    }

    @Override // p205v0.d
    public final float F() {
        return this.f23084r;
    }

    @Override // p205v0.d
    public final float G() {
        return this.f23090x;
    }

    @Override // p205v0.d
    public final int H() {
        return this.f23079m;
    }

    @Override // p205v0.d
    public final void I(long j) {
        long j10 = 9223372034707292159L & j;
        ViewLayer viewLayer = this.f23072d;
        if (j10 != 9205357640488583168L) {
            this.f23082p = false;
            viewLayer.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            viewLayer.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                a.n(viewLayer);
                return;
            }
            this.f23082p = true;
            viewLayer.setPivotX(((int) (this.f23076i >> 32)) / 2.0f);
            viewLayer.setPivotY(((int) (4294967295L & this.f23076i)) / 2.0f);
        }
    }

    @Override // p205v0.d
    public final long J() {
        return this.f23088v;
    }

    @Override // p205v0.d
    public final float a() {
        return this.f23083q;
    }

    @Override // p205v0.d
    public final void b(float f3) {
        this.f23087u = f3;
        this.f23072d.setElevation(f3);
    }

    @Override // p205v0.d
    public final float c() {
        return this.f23081o;
    }

    @Override // p205v0.d
    public final void d() {
        this.f23072d.setRotationX(0.0f);
    }

    @Override // p205v0.d
    public final void e(float f3) {
        this.f23081o = f3;
        this.f23072d.setAlpha(f3);
    }

    @Override // p205v0.d
    public final void f(float f3) {
        this.f23090x = f3;
        this.f23072d.setRotation(f3);
    }

    @Override // p205v0.d
    public final void g() {
        this.f23072d.setRotationY(0.0f);
    }

    @Override // p205v0.d
    public final void h(float f3) {
        this.f23086t = f3;
        this.f23072d.setTranslationY(f3);
    }

    @Override // p205v0.d
    public final void i(float f3) {
        this.f23083q = f3;
        this.f23072d.setScaleX(f3);
    }

    @Override // p205v0.d
    public final void j() {
        this.f23070b.removeViewInLayout(this.f23072d);
    }

    @Override // p205v0.d
    public final void k(float f3) {
        this.f23085s = f3;
        this.f23072d.setTranslationX(f3);
    }

    @Override // p205v0.d
    public final void l(float f3) {
        this.f23084r = f3;
        this.f23072d.setScaleY(f3);
    }

    @Override // p205v0.d
    public final void m(float f3) {
        this.f23072d.setCameraDistance(f3 * this.f23073e.getDisplayMetrics().densityDpi);
    }

    @Override // p205v0.d
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // p205v0.d
    public final float o() {
        return this.f23086t;
    }

    @Override // p205v0.d
    public final long p() {
        return this.f23089w;
    }

    @Override // p205v0.d
    public final void q(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f23088v = j;
            a.q(F.u(j), this.f23072d);
        }
    }

    @Override // p205v0.d
    public final void r(Outline outline, long j) {
        ViewLayer viewLayer = this.f23072d;
        viewLayer.f11960v = outline;
        viewLayer.invalidateOutline();
        if ((this.f23078l || viewLayer.getClipToOutline()) && outline != null) {
            viewLayer.setClipToOutline(true);
            if (this.f23078l) {
                this.f23078l = false;
                this.j = true;
            }
        }
        this.f23077k = outline != null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p205v0.d
    public final void s(c cVar, m mVar, b bVar, f fVar) {
        ViewLayer viewLayer = this.f23072d;
        ViewParent parent = viewLayer.getParent();
        DrawChildContainer drawChildContainer = this.f23070b;
        if (parent == null) {
            drawChildContainer.addView(viewLayer);
        }
        viewLayer.setDrawParams(cVar, mVar, bVar, fVar);
        if (viewLayer.isAttachedToWindow()) {
            viewLayer.setVisibility(4);
            viewLayer.setVisibility(0);
            try {
                p pVar = this.f23071c;
                g gVar = f23069y;
                C1294c c1294c = pVar.f21838a;
                Canvas canvas = c1294c.f21818a;
                c1294c.f21818a = gVar;
                drawChildContainer.a(c1294c, viewLayer, viewLayer.getDrawingTime());
                pVar.f21838a.f21818a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // p205v0.d
    public final float t() {
        return this.f23072d.getCameraDistance() / this.f23073e.getDisplayMetrics().densityDpi;
    }

    @Override // p205v0.d
    public final float u() {
        return this.f23085s;
    }

    @Override // p205v0.d
    public final void v(boolean z10) {
        boolean z11 = false;
        this.f23078l = z10 && !this.f23077k;
        this.j = true;
        if (z10 && this.f23077k) {
            z11 = true;
        }
        this.f23072d.setClipToOutline(z11);
    }

    @Override // p205v0.d
    public final int w() {
        return this.f23080n;
    }

    @Override // p205v0.d
    public final float x() {
        return 0.0f;
    }

    @Override // p205v0.d
    public final void y(int i10) {
        this.f23080n = i10;
        ViewLayer viewLayer = this.f23072d;
        boolean z10 = true;
        if (i10 == 1 || this.f23079m != 3) {
            viewLayer.setLayerType(2, null);
            viewLayer.setCanUseCompositingLayer$ui_graphics_release(true);
            return;
        }
        if (i10 == 1) {
            viewLayer.setLayerType(2, null);
        } else if (i10 == 2) {
            viewLayer.setLayerType(0, null);
            z10 = false;
        } else {
            viewLayer.setLayerType(0, null);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    @Override // p205v0.d
    public final void z(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f23089w = j;
            a.r(F.u(j), this.f23072d);
        }
    }
}
