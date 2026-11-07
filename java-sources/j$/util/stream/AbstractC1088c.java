package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1088c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f18449d;

    public abstract void clear();

    public AbstractC1088c() {
        this.f18446a = 4;
    }

    public AbstractC1088c(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i10);
        }
        this.f18446a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i10 - 1));
    }

    public final long count() {
        int i10 = this.f18448c;
        if (i10 == 0) {
            return this.f18447b;
        }
        return this.f18449d[i10] + ((long) this.f18447b);
    }
}
