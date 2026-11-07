package p180s0;

import N9.b0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import p171r0.e;
import p251z9.j;

/* JADX INFO: renamed from: s0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1294c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f21818a = AbstractC1295d.f21821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f21819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f21820c;

    @Override // p180s0.o
    public final void a(e eVar) {
        l(eVar.f21389a, eVar.f21390b, eVar.f21391c, eVar.f21392d, 1);
    }

    @Override // p180s0.o
    public final void b(E e10) {
        Canvas canvas = this.f21818a;
        if (!(e10 instanceof C1300i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C1300i) e10).f21829a, Region.Op.INTERSECT);
    }

    @Override // p180s0.o
    public final void c(float f3, float f7, float f10, float f11, float f12, float f13, boolean z10, b0 b0Var) {
        this.f21818a.drawArc(f3, f7, f10, f11, f12, f13, z10, (Paint) b0Var.f6165b);
    }

    @Override // p180s0.o
    public final void d(E e10, b0 b0Var) {
        Canvas canvas = this.f21818a;
        if (!(e10 instanceof C1300i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C1300i) e10).f21829a, (Paint) b0Var.f6165b);
    }

    @Override // p180s0.o
    public final void e(float f3, float f7) {
        this.f21818a.scale(f3, f7);
    }

    @Override // p180s0.o
    public final void f(C1297f c1297f, b0 b0Var) {
        this.f21818a.drawBitmap(AbstractC1298g.a(c1297f), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) b0Var.f6165b);
    }

    @Override // p180s0.o
    public final void g(float f3) {
        this.f21818a.rotate(f3);
    }

    @Override // p180s0.o
    public final void h(float f3, long j, b0 b0Var) {
        this.f21818a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f3, (Paint) b0Var.f6165b);
    }

    @Override // p180s0.o
    public final void i(e eVar, b0 b0Var) {
        this.f21818a.saveLayer(eVar.f21389a, eVar.f21390b, eVar.f21391c, eVar.f21392d, (Paint) b0Var.f6165b, 31);
    }

    @Override // p180s0.o
    public final void j(C1297f c1297f, long j, long j10, long j11, b0 b0Var) {
        if (this.f21819b == null) {
            this.f21819b = new Rect();
            this.f21820c = new Rect();
        }
        Canvas canvas = this.f21818a;
        Bitmap bitmapA = AbstractC1298g.a(c1297f);
        Rect rect = this.f21819b;
        j.b(rect);
        int i10 = (int) (j >> 32);
        rect.left = i10;
        int i11 = (int) (j & 4294967295L);
        rect.top = i11;
        rect.right = i10 + ((int) (j10 >> 32));
        rect.bottom = i11 + ((int) (j10 & 4294967295L));
        Rect rect2 = this.f21820c;
        j.b(rect2);
        int i12 = (int) 0;
        rect2.left = i12;
        int i13 = (int) 0;
        rect2.top = i13;
        rect2.right = i12 + ((int) (j11 >> 32));
        rect2.bottom = i13 + ((int) (4294967295L & j11));
        canvas.drawBitmap(bitmapA, rect, rect2, (Paint) b0Var.f6165b);
    }

    @Override // p180s0.o
    public final void k(float f3, float f7, float f10, float f11, float f12, float f13, b0 b0Var) {
        this.f21818a.drawRoundRect(f3, f7, f10, f11, f12, f13, (Paint) b0Var.f6165b);
    }

    @Override // p180s0.o
    public final void l(float f3, float f7, float f10, float f11, int i10) {
        this.f21818a.clipRect(f3, f7, f10, f11, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p180s0.o
    public final void m(float f3, float f7) {
        this.f21818a.translate(f3, f7);
    }

    @Override // p180s0.o
    public final void n() {
        this.f21818a.restore();
    }

    @Override // p180s0.o
    public final void o(float f3, float f7, float f10, float f11, b0 b0Var) {
        this.f21818a.drawRect(f3, f7, f10, f11, (Paint) b0Var.f6165b);
    }

    @Override // p180s0.o
    public final void p(long j, long j10, b0 b0Var) {
        this.f21818a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), (Paint) b0Var.f6165b);
    }

    @Override // p180s0.o
    public final void q() {
        this.f21818a.save();
    }

    @Override // p180s0.o
    public final void r() {
        F.m(this.f21818a, false);
    }

    @Override // p180s0.o
    public final void s(float[] fArr) {
        if (F.n(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        F.p(matrix, fArr);
        this.f21818a.concat(matrix);
    }

    @Override // p180s0.o
    public final void t() {
        F.m(this.f21818a, true);
    }
}
