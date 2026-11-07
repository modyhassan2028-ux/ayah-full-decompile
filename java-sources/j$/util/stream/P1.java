package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class P1 implements Q1, InterfaceC1131k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f18337c;

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

    public P1(LongBinaryOperator longBinaryOperator) {
        this.f18337c = longBinaryOperator;
    }

    @Override // j$.util.stream.Q1
    public final void i(Q1 q10) {
        P1 p10 = (P1) q10;
        if (p10.f18335a) {
            return;
        }
        accept(p10.f18336b);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18335a = true;
        this.f18336b = 0L;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        if (this.f18335a) {
            this.f18335a = false;
            this.f18336b = j;
        } else {
            this.f18336b = this.f18337c.applyAsLong(this.f18336b, j);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f18335a ? j$.util.E.f18051c : new j$.util.E(this.f18336b);
    }
}
