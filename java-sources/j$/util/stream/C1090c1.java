package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1090c1 extends C1085b1 implements InterfaceC1188w0 {
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
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
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

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1198y0
    public final /* bridge */ /* synthetic */ G0 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.InterfaceC1188w0, j$.util.stream.InterfaceC1198y0
    public final C0 build() {
        int i10 = this.f18444b;
        int[] iArr = this.f18443a;
        if (i10 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f18444b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        int[] iArr = this.f18443a;
        if (j != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(iArr.length)));
        }
        this.f18444b = 0;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        int i11 = this.f18444b;
        int[] iArr = this.f18443a;
        if (i11 < iArr.length) {
            this.f18444b = i11 + 1;
            iArr[i11] = i10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void end() {
        int i10 = this.f18444b;
        int[] iArr = this.f18443a;
        if (i10 < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f18444b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.C1085b1
    public final String toString() {
        int[] iArr = this.f18443a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f18444b), Arrays.toString(iArr));
    }
}
