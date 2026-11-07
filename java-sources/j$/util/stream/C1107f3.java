package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1107f3 extends AbstractC1112g3 implements Consumer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f18470b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public C1107f3(int i10) {
        this.f18470b = new Object[i10];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f18472a;
        this.f18472a = i10 + 1;
        this.f18470b[i10] = obj;
    }
}
