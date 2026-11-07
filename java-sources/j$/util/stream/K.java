package j$.util.stream;

import j$.util.C1066g;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class K implements IntFunction, LongFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IntFunction f18299a;

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        Object objApply = this.f18299a.apply(i10);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        C1066g.a(objApply.getClass(), "java.util.stream.IntStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return AbstractC1184v1.Z(j, this.f18299a);
    }
}
