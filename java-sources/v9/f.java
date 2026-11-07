package v9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f23393r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ f[] f23394s;

    /* JADX INFO: Fake field, exist only in values array */
    f EF0;

    static {
        f fVar = new f("TOP_DOWN", 0);
        f fVar2 = new f("BOTTOM_UP", 1);
        f23393r = fVar2;
        f23394s = new f[]{fVar, fVar2};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f23394s.clone();
    }
}
