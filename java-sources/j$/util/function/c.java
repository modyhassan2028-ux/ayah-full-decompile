package j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements DoubleUnaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleUnaryOperator f18156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleUnaryOperator f18157c;

    public /* synthetic */ c(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2, int i10) {
        this.f18155a = i10;
        this.f18156b = doubleUnaryOperator;
        this.f18157c = doubleUnaryOperator2;
    }

    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f18155a) {
            case 0:
                break;
        }
        return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
    }

    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f18155a) {
            case 0:
                break;
        }
        return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d5) {
        switch (this.f18155a) {
            case 0:
                return this.f18156b.applyAsDouble(this.f18157c.applyAsDouble(d5));
            default:
                return this.f18157c.applyAsDouble(this.f18156b.applyAsDouble(d5));
        }
    }
}
