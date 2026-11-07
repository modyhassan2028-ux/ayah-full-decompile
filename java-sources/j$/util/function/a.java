package j$.util.function;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements BinaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f18152b;

    public /* synthetic */ a(Comparator comparator, int i10) {
        this.f18151a = i10;
        this.f18152b = comparator;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f18151a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.c(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f18151a) {
            case 0:
                return this.f18152b.compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return this.f18152b.compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }
}
