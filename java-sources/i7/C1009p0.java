package i7;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: i7.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1009p0 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f17502r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f17503s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f17504t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1014r0 f17505u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1009p0(C1014r0 c1014r0, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.f17505u = c1014r0;
        long andIncrement = C1014r0.f17530B.getAndIncrement();
        this.f17502r = andIncrement;
        this.f17504t = str;
        this.f17503s = z10;
        if (andIncrement == Long.MAX_VALUE) {
            X x9 = ((C1023u0) c1014r0.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17182w.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1009p0 c1009p0 = (C1009p0) obj;
        boolean z10 = c1009p0.f17503s;
        boolean z11 = this.f17503s;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j = c1009p0.f17502r;
        long j10 = this.f17502r;
        if (j10 < j) {
            return -1;
        }
        if (j10 > j) {
            return 1;
        }
        X x9 = ((C1023u0) this.f17505u.f16104r).f17584w;
        C1023u0.m(x9);
        x9.f17183x.b(Long.valueOf(j10), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        X x9 = ((C1023u0) this.f17505u.f16104r).f17584w;
        C1023u0.m(x9);
        x9.f17182w.b(th, this.f17504t);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1009p0(C1014r0 c1014r0, Callable callable, boolean z10) {
        super(callable);
        this.f17505u = c1014r0;
        long andIncrement = C1014r0.f17530B.getAndIncrement();
        this.f17502r = andIncrement;
        this.f17504t = "Task exception on worker thread";
        this.f17503s = z10;
        if (andIncrement == Long.MAX_VALUE) {
            X x9 = ((C1023u0) c1014r0.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17182w.a("Tasks index overflow");
        }
    }
}
