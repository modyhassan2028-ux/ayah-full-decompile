package p232y;

import A.EnumC0047u0;
import B9.a;
import D0.O;
import I1.n0;
import J0.AbstractC0291n;
import J0.InterfaceC0293p;
import J0.K;
import N7.f;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import p063g1.c;
import p063g1.m;
import p074h0.i;
import p151p.V;
import p180s0.AbstractC1295d;
import p180s0.C1294c;
import p180s0.o;
import p196u0.b;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends AbstractC0291n implements InterfaceC0293p {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C1452f f24566H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C1470y f24567I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public RenderNode f24568J;

    public l0(O o10, C1452f c1452f, C1470y c1470y) {
        this.f24566H = c1452f;
        this.f24567I = c1470y;
        v0(o10);
    }

    public static boolean y0(float f3, EdgeEffect edgeEffect, Canvas canvas) {
        if (f3 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f3);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // J0.InterfaceC0293p
    public final /* synthetic */ void Y() {
    }

    @Override // J0.InterfaceC0293p
    public final void r(K k7) {
        i iVar;
        boolean zY0;
        boolean z10;
        char c10;
        float f3;
        b bVar = k7.f3942r;
        long jV = bVar.f22795s.v();
        C1452f c1452f = this.f24566H;
        c1452f.i(jV);
        Canvas canvasA = AbstractC1295d.a(bVar.f22795s.p());
        c1452f.f24506d.getValue();
        i iVar2 = bVar.f22795s;
        if (p171r0.i.e(iVar2.v())) {
            k7.a();
            return;
        }
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        C1470y c1470y = this.f24567I;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = c1470y.f24601d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = c1470y.f24602e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = c1470y.f24603f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = c1470y.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = c1470y.f24604h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = c1470y.f24605i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = c1470y.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = c1470y.f24606k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            k7.a();
            return;
        }
        float fW = k7.w(r.f24583a);
        boolean z11 = C1470y.f(c1470y.f24601d) || C1470y.g(c1470y.f24604h) || C1470y.f(c1470y.f24602e) || C1470y.g(c1470y.f24605i);
        boolean z12 = C1470y.f(c1470y.f24603f) || C1470y.g(c1470y.j) || C1470y.f(c1470y.g) || C1470y.g(c1470y.f24606k);
        if (z11 && z12) {
            z0().setPosition(0, 0, canvasA.getWidth(), canvasA.getHeight());
        } else if (z11) {
            z0().setPosition(0, 0, (a.V(fW) * 2) + canvasA.getWidth(), canvasA.getHeight());
        } else {
            if (!z12) {
                k7.a();
                return;
            }
            z0().setPosition(0, 0, canvasA.getWidth(), (a.V(fW) * 2) + canvasA.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = z0().beginRecording();
        boolean zG = C1470y.g(c1470y.j);
        EnumC0047u0 enumC0047u0 = EnumC0047u0.f425s;
        if (zG) {
            EdgeEffect edgeEffectA = c1470y.j;
            if (edgeEffectA == null) {
                edgeEffectA = c1470y.a(enumC0047u0);
                c1470y.j = edgeEffectA;
            }
            y0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (C1470y.f(c1470y.f24603f)) {
            EdgeEffect edgeEffectC = c1470y.c();
            zY0 = y0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (C1470y.g(c1470y.f24603f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c1452f.c() & 4294967295L));
                EdgeEffect edgeEffectA2 = c1470y.j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = c1470y.a(enumC0047u0);
                    c1470y.j = edgeEffectA2;
                }
                int i10 = Build.VERSION.SDK_INT;
                float fD = i10 >= 31 ? f.d(edgeEffectC) : 0.0f;
                iVar = iVar2;
                float f7 = 1 - fIntBitsToFloat;
                if (i10 >= 31) {
                    f.g(edgeEffectA2, fD, f7);
                } else {
                    edgeEffectA2.onPull(fD, f7);
                }
            } else {
                iVar = iVar2;
            }
        } else {
            iVar = iVar2;
            zY0 = false;
        }
        boolean zG2 = C1470y.g(c1470y.f24604h);
        EnumC0047u0 enumC0047u1 = EnumC0047u0.f424r;
        if (zG2) {
            EdgeEffect edgeEffectA3 = c1470y.f24604h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = c1470y.a(enumC0047u1);
                c1470y.f24604h = edgeEffectA3;
            }
            y0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (C1470y.f(c1470y.f24601d)) {
            EdgeEffect edgeEffectE = c1470y.e();
            boolean z13 = y0(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zY0;
            if (C1470y.g(c1470y.f24601d)) {
                z10 = z12;
                c10 = ' ';
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1452f.c() >> 32));
                EdgeEffect edgeEffectA4 = c1470y.f24604h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = c1470y.a(enumC0047u1);
                    c1470y.f24604h = edgeEffectA4;
                }
                int i11 = Build.VERSION.SDK_INT;
                float fD2 = i11 >= 31 ? f.d(edgeEffectE) : 0.0f;
                if (i11 >= 31) {
                    f.g(edgeEffectA4, fD2, fIntBitsToFloat2);
                } else {
                    edgeEffectA4.onPull(fD2, fIntBitsToFloat2);
                }
            } else {
                c1452f = c1452f;
                z10 = z12;
                c10 = ' ';
            }
            zY0 = z13;
        } else {
            c1452f = c1452f;
            z10 = z12;
            c10 = ' ';
        }
        if (C1470y.g(c1470y.f24606k)) {
            EdgeEffect edgeEffectA5 = c1470y.f24606k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = c1470y.a(enumC0047u0);
                c1470y.f24606k = edgeEffectA5;
            }
            y0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (C1470y.f(c1470y.g)) {
            EdgeEffect edgeEffectD = c1470y.d();
            boolean z14 = y0(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zY0;
            if (C1470y.g(c1470y.g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c1452f.c() & 4294967295L));
                EdgeEffect edgeEffectA6 = c1470y.f24606k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = c1470y.a(enumC0047u0);
                    c1470y.f24606k = edgeEffectA6;
                }
                int i12 = Build.VERSION.SDK_INT;
                float fD3 = i12 >= 31 ? f.d(edgeEffectD) : 0.0f;
                if (i12 >= 31) {
                    f.g(edgeEffectA6, fD3, fIntBitsToFloat3);
                } else {
                    edgeEffectA6.onPull(fD3, fIntBitsToFloat3);
                }
            }
            zY0 = z14;
        }
        if (C1470y.g(c1470y.f24605i)) {
            EdgeEffect edgeEffectA7 = c1470y.f24605i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = c1470y.a(enumC0047u1);
                c1470y.f24605i = edgeEffectA7;
            }
            f3 = 0.0f;
            y0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        } else {
            f3 = 0.0f;
        }
        if (C1470y.f(c1470y.f24602e)) {
            EdgeEffect edgeEffectB = c1470y.b();
            boolean z15 = y0(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zY0;
            if (C1470y.g(c1470y.f24602e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c1452f.c() >> c10));
                EdgeEffect edgeEffectA8 = c1470y.f24605i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = c1470y.a(enumC0047u1);
                    c1470y.f24605i = edgeEffectA8;
                }
                int i13 = Build.VERSION.SDK_INT;
                float fD4 = i13 >= 31 ? f.d(edgeEffectB) : f3;
                float f10 = 1 - fIntBitsToFloat4;
                if (i13 >= 31) {
                    f.g(edgeEffectA8, fD4, f10);
                } else {
                    edgeEffectA8.onPull(fD4, f10);
                }
            }
            zY0 = z15;
        }
        if (zY0) {
            c1452f.d();
        }
        float f11 = z10 ? f3 : fW;
        if (z11) {
            fW = f3;
        }
        m layoutDirection = k7.getLayoutDirection();
        C1294c c1294c = new C1294c();
        c1294c.f21818a = recordingCanvasBeginRecording;
        long jV2 = iVar.v();
        i iVar3 = bVar.f22795s;
        p196u0.a aVar = ((b) iVar3.f16424u).f22794r;
        c cVar = aVar.f22790a;
        m mVar = aVar.f22791b;
        o oVarP = iVar3.p();
        long jV3 = bVar.f22795s.v();
        i iVar4 = bVar.f22795s;
        p205v0.b bVar2 = (p205v0.b) iVar4.f16423t;
        iVar4.H(k7);
        iVar4.I(layoutDirection);
        iVar4.G(c1294c);
        iVar4.J(jV2);
        iVar4.f16423t = null;
        c1294c.q();
        try {
            ((V) bVar.f22795s.f16422s).x(f11, fW);
            try {
                k7.a();
                float f12 = -f11;
                float f13 = -fW;
                ((V) bVar.f22795s.f16422s).x(f12, f13);
                c1294c.n();
                i iVar5 = bVar.f22795s;
                iVar5.H(cVar);
                iVar5.I(mVar);
                iVar5.G(oVarP);
                iVar5.J(jV3);
                iVar5.f16423t = bVar2;
                z0().endRecording();
                int iSave = canvasA.save();
                canvasA.translate(f12, f13);
                canvasA.drawRenderNode(z0());
                canvasA.restoreToCount(iSave);
            } catch (Throwable th) {
                ((V) bVar.f22795s.f16422s).x(-f11, -fW);
                throw th;
            }
        } catch (Throwable th2) {
            c1294c.n();
            i iVar6 = bVar.f22795s;
            iVar6.H(cVar);
            iVar6.I(mVar);
            iVar6.G(oVarP);
            iVar6.J(jV3);
            iVar6.f16423t = bVar2;
            throw th2;
        }
    }

    public final RenderNode z0() {
        RenderNode renderNode = this.f24568J;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeG = n0.g();
        this.f24568J = renderNodeG;
        return renderNodeG;
    }
}
