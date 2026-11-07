package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class X2 {
    public static final X2 OP;
    public static final X2 SPLITERATOR;
    public static final X2 STREAM;
    public static final X2 TERMINAL_OP;
    public static final X2 UPSTREAM_TERMINAL_OP;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ X2[] f18390a;

    public static X2 valueOf(String str) {
        return (X2) Enum.valueOf(X2.class, str);
    }

    public static X2[] values() {
        return (X2[]) f18390a.clone();
    }

    static {
        X2 x9 = new X2("SPLITERATOR", 0);
        SPLITERATOR = x9;
        X2 x10 = new X2("STREAM", 1);
        STREAM = x10;
        X2 x11 = new X2("OP", 2);
        OP = x11;
        X2 x12 = new X2("TERMINAL_OP", 3);
        TERMINAL_OP = x12;
        X2 x13 = new X2("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = x13;
        f18390a = new X2[]{x9, x10, x11, x12, x13};
    }
}
