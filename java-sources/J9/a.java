package J9;

import java.io.Serializable;
import p185s8.u0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable, Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f4414t = new a(0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f4415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f4416s;

    public a(long j, long j10) {
        this.f4415r = j;
        this.f4416s = j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        j.e(aVar, "other");
        long j = aVar.f4415r;
        long j10 = this.f4415r;
        if (j10 != j) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f4416s ^ Long.MIN_VALUE, aVar.f4416s ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4415r == aVar.f4415r && this.f4416s == aVar.f4416s;
    }

    public final int hashCode() {
        long j = this.f4415r ^ this.f4416s;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        u0.q(this.f4415r, bArr, 0, 0, 4);
        bArr[8] = 45;
        u0.q(this.f4415r, bArr, 9, 4, 6);
        bArr[13] = 45;
        u0.q(this.f4415r, bArr, 14, 6, 8);
        bArr[18] = 45;
        u0.q(this.f4416s, bArr, 19, 0, 2);
        bArr[23] = 45;
        u0.q(this.f4416s, bArr, 24, 2, 8);
        return new String(bArr, H9.a.f3610a);
    }
}
