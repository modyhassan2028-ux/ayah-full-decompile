package M9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f5830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f5831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f5832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ a[] f5833u;

    static {
        a aVar = new a("SUSPEND", 0);
        f5830r = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f5831s = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f5832t = aVar3;
        f5833u = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5833u.clone();
    }
}
