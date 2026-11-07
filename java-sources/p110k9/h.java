package p110k9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f19074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f19075s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ h[] f19076t;

    /* JADX INFO: Fake field, exist only in values array */
    h EF0;

    static {
        h hVar = new h("SYNCHRONIZED", 0);
        h hVar2 = new h("PUBLICATION", 1);
        f19074r = hVar2;
        h hVar3 = new h("NONE", 2);
        f19075s = hVar3;
        f19076t = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f19076t.clone();
    }
}
