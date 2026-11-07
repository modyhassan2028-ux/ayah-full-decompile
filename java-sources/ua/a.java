package ua;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p120l9.l;
import p251z9.j;
import va.h;
import va.k;
import va.m;
import va.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f22988e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f22989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f22990d;

    static {
        f22988e = Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        int i10 = 0;
        ArrayList arrayListI0 = l.i0(new n[]{Build.VERSION.SDK_INT >= 29 ? new va.a() : null, new m(va.e.f23400f), new m(k.f23410a), new m(h.f23408a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListI0.size();
        while (i10 < size) {
            Object obj = arrayListI0.get(i10);
            i10++;
            if (((n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f22990d = arrayList;
    }

    @Override // ua.d
    public final void a(Context context) {
        this.f22989c = context;
    }

    @Override // ua.d
    public final Context b() {
        return this.f22989c;
    }

    @Override // ua.e
    public final p186s9.b c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        va.b bVar = x509TrustManagerExtensions != null ? new va.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new ya.a(d(x509TrustManager));
    }

    @Override // ua.e
    public final ya.d d(X509TrustManager x509TrustManager) {
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(x509TrustManager);
    }

    @Override // ua.e
    public final void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        j.e(list, "protocols");
        ArrayList arrayList = this.f22990d;
        int size = arrayList.size();
        int i10 = 0;
        do {
            if (i10 >= size) {
                obj = null;
                break;
            } else {
                obj = arrayList.get(i10);
                i10++;
            }
        } while (!((n) obj).b(sSLSocket));
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // ua.e
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f22990d;
        int size = arrayList.size();
        int i10 = 0;
        do {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
        } while (!((n) obj).b(sSLSocket));
        n nVar = (n) obj;
        if (nVar != null) {
            return nVar.a(sSLSocket);
        }
        return null;
    }

    @Override // ua.e
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // ua.e
    public final boolean i(String str) {
        j.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // ua.e
    public final void k(Object obj, String str) {
        j.e(str, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, str);
        } else {
            j.c(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            ((CloseGuard) obj).warnIfOpen();
        }
    }

    @Override // ua.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
