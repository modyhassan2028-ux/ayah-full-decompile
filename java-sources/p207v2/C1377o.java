package p207v2;

import H9.p;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Iterator;
import java.util.List;
import p120l9.m;
import p123m2.c;
import p251z9.j;

/* JADX INFO: renamed from: v2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1377o extends AbstractC1379q {
    public static final C1377o g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC1375m f23276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1374l f23280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1374l f23281f;

    static {
        List listK = AbstractC0813f2.K(j0.f23257d);
        C1372j c1372j = C1372j.f23256c;
        C1372j c1372j2 = C1372j.f23255b;
        g = new C1377o(EnumC1375m.f23268r, listK, 0, 0, new C1374l(c1372j, c1372j2, c1372j2), null);
    }

    public C1377o(EnumC1375m enumC1375m, List list, int i10, int i11, C1374l c1374l, C1374l c1374l2) {
        this.f23276a = enumC1375m;
        this.f23277b = list;
        this.f23278c = i10;
        this.f23279d = i11;
        this.f23280e = c1374l;
        this.f23281f = c1374l2;
        if (enumC1375m != EnumC1375m.f23270t && i10 < 0) {
            throw new IllegalArgumentException(c.r(i10, "Prepend insert defining placeholdersBefore must be > 0, but was ").toString());
        }
        if (enumC1375m != EnumC1375m.f23269s && i11 < 0) {
            throw new IllegalArgumentException(c.r(i11, "Append insert defining placeholdersAfter must be > 0, but was ").toString());
        }
        if (enumC1375m == EnumC1375m.f23268r && list.isEmpty()) {
            throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1377o)) {
            return false;
        }
        C1377o c1377o = (C1377o) obj;
        return this.f23276a == c1377o.f23276a && j.a(this.f23277b, c1377o.f23277b) && this.f23278c == c1377o.f23278c && this.f23279d == c1377o.f23279d && j.a(this.f23280e, c1377o.f23280e) && j.a(this.f23281f, c1377o.f23281f);
    }

    public final int hashCode() {
        int iHashCode = (this.f23280e.hashCode() + ((((((this.f23277b.hashCode() + (this.f23276a.hashCode() * 31)) * 31) + this.f23278c) * 31) + this.f23279d) * 31)) * 31;
        C1374l c1374l = this.f23281f;
        return iHashCode + (c1374l == null ? 0 : c1374l.hashCode());
    }

    public final String toString() {
        List list;
        List list2;
        List list3 = this.f23277b;
        Iterator it = list3.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((j0) it.next()).f23259b.size();
        }
        int i10 = this.f23278c;
        String strValueOf = i10 != -1 ? String.valueOf(i10) : "none";
        int i11 = this.f23279d;
        String strValueOf2 = i11 != -1 ? String.valueOf(i11) : "none";
        StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
        sb.append(this.f23276a);
        sb.append(", with ");
        sb.append(size);
        sb.append(" items (\n                    |   first item: ");
        j0 j0Var = (j0) m.g0(list3);
        Object objN0 = null;
        sb.append((j0Var == null || (list2 = j0Var.f23259b) == null) ? null : m.g0(list2));
        sb.append("\n                    |   last item: ");
        j0 j0Var2 = (j0) m.n0(list3);
        if (j0Var2 != null && (list = j0Var2.f23259b) != null) {
            objN0 = m.n0(list);
        }
        sb.append(objN0);
        sb.append("\n                    |   placeholdersBefore: ");
        sb.append(strValueOf);
        sb.append("\n                    |   placeholdersAfter: ");
        sb.append(strValueOf2);
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.f23280e);
        sb.append("\n                    ");
        String string = sb.toString();
        C1374l c1374l = this.f23281f;
        if (c1374l != null) {
            string = string + "|   mediatorLoadStates: " + c1374l + '\n';
        }
        return p.J0(string + "|)");
    }
}
