package ua;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import ka.r;
import p120l9.l;
import p251z9.j;
import va.h;
import va.k;
import va.m;
import va.n;
import va.o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f22993e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f22994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f22995d;

    static {
        f22993e = Build.VERSION.SDK_INT < 29;
    }

    public c() {
        o oVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e10) {
            CopyOnWriteArraySet copyOnWriteArraySet = va.c.f23397a;
            va.c.a(5, r.class.getName(), e10, "unable to load android socket classes");
            oVar = null;
        }
        int i10 = 0;
        ArrayList arrayListI0 = l.i0(new n[]{oVar, new m(va.e.f23400f), new m(k.f23410a), new m(h.f23408a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListI0.size();
        while (i10 < size) {
            Object obj = arrayListI0.get(i10);
            i10++;
            if (((n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f22995d = arrayList;
    }

    @Override // ua.d
    public final void a(Context context) {
        this.f22994c = context;
    }

    @Override // ua.d
    public final Context b() {
        return this.f22994c;
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
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // ua.e
    public final void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        j.e(list, "protocols");
        ArrayList arrayList = this.f22995d;
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
    public final void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        j.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // ua.e
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f22995d;
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
    public final boolean i(String str) {
        j.e(str, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // ua.e
    public final void j(String str, int i10, Throwable th) {
        j.e(str, "message");
        if (i10 == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }

    @Override // ua.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
