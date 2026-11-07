package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1113h {
    public static final EnumC1113h CONCURRENT;
    public static final EnumC1113h IDENTITY_FINISH;
    public static final EnumC1113h UNORDERED;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC1113h[] f18473a;

    public static EnumC1113h valueOf(String str) {
        return (EnumC1113h) Enum.valueOf(EnumC1113h.class, str);
    }

    public static EnumC1113h[] values() {
        return (EnumC1113h[]) f18473a.clone();
    }

    static {
        EnumC1113h enumC1113h = new EnumC1113h("CONCURRENT", 0);
        CONCURRENT = enumC1113h;
        EnumC1113h enumC1113h2 = new EnumC1113h("UNORDERED", 1);
        UNORDERED = enumC1113h2;
        EnumC1113h enumC1113h3 = new EnumC1113h("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = enumC1113h3;
        f18473a = new EnumC1113h[]{enumC1113h, enumC1113h2, enumC1113h3};
    }
}
