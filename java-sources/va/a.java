package va;

import android.net.ssl.SSLSockets;
import android.os.Build;
import i7.D;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    @Override // va.n
    public final String a(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null || applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // va.n
    public final boolean b(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // va.n
    public final boolean c() {
        ua.e eVar = ua.e.f22996a;
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // va.n
    public final void d(SSLSocket sSLSocket, String str, List list) throws IOException {
        p251z9.j.e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ua.e eVar = ua.e.f22996a;
            sSLParameters.setApplicationProtocols((String[]) D.o(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
