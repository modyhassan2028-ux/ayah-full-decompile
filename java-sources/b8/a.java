package b8;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f13327r = new a();

    @Override // b8.b
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // b8.b
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
