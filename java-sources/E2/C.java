package E2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f1455v = new ThreadLocal();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0140p f1456w = new C0140p(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f1458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f1459t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f1457r = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f1460u = new ArrayList();

    public static F0 c(RecyclerView recyclerView, int i10, long j) {
        int iZ = recyclerView.f12918w.z();
        for (int i11 = 0; i11 < iZ; i11++) {
            F0 f0P = RecyclerView.P(recyclerView.f12918w.y(i11));
            if (f0P.f1488c == i10 && !f0P.g()) {
                return null;
            }
        }
        u0 u0Var = recyclerView.f12912t;
        if (j == Long.MAX_VALUE) {
            try {
                if (E1.i.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.Y(false);
                Trace.endSection();
            }
        }
        recyclerView.X();
        F0 f0K = u0Var.k(j, i10);
        if (f0K != null) {
            if (!f0K.f() || f0K.g()) {
                u0Var.a(f0K, false);
            } else {
                u0Var.h(f0K.f1486a);
            }
        }
        return f0K;
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.f12873J) {
            if (RecyclerView.f12846T0 && !this.f1457r.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f1458s == 0) {
                this.f1458s = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        A a9 = recyclerView.f12921x0;
        a9.f1434b = i10;
        a9.f1435c = i11;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    public final void b(long j) {
        B b5;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        B b10;
        ArrayList arrayList = this.f1457r;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i12);
            int windowVisibility = recyclerView3.getWindowVisibility();
            A a9 = recyclerView3.f12921x0;
            if (windowVisibility == 0) {
                a9.e(recyclerView3, false);
                i11 += a9.f1436d;
            }
        }
        ArrayList arrayList2 = this.f1460u;
        arrayList2.ensureCapacity(i11);
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                A a10 = recyclerView4.f12921x0;
                int iAbs = Math.abs(a10.f1435c) + Math.abs(a10.f1434b);
                for (int i15 = i10; i15 < a10.f1436d * 2; i15 += 2) {
                    if (i14 >= arrayList2.size()) {
                        b10 = new B();
                        arrayList2.add(b10);
                    } else {
                        b10 = (B) arrayList2.get(i14);
                    }
                    int[] iArr = (int[]) a10.f1437e;
                    int i16 = iArr[i15 + 1];
                    b10.f1438a = i16 <= iAbs;
                    b10.f1439b = iAbs;
                    b10.f1440c = i16;
                    b10.f1441d = recyclerView4;
                    b10.f1442e = iArr[i15];
                    i14++;
                }
            }
            i13++;
            i10 = 0;
        }
        Collections.sort(arrayList2, f1456w);
        for (int i17 = 0; i17 < arrayList2.size() && (recyclerView = (b5 = (B) arrayList2.get(i17)).f1441d) != null; i17++) {
            F0 f0C = c(recyclerView, b5.f1442e, b5.f1438a ? Long.MAX_VALUE : j);
            if (f0C != null && f0C.f1487b != null && f0C.f() && !f0C.g() && (recyclerView2 = (RecyclerView) f0C.f1487b.get()) != null) {
                if (recyclerView2.U && recyclerView2.f12918w.z() != 0) {
                    u0 u0Var = recyclerView2.f12912t;
                    AbstractC0129j0 abstractC0129j0 = recyclerView2.f12897g0;
                    if (abstractC0129j0 != null) {
                        abstractC0129j0.e();
                    }
                    AbstractC0135m0 abstractC0135m0 = recyclerView2.f12863E;
                    if (abstractC0135m0 != null) {
                        abstractC0135m0.l0(u0Var);
                        recyclerView2.f12863E.m0(u0Var);
                    }
                    u0Var.f1778a.clear();
                    u0Var.f();
                }
                A a11 = recyclerView2.f12921x0;
                a11.e(recyclerView2, true);
                if (a11.f1436d != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        B0 b11 = recyclerView2.f12923y0;
                        AbstractC0115c0 abstractC0115c0 = recyclerView2.f12861D;
                        b11.f1446d = 1;
                        b11.f1447e = abstractC0115c0.a();
                        b11.g = false;
                        b11.f1449h = false;
                        b11.f1450i = false;
                        for (int i18 = 0; i18 < a11.f1436d * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) a11.f1437e)[i18], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            b5.f1438a = false;
            b5.f1439b = 0;
            b5.f1440c = 0;
            b5.f1441d = null;
            b5.f1442e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f1457r;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f1459t);
                }
            }
        } finally {
            this.f1458s = 0L;
            Trace.endSection();
        }
    }
}
