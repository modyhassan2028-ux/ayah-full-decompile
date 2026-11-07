package p104k1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f18954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f18955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ u[] f18956t;

    static {
        u uVar = new u("Inherit", 0);
        f18954r = uVar;
        u uVar2 = new u("SecureOn", 1);
        f18955s = uVar2;
        f18956t = new u[]{uVar, uVar2, new u("SecureOff", 2)};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f18956t.clone();
    }
}
