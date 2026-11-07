package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0767p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0767p f12661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0767p f12662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0767p f12663t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final EnumC0767p f12664u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final EnumC0767p f12665v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ EnumC0767p[] f12666w;

    static {
        EnumC0767p enumC0767p = new EnumC0767p("DESTROYED", 0);
        f12661r = enumC0767p;
        EnumC0767p enumC0767p2 = new EnumC0767p("INITIALIZED", 1);
        f12662s = enumC0767p2;
        EnumC0767p enumC0767p3 = new EnumC0767p("CREATED", 2);
        f12663t = enumC0767p3;
        EnumC0767p enumC0767p4 = new EnumC0767p("STARTED", 3);
        f12664u = enumC0767p4;
        EnumC0767p enumC0767p5 = new EnumC0767p("RESUMED", 4);
        f12665v = enumC0767p5;
        f12666w = new EnumC0767p[]{enumC0767p, enumC0767p2, enumC0767p3, enumC0767p4, enumC0767p5};
    }

    public static EnumC0767p valueOf(String str) {
        return (EnumC0767p) Enum.valueOf(EnumC0767p.class, str);
    }

    public static EnumC0767p[] values() {
        return (EnumC0767p[]) f12666w.clone();
    }
}
