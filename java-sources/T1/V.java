package T1;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class V extends FileObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f7643b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f7644c = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f7645a;

    public V(String str) {
        super(str, 128);
        this.f7645a = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i10, String str) {
        Iterator it = this.f7645a.iterator();
        while (it.hasNext()) {
            ((p241y9.c) it.next()).e(str);
        }
    }
}
