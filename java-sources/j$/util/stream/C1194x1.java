package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1194x1 extends R1 implements Q1, InterfaceC1131k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f18582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjLongConsumer f18583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1143n f18584d;

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
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC1131k2
    public final /* synthetic */ void l(Long l10) {
        AbstractC1184v1.I(this, l10);
    }

    @Override // j$.util.stream.Q1
    public final void i(Q1 q10) {
        this.f18344a = this.f18584d.apply(this.f18344a, ((C1194x1) q10).f18344a);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18344a = this.f18582b.get();
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        this.f18583c.accept(this.f18344a, j);
    }

    public C1194x1(Supplier supplier, ObjLongConsumer objLongConsumer, C1143n c1143n) {
        this.f18582b = supplier;
        this.f18583c = objLongConsumer;
        this.f18584d = c1143n;
    }
}
