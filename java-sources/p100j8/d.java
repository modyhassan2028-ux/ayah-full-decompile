package p100j8;

import I8.b;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p109k8.a;
import p109k8.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18792a;

    public /* synthetic */ d(int i10) {
        this.f18792a = i10;
    }

    @Override // I8.b
    public final Object get() {
        switch (this.f18792a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return ExecutorsRegistrar.a();
            case 3:
                l lVar = ExecutorsRegistrar.f15395a;
                return new f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f15398d.get());
            case 4:
                l lVar2 = ExecutorsRegistrar.f15395a;
                return new f(Executors.newCachedThreadPool(new a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f15398d.get());
            default:
                l lVar3 = ExecutorsRegistrar.f15395a;
                return Executors.newSingleThreadScheduledExecutor(new a("Firebase Scheduler", 0, null));
        }
    }
}
