package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q0 extends I0 implements F0 {
    @Override // j$.util.stream.G0
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC1184v1.M(this, intFunction);
    }

    @Override // j$.util.stream.F0
    public final void g(Object obj) {
        ((F0) this.f18276a).g(obj);
        ((F0) this.f18277b).g(obj);
    }

    @Override // j$.util.stream.F0
    public final void f(int i10, Object obj) {
        G0 g10 = this.f18276a;
        ((F0) g10).f(i10, obj);
        ((F0) this.f18277b).f(i10 + ((int) ((F0) g10).count()), obj);
    }

    @Override // j$.util.stream.F0
    public final Object b() {
        long j = this.f18278c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) j);
        f(0, objNewArray);
        return objNewArray;
    }

    public final String toString() {
        long j = this.f18278c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f18276a, this.f18277b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
