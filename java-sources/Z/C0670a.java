package Z;

/* JADX INFO: renamed from: Z.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0670a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10648a;

    public C0670a(int i10) {
        this.f10648a = i10;
    }

    public final boolean a() {
        return this.f10648a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return p245z2.a.E(sb, this.f10648a, " }");
    }
}
