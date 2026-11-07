package Z9;

/* JADX INFO: loaded from: classes.dex */
public final class m extends w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f11056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f11057s;

    public m(String str, boolean z10) {
        p251z9.j.e(str, "body");
        this.f11056r = z10;
        this.f11057s = str.toString();
    }

    @Override // Z9.w
    public final String b() {
        return this.f11057s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f11056r == mVar.f11056r && p251z9.j.a(this.f11057s, mVar.f11057s);
    }

    public final int hashCode() {
        return this.f11057s.hashCode() + ((this.f11056r ? 1231 : 1237) * 31);
    }

    @Override // Z9.w
    public final String toString() {
        boolean z10 = this.f11056r;
        String str = this.f11057s;
        if (!z10) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        p009aa.p.a(str, sb);
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }
}
