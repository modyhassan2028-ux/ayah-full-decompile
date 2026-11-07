package K9;

/* JADX INFO: loaded from: classes.dex */
public abstract class O implements Runnable, Comparable, J {
    private volatile Object _heap;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f5330r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5331s = -1;

    public O(long j) {
        this.f5330r = j;
    }

    @Override // K9.J
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                P9.t tVar = AbstractC0405x.f5409b;
                if (obj == tVar) {
                    return;
                }
                P p10 = obj instanceof P ? (P) obj : null;
                if (p10 != null) {
                    p10.b(this);
                }
                this._heap = tVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final P9.x b() {
        Object obj = this._heap;
        if (obj instanceof P9.x) {
            return (P9.x) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f5330r - ((O) obj).f5330r;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final int d(long j, P p10, Q q10) {
        synchronized (this) {
            if (this._heap == AbstractC0405x.f5409b) {
                return 2;
            }
            synchronized (p10) {
                try {
                    O[] oArr = p10.f6812a;
                    O o10 = oArr != null ? oArr[0] : null;
                    if (Q.f5335z.get(q10) == 1) {
                        return 1;
                    }
                    if (o10 == null) {
                        p10.f5332c = j;
                    } else {
                        long j10 = o10.f5330r;
                        if (j10 - j < 0) {
                            j = j10;
                        }
                        if (j - p10.f5332c > 0) {
                            p10.f5332c = j;
                        }
                    }
                    long j11 = this.f5330r;
                    long j12 = p10.f5332c;
                    if (j11 - j12 < 0) {
                        this.f5330r = j12;
                    }
                    p10.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(P p10) {
        if (this._heap == AbstractC0405x.f5409b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = p10;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f5330r + ']';
    }
}
