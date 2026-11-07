package va;

import i7.D;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f23410a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f23411b;

    static {
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, j.class.getClassLoader());
            if (Conscrypt.isAvailable() && j.a()) {
                z10 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f23411b = z10;
    }

    @Override // va.n
    public final String a(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // va.n
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // va.n
    public final boolean c() {
        return f23411b;
    }

    @Override // va.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        p251z9.j.e(list, "protocols");
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ua.e eVar = ua.e.f22996a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) D.o(list).toArray(new String[0]));
        }
    }
}
