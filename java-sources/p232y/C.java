package p232y;

import B9.a;
import D.P;
import D0.O;
import J0.AbstractC0291n;
import J0.InterfaceC0293p;
import J0.K;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import p171r0.i;
import p180s0.AbstractC1295d;
import p196u0.b;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0291n implements InterfaceC0293p {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C1452f f24413H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C1470y f24414I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final P f24415J;

    public C(O o10, C1452f c1452f, C1470y c1470y, P p10) {
        this.f24413H = c1452f;
        this.f24414I = c1470y;
        this.f24415J = p10;
        v0(o10);
    }

    public static boolean y0(float f3, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f3);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // J0.InterfaceC0293p
    public final /* synthetic */ void Y() {
    }

    @Override // J0.InterfaceC0293p
    public final void r(K k7) {
        boolean zY0;
        long j;
        b bVar = k7.f3942r;
        long jV = bVar.f22795s.v();
        C1452f c1452f = this.f24413H;
        c1452f.i(jV);
        if (i.e(bVar.f22795s.v())) {
            k7.a();
            return;
        }
        k7.a();
        c1452f.f24506d.getValue();
        Canvas canvasA = AbstractC1295d.a(bVar.f22795s.p());
        C1470y c1470y = this.f24414I;
        boolean zF = C1470y.f(c1470y.f24603f);
        P p10 = this.f24415J;
        if (zF) {
            zY0 = y0(270.0f, (((long) Float.floatToRawIntBits(k7.w(p10.a(k7.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (k7.b() & 4294967295L)))) << 32), c1470y.c(), canvasA);
        } else {
            zY0 = false;
        }
        if (C1470y.f(c1470y.f24601d)) {
            j = 4294967295L;
            zY0 = y0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(k7.w(p10.f909b))) & 4294967295L), c1470y.e(), canvasA) || zY0;
        } else {
            j = 4294967295L;
        }
        if (C1470y.f(c1470y.g)) {
            zY0 = y0(90.0f, (((long) Float.floatToRawIntBits(k7.w(p10.b(k7.getLayoutDirection())) + (-((float) a.V(Float.intBitsToFloat((int) (k7.b() >> 32))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << 32), c1470y.d(), canvasA) || zY0;
        }
        if (C1470y.f(c1470y.f24602e)) {
            EdgeEffect edgeEffectB = c1470y.b();
            zY0 = y0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (k7.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (k7.b() & j))) + k7.w(p10.f911d))) & j), edgeEffectB, canvasA) || zY0;
        }
        if (zY0) {
            c1452f.d();
        }
    }
}
