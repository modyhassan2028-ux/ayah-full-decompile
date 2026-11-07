package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class P implements E3, F3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18334a;

    public /* synthetic */ void accept(double d5) {
        AbstractC1184v1.D();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        AbstractC1184v1.K();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC1184v1.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void end() {
    }

    public P(boolean z10) {
        this.f18334a = z10;
    }

    @Override // j$.util.stream.E3
    public final int w() {
        if (this.f18334a) {
            return 0;
        }
        return Y2.f18409r;
    }

    public final void a(AbstractC1184v1 abstractC1184v1, Spliterator spliterator) {
        if (this.f18334a) {
            new Q(abstractC1184v1, spliterator, this).invoke();
        } else {
            new S(abstractC1184v1, spliterator, abstractC1184v1.F0(this)).invoke();
        }
    }
}
