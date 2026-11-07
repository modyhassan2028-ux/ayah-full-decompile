package H9;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f3619b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3620a = true;

    public e() {
        if (Y2.a.g("")) {
            return;
        }
        Y2.a.g("");
    }

    public final void a(String str, StringBuilder sb) {
        p245z2.a.I(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
