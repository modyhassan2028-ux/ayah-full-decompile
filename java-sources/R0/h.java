package R0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p251z9.k f7080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p251z9.k f7081b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(p241y9.a aVar, p241y9.a aVar2) {
        this.f7080a = (p251z9.k) aVar;
        this.f7081b = (p251z9.k) aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y9.a, z9.k] */
    public final p241y9.a a() {
        return this.f7081b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r1v6, types: [y9.a, z9.k] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f7080a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f7081b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
