package D6;

/* JADX INFO: loaded from: classes.dex */
public final class q extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1306a;

    public q(Integer num) {
        this.f1306a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        Integer num = this.f1306a;
        q qVar = (q) ((D) obj);
        if (num == null) {
            return qVar.f1306a == null;
        }
        return num.equals(qVar.f1306a);
    }

    public final int hashCode() {
        Integer num = this.f1306a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f1306a + "}";
    }
}
