package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class A1 extends AbstractC1184v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f18217i;
    public final /* synthetic */ Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f18218k;

    public /* synthetic */ A1(Z2 z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f18216h = i10;
        this.j = obj;
        this.f18218k = obj2;
        this.f18217i = obj3;
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final Q1 D0() {
        switch (this.f18216h) {
            case 0:
                return new C1194x1((Supplier) this.f18217i, (ObjLongConsumer) this.f18218k, (C1143n) this.j);
            case 1:
                return new D1((Supplier) this.f18217i, (ObjDoubleConsumer) this.f18218k, (C1143n) this.j);
            case 2:
                return new F1(this.f18217i, (BiFunction) this.f18218k, (BinaryOperator) this.j);
            case 3:
                return new J1((Supplier) this.f18217i, (BiConsumer) this.f18218k, (BiConsumer) this.j);
            default:
                return new N1((Supplier) this.f18217i, (ObjIntConsumer) this.f18218k, (C1143n) this.j);
        }
    }
}
