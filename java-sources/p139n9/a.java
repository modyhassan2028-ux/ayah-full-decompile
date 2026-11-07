package p139n9;

import j$.util.AbstractC1062c;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparator, j$.util.Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20030b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20031c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20032a;

    public /* synthetic */ a(int i10) {
        this.f20032a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20032a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                j.e(comparable, "a");
                j.e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                j.e(comparable3, "a");
                j.e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator reversed() {
        switch (this.f20032a) {
            case 0:
                return f20031c;
            default:
                return f20030b;
        }
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ Comparator thenComparing(Comparator comparator) {
        int i10 = this.f20032a;
        return j$.util.Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        int i10 = this.f20032a;
        return j$.util.Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        int i10 = this.f20032a;
        return j$.util.Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        int i10 = this.f20032a;
        return j$.util.Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ Comparator thenComparing(Function function) {
        int i10 = this.f20032a;
        return j$.util.Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        int i10 = this.f20032a;
        return AbstractC1062c.w(this, j$.util.Comparator.CC.comparing(function, comparator));
    }
}
