package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1106f2 implements InterfaceC1126j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1136l2 f18469a;

    @Override // j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d5) {
        AbstractC1184v1.D();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(long j) {
        AbstractC1184v1.L();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC1126j2
    public final /* synthetic */ void d(Integer num) {
        AbstractC1184v1.G(this, num);
    }

    public AbstractC1106f2(InterfaceC1136l2 interfaceC1136l2) {
        this.f18469a = (InterfaceC1136l2) Objects.requireNonNull(interfaceC1136l2);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public void c(long j) {
        this.f18469a.c(j);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public void end() {
        this.f18469a.end();
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public boolean e() {
        return this.f18469a.e();
    }
}
