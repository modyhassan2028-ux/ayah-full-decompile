package T6;

import android.os.Trace;
import com.google.android.gms.internal.measurement.O1;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ p f7852s = new p(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7853r;

    public /* synthetic */ p(int i10) {
        this.f7853r = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7853r) {
            case 0:
                throw null;
            case 1:
                try {
                    Method method = E1.i.f1432b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (p013b2.j.d()) {
                        p013b2.j.a().e();
                        break;
                    }
                    return;
                } finally {
                    Method method2 = E1.i.f1432b;
                    Trace.endSection();
                }
            default:
                O1.f14084i.incrementAndGet();
                return;
        }
    }

    public p(q qVar) {
        this.f7853r = 0;
    }
}
