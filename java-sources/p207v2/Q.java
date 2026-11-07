package p207v2;

import H9.p;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC1367e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23175d;

    public Q(int i10, int i11, int i12) {
        this.f23173b = i10;
        this.f23174c = i11;
        this.f23175d = i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return this.f23173b == q10.f23173b && this.f23174c == q10.f23174c && this.f23175d == q10.f23175d;
    }

    public final int hashCode() {
        return this.f23173b + this.f23174c + this.f23175d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
        int i10 = this.f23173b;
        sb.append(i10);
        sb.append(" items (\n                    |   dropCount: ");
        sb.append(i10);
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.f23174c);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.f23175d);
        sb.append("\n                    |)\n                    |");
        return p.J0(sb.toString());
    }
}
