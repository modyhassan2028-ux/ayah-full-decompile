package Da;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f1341d = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1344c;

    public A a() {
        this.f1342a = false;
        return this;
    }

    public A b() {
        this.f1344c = 0L;
        return this;
    }

    public long c() {
        if (this.f1342a) {
            return this.f1343b;
        }
        throw new IllegalStateException("No deadline");
    }

    public A d(long j) {
        this.f1342a = true;
        this.f1343b = j;
        return this;
    }

    public boolean e() {
        return this.f1342a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f1342a && this.f1343b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public A g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        p251z9.j.e(timeUnit, "unit");
        if (j >= 0) {
            this.f1344c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }
}
