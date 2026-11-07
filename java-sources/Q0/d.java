package Q0;

import A.C0029l;
import A.M0;
import I1.C0249e;
import K9.A;
import K9.AbstractC0405x;
import K9.k0;
import R0.p;
import Z.C0672b;
import Z.C0681f0;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.function.Consumer;
import p063g1.k;
import p110k9.y;
import p180s0.F;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f6833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f6834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0249e f6835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AndroidComposeView f6836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P9.d f6837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f6838f;

    public d(p pVar, k kVar, P9.d dVar, C0249e c0249e, AndroidComposeView androidComposeView) {
        this.f6833a = pVar;
        this.f6834b = kVar;
        this.f6835c = c0249e;
        this.f6836d = androidComposeView;
        this.f6837e = AbstractC0405x.z(dVar, e.f6839r);
        this.f6838f = new g(kVar.b(), new c(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(d dVar, ScrollCaptureSession scrollCaptureSession, k kVar, q9.c cVar) {
        a aVar;
        int i10;
        int i11;
        d dVar2;
        int i12;
        ScrollCaptureSession scrollCaptureSession2;
        int i13;
        int iL;
        int iL2;
        int i14;
        int i15;
        Canvas canvasLockHardwareCanvas;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i16 = aVar.f6824y;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                aVar.f6824y = i16 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar, cVar);
            }
        } else {
            aVar = new a(dVar, cVar);
        }
        Object obj = aVar.f6822w;
        int i17 = aVar.f6824y;
        p161p9.a aVar2 = p161p9.a.f21156r;
        if (i17 == 0) {
            p110k9.a.e(obj);
            i10 = kVar.f16257b;
            i11 = kVar.f16259d;
            g gVar = dVar.f6838f;
            aVar.f6817r = dVar;
            aVar.f6818s = scrollCaptureSession;
            aVar.f6819t = kVar;
            aVar.f6820u = i10;
            aVar.f6821v = i11;
            aVar.f6824y = 1;
            int i18 = gVar.f6844a;
            if (i10 > i11) {
                throw new IllegalArgumentException(android.support.v4.media.session.p.w(i10, i11, "Expected min=", " ≤ max=").toString());
            }
            int i19 = i11 - i10;
            if (i19 > i18) {
                throw new IllegalArgumentException(android.support.v4.media.session.p.w(i19, i18, "Expected range (", ") to be ≤ viewportSize=").toString());
            }
            float f3 = i10;
            float f7 = gVar.f6845b;
            Object obj2 = y.f19095a;
            if (f3 < f7 || i11 > i18 + f7) {
                Object objB = gVar.b((f3 < f7 ? i10 : i11 - i18) - f7, aVar);
                if (objB != aVar2) {
                    objB = obj2;
                }
                if (objB == aVar2) {
                    obj2 = objB;
                }
            }
            if (obj2 != aVar2) {
            }
            return aVar2;
        }
        if (i17 == 1) {
            int i20 = aVar.f6821v;
            int i21 = aVar.f6820u;
            kVar = aVar.f6819t;
            ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) aVar.f6818s;
            d dVar3 = aVar.f6817r;
            p110k9.a.e(obj);
            i10 = i21;
            scrollCaptureSession = scrollCaptureSession3;
            i11 = i20;
            dVar = dVar3;
        } else {
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = aVar.f6821v;
            i13 = aVar.f6820u;
            kVar = aVar.f6819t;
            scrollCaptureSession2 = (ScrollCaptureSession) aVar.f6818s;
            dVar2 = aVar.f6817r;
            p110k9.a.e(obj);
        }
        g gVar2 = dVar2.f6838f;
        iL = B0.c.l(i13 - B9.a.V(gVar2.f6845b), 0, gVar2.f6844a);
        g gVar3 = dVar2.f6838f;
        iL2 = B0.c.l(i12 - B9.a.V(gVar3.f6845b), 0, gVar3.f6844a);
        i14 = kVar.f16256a;
        i15 = kVar.f16258c;
        if (iL == iL2) {
            return k.f16255e;
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i14, -iL);
            k kVar2 = dVar2.f6834b;
            canvasLockHardwareCanvas.translate(-kVar2.f16256a, -kVar2.f16257b);
            dVar2.f6836d.getRootView().draw(canvasLockHardwareCanvas);
            int iV = B9.a.V(dVar2.f6838f.f6845b);
            return new k(i14, iL + iV, i15, iL2 + iV);
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        b bVar = b.f6825s;
        aVar.f6817r = dVar;
        aVar.f6818s = scrollCaptureSession;
        aVar.f6819t = kVar;
        aVar.f6820u = i10;
        aVar.f6821v = i11;
        aVar.f6824y = 2;
        if (C0672b.p(aVar.getContext()).b0(bVar, aVar) != aVar2) {
            dVar2 = dVar;
            i12 = i11;
            scrollCaptureSession2 = scrollCaptureSession;
            i13 = i10;
            g gVar4 = dVar2.f6838f;
            iL = B0.c.l(i13 - B9.a.V(gVar4.f6845b), 0, gVar4.f6844a);
            g gVar5 = dVar2.f6838f;
            iL2 = B0.c.l(i12 - B9.a.V(gVar5.f6845b), 0, gVar5.f6844a);
            i14 = kVar.f16256a;
            i15 = kVar.f16258c;
            if (iL == iL2) {
                return k.f16255e;
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i14, -iL);
            k kVar3 = dVar2.f6834b;
            canvasLockHardwareCanvas.translate(-kVar3.f16256a, -kVar3.f16257b);
            dVar2.f6836d.getRootView().draw(canvasLockHardwareCanvas);
            int iV2 = B9.a.V(dVar2.f6838f.f6845b);
            return new k(i14, iL + iV2, i15, iL2 + iV2);
        }
        return aVar2;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC0405x.x(this.f6837e, k0.f5377s, new O9.y(this, runnable, null, 2), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        A aX = AbstractC0405x.x(this.f6837e, null, new C0029l(this, scrollCaptureSession, rect, consumer, null, 5), 3);
        aX.s(new M0(20, cancellationSignal));
        cancellationSignal.setOnCancelListener(new M.i(1, aX));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.n(F.r(this.f6834b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f6838f.f6845b = 0.0f;
        ((C0681f0) this.f6835c.f3724b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
