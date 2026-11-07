package i7;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class X extends C0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final V f17174A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final V f17175B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final V f17176C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final V f17177D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final V f17178E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public char f17179t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f17180u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f17181v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final V f17182w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final V f17183x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final V f17184y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final V f17185z;

    public X(C1023u0 c1023u0) {
        super(c1023u0);
        this.f17179t = (char) 0;
        this.f17180u = -1L;
        this.f17182w = new V(this, 6, false, false);
        this.f17183x = new V(this, 6, true, false);
        this.f17184y = new V(this, 6, false, true);
        this.f17185z = new V(this, 5, false, false);
        this.f17174A = new V(this, 5, true, false);
        this.f17175B = new V(this, 5, false, true);
        this.f17176C = new V(this, 4, false, false);
        this.f17177D = new V(this, 3, false, false);
        this.f17178E = new V(this, 2, false, false);
    }

    public static String A(Object obj, boolean z10) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof W) {
                return ((W) obj).f17170a;
            }
            return z10 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
        String canonicalName = C1023u0.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    public static W w(String str) {
        if (str == null) {
            return null;
        }
        return new W(str);
    }

    public static String z(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strA = A(obj, z10);
        String strA2 = A(obj2, z10);
        String strA3 = A(obj3, z10);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strA)) {
            sb.append(str2);
            sb.append(strA);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strA2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strA2);
        }
        if (!TextUtils.isEmpty(strA3)) {
            sb.append(str3);
            sb.append(strA3);
        }
        return sb.toString();
    }

    @Override // i7.C0
    public final boolean p() {
        return false;
    }

    public final V s() {
        return this.f17182w;
    }

    public final V t() {
        return this.f17185z;
    }

    public final V u() {
        return this.f17177D;
    }

    public final V v() {
        return this.f17178E;
    }

    public final void x(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(y(), i10)) {
            Log.println(i10, y(), z(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        U6.y.f(str);
        C1014r0 c1014r0 = ((C1023u0) this.f16104r).f17585x;
        if (c1014r0 == null) {
            Log.println(6, y(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!c1014r0.f16847s) {
                Log.println(6, y(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            c1014r0.x(new U(this, i10, str, obj, obj2, obj3));
        }
    }

    public final String y() {
        String str;
        synchronized (this) {
            try {
                if (this.f17181v == null) {
                    ((C1023u0) ((C1023u0) this.f16104r).f17582u.f16104r).getClass();
                    this.f17181v = "FA";
                }
                U6.y.f(this.f17181v);
                str = this.f17181v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
