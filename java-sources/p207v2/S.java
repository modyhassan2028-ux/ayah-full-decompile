package p207v2;

import H9.p;
import java.util.ArrayList;
import p120l9.m;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC1367e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23178d;

    public S(ArrayList arrayList, int i10, int i11) {
        this.f23176b = arrayList;
        this.f23177c = i10;
        this.f23178d = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return this.f23176b.equals(s10.f23176b) && this.f23177c == s10.f23177c && this.f23178d == s10.f23178d;
    }

    public final int hashCode() {
        return this.f23176b.hashCode() + this.f23177c + this.f23178d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
        ArrayList arrayList = this.f23176b;
        sb.append(arrayList.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(m.g0(arrayList));
        sb.append("\n                    |   last item: ");
        sb.append(m.n0(arrayList));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.f23177c);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.f23178d);
        sb.append("\n                    |)\n                    |");
        return p.J0(sb.toString());
    }
}
