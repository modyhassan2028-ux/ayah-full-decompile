package b8;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f13328r;

    public c(Object obj) {
        this.f13328r = obj;
    }

    @Override // b8.b
    public final Object a() {
        return this.f13328r;
    }

    @Override // b8.b
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f13328r.equals(((c) obj).f13328r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13328r.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13328r);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
