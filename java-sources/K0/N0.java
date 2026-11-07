package K0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import p180s0.C1294c;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements InterfaceC0365q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f4965a = I1.n0.b();

    @Override // K0.InterfaceC0365q0
    public final void A(float f3) {
        this.f4965a.setPivotY(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void B(float f3) {
        this.f4965a.setElevation(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void C(p180s0.p pVar, p180s0.E e10, P0 p10) {
        RecordingCanvas recordingCanvasBeginRecording = this.f4965a.beginRecording();
        C1294c c1294c = pVar.f21838a;
        Canvas canvas = c1294c.f21818a;
        c1294c.f21818a = recordingCanvasBeginRecording;
        if (e10 != null) {
            c1294c.q();
            c1294c.b(e10);
        }
        p10.e(c1294c);
        if (e10 != null) {
            c1294c.n();
        }
        pVar.f21838a.f21818a = canvas;
        this.f4965a.endRecording();
    }

    @Override // K0.InterfaceC0365q0
    public final int D() {
        return this.f4965a.getRight();
    }

    @Override // K0.InterfaceC0365q0
    public final boolean E() {
        return this.f4965a.getClipToOutline();
    }

    @Override // K0.InterfaceC0365q0
    public final void F(int i10) {
        this.f4965a.offsetTopAndBottom(i10);
    }

    @Override // K0.InterfaceC0365q0
    public final void G(boolean z10) {
        this.f4965a.setClipToOutline(z10);
    }

    @Override // K0.InterfaceC0365q0
    public final void H(Outline outline) {
        this.f4965a.setOutline(outline);
    }

    @Override // K0.InterfaceC0365q0
    public final void I(int i10) {
        this.f4965a.setSpotShadowColor(i10);
    }

    @Override // K0.InterfaceC0365q0
    public final boolean J() {
        return this.f4965a.setHasOverlappingRendering(true);
    }

    @Override // K0.InterfaceC0365q0
    public final void K(Matrix matrix) {
        this.f4965a.getMatrix(matrix);
    }

    @Override // K0.InterfaceC0365q0
    public final float L() {
        return this.f4965a.getElevation();
    }

    @Override // K0.InterfaceC0365q0
    public final int a() {
        return this.f4965a.getHeight();
    }

    @Override // K0.InterfaceC0365q0
    public final int b() {
        return this.f4965a.getWidth();
    }

    @Override // K0.InterfaceC0365q0
    public final float c() {
        return this.f4965a.getAlpha();
    }

    @Override // K0.InterfaceC0365q0
    public final void d() {
        this.f4965a.setRotationX(0.0f);
    }

    @Override // K0.InterfaceC0365q0
    public final void e(float f3) {
        this.f4965a.setAlpha(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void f(float f3) {
        this.f4965a.setRotationZ(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void g() {
        this.f4965a.setRotationY(0.0f);
    }

    @Override // K0.InterfaceC0365q0
    public final void h(float f3) {
        this.f4965a.setTranslationY(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void i(float f3) {
        this.f4965a.setScaleX(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void j() {
        this.f4965a.discardDisplayList();
    }

    @Override // K0.InterfaceC0365q0
    public final void k(float f3) {
        this.f4965a.setTranslationX(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void l(float f3) {
        this.f4965a.setScaleY(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void m(float f3) {
        this.f4965a.setCameraDistance(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final boolean n() {
        return this.f4965a.hasDisplayList();
    }

    @Override // K0.InterfaceC0365q0
    public final void o(int i10) {
        this.f4965a.offsetLeftAndRight(i10);
    }

    @Override // K0.InterfaceC0365q0
    public final int p() {
        return this.f4965a.getBottom();
    }

    @Override // K0.InterfaceC0365q0
    public final boolean q() {
        return this.f4965a.getClipToBounds();
    }

    @Override // K0.InterfaceC0365q0
    public final void r() {
        if (Build.VERSION.SDK_INT >= 31) {
            O0.a(this.f4965a);
        }
    }

    @Override // K0.InterfaceC0365q0
    public final void s(Canvas canvas) {
        canvas.drawRenderNode(this.f4965a);
    }

    @Override // K0.InterfaceC0365q0
    public final int t() {
        return this.f4965a.getTop();
    }

    @Override // K0.InterfaceC0365q0
    public final int u() {
        return this.f4965a.getLeft();
    }

    @Override // K0.InterfaceC0365q0
    public final void v(float f3) {
        this.f4965a.setPivotX(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void w(boolean z10) {
        this.f4965a.setClipToBounds(z10);
    }

    @Override // K0.InterfaceC0365q0
    public final boolean x(int i10, int i11, int i12, int i13) {
        return this.f4965a.setPosition(i10, i11, i12, i13);
    }

    @Override // K0.InterfaceC0365q0
    public final void y() {
        RenderNode renderNode = this.f4965a;
        renderNode.setUseCompositingLayer(false, null);
        renderNode.setHasOverlappingRendering(true);
    }

    @Override // K0.InterfaceC0365q0
    public final void z(int i10) {
        this.f4965a.setAmbientShadowColor(i10);
    }
}
