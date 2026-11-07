package R6;

import U6.y;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7230a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f7231b = new LinkedBlockingQueue();

    public final IBinder a() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        y.e("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f7230a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f7230a = true;
        IBinder iBinder = (IBinder) this.f7231b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7231b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
