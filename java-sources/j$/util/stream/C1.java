package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public final class C1 extends AbstractC1184v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18233h;

    public /* synthetic */ C1(int i10) {
        this.f18233h = i10;
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final Q1 D0() {
        switch (this.f18233h) {
            case 0:
                return new U1();
            case 1:
                return new S1();
            case 2:
                return new V1();
            default:
                return new T1();
        }
    }

    @Override // j$.util.stream.AbstractC1184v1, j$.util.stream.E3
    public final Object f(AbstractC1078a abstractC1078a, Spliterator spliterator) {
        switch (this.f18233h) {
            case 0:
                return Y2.SIZED.v(abstractC1078a.f18426m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.f(abstractC1078a, spliterator);
            case 1:
                return Y2.SIZED.v(abstractC1078a.f18426m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.f(abstractC1078a, spliterator);
            case 2:
                return Y2.SIZED.v(abstractC1078a.f18426m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.f(abstractC1078a, spliterator);
            default:
                return Y2.SIZED.v(abstractC1078a.f18426m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.f(abstractC1078a, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC1184v1, j$.util.stream.E3
    public final Object j(AbstractC1184v1 abstractC1184v1, Spliterator spliterator) {
        switch (this.f18233h) {
            case 0:
                return Y2.SIZED.v(((AbstractC1078a) abstractC1184v1).f18426m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.j(abstractC1184v1, spliterator);
            case 1:
                return Y2.SIZED.v(((AbstractC1078a) abstractC1184v1).f18426m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.j(abstractC1184v1, spliterator);
            case 2:
                return Y2.SIZED.v(((AbstractC1078a) abstractC1184v1).f18426m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.j(abstractC1184v1, spliterator);
            default:
                return Y2.SIZED.v(((AbstractC1078a) abstractC1184v1).f18426m) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.j(abstractC1184v1, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC1184v1, j$.util.stream.E3
    public final int w() {
        switch (this.f18233h) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return Y2.f18409r;
    }
}
