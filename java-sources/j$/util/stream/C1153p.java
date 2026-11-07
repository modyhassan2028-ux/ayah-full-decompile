package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1153p extends AbstractC1101e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1078a f18519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1153p(AbstractC1078a abstractC1078a, InterfaceC1136l2 interfaceC1136l2, int i10) {
        super(interfaceC1136l2);
        this.f18518b = i10;
        this.f18519c = abstractC1078a;
    }

    @Override // j$.util.stream.AbstractC1101e2, j$.util.stream.InterfaceC1136l2
    public void c(long j) {
        switch (this.f18518b) {
            case 4:
                this.f18464a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC1121i2, j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        switch (this.f18518b) {
            case 0:
                this.f18464a.accept(((DoubleFunction) ((C1158q) this.f18519c).f18524t).apply(d5));
                return;
            case 1:
                this.f18464a.accept(((DoubleUnaryOperator) ((r) this.f18519c).f18530t).applyAsDouble(d5));
                return;
            case 2:
                ((C1167s) this.f18519c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d5);
                throw null;
            case 3:
                ((C1172t) this.f18519c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d5);
                throw null;
            case 4:
                ((C1182v) this.f18519c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d5);
                throw null;
            default:
                ((DoubleConsumer) ((r) this.f18519c).f18530t).accept(d5);
                this.f18464a.accept(d5);
                return;
        }
    }
}
