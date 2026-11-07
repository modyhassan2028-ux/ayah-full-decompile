package D;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f913a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f914b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC0060c f915c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t2 = (T) obj;
        return Float.compare(this.f913a, t2.f913a) == 0 && this.f914b == t2.f914b && p251z9.j.a(this.f915c, t2.f915c);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.f913a) * 31) + (this.f914b ? 1231 : 1237)) * 31;
        AbstractC0060c abstractC0060c = this.f915c;
        return (iFloatToIntBits + (abstractC0060c == null ? 0 : abstractC0060c.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f913a + ", fill=" + this.f914b + ", crossAxisAlignment=" + this.f915c + ", flowLayoutData=null)";
    }
}
