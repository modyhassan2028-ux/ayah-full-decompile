package p024c3;

import W.C0557f1;
import java.math.BigInteger;
import p110k9.a;
import p110k9.o;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e f13454w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13455r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f13456s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f13457t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f13458u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o f13459v = a.d(new C0557f1(10, this));

    static {
        new e(0, 0, 0, "");
        f13454w = new e(0, 1, 0, "");
        new e(1, 0, 0, "");
    }

    public e(int i10, int i11, int i12, String str) {
        this.f13455r = i10;
        this.f13456s = i11;
        this.f13457t = i12;
        this.f13458u = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        j.e(eVar, "other");
        Object value = this.f13459v.getValue();
        j.d(value, "<get-bigInteger>(...)");
        Object value2 = eVar.f13459v.getValue();
        j.d(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f13455r == eVar.f13455r && this.f13456s == eVar.f13456s && this.f13457t == eVar.f13457t;
    }

    public final int hashCode() {
        return ((((527 + this.f13455r) * 31) + this.f13456s) * 31) + this.f13457t;
    }

    public final String toString() {
        String str = this.f13458u;
        String strJ = !H9.o.e1(str) ? j.j(str, "-") : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13455r);
        sb.append('.');
        sb.append(this.f13456s);
        sb.append('.');
        return p245z2.a.E(sb, this.f13457t, strJ);
    }
}
