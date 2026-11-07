package i7;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class W0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ W0 f17171a = new W0();

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return Long.valueOf(((F1) obj).f16880s);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
