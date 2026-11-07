package p185s8;

import java.util.List;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public final class J extends N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f22214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22215f;
    public final v0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M0 f22216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L0 f22217i;
    public final w0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f22218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f22219l;

    public J(String str, String str2, String str3, long j, Long l10, boolean z10, v0 v0Var, M0 m10, L0 l11, w0 w0Var, List list, int i10) {
        this.f22210a = str;
        this.f22211b = str2;
        this.f22212c = str3;
        this.f22213d = j;
        this.f22214e = l10;
        this.f22215f = z10;
        this.g = v0Var;
        this.f22216h = m10;
        this.f22217i = l11;
        this.j = w0Var;
        this.f22218k = list;
        this.f22219l = i10;
    }

    @Override // p185s8.N0
    public final I a() {
        I i10 = new I();
        i10.f22199a = this.f22210a;
        i10.f22200b = this.f22211b;
        i10.f22201c = this.f22212c;
        i10.f22202d = this.f22213d;
        i10.f22203e = this.f22214e;
        i10.f22204f = this.f22215f;
        i10.g = this.g;
        i10.f22205h = this.f22216h;
        i10.f22206i = this.f22217i;
        i10.j = this.j;
        i10.f22207k = this.f22218k;
        i10.f22208l = this.f22219l;
        i10.f22209m = (byte) 7;
        return i10;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l10;
        M0 m10;
        L0 l11;
        w0 w0Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof N0) {
            J j = (J) ((N0) obj);
            List list2 = j.f22218k;
            w0 w0Var2 = j.j;
            L0 l12 = j.f22217i;
            M0 m11 = j.f22216h;
            Long l13 = j.f22214e;
            String str2 = j.f22212c;
            if (this.f22210a.equals(j.f22210a) && this.f22211b.equals(j.f22211b) && ((str = this.f22212c) != null ? str.equals(str2) : str2 == null) && this.f22213d == j.f22213d && ((l10 = this.f22214e) != null ? l10.equals(l13) : l13 == null) && this.f22215f == j.f22215f && this.g.equals(j.g) && ((m10 = this.f22216h) != null ? m10.equals(m11) : m11 == null) && ((l11 = this.f22217i) != null ? l11.equals(l12) : l12 == null) && ((w0Var = this.j) != null ? w0Var.equals(w0Var2) : w0Var2 == null) && ((list = this.f22218k) != null ? list.equals(list2) : list2 == null) && this.f22219l == j.f22219l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f22210a.hashCode() ^ 1000003) * 1000003) ^ this.f22211b.hashCode()) * 1000003;
        String str = this.f22212c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.f22213d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l10 = this.f22214e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f22215f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        M0 m10 = this.f22216h;
        int iHashCode4 = (iHashCode3 ^ (m10 == null ? 0 : m10.hashCode())) * 1000003;
        L0 l11 = this.f22217i;
        int iHashCode5 = (iHashCode4 ^ (l11 == null ? 0 : l11.hashCode())) * 1000003;
        w0 w0Var = this.j;
        int iHashCode6 = (iHashCode5 ^ (w0Var == null ? 0 : w0Var.hashCode())) * 1000003;
        List list = this.f22218k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f22219l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f22210a);
        sb.append(", identifier=");
        sb.append(this.f22211b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f22212c);
        sb.append(", startedAt=");
        sb.append(this.f22213d);
        sb.append(", endedAt=");
        sb.append(this.f22214e);
        sb.append(", crashed=");
        sb.append(this.f22215f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.f22216h);
        sb.append(", os=");
        sb.append(this.f22217i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.f22218k);
        sb.append(", generatorType=");
        return a.E(sb, this.f22219l, "}");
    }
}
