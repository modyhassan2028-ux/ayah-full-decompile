package p003a2;

import M7.i;
import M7.j;
import W2.l;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f11134p = new c(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f11135q = new c(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f11136r = new c(3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f11137s = new c(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f11138t = new c(5);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f11139u = new c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f11140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f11141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f11143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f11144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11145f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f11146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11147i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f11148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f11149l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f11150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f11151n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11152o;

    public e(j jVar) {
        i iVar = j.f5778H;
        this.f11140a = 0.0f;
        this.f11141b = Float.MAX_VALUE;
        this.f11142c = false;
        this.f11145f = false;
        this.g = Float.MAX_VALUE;
        this.f11146h = -3.4028235E38f;
        this.f11147i = 0L;
        this.f11148k = new ArrayList();
        this.f11149l = new ArrayList();
        this.f11143d = jVar;
        this.f11144e = iVar;
        if (iVar == f11136r || iVar == f11137s || iVar == f11138t) {
            this.j = 0.1f;
        } else if (iVar == f11139u || iVar == f11134p || iVar == f11135q) {
            this.j = 0.00390625f;
        } else {
            this.j = 1.0f;
        }
        this.f11150m = null;
        this.f11151n = Float.MAX_VALUE;
        this.f11152o = false;
    }

    public final void a(float f3) {
        this.f11144e.P(this.f11143d, f3);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11149l;
            if (i10 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i10) != null) {
                ((l) arrayList.get(i10)).getClass();
                throw null;
            }
            i10++;
        }
    }

    public final void b() {
        if (this.f11150m.f11154b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f11145f) {
            this.f11152o = true;
        }
    }
}
