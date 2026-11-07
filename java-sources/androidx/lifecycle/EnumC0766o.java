package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0766o {
    private static final /* synthetic */ p179r9.a $ENTRIES;
    private static final /* synthetic */ EnumC0766o[] $VALUES;
    public static final C0764m Companion;
    public static final EnumC0766o ON_ANY;
    public static final EnumC0766o ON_CREATE;
    public static final EnumC0766o ON_DESTROY;
    public static final EnumC0766o ON_PAUSE;
    public static final EnumC0766o ON_RESUME;
    public static final EnumC0766o ON_START;
    public static final EnumC0766o ON_STOP;

    static {
        EnumC0766o enumC0766o = new EnumC0766o("ON_CREATE", 0);
        ON_CREATE = enumC0766o;
        EnumC0766o enumC0766o2 = new EnumC0766o("ON_START", 1);
        ON_START = enumC0766o2;
        EnumC0766o enumC0766o3 = new EnumC0766o("ON_RESUME", 2);
        ON_RESUME = enumC0766o3;
        EnumC0766o enumC0766o4 = new EnumC0766o("ON_PAUSE", 3);
        ON_PAUSE = enumC0766o4;
        EnumC0766o enumC0766o5 = new EnumC0766o("ON_STOP", 4);
        ON_STOP = enumC0766o5;
        EnumC0766o enumC0766o6 = new EnumC0766o("ON_DESTROY", 5);
        ON_DESTROY = enumC0766o6;
        EnumC0766o enumC0766o7 = new EnumC0766o("ON_ANY", 6);
        ON_ANY = enumC0766o7;
        EnumC0766o[] enumC0766oArr = {enumC0766o, enumC0766o2, enumC0766o3, enumC0766o4, enumC0766o5, enumC0766o6, enumC0766o7};
        $VALUES = enumC0766oArr;
        $ENTRIES = new p179r9.b(enumC0766oArr);
        Companion = new C0764m();
    }

    public static EnumC0766o valueOf(String str) {
        return (EnumC0766o) Enum.valueOf(EnumC0766o.class, str);
    }

    public static EnumC0766o[] values() {
        return (EnumC0766o[]) $VALUES.clone();
    }

    public final EnumC0767p a() {
        switch (AbstractC0765n.f12660a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0767p.f12663t;
            case 3:
            case 4:
                return EnumC0767p.f12664u;
            case 5:
                return EnumC0767p.f12665v;
            case 6:
                return EnumC0767p.f12661r;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new A6.a();
        }
    }
}
