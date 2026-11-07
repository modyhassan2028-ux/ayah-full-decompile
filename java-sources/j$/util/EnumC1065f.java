package j$.util;

import java.util.Collections;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1065f implements java.util.Comparator, Comparator {
    public static final EnumC1065f INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC1065f[] f18150a;

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        return Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return AbstractC1062c.w(this, Comparator.CC.comparing(function, comparator));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    public static EnumC1065f valueOf(String str) {
        return (EnumC1065f) Enum.valueOf(EnumC1065f.class, str);
    }

    public static EnumC1065f[] values() {
        return (EnumC1065f[]) f18150a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    static {
        EnumC1065f enumC1065f = new EnumC1065f("INSTANCE", 0);
        INSTANCE = enumC1065f;
        f18150a = new EnumC1065f[]{enumC1065f};
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator reversed() {
        return Collections.reverseOrder();
    }
}
