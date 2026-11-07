package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class E {
    public static final E LENIENT;
    public static final E SMART;
    public static final E STRICT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ E[] f17854a;

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f17854a.clone();
    }

    static {
        E e10 = new E("STRICT", 0);
        STRICT = e10;
        E e11 = new E("SMART", 1);
        SMART = e11;
        E e12 = new E("LENIENT", 2);
        LENIENT = e12;
        f17854a = new E[]{e10, e11, e12};
    }
}
