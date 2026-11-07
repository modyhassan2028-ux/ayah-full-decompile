package p160p8;

import D6.s;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p000a.a;
import p118l7.i;
import p151p.C1256n;
import p151p.m1;
import p178r8.c;
import p213v8.b;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f21080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f21081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f21082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f21083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f21084e;

    public k(m mVar, long j, Throwable th, Thread thread, s sVar) {
        this.f21084e = mVar;
        this.f21080a = j;
        this.f21081b = th;
        this.f21082c = thread;
        this.f21083d = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.f21080a;
        long j10 = j / 1000;
        m mVar = this.f21084e;
        String strE = mVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return a.E(null);
        }
        mVar.f21091c.e();
        m1 m1Var = mVar.f21099m;
        m1Var.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        m1Var.h(this.f21081b, this.f21082c, "crash", new c(strE, j10, p120l9.s.f19441r), true);
        try {
            b bVar = mVar.g;
            String str = ".ae" + j;
            bVar.getClass();
            if (!new File((File) bVar.f23380c, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        s sVar = this.f21083d;
        mVar.b(false, sVar, false);
        mVar.c(new e().f21067a, Boolean.FALSE);
        return !mVar.f21090b.a() ? a.E(null) : ((i) ((AtomicReference) sVar.f1315i).get()).f19402a.h(mVar.f21093e.f21345a, new C1256n(this, strE));
    }
}
