package p185s8;

import java.util.List;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f22255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f22258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D0 f22259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f22260f;
    public final int g;

    public Q(S s10, List list, List list2, Boolean bool, D0 d1, List list3, int i10) {
        this.f22255a = s10;
        this.f22256b = list;
        this.f22257c = list2;
        this.f22258d = bool;
        this.f22259e = d1;
        this.f22260f = list3;
        this.g = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        Q q10 = (Q) ((E0) obj);
        List list = q10.f22260f;
        D0 d1 = q10.f22259e;
        Boolean bool = q10.f22258d;
        List list2 = q10.f22257c;
        List list3 = q10.f22256b;
        if (!this.f22255a.equals(q10.f22255a)) {
            return false;
        }
        List list4 = this.f22256b;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        List list5 = this.f22257c;
        if (list5 == null) {
            if (list2 != null) {
                return false;
            }
        } else if (!list5.equals(list2)) {
            return false;
        }
        Boolean bool2 = this.f22258d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        D0 d5 = this.f22259e;
        if (d5 == null) {
            if (d1 != null) {
                return false;
            }
        } else if (!d5.equals(d1)) {
            return false;
        }
        List list6 = this.f22260f;
        if (list6 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list6.equals(list)) {
            return false;
        }
        return this.g == q10.g;
    }

    public final int hashCode() {
        int iHashCode = (this.f22255a.hashCode() ^ 1000003) * 1000003;
        List list = this.f22256b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f22257c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f22258d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        D0 d1 = this.f22259e;
        int iHashCode5 = (iHashCode4 ^ (d1 == null ? 0 : d1.hashCode())) * 1000003;
        List list3 = this.f22260f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f22255a);
        sb.append(", customAttributes=");
        sb.append(this.f22256b);
        sb.append(", internalKeys=");
        sb.append(this.f22257c);
        sb.append(", background=");
        sb.append(this.f22258d);
        sb.append(", currentProcessDetails=");
        sb.append(this.f22259e);
        sb.append(", appProcessDetails=");
        sb.append(this.f22260f);
        sb.append(", uiOrientation=");
        return a.E(sb, this.g, "}");
    }
}
