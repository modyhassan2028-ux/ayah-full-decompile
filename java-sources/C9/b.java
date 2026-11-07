package C9;

import K0.Y;
import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f783a;

    public /* synthetic */ b(int i10) {
        this.f783a = i10;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f783a) {
            case 0:
                return new Random();
            case 1:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                Y y10 = new Y(choreographer, u0.k(looperMyLooper));
                return Y2.a.Z(y10, y10.f5039C);
            case 2:
                return 0L;
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(la.e.f19451a);
                return simpleDateFormat;
        }
    }
}
