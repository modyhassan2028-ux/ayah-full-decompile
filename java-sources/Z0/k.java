package Z0;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final k g = new k(false, 0, true, 1, 1, p012b1.c.f13144t);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p012b1.c f10934f;

    public k(boolean z10, int i10, boolean z11, int i11, int i12, p012b1.c cVar) {
        this.f10929a = z10;
        this.f10930b = i10;
        this.f10931c = z11;
        this.f10932d = i11;
        this.f10933e = i12;
        this.f10934f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f10929a == kVar.f10929a && this.f10930b == kVar.f10930b && this.f10931c == kVar.f10931c && this.f10932d == kVar.f10932d && this.f10933e == kVar.f10933e && p251z9.j.a(this.f10934f, kVar.f10934f);
    }

    public final int hashCode() {
        return this.f10934f.f13145r.hashCode() + ((((((((((this.f10929a ? 1231 : 1237) * 31) + this.f10930b) * 31) + (this.f10931c ? 1231 : 1237)) * 31) + this.f10932d) * 31) + this.f10933e) * 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f10929a + ", capitalization=" + ((Object) l.a(this.f10930b)) + ", autoCorrect=" + this.f10931c + ", keyboardType=" + ((Object) m.a(this.f10932d)) + ", imeAction=" + ((Object) j.a(this.f10933e)) + ", platformImeOptions=null, hintLocales=" + this.f10934f + ')';
    }
}
