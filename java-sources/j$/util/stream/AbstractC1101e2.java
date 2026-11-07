package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1101e2 implements InterfaceC1121i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1136l2 f18464a;

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(int i10) {
        AbstractC1184v1.K();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(long j) {
        AbstractC1184v1.L();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC1121i2
    public final /* synthetic */ void n(Double d5) {
        AbstractC1184v1.E(this, d5);
    }

    public AbstractC1101e2(InterfaceC1136l2 interfaceC1136l2) {
        this.f18464a = (InterfaceC1136l2) Objects.requireNonNull(interfaceC1136l2);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public void c(long j) {
        this.f18464a.c(j);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public void end() {
        this.f18464a.end();
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public boolean e() {
        return this.f18464a.e();
    }
}
