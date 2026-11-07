package p180s0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import p171r0.e;
import p251z9.j;

/* JADX INFO: renamed from: s0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1300i implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f21829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f21830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f21831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f21832d;

    public C1300i(Path path) {
        this.f21829a = path;
    }

    public final e a() {
        if (this.f21830b == null) {
            this.f21830b = new RectF();
        }
        RectF rectF = this.f21830b;
        j.b(rectF);
        this.f21829a.computeBounds(rectF, true);
        return new e(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean b(E e10, E e11, int i10) {
        Path.Op op;
        if (i10 == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i10 == 1) {
            op = Path.Op.INTERSECT;
        } else if (i10 == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i10 == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(e10 instanceof C1300i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C1300i) e10).f21829a;
        if (e11 instanceof C1300i) {
            return this.f21829a.op(path, ((C1300i) e11).f21829a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void c() {
        this.f21829a.reset();
    }
}
