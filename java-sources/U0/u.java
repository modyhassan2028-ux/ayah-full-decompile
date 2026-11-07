package U0;

/* JADX INFO: loaded from: classes.dex */
public final class u implements InterfaceC0510b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p055f1.r f8127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f8128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p055f1.i f8129f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p055f1.t f8131i;

    public u(int i10, int i11, long j, p055f1.r rVar, w wVar, p055f1.i iVar, int i12, int i13, p055f1.t tVar) {
        this.f8124a = i10;
        this.f8125b = i11;
        this.f8126c = j;
        this.f8127d = rVar;
        this.f8128e = wVar;
        this.f8129f = iVar;
        this.g = i12;
        this.f8130h = i13;
        this.f8131i = tVar;
        if (p063g1.o.a(j, p063g1.o.f16266c) || p063g1.o.c(j) >= 0.0f) {
            return;
        }
        p002a1.a.b("lineHeight can't be negative (" + p063g1.o.c(j) + ')');
    }

    public final u a(u uVar) {
        return uVar == null ? this : v.a(this, uVar.f8124a, uVar.f8125b, uVar.f8126c, uVar.f8127d, uVar.f8128e, uVar.f8129f, uVar.g, uVar.f8130h, uVar.f8131i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f8124a == uVar.f8124a && this.f8125b == uVar.f8125b && p063g1.o.a(this.f8126c, uVar.f8126c) && p251z9.j.a(this.f8127d, uVar.f8127d) && p251z9.j.a(this.f8128e, uVar.f8128e) && p251z9.j.a(this.f8129f, uVar.f8129f) && this.g == uVar.g && this.f8130h == uVar.f8130h && p251z9.j.a(this.f8131i, uVar.f8131i);
    }

    public final int hashCode() {
        int iD = (p063g1.o.d(this.f8126c) + (((this.f8124a * 31) + this.f8125b) * 31)) * 31;
        p055f1.r rVar = this.f8127d;
        int iHashCode = (iD + (rVar != null ? rVar.hashCode() : 0)) * 31;
        w wVar = this.f8128e;
        int iHashCode2 = (iHashCode + (wVar != null ? wVar.hashCode() : 0)) * 31;
        p055f1.i iVar = this.f8129f;
        int iHashCode3 = (((((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.g) * 31) + this.f8130h) * 31;
        p055f1.t tVar = this.f8131i;
        return iHashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) p055f1.k.a(this.f8124a)) + ", textDirection=" + ((Object) p055f1.m.a(this.f8125b)) + ", lineHeight=" + ((Object) p063g1.o.e(this.f8126c)) + ", textIndent=" + this.f8127d + ", platformStyle=" + this.f8128e + ", lineHeightStyle=" + this.f8129f + ", lineBreak=" + ((Object) p055f1.e.a(this.g)) + ", hyphens=" + ((Object) p055f1.d.a(this.f8130h)) + ", textMotion=" + this.f8131i + ')';
    }
}
