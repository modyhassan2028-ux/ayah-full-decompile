package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class V1 extends W1 {
    @Override // j$.util.stream.R1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f18385b);
    }

    @Override // j$.util.stream.Q1
    public final void i(Q1 q10) {
        this.f18385b += ((W1) q10).f18385b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f18385b++;
    }
}
