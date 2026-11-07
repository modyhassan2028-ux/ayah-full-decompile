package B4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f622r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f623s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ c[] f624t;

    static {
        c cVar = new c("RANGE", 0);
        f622r = cVar;
        c cVar2 = new c("AYAH", 1);
        f623s = cVar2;
        f624t = new c[]{cVar, cVar2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f624t.clone();
    }
}
