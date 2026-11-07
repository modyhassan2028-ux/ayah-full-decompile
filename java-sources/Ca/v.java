package Ca;

import java.math.BigInteger;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f865f;
    public final u g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f867i;
    public final List j;

    public v(long j, BigInteger bigInteger, d dVar, List list, w wVar, List list2, u uVar, k kVar, k kVar2, List list3) {
        p251z9.j.e(list, "issuer");
        p251z9.j.e(list2, "subject");
        p251z9.j.e(uVar, "subjectPublicKeyInfo");
        this.f860a = j;
        this.f861b = bigInteger;
        this.f862c = dVar;
        this.f863d = list;
        this.f864e = wVar;
        this.f865f = list2;
        this.g = uVar;
        this.f866h = kVar;
        this.f867i = kVar2;
        this.j = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f860a == vVar.f860a && p251z9.j.a(this.f861b, vVar.f861b) && p251z9.j.a(this.f862c, vVar.f862c) && p251z9.j.a(this.f863d, vVar.f863d) && p251z9.j.a(this.f864e, vVar.f864e) && p251z9.j.a(this.f865f, vVar.f865f) && p251z9.j.a(this.g, vVar.g) && p251z9.j.a(this.f866h, vVar.f866h) && p251z9.j.a(this.f867i, vVar.f867i) && p251z9.j.a(this.j, vVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f865f.hashCode() + ((this.f864e.hashCode() + ((this.f863d.hashCode() + ((this.f862c.hashCode() + ((this.f861b.hashCode() + (((int) this.f860a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        k kVar = this.f866h;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        k kVar2 = this.f867i;
        return this.j.hashCode() + ((iHashCode2 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TbsCertificate(version=" + this.f860a + ", serialNumber=" + this.f861b + ", signature=" + this.f862c + ", issuer=" + this.f863d + ", validity=" + this.f864e + ", subject=" + this.f865f + ", subjectPublicKeyInfo=" + this.g + ", issuerUniqueID=" + this.f866h + ", subjectUniqueID=" + this.f867i + ", extensions=" + this.j + ')';
    }
}
