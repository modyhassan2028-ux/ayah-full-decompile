package K;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final V f4547e = new V(-1, null, 0, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f4549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4551d;

    public V(int i10, Boolean bool, int i11, int i12) {
        this.f4548a = i10;
        this.f4549b = bool;
        this.f4550c = i11;
        this.f4551d = i12;
    }

    public final Z0.k a(boolean z10) {
        int i10 = this.f4548a;
        Z0.l lVar = new Z0.l(i10);
        if (i10 == -1) {
            lVar = null;
        }
        int i11 = lVar != null ? lVar.f10935a : 0;
        Boolean bool = this.f4549b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i12 = this.f4550c;
        Z0.m mVar = new Z0.m(i12);
        if (i12 == 0) {
            mVar = null;
        }
        int i13 = mVar != null ? mVar.f10936a : 1;
        int i14 = this.f4551d;
        Z0.j jVar = i14 != -1 ? new Z0.j(i14) : null;
        return new Z0.k(z10, i11, zBooleanValue, i13, jVar != null ? jVar.f10928a : 1, p012b1.c.f13144t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return this.f4548a == v10.f4548a && p251z9.j.a(this.f4549b, v10.f4549b) && this.f4550c == v10.f4550c && this.f4551d == v10.f4551d;
    }

    public final int hashCode() {
        int i10 = this.f4548a * 31;
        Boolean bool = this.f4549b;
        return (((((i10 + (bool != null ? bool.hashCode() : 0)) * 31) + this.f4550c) * 31) + this.f4551d) * 29791;
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) Z0.l.a(this.f4548a)) + ", autoCorrectEnabled=" + this.f4549b + ", keyboardType=" + ((Object) Z0.m.a(this.f4550c)) + ", imeAction=" + ((Object) Z0.j.a(this.f4551d)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
