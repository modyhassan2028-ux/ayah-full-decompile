package p173r2;

import B9.a;
import F9.n;
import H9.v;
import android.os.Bundle;
import p251z9.j;

/* JADX INFO: renamed from: r2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1284d extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21437e;

    public C1284d(int i10, boolean z10) {
        this.f21437e = i10;
    }

    @Override // p173r2.E
    public final Object a(String str, Bundle bundle) {
        switch (this.f21437e) {
            case 0:
                j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || a.K(str, bundle)) {
                    return null;
                }
                boolean z10 = bundle.getBoolean(str, false);
                if (z10 || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z10);
                }
                n.J(str);
                throw null;
            case 1:
                j.e(bundle, "bundle");
                return Integer.valueOf(a.C(str, bundle));
            case 2:
                j.e(bundle, "bundle");
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                n.J(str);
                throw null;
            default:
                j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || a.K(str, bundle)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                n.J(str);
                throw null;
        }
    }

    @Override // p173r2.E
    public final String b() {
        switch (this.f21437e) {
            case 0:
                return "boolean";
            case 1:
                return "integer";
            case 2:
                return "long";
            default:
                return "string";
        }
    }

    @Override // p173r2.E
    public final Object d(String str) {
        boolean z10;
        int i10;
        String strSubstring;
        long j;
        switch (this.f21437e) {
            case 0:
                if (str.equals("true")) {
                    z10 = true;
                } else {
                    if (!str.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                if (v.R0(str, "0x", false)) {
                    String strSubstring2 = str.substring(2);
                    j.d(strSubstring2, "substring(...)");
                    n.n(16);
                    i10 = Integer.parseInt(strSubstring2, 16);
                } else {
                    i10 = Integer.parseInt(str);
                }
                return Integer.valueOf(i10);
            case 2:
                if (v.L0(str, "L")) {
                    strSubstring = str.substring(0, str.length() - 1);
                    j.d(strSubstring, "substring(...)");
                } else {
                    strSubstring = str;
                }
                if (v.R0(str, "0x", false)) {
                    String strSubstring3 = strSubstring.substring(2);
                    j.d(strSubstring3, "substring(...)");
                    n.n(16);
                    j = Long.parseLong(strSubstring3, 16);
                } else {
                    j = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j);
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // p173r2.E
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f21437e) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                j.e(str, "key");
                bundle.putBoolean(str, zBooleanValue);
                break;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                j.e(str, "key");
                bundle.putInt(str, iIntValue);
                break;
            case 2:
                long jLongValue = ((Number) obj).longValue();
                j.e(str, "key");
                bundle.putLong(str, jLongValue);
                break;
            default:
                String str2 = (String) obj;
                j.e(str, "key");
                if (str2 == null) {
                    Y2.a.a0(str, bundle);
                } else {
                    Y2.a.c0(str, str2, bundle);
                }
                break;
        }
    }
}
