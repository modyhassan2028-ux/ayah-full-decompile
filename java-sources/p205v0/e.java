package p205v0;

import B9.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicBoolean;
import p063g1.c;
import p063g1.l;
import p063g1.m;
import p074h0.i;
import p085i0.f;
import p180s0.AbstractC1295d;
import p180s0.C1294c;
import p180s0.F;
import p180s0.o;
import p180s0.p;
import p180s0.q;
import p196u0.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicBoolean f23028y = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f23029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f23030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f23031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Matrix f23033f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f23034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23035i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f23036k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f23038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f23039n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f23040o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f23041p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f23042q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f23043r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f23044s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f23045t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f23046u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f23047v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f23048w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f23049x;

    public e(AndroidComposeView androidComposeView, p pVar, b bVar) {
        this.f23029b = pVar;
        this.f23030c = bVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f23031d = renderNodeCreate;
        this.f23032e = 0L;
        this.f23034h = 0L;
        if (f23028y.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                l.c(renderNodeCreate, l.a(renderNodeCreate));
                l.d(renderNodeCreate, l.b(renderNodeCreate));
            }
            if (i10 >= 24) {
                k.a(renderNodeCreate);
            } else {
                j.a(renderNodeCreate);
            }
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        L(0);
        this.f23035i = 0;
        this.j = 3;
        this.f23036k = 1.0f;
        this.f23038m = 1.0f;
        this.f23039n = 1.0f;
        long j = q.f21839b;
        this.f23043r = j;
        this.f23044s = j;
        this.f23046u = 8.0f;
    }

    @Override // p205v0.d
    public final Matrix A() {
        Matrix matrix = this.f23033f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f23033f = matrix;
        }
        this.f23031d.getMatrix(matrix);
        return matrix;
    }

    @Override // p205v0.d
    public final void B(int i10, int i11, long j) {
        int i12 = (int) (j >> 32);
        int i13 = (int) (4294967295L & j);
        this.f23031d.setLeftTopRightBottom(i10, i11, i10 + i12, i11 + i13);
        if (l.a(this.f23032e, j)) {
            return;
        }
        if (this.f23037l) {
            this.f23031d.setPivotX(i12 / 2.0f);
            this.f23031d.setPivotY(i13 / 2.0f);
        }
        this.f23032e = j;
    }

    @Override // p205v0.d
    public final void C(o oVar) {
        DisplayListCanvas displayListCanvasA = AbstractC1295d.a(oVar);
        j.c(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.f23031d);
    }

    @Override // p205v0.d
    public final float D() {
        return 0.0f;
    }

    @Override // p205v0.d
    public final float E() {
        return this.f23042q;
    }

    @Override // p205v0.d
    public final float F() {
        return this.f23039n;
    }

    @Override // p205v0.d
    public final float G() {
        return this.f23045t;
    }

    @Override // p205v0.d
    public final int H() {
        return this.j;
    }

    @Override // p205v0.d
    public final void I(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f23037l = true;
            this.f23031d.setPivotX(((int) (this.f23032e >> 32)) / 2.0f);
            this.f23031d.setPivotY(((int) (4294967295L & this.f23032e)) / 2.0f);
        } else {
            this.f23037l = false;
            this.f23031d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f23031d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // p205v0.d
    public final long J() {
        return this.f23043r;
    }

    public final void K() {
        boolean z10 = this.f23047v;
        boolean z11 = false;
        boolean z12 = z10 && !this.g;
        if (z10 && this.g) {
            z11 = true;
        }
        if (z12 != this.f23048w) {
            this.f23048w = z12;
            this.f23031d.setClipToBounds(z12);
        }
        if (z11 != this.f23049x) {
            this.f23049x = z11;
            this.f23031d.setClipToOutline(z11);
        }
    }

    public final void L(int i10) {
        RenderNode renderNode = this.f23031d;
        if (i10 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // p205v0.d
    public final float a() {
        return this.f23038m;
    }

    @Override // p205v0.d
    public final void b(float f3) {
        this.f23042q = f3;
        this.f23031d.setElevation(f3);
    }

    @Override // p205v0.d
    public final float c() {
        return this.f23036k;
    }

    @Override // p205v0.d
    public final void d() {
        this.f23031d.setRotationX(0.0f);
    }

    @Override // p205v0.d
    public final void e(float f3) {
        this.f23036k = f3;
        this.f23031d.setAlpha(f3);
    }

    @Override // p205v0.d
    public final void f(float f3) {
        this.f23045t = f3;
        this.f23031d.setRotation(f3);
    }

    @Override // p205v0.d
    public final void g() {
        this.f23031d.setRotationY(0.0f);
    }

    @Override // p205v0.d
    public final void h(float f3) {
        this.f23041p = f3;
        this.f23031d.setTranslationY(f3);
    }

    @Override // p205v0.d
    public final void i(float f3) {
        this.f23038m = f3;
        this.f23031d.setScaleX(f3);
    }

    @Override // p205v0.d
    public final void j() {
        if (Build.VERSION.SDK_INT >= 24) {
            k.a(this.f23031d);
        } else {
            j.a(this.f23031d);
        }
    }

    @Override // p205v0.d
    public final void k(float f3) {
        this.f23040o = f3;
        this.f23031d.setTranslationX(f3);
    }

    @Override // p205v0.d
    public final void l(float f3) {
        this.f23039n = f3;
        this.f23031d.setScaleY(f3);
    }

    @Override // p205v0.d
    public final void m(float f3) {
        this.f23046u = f3;
        this.f23031d.setCameraDistance(-f3);
    }

    @Override // p205v0.d
    public final boolean n() {
        return this.f23031d.isValid();
    }

    @Override // p205v0.d
    public final float o() {
        return this.f23041p;
    }

    @Override // p205v0.d
    public final long p() {
        return this.f23044s;
    }

    @Override // p205v0.d
    public final void q(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f23043r = j;
            l.c(this.f23031d, F.u(j));
        }
    }

    @Override // p205v0.d
    public final void r(Outline outline, long j) {
        this.f23034h = j;
        this.f23031d.setOutline(outline);
        this.g = outline != null;
        K();
    }

    @Override // p205v0.d
    public final void s(c cVar, m mVar, b bVar, f fVar) {
        Canvas canvasStart = this.f23031d.start(Math.max((int) (this.f23032e >> 32), (int) (this.f23034h >> 32)), Math.max((int) (this.f23032e & 4294967295L), (int) (4294967295L & this.f23034h)));
        try {
            C1294c c1294c = this.f23029b.f21838a;
            Canvas canvas = c1294c.f21818a;
            c1294c.f21818a = canvasStart;
            b bVar2 = this.f23030c;
            i iVar = bVar2.f22795s;
            long jD0 = a.d0(this.f23032e);
            p196u0.a aVar = ((b) iVar.f16424u).f22794r;
            c cVar2 = aVar.f22790a;
            m mVar2 = aVar.f22791b;
            o oVarP = iVar.p();
            long jV = iVar.v();
            b bVar3 = (b) iVar.f16423t;
            iVar.H(cVar);
            iVar.I(mVar);
            iVar.G(c1294c);
            iVar.J(jD0);
            iVar.f16423t = bVar;
            c1294c.q();
            try {
                fVar.e(bVar2);
                c1294c.n();
                iVar.H(cVar2);
                iVar.I(mVar2);
                iVar.G(oVarP);
                iVar.J(jV);
                iVar.f16423t = bVar3;
                c1294c.f21818a = canvas;
                this.f23031d.end(canvasStart);
            } catch (Throwable th) {
                c1294c.n();
                i iVar2 = bVar2.f22795s;
                iVar2.H(cVar2);
                iVar2.I(mVar2);
                iVar2.G(oVarP);
                iVar2.J(jV);
                iVar2.f16423t = bVar3;
                throw th;
            }
        } catch (Throwable th2) {
            this.f23031d.end(canvasStart);
            throw th2;
        }
    }

    @Override // p205v0.d
    public final float t() {
        return this.f23046u;
    }

    @Override // p205v0.d
    public final float u() {
        return this.f23040o;
    }

    @Override // p205v0.d
    public final void v(boolean z10) {
        this.f23047v = z10;
        K();
    }

    @Override // p205v0.d
    public final int w() {
        return this.f23035i;
    }

    @Override // p205v0.d
    public final float x() {
        return 0.0f;
    }

    @Override // p205v0.d
    public final void y(int i10) {
        this.f23035i = i10;
        if (i10 != 1 && this.j == 3) {
            L(i10);
        } else {
            L(1);
        }
    }

    @Override // p205v0.d
    public final void z(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f23044s = j;
            l.d(this.f23031d, F.u(j));
        }
    }
}
