package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1135l1 extends C1130k1 implements InterfaceC1193x0 {
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

    @Override // j$.util.stream.InterfaceC1131k2
    public final /* synthetic */ void l(Long l10) {
        AbstractC1184v1.I(this, l10);
    }

    @Override // j$.util.stream.InterfaceC1198y0
    public final /* bridge */ /* synthetic */ G0 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.InterfaceC1193x0, j$.util.stream.InterfaceC1198y0
    public final E0 build() {
        int i10 = this.f18493b;
        long[] jArr = this.f18492a;
        if (i10 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f18493b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        long[] jArr = this.f18492a;
        if (j != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(jArr.length)));
        }
        this.f18493b = 0;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        int i10 = this.f18493b;
        long[] jArr = this.f18492a;
        if (i10 < jArr.length) {
            this.f18493b = i10 + 1;
            jArr[i10] = j;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void end() {
        int i10 = this.f18493b;
        long[] jArr = this.f18492a;
        if (i10 < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f18493b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.C1130k1
    public final String toString() {
        long[] jArr = this.f18492a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f18493b), Arrays.toString(jArr));
    }
}
