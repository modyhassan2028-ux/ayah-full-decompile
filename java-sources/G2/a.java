package G2;

import M.k;
import R7.f;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f2786c = new f(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f2787d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f2788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f2789b;

    public a(String str, boolean z10) {
        ReentrantLock reentrantLock;
        synchronized (f2786c) {
            try {
                LinkedHashMap linkedHashMap = f2787d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2788a = reentrantLock;
        this.f2789b = z10 ? new k(str) : null;
    }
}
