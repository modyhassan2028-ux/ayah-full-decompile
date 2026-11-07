package p084i;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static F f16512e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16513a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16516d;

    public /* synthetic */ F() {
    }

    public static void c(F f3, long j, long j10, int i10) {
        if ((i10 & 1) != 0) {
            j = 0;
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        synchronized (f3) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j10 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j11 = f3.f16515c + j;
                f3.f16515c = j11;
                long j12 = f3.f16516d + j10;
                f3.f16516d = j12;
                if (j12 > j11) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(double d5, double d9, long j) {
        float f3 = (j - 946728000000L) / 8.64E7f;
        float f7 = (0.01720197f * f3) + 6.24006f;
        double d10 = f7;
        double dSin = (Math.sin(f7 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f7) * 3.4906598739326E-4d) + (Math.sin(d10) * 0.03341960161924362d) + d10 + 1.796593063d + 3.141592653589793d;
        double d11 = (-d9) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d10) * 0.0053d) + ((double) (Math.round(((double) (f3 - 9.0E-4f)) - d11) + 9.0E-4f)) + d11;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d12 = 0.01745329238474369d * d5;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d12))) / (Math.cos(dAsin) * Math.cos(d12));
        if (dSin3 >= 1.0d) {
            this.f16514b = 1;
            this.f16515c = -1L;
            this.f16516d = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f16514b = 0;
                this.f16515c = -1L;
                this.f16516d = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f16515c = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f16516d = jRound;
            if (jRound >= j || this.f16515c <= j) {
                this.f16514b = 1;
            } else {
                this.f16514b = 0;
            }
        }
    }

    public synchronized long b() {
        return this.f16515c - this.f16516d;
    }

    public String toString() {
        switch (this.f16513a) {
            case 1:
                return "WindowCounter(streamId=" + this.f16514b + ", total=" + this.f16515c + ", acknowledged=" + this.f16516d + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public F(int i10) {
        this.f16514b = i10;
    }
}
