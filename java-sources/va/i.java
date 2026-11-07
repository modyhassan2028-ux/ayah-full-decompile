package va;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class i implements l {
    @Override // va.l
    public final boolean b(SSLSocket sSLSocket) {
        return k.f23411b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // va.l
    public final n c(SSLSocket sSLSocket) {
        return new k();
    }
}
