package L8;

import J8.k;
import U6.C0532j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f5574d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f5575e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f5576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5578c;

    public d() {
        if (C0532j.f8279t == null) {
            Pattern pattern = k.f4411c;
            C0532j.f8279t = new C0532j(11);
        }
        C0532j c0532j = C0532j.f8279t;
        if (k.f4412d == null) {
            k.f4412d = new k(c0532j);
        }
        this.f5576a = k.f4412d;
    }

    public final synchronized long a(int i10) {
        try {
            if (!(i10 == 429 || (i10 >= 500 && i10 < 600))) {
                return f5574d;
            }
            double dPow = Math.pow(2.0d, this.f5578c);
            this.f5576a.getClass();
            return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f5575e);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final synchronized boolean b() {
        boolean z10;
        if (this.f5578c != 0) {
            this.f5576a.f4413a.getClass();
            if (System.currentTimeMillis() > this.f5577b) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        return z10;
    }

    public final synchronized void c() {
        this.f5578c = 0;
    }

    public final synchronized void d(int i10) {
        try {
            if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
                c();
                return;
            }
            this.f5578c++;
            long jA = a(i10);
            this.f5576a.f4413a.getClass();
            this.f5577b = System.currentTimeMillis() + jA;
        } catch (Throwable th) {
            throw th;
        }
    }
}
