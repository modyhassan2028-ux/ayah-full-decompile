package K0;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.measurement.G1;
import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5133a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5134b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(G1 g10) {
        super(null);
        this.f5134b = g10;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f5133a) {
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        Cursor cursor;
        switch (this.f5133a) {
            case 1:
                p151p.W0 w9 = (p151p.W0) this.f5134b;
                if (!w9.f6440s || (cursor = w9.f6441t) == null || cursor.isClosed()) {
                    return;
                }
                w9.f6439r = w9.f6441t.requery();
                return;
            case 2:
                ((AtomicBoolean) ((p213v8.b) this.f5134b).f23378a).set(true);
                return;
            case 3:
                G1 g10 = (G1) this.f5134b;
                synchronized (g10.f14039f) {
                    g10.g = null;
                    g10.f14036c.run();
                    break;
                }
                synchronized (g10) {
                    try {
                        Iterator it = g10.f14040h.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                super.onChange(z10);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p213v8.b bVar) {
        super(null);
        Objects.requireNonNull(bVar);
        this.f5134b = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(M9.e eVar, Handler handler) {
        super(handler);
        this.f5134b = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p151p.W0 w9) {
        super(new Handler());
        this.f5134b = w9;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10, Uri uri) {
        switch (this.f5133a) {
            case 0:
                ((M9.e) this.f5134b).k(p110k9.y.f19095a);
                break;
            default:
                super.onChange(z10, uri);
                break;
        }
    }
}
