package Ea;

import Da.e;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Socket f2006n;

    public c(Socket socket) {
        this.f2006n = socket;
    }

    @Override // Da.e
    public final void j() {
        Socket socket = this.f2006n;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (!d.a(e10)) {
                throw e10;
            }
            d.f2007a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        } catch (Exception e11) {
            d.f2007a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
