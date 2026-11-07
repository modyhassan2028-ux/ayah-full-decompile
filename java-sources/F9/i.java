package F9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i f2543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ i[] f2544s;

    static {
        i iVar = new i("INVARIANT", 0);
        f2543r = iVar;
        f2544s = new i[]{iVar, new i("IN", 1), new i("OUT", 2)};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f2544s.clone();
    }
}
