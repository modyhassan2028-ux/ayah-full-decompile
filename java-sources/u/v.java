package u;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f22765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22766b;

    public v(int i10) {
        this.f22765a = i10 == 0 ? AbstractC1359n.f22739a : new long[i10];
    }

    public final void a(long j) {
        int i10 = this.f22766b + 1;
        long[] jArr = this.f22765a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            p251z9.j.d(jArrCopyOf, "copyOf(...)");
            this.f22765a = jArrCopyOf;
        }
        long[] jArr2 = this.f22765a;
        int i11 = this.f22766b;
        jArr2[i11] = j;
        this.f22766b = i11 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            int i10 = vVar.f22766b;
            int i11 = this.f22766b;
            if (i10 == i11) {
                long[] jArr = this.f22765a;
                long[] jArr2 = vVar.f22765a;
                E9.d dVarI0 = B0.c.i0(0, i11);
                int i12 = dVarI0.f1995r;
                int i13 = dVarI0.f1996s;
                if (i12 > i13) {
                    return true;
                }
                while (jArr[i12] == jArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f22765a;
        int i10 = this.f22766b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            long j = jArr[i12];
            i11 += ((int) (j ^ (j >>> 32))) * 31;
        }
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f22765a;
        int i10 = this.f22766b;
        for (int i11 = 0; i11 < i10; i11++) {
            long j = jArr[i11];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                p251z9.j.d(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        p251z9.j.d(string2, "toString(...)");
        return string2;
    }
}
