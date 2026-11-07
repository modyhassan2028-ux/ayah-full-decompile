package i7;

import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f17124b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f17125c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f17126d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0991j0 f17127a;

    public S(C0991j0 c0991j0) {
        this.f17127a = c0991j0;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        U6.y.f(atomicReference);
        U6.y.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f17127a.a() ? str : g(str, I0.f17005c, I0.f17003a, f17124b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f17127a.a() ? str : g(str, I0.f17008f, I0.f17007e, f17125c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (this.f17127a.a()) {
            return str.startsWith("_exp_") ? p245z2.a.D("experiment_id(", str, ")") : g(str, I0.j, I0.f17010i, f17126d);
        }
        return str;
    }

    public final String d(C1022u c1022u) {
        String string;
        C0991j0 c0991j0 = this.f17127a;
        if (!c0991j0.a()) {
            return c1022u.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(c1022u.f17560t);
        sb.append(",name=");
        sb.append(a(c1022u.f17558r));
        sb.append(",params=");
        C1019t c1019t = c1022u.f17559s;
        if (c1019t == null) {
            string = null;
        } else {
            string = !c0991j0.a() ? c1019t.f17548r.toString() : e(c1019t.e());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.f17127a.a()) {
            return bundle.toString();
        }
        StringBuilder sbC = android.support.v4.media.session.p.C("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbC.length() != 8) {
                sbC.append(", ");
            }
            sbC.append(b(str));
            sbC.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbC.append(strF);
        }
        sbC.append("}]");
        return sbC.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbC = android.support.v4.media.session.p.C("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbC.length() != 1) {
                    sbC.append(", ");
                }
                sbC.append(strE);
            }
        }
        sbC.append("]");
        return sbC.toString();
    }
}
