package ua;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import ka.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile e f22996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f22997b;

    static {
        try {
            for (Map.Entry entry : va.c.f23398b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (va.c.f23397a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(va.d.f23399a);
                }
            }
        } catch (RuntimeException e10) {
            e10.printStackTrace();
        }
        e aVar = a.f22988e ? new a() : null;
        if (aVar == null) {
            aVar = c.f22993e ? new c() : null;
        }
        if (aVar == null) {
            throw new IllegalStateException(p123m2.c.r(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        f22996a = aVar;
        f22997b = Logger.getLogger(r.class.getName());
    }

    public static X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        j.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        j.d(string, "toString(...)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    public abstract p186s9.b c(X509TrustManager x509TrustManager);

    public ya.d d(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new ya.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public abstract void e(SSLSocket sSLSocket, String str, List list);

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        j.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public abstract String g(SSLSocket sSLSocket);

    public Object h() {
        if (f22997b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean i(String str);

    public void j(String str, int i10, Throwable th) {
        j.e(str, "message");
        f22997b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void k(Object obj, String str) {
        j.e(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(str, 5, (Throwable) obj);
    }

    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        j.d(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
