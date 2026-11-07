package B6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f646t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ c[] f647u;

    static {
        c cVar = new c("DEFAULT", 0);
        f644r = cVar;
        c cVar2 = new c("VERY_LOW", 1);
        f645s = cVar2;
        c cVar3 = new c("HIGHEST", 2);
        f646t = cVar3;
        f647u = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f647u.clone();
    }
}
