package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1111g2 implements InterfaceC1131k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1136l2 f18471a;

    @Override // j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d5) {
        AbstractC1184v1.D();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(int i10) {
        AbstractC1184v1.K();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1131k2
    public final /* synthetic */ void l(Long l10) {
        AbstractC1184v1.I(this, l10);
    }

    public AbstractC1111g2(InterfaceC1136l2 interfaceC1136l2) {
        this.f18471a = (InterfaceC1136l2) Objects.requireNonNull(interfaceC1136l2);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public void c(long j) {
        this.f18471a.c(j);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public void end() {
        this.f18471a.end();
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public boolean e() {
        return this.f18471a.e();
    }
}
