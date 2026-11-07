package K0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import p180s0.C1294c;

/* JADX INFO: loaded from: classes.dex */
public final class M0 implements InterfaceC0365q0 {
    public static boolean g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f4958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4963f;

    public M0(AndroidComposeView androidComposeView) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f4958a = renderNodeCreate;
        if (g) {
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
                T0.c(renderNodeCreate, T0.a(renderNodeCreate));
                T0.d(renderNodeCreate, T0.b(renderNodeCreate));
            }
            if (i10 >= 24) {
                S0.a(renderNodeCreate);
            } else {
                R0.a(renderNodeCreate);
            }
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            g = false;
        }
    }

    @Override // K0.InterfaceC0365q0
    public final void A(float f3) {
        this.f4958a.setPivotY(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void B(float f3) {
        this.f4958a.setElevation(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void C(p180s0.p pVar, p180s0.E e10, P0 p10) {
        Canvas canvasStart = this.f4958a.start(b(), a());
        C1294c c1294c = pVar.f21838a;
        Canvas canvas = c1294c.f21818a;
        c1294c.f21818a = canvasStart;
        if (e10 != null) {
            c1294c.q();
            c1294c.b(e10);
        }
        p10.e(c1294c);
        if (e10 != null) {
            c1294c.n();
        }
        pVar.f21838a.f21818a = canvas;
        this.f4958a.end(canvasStart);
    }

    @Override // K0.InterfaceC0365q0
    public final int D() {
        return this.f4961d;
    }

    @Override // K0.InterfaceC0365q0
    public final boolean E() {
        return this.f4958a.getClipToOutline();
    }

    @Override // K0.InterfaceC0365q0
    public final void F(int i10) {
        this.f4960c += i10;
        this.f4962e += i10;
        this.f4958a.offsetTopAndBottom(i10);
    }

    @Override // K0.InterfaceC0365q0
    public final void G(boolean z10) {
        this.f4958a.setClipToOutline(z10);
    }

    @Override // K0.InterfaceC0365q0
    public final void H(Outline outline) {
        this.f4958a.setOutline(outline);
    }

    @Override // K0.InterfaceC0365q0
    public final void I(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            T0.d(this.f4958a, i10);
        }
    }

    @Override // K0.InterfaceC0365q0
    public final boolean J() {
        return this.f4958a.setHasOverlappingRendering(true);
    }

    @Override // K0.InterfaceC0365q0
    public final void K(Matrix matrix) {
        this.f4958a.getMatrix(matrix);
    }

    @Override // K0.InterfaceC0365q0
    public final float L() {
        return this.f4958a.getElevation();
    }

    @Override // K0.InterfaceC0365q0
    public final int a() {
        return this.f4962e - this.f4960c;
    }

    @Override // K0.InterfaceC0365q0
    public final int b() {
        return this.f4961d - this.f4959b;
    }

    @Override // K0.InterfaceC0365q0
    public final float c() {
        return this.f4958a.getAlpha();
    }

    @Override // K0.InterfaceC0365q0
    public final void d() {
        this.f4958a.setRotationX(0.0f);
    }

    @Override // K0.InterfaceC0365q0
    public final void e(float f3) {
        this.f4958a.setAlpha(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void f(float f3) {
        this.f4958a.setRotation(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void g() {
        this.f4958a.setRotationY(0.0f);
    }

    @Override // K0.InterfaceC0365q0
    public final void h(float f3) {
        this.f4958a.setTranslationY(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void i(float f3) {
        this.f4958a.setScaleX(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void j() {
        if (Build.VERSION.SDK_INT >= 24) {
            S0.a(this.f4958a);
        } else {
            R0.a(this.f4958a);
        }
    }

    @Override // K0.InterfaceC0365q0
    public final void k(float f3) {
        this.f4958a.setTranslationX(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void l(float f3) {
        this.f4958a.setScaleY(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void m(float f3) {
        this.f4958a.setCameraDistance(-f3);
    }

    @Override // K0.InterfaceC0365q0
    public final boolean n() {
        return this.f4958a.isValid();
    }

    @Override // K0.InterfaceC0365q0
    public final void o(int i10) {
        this.f4959b += i10;
        this.f4961d += i10;
        this.f4958a.offsetLeftAndRight(i10);
    }

    @Override // K0.InterfaceC0365q0
    public final int p() {
        return this.f4962e;
    }

    @Override // K0.InterfaceC0365q0
    public final boolean q() {
        return this.f4963f;
    }

    @Override // K0.InterfaceC0365q0
    public final void s(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f4958a);
    }

    @Override // K0.InterfaceC0365q0
    public final int t() {
        return this.f4960c;
    }

    @Override // K0.InterfaceC0365q0
    public final int u() {
        return this.f4959b;
    }

    @Override // K0.InterfaceC0365q0
    public final void v(float f3) {
        this.f4958a.setPivotX(f3);
    }

    @Override // K0.InterfaceC0365q0
    public final void w(boolean z10) {
        this.f4963f = z10;
        this.f4958a.setClipToBounds(z10);
    }

    @Override // K0.InterfaceC0365q0
    public final boolean x(int i10, int i11, int i12, int i13) {
        this.f4959b = i10;
        this.f4960c = i11;
        this.f4961d = i12;
        this.f4962e = i13;
        return this.f4958a.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // K0.InterfaceC0365q0
    public final void y() {
        this.f4958a.setLayerType(0);
        this.f4958a.setHasOverlappingRendering(true);
    }

    @Override // K0.InterfaceC0365q0
    public final void z(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            T0.c(this.f4958a, i10);
        }
    }

    @Override // K0.InterfaceC0365q0
    public final void r() {
    }
}
