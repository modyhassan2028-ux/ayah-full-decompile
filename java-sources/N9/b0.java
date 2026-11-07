package N9;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Arrays;
import p180s0.AbstractC1293b;
import p180s0.AbstractC1299h;
import p180s0.C1303l;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6167d;

    public b0(p173r2.j jVar, int i10) {
        this.f6165b = jVar.f21446w;
        this.f6164a = i10;
        p197u2.d dVar = jVar.f21448y;
        this.f6166c = dVar.a();
        Bundle bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
        this.f6167d = bundleP;
        dVar.f22832h.J(bundleP);
    }

    public int a() {
        Paint.Cap strokeCap = ((Paint) this.f6165b).getStrokeCap();
        int i10 = strokeCap == null ? -1 : AbstractC1299h.f21827a[strokeCap.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int b() {
        Paint.Join strokeJoin = ((Paint) this.f6165b).getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : AbstractC1299h.f21828b[strokeJoin.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 2;
    }

    public void c(float f3) {
        ((Paint) this.f6165b).setAlpha((int) Math.rint(f3 * 255.0f));
    }

    public void d(int i10) {
        if (this.f6164a == i10) {
            return;
        }
        this.f6164a = i10;
        Paint paint = (Paint) this.f6165b;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1293b.c(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC1293b.e(i10)));
        }
    }

    public void e(long j) {
        ((Paint) this.f6165b).setColor(p180s0.F.u(j));
    }

    public void f(C1303l c1303l) {
        this.f6167d = c1303l;
        ((Paint) this.f6165b).setColorFilter(c1303l != null ? c1303l.f21834a : null);
    }

    public void g(int i10) {
        ((Paint) this.f6165b).setFilterBitmap(!(i10 == 0));
    }

    public void h(Shader shader) {
        this.f6166c = shader;
        ((Paint) this.f6165b).setShader(shader);
    }

    public void i(int i10) {
        Paint.Cap cap;
        Paint paint = (Paint) this.f6165b;
        if (i10 == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i10 == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i10 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void j(int i10) {
        Paint.Join join;
        Paint paint = (Paint) this.f6165b;
        if (i10 == 0) {
            join = Paint.Join.MITER;
        } else if (i10 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i10 == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void k(float f3) {
        ((Paint) this.f6165b).setStrokeWidth(f3);
    }

    public void l(int i10) {
        ((Paint) this.f6165b).setStyle(i10 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public b0(Paint paint) {
        this.f6165b = paint;
        this.f6164a = 3;
    }

    public b0(Bundle bundle) {
        p251z9.j.e(bundle, "state");
        String string = bundle.getString("nav-entry-state:id");
        if (string != null) {
            this.f6165b = string;
            this.f6164a = B9.a.C("nav-entry-state:destination-id", bundle);
            this.f6166c = B9.a.F("nav-entry-state:args", bundle);
            this.f6167d = B9.a.F("nav-entry-state:saved-state", bundle);
            return;
        }
        F9.n.J("nav-entry-state:id");
        throw null;
    }

    public b0(int i10, M9.a aVar, InterfaceC0415h interfaceC0415h, p150o9.h hVar) {
        this.f6165b = interfaceC0415h;
        this.f6164a = i10;
        this.f6166c = aVar;
        this.f6167d = hVar;
    }
}
