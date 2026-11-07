package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1080a1 extends J0 implements InterfaceC1198y0 {
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

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(long j) {
        AbstractC1184v1.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1198y0
    public final G0 build() {
        int i10 = this.f18292b;
        Object[] objArr = this.f18291a;
        if (i10 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f18292b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        Object[] objArr = this.f18291a;
        if (j != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(objArr.length)));
        }
        this.f18292b = 0;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        int i10 = this.f18292b;
        Object[] objArr = this.f18291a;
        if (i10 < objArr.length) {
            this.f18292b = i10 + 1;
            objArr[i10] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void end() {
        int i10 = this.f18292b;
        Object[] objArr = this.f18291a;
        if (i10 < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f18292b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.J0
    public final String toString() {
        Object[] objArr = this.f18291a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f18292b), Arrays.toString(objArr));
    }
}
