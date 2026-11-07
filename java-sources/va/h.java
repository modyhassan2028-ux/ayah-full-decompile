package va;

import i7.D;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f23408a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f23409b;

    static {
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, g.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f23409b = z10;
    }

    @Override // va.n
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // va.n
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // va.n
    public final boolean c() {
        return f23409b;
    }

    @Override // va.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        p251z9.j.e(list, "protocols");
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            ua.e eVar = ua.e.f22996a;
            parameters.setApplicationProtocols((String[]) D.o(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
