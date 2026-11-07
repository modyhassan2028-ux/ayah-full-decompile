package androidx.window.layout;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutInfo;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import p056f2.C0948v;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f13067a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A f13069c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f13068b = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f13070d = new LinkedHashSet();

    public c(Activity activity) {
        this.f13067a = activity;
    }

    public final void a(C0948v c0948v) {
        ReentrantLock reentrantLock = this.f13068b;
        reentrantLock.lock();
        try {
            A a9 = this.f13069c;
            if (a9 != null) {
                c0948v.accept(a9);
            }
            this.f13070d.add(c0948v);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        p251z9.j.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f13068b;
        reentrantLock.lock();
        try {
            this.f13069c = e.b(this.f13067a, windowLayoutInfo);
            Iterator it = this.f13070d.iterator();
            while (it.hasNext()) {
                ((H1.a) it.next()).accept(this.f13069c);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
