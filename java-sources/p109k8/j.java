package p109k8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Executor {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f19063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Handler f19064s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ j[] f19065t;

    static {
        j jVar = new j("INSTANCE", 0);
        f19063r = jVar;
        f19065t = new j[]{jVar};
        f19064s = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f19065t.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f19064s.post(runnable);
    }
}
