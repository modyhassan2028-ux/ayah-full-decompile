package androidx.window.layout;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import p056f2.C0948v;

/* JADX INFO: loaded from: classes.dex */
public final class d implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f13071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f13072b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f13073c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f13074d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f13071a = windowLayoutComponent;
    }

    @Override // androidx.window.layout.w
    public final void a(Activity activity, B2.c cVar, C0948v c0948v) {
        p110k9.y yVar;
        LinkedHashMap linkedHashMap = this.f13073c;
        ReentrantLock reentrantLock = this.f13072b;
        reentrantLock.lock();
        try {
            c cVar2 = (c) linkedHashMap.get(activity);
            LinkedHashMap linkedHashMap2 = this.f13074d;
            if (cVar2 == null) {
                yVar = null;
            } else {
                cVar2.a(c0948v);
                linkedHashMap2.put(c0948v, activity);
                yVar = p110k9.y.f19095a;
            }
            if (yVar == null) {
                c cVar3 = new c(activity);
                linkedHashMap.put(activity, cVar3);
                linkedHashMap2.put(c0948v, activity);
                cVar3.a(c0948v);
                this.f13071a.addWindowLayoutInfoListener(activity, cVar3);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.w
    public final void b(H1.a aVar) {
        p251z9.j.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f13072b;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.f13074d.get(aVar);
            if (activity == null) {
                reentrantLock.unlock();
                return;
            }
            c cVar = (c) this.f13073c.get(activity);
            if (cVar == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashSet linkedHashSet = cVar.f13070d;
            ReentrantLock reentrantLock2 = cVar.f13068b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(aVar);
                reentrantLock2.unlock();
                if (linkedHashSet.isEmpty()) {
                    this.f13071a.removeWindowLayoutInfoListener(cVar);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
