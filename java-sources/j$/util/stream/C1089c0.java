package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: j$.util.stream.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1089c0 extends AbstractC1111g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1078a f18451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1089c0(AbstractC1078a abstractC1078a, InterfaceC1136l2 interfaceC1136l2, int i10) {
        super(interfaceC1136l2);
        this.f18450b = i10;
        this.f18451c = abstractC1078a;
    }

    @Override // j$.util.stream.AbstractC1111g2, j$.util.stream.InterfaceC1136l2
    public void c(long j) {
        switch (this.f18450b) {
            case 4:
                this.f18471a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC1131k2, j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        switch (this.f18450b) {
            case 0:
                this.f18471a.accept(((LongFunction) ((C1158q) this.f18451c).f18524t).apply(j));
                return;
            case 1:
                ((C1172t) this.f18451c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                ((C1167s) this.f18451c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((C1182v) this.f18451c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                ((C1172t) this.f18451c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
            default:
                ((LongConsumer) ((C1104f0) this.f18451c).f18468t).accept(j);
                this.f18471a.accept(j);
                return;
        }
    }
}
