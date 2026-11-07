package Da;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class e extends A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f1353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static e f1354i;
    public static final ReentrantLock j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Condition f1355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f1356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f1357m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1359f = -1;
    public long g;

    static {
        r rVar = new r((char) 0, 0);
        rVar.f1388t = new e[8];
        f1353h = rVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        p251z9.j.d(conditionNewCondition, "newCondition(...)");
        f1355k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f1356l = millis;
        f1357m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j10 = this.f1344c;
        boolean z10 = this.f1342a;
        if (j10 != 0 || z10) {
            ReentrantLock reentrantLock = j;
            reentrantLock.lock();
            try {
                if (this.f1358e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f1358e = 1;
                H8.e.l(this, j10, z10);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            int i10 = this.f1358e;
            this.f1358e = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f1353h.p(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
