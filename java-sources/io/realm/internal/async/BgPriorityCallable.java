package io.realm.internal.async;

import android.os.Process;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class BgPriorityCallable<T> implements Callable<T> {
    private final Callable<T> callable;

    public BgPriorityCallable(Callable<T> callable) {
        this.callable = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        Process.setThreadPriority(10);
        return this.callable.call();
    }
}
