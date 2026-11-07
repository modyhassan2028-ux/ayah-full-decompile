package p207v2;

import H9.p;

/* JADX INFO: loaded from: classes.dex */
public final class P extends AbstractC1367e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23172e;

    public P(int i10, int i11, int i12, int i13) {
        this.f23169b = i10;
        this.f23170c = i11;
        this.f23171d = i12;
        this.f23172e = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return this.f23169b == p10.f23169b && this.f23170c == p10.f23170c && this.f23171d == p10.f23171d && this.f23172e == p10.f23172e;
    }

    public final int hashCode() {
        return this.f23169b + this.f23170c + this.f23171d + this.f23172e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
        int i10 = this.f23170c;
        sb.append(i10);
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.f23169b);
        sb.append("\n                    |   dropCount: ");
        sb.append(i10);
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.f23171d);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.f23172e);
        sb.append("\n                    |)\n                    |");
        return p.J0(sb.toString());
    }
}
