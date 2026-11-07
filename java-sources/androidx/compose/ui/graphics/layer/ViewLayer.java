package androidx.compose.ui.graphics.layer;

import K0.d1;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import p063g1.c;
import p063g1.m;
import p074h0.i;
import p180s0.C1294c;
import p180s0.o;
import p180s0.p;
import p205v0.a;
import p205v0.b;
import p205v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer extends View {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final d1 f11954B = new d1(3);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public b f11955A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DrawChildContainer f11956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f11957s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p196u0.b f11958t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11959u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Outline f11960v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11961w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f11962x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m f11963y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p241y9.c f11964z;

    public ViewLayer(DrawChildContainer drawChildContainer, p pVar, p196u0.b bVar) {
        super(drawChildContainer.getContext());
        this.f11956r = drawChildContainer;
        this.f11957s = pVar;
        this.f11958t = bVar;
        setOutlineProvider(f11954B);
        this.f11961w = true;
        this.f11962x = p196u0.c.f22798a;
        this.f11963y = m.f16261r;
        d.f23027a.getClass();
        this.f11964z = a.f23002t;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        p pVar = this.f11957s;
        C1294c c1294c = pVar.f21838a;
        Canvas canvas2 = c1294c.f21818a;
        c1294c.f21818a = canvas;
        c cVar = this.f11962x;
        m mVar = this.f11963y;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar = this.f11955A;
        p241y9.c cVar2 = this.f11964z;
        p196u0.b bVar2 = this.f11958t;
        i iVar = bVar2.f22795s;
        p196u0.a aVar = ((p196u0.b) iVar.f16424u).f22794r;
        c cVar3 = aVar.f22790a;
        m mVar2 = aVar.f22791b;
        o oVarP = iVar.p();
        i iVar2 = bVar2.f22795s;
        long jV = iVar2.v();
        b bVar3 = (b) iVar2.f16423t;
        iVar2.H(cVar);
        iVar2.I(mVar);
        iVar2.G(c1294c);
        iVar2.J(jFloatToRawIntBits);
        iVar2.f16423t = bVar;
        c1294c.q();
        try {
            cVar2.e(bVar2);
            c1294c.n();
            iVar2.H(cVar3);
            iVar2.I(mVar2);
            iVar2.G(oVarP);
            iVar2.J(jV);
            iVar2.f16423t = bVar3;
            pVar.f21838a.f21818a = canvas2;
            this.f11959u = false;
        } catch (Throwable th) {
            c1294c.n();
            iVar2.H(cVar3);
            iVar2.I(mVar2);
            iVar2.G(oVarP);
            iVar2.J(jV);
            iVar2.f16423t = bVar3;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f11961w;
    }

    public final p getCanvasHolder() {
        return this.f11957s;
    }

    public final View getOwnerView() {
        return this.f11956r;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f11961w;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f11959u) {
            return;
        }
        this.f11959u = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.f11961w != z10) {
            this.f11961w = z10;
            invalidate();
        }
    }

    public final void setDrawParams(c cVar, m mVar, b bVar, p241y9.c cVar2) {
        this.f11962x = cVar;
        this.f11963y = mVar;
        this.f11964z = cVar2;
        this.f11955A = bVar;
    }

    public final void setInvalidated(boolean z10) {
        this.f11959u = z10;
    }
}
