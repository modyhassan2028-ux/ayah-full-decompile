package p207v2;

import H9.p;
import java.util.ArrayList;
import p120l9.m;

/* JADX INFO: loaded from: classes.dex */
public final class O extends AbstractC1367e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23168e;

    public O(int i10, ArrayList arrayList, int i11, int i12) {
        this.f23165b = i10;
        this.f23166c = arrayList;
        this.f23167d = i11;
        this.f23168e = i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return this.f23165b == o10.f23165b && this.f23166c.equals(o10.f23166c) && this.f23167d == o10.f23167d && this.f23168e == o10.f23168e;
    }

    public final int hashCode() {
        return this.f23166c.hashCode() + this.f23165b + this.f23167d + this.f23168e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
        ArrayList arrayList = this.f23166c;
        sb.append(arrayList.size());
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.f23165b);
        sb.append("\n                    |   first item: ");
        sb.append(m.g0(arrayList));
        sb.append("\n                    |   last item: ");
        sb.append(m.n0(arrayList));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.f23167d);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.f23168e);
        sb.append("\n                    |)\n                    |");
        return p.J0(sb.toString());
    }
}
