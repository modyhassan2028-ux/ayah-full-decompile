package R7;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f7388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f7389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f7390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f7391f;
    public final ArrayList g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f7392h = new ArrayList();

    public y() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f3, float f7, float f10, float f11, float f12, float f13) {
        u uVar = new u(f3, f7, f10, f11);
        uVar.f7380f = f12;
        uVar.g = f13;
        this.g.add(uVar);
        s sVar = new s(uVar);
        float f14 = f12 + f13;
        boolean z10 = f13 < 0.0f;
        if (z10) {
            f12 = (f12 + 180.0f) % 360.0f;
        }
        float f15 = z10 ? (180.0f + f14) % 360.0f : f14;
        b(f12);
        this.f7392h.add(sVar);
        this.f7390e = f15;
        double d5 = f14;
        this.f7388c = (((f10 - f3) / 2.0f) * ((float) Math.cos(Math.toRadians(d5)))) + ((f3 + f10) * 0.5f);
        this.f7389d = (((f11 - f7) / 2.0f) * ((float) Math.sin(Math.toRadians(d5)))) + ((f7 + f11) * 0.5f);
    }

    public final void b(float f3) {
        float f7 = this.f7390e;
        if (f7 == f3) {
            return;
        }
        float f10 = ((f3 - f7) + 360.0f) % 360.0f;
        if (f10 > 180.0f) {
            return;
        }
        float f11 = this.f7388c;
        float f12 = this.f7389d;
        u uVar = new u(f11, f12, f11, f12);
        uVar.f7380f = this.f7390e;
        uVar.g = f10;
        this.f7392h.add(new s(uVar));
        this.f7390e = f3;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((w) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void d(float f3, float f7) {
        v vVar = new v();
        vVar.f7381b = f3;
        vVar.f7382c = f7;
        this.g.add(vVar);
        t tVar = new t(vVar, this.f7388c, this.f7389d);
        float fB = tVar.b() + 270.0f;
        float fB2 = tVar.b() + 270.0f;
        b(fB);
        this.f7392h.add(tVar);
        this.f7390e = fB2;
        this.f7388c = f3;
        this.f7389d = f7;
    }

    public final void e(float f3, float f7, float f10, float f11) {
        this.f7386a = f3;
        this.f7387b = f7;
        this.f7388c = f3;
        this.f7389d = f7;
        this.f7390e = f10;
        this.f7391f = (f10 + f11) % 360.0f;
        this.g.clear();
        this.f7392h.clear();
    }
}
