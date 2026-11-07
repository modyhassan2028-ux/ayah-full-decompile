package p162q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f21185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f21186s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f21187t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ b[] f21188u;

    static {
        b bVar = new b("None", 0);
        f21185r = bVar;
        b bVar2 = new b("Cancelled", 1);
        f21186s = bVar2;
        b bVar3 = new b("Redirected", 2);
        f21187t = bVar3;
        f21188u = new b[]{bVar, bVar2, bVar3, new b("RedirectCancelled", 3)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f21188u.clone();
    }
}
