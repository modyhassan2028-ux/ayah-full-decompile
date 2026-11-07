package p013b2;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: b2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0775a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13150a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f13150a);
        thread.setPriority(10);
        return thread;
    }
}
