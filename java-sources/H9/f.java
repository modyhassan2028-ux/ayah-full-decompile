package H9;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f3621d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f3623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f3624c;

    static {
        d dVar = d.f3618a;
        e eVar = e.f3619b;
        f3621d = new f(false, dVar, eVar);
        new f(true, dVar, eVar);
    }

    public f(boolean z10, d dVar, e eVar) {
        p251z9.j.e(dVar, "bytes");
        p251z9.j.e(eVar, "number");
        this.f3622a = z10;
        this.f3623b = dVar;
        this.f3624c = eVar;
    }

    public final String toString() {
        StringBuilder sbC = android.support.v4.media.session.p.C("HexFormat(\n    upperCase = ");
        sbC.append(this.f3622a);
        sbC.append(",\n    bytes = BytesHexFormat(\n");
        this.f3623b.a("        ", sbC);
        sbC.append('\n');
        sbC.append("    ),");
        sbC.append('\n');
        sbC.append("    number = NumberHexFormat(");
        sbC.append('\n');
        this.f3624c.a("        ", sbC);
        sbC.append('\n');
        sbC.append("    )");
        sbC.append('\n');
        sbC.append(")");
        return sbC.toString();
    }
}
