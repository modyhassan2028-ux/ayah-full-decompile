package i7;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17148r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f17149s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f17150t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f17151u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f17152v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f17153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f17154x;

    public U(X x9, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f17149s = i10;
        this.f17150t = str;
        this.f17151u = obj;
        this.f17152v = obj2;
        this.f17153w = obj3;
        this.f17154x = x9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17148r) {
            case 0:
                X x9 = (X) this.f17154x;
                C0985h0 c0985h0 = ((C1023u0) x9.f16104r).f17583v;
                C1023u0.k(c0985h0);
                if (!c0985h0.f16847s) {
                    Log.println(6, x9.y(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (x9.f17179t == 0) {
                    C0981g c0981g = ((C1023u0) x9.f16104r).f17582u;
                    if (c0981g.f17361v == null) {
                        synchronized (c0981g) {
                            try {
                                if (c0981g.f17361v == null) {
                                    C1023u0 c1023u0 = (C1023u0) c0981g.f16104r;
                                    ApplicationInfo applicationInfo = c1023u0.f17579r.getApplicationInfo();
                                    String strA = Y6.c.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c0981g.f17361v = Boolean.valueOf(str != null && str.equals(strA));
                                    }
                                    if (c0981g.f17361v == null) {
                                        c0981g.f17361v = Boolean.TRUE;
                                        X x10 = c1023u0.f17584w;
                                        C1023u0.m(x10);
                                        x10.f17182w.a("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (c0981g.f17361v.booleanValue()) {
                        x9.f17179t = 'C';
                    } else {
                        x9.f17179t = 'c';
                    }
                    break;
                }
                if (x9.f17180u < 0) {
                    ((C1023u0) x9.f16104r).f17582u.t();
                    x9.f17180u = 133005L;
                }
                int i10 = this.f17149s;
                char c10 = x9.f17179t;
                long j = x9.f17180u;
                String str2 = this.f17150t;
                Object obj = this.f17151u;
                Object obj2 = this.f17152v;
                Object obj3 = this.f17153w;
                char cCharAt = "01VDIWEA?".charAt(i10);
                String strZ = X.z(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c10).length() + String.valueOf(j).length() + 1 + strZ.length());
                sb.append("2");
                sb.append(cCharAt);
                sb.append(c10);
                sb.append(j);
                sb.append(":");
                sb.append(strZ);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                C0982g0 c0982g0 = c0985h0.f17402v;
                if (c0982g0 != null) {
                    String str3 = (String) c0982g0.f17365d;
                    C0985h0 c0985h1 = (C0985h0) c0982g0.f17366e;
                    c0985h1.o();
                    if (((C0985h0) c0982g0.f17366e).s().getLong((String) c0982g0.f17363b, 0L) == 0) {
                        c0982g0.b();
                    }
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferencesS = c0985h1.s();
                    String str4 = (String) c0982g0.f17364c;
                    long j10 = sharedPreferencesS.getLong(str4, 0L);
                    if (j10 <= 0) {
                        SharedPreferences.Editor editorEdit = c0985h1.s().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    V1 v10 = ((C1023u0) c0985h1.f16104r).f17587z;
                    C1023u0.k(v10);
                    long jNextLong = v10.n0().nextLong() & Long.MAX_VALUE;
                    long j11 = j10 + 1;
                    long j12 = Long.MAX_VALUE / j11;
                    SharedPreferences.Editor editorEdit2 = c0985h1.s().edit();
                    if (jNextLong < j12) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j11);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((Z) this.f17151u).b(this.f17150t, this.f17149s, (Throwable) this.f17152v, (byte[]) this.f17153w, (Map) this.f17154x);
                return;
        }
    }

    public /* synthetic */ U(String str, Z z10, int i10, IOException iOException, byte[] bArr, Map map) {
        U6.y.f(z10);
        this.f17151u = z10;
        this.f17149s = i10;
        this.f17152v = iOException;
        this.f17153w = bArr;
        this.f17150t = str;
        this.f17154x = map;
    }
}
