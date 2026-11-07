package p205v0;

import B9.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import p063g1.c;
import p063g1.m;
import p074h0.i;
import p180s0.AbstractC1295d;
import p180s0.C1294c;
import p180s0.F;
import p180s0.o;
import p180s0.p;
import p180s0.q;
import p196u0.b;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f23050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f23051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f23052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Matrix f23054f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f23055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23056i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f23057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f23058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f23059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f23060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f23061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f23062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f23063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f23064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f23065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f23066t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f23067u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23068v;

    public f() {
        p pVar = new p();
        b bVar = new b();
        this.f23050b = pVar;
        this.f23051c = bVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.f23052d = renderNode;
        this.f23053e = 0L;
        renderNode.setClipToBounds(false);
        L(renderNode, 0);
        this.f23055h = 1.0f;
        this.f23056i = 3;
        this.j = 1.0f;
        this.f23057k = 1.0f;
        long j = q.f21839b;
        this.f23061o = j;
        this.f23062p = j;
        this.f23064r = 8.0f;
        this.f23068v = 0;
    }

    public static void L(RenderNode renderNode, int i10) {
        if (i10 == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // p205v0.d
    public final Matrix A() {
        Matrix matrix = this.f23054f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f23054f = matrix;
        }
        this.f23052d.getMatrix(matrix);
        return matrix;
    }

    @Override // p205v0.d
    public final void B(int i10, int i11, long j) {
        this.f23052d.setPosition(i10, i11, ((int) (j >> 32)) + i10, ((int) (4294967295L & j)) + i11);
        this.f23053e = a.d0(j);
    }

    @Override // p205v0.d
    public final void C(o oVar) {
        AbstractC1295d.a(oVar).drawRenderNode(this.f23052d);
    }

    @Override // p205v0.d
    public final float D() {
        return 0.0f;
    }

    @Override // p205v0.d
    public final float E() {
        return this.f23060n;
    }

    @Override // p205v0.d
    public final float F() {
        return this.f23057k;
    }

    @Override // p205v0.d
    public final float G() {
        return this.f23063q;
    }

    @Override // p205v0.d
    public final int H() {
        return this.f23056i;
    }

    @Override // p205v0.d
    public final void I(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f23052d.resetPivot();
        } else {
            this.f23052d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f23052d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // p205v0.d
    public final long J() {
        return this.f23061o;
    }

    public final void K() {
        boolean z10 = this.f23065s;
        boolean z11 = false;
        boolean z12 = z10 && !this.g;
        if (z10 && this.g) {
            z11 = true;
        }
        if (z12 != this.f23066t) {
            this.f23066t = z12;
            this.f23052d.setClipToBounds(z12);
        }
        if (z11 != this.f23067u) {
            this.f23067u = z11;
            this.f23052d.setClipToOutline(z11);
        }
    }

    @Override // p205v0.d
    public final float a() {
        return this.j;
    }

    @Override // p205v0.d
    public final void b(float f3) {
        this.f23060n = f3;
        this.f23052d.setElevation(f3);
    }

    @Override // p205v0.d
    public final float c() {
        return this.f23055h;
    }

    @Override // p205v0.d
    public final void d() {
        this.f23052d.setRotationX(0.0f);
    }

    @Override // p205v0.d
    public final void e(float f3) {
        this.f23055h = f3;
        this.f23052d.setAlpha(f3);
    }

    @Override // p205v0.d
    public final void f(float f3) {
        this.f23063q = f3;
        this.f23052d.setRotationZ(f3);
    }

    @Override // p205v0.d
    public final void g() {
        this.f23052d.setRotationY(0.0f);
    }

    @Override // p205v0.d
    public final void h(float f3) {
        this.f23059m = f3;
        this.f23052d.setTranslationY(f3);
    }

    @Override // p205v0.d
    public final void i(float f3) {
        this.j = f3;
        this.f23052d.setScaleX(f3);
    }

    @Override // p205v0.d
    public final void j() {
        this.f23052d.discardDisplayList();
    }

    @Override // p205v0.d
    public final void k(float f3) {
        this.f23058l = f3;
        this.f23052d.setTranslationX(f3);
    }

    @Override // p205v0.d
    public final void l(float f3) {
        this.f23057k = f3;
        this.f23052d.setScaleY(f3);
    }

    @Override // p205v0.d
    public final void m(float f3) {
        this.f23064r = f3;
        this.f23052d.setCameraDistance(f3);
    }

    @Override // p205v0.d
    public final boolean n() {
        return this.f23052d.hasDisplayList();
    }

    @Override // p205v0.d
    public final float o() {
        return this.f23059m;
    }

    @Override // p205v0.d
    public final long p() {
        return this.f23062p;
    }

    @Override // p205v0.d
    public final void q(long j) {
        this.f23061o = j;
        this.f23052d.setAmbientShadowColor(F.u(j));
    }

    @Override // p205v0.d
    public final void r(Outline outline, long j) {
        this.f23052d.setOutline(outline);
        this.g = outline != null;
        K();
    }

    @Override // p205v0.d
    public final void s(c cVar, m mVar, b bVar, p085i0.f fVar) {
        b bVar2 = this.f23051c;
        RecordingCanvas recordingCanvasBeginRecording = this.f23052d.beginRecording();
        try {
            p pVar = this.f23050b;
            C1294c c1294c = pVar.f21838a;
            Canvas canvas = c1294c.f21818a;
            c1294c.f21818a = recordingCanvasBeginRecording;
            i iVar = bVar2.f22795s;
            iVar.H(cVar);
            iVar.I(mVar);
            iVar.f16423t = bVar;
            iVar.J(this.f23053e);
            iVar.G(c1294c);
            fVar.e(bVar2);
            pVar.f21838a.f21818a = canvas;
        } finally {
            this.f23052d.endRecording();
        }
    }

    @Override // p205v0.d
    public final float t() {
        return this.f23064r;
    }

    @Override // p205v0.d
    public final float u() {
        return this.f23058l;
    }

    @Override // p205v0.d
    public final void v(boolean z10) {
        this.f23065s = z10;
        K();
    }

    @Override // p205v0.d
    public final int w() {
        return this.f23068v;
    }

    @Override // p205v0.d
    public final float x() {
        return 0.0f;
    }

    @Override // p205v0.d
    public final void y(int i10) {
        this.f23068v = i10;
        if (i10 != 1 && this.f23056i == 3) {
            L(this.f23052d, i10);
        } else {
            L(this.f23052d, 1);
        }
    }

    @Override // p205v0.d
    public final void z(long j) {
        this.f23062p = j;
        this.f23052d.setSpotShadowColor(F.u(j));
    }
}
