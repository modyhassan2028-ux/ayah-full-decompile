package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class F {
    public static final F ALWAYS;
    public static final F EXCEEDS_PAD;
    public static final F NEVER;
    public static final F NORMAL;
    public static final F NOT_NEGATIVE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ F[] f17855a;

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f17855a.clone();
    }

    static {
        F f3 = new F("NORMAL", 0);
        NORMAL = f3;
        F f7 = new F("ALWAYS", 1);
        ALWAYS = f7;
        F f10 = new F("NEVER", 2);
        NEVER = f10;
        F f11 = new F("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = f11;
        F f12 = new F("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = f12;
        f17855a = new F[]{f3, f7, f10, f11, f12};
    }
}
