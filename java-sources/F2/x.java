package F2;

import J0.C0280d0;
import K9.AbstractC0405x;
import K9.C0389g;
import N9.k0;
import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Process;
import android.os.StrictMode;
import android.text.SpannableString;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.SearchView;
import com.ayah.MainActivity;
import com.ayah.R;
import com.ayah.common.data.dao.notification.ReminderDestination;
import com.ayah.feature.audio.service.AyahAudioService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import io.realm.RealmFieldTypeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import p020c.C0781f;
import p151p.m1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2335t;

    public /* synthetic */ x(int i10, Object obj, Object obj2) {
        this.f2333r = i10;
        this.f2334s = obj;
        this.f2335t = obj2;
    }

    private final void a() {
        p100j8.m mVar = (p100j8.m) this.f2334s;
        I8.b bVar = (I8.b) this.f2335t;
        synchronized (mVar) {
            try {
                if (mVar.f18814b == null) {
                    mVar.f18813a.add(bVar);
                } else {
                    mVar.f18814b.add(bVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        I8.a aVar;
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        p110k9.j jVar;
        p110k9.j jVar2;
        int i10 = 1;
        switch (this.f2333r) {
            case 0:
                Runnable runnable = (Runnable) this.f2334s;
                y yVar = (y) this.f2335t;
                try {
                    runnable.run();
                    return;
                } finally {
                    yVar.b();
                }
            case 1:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f2334s;
                JobParameters jobParameters = (JobParameters) this.f2335t;
                int i11 = JobInfoSchedulerService.f13972r;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 2:
                ((C0389g) this.f2334s).B((L9.d) this.f2335t);
                return;
            case 3:
                ComponentActivity componentActivity = (ComponentActivity) this.f2334s;
                p020c.D d5 = (p020c.D) this.f2335t;
                int i12 = ComponentActivity.f11367K;
                componentActivity.f12313r.a(new C0781f(d5, componentActivity));
                return;
            case 4:
                MainActivity mainActivity = (MainActivity) this.f2334s;
                ReminderDestination reminderDestination = (ReminderDestination) this.f2335t;
                int i13 = MainActivity.f13622J0;
                p218w3.c cVar = mainActivity.f13659x0;
                if (cVar == null) {
                    p251z9.j.k("jumpModel");
                    throw null;
                }
                ReminderDestination.Sura sura = (ReminderDestination.Sura) reminderDestination;
                int i14 = sura.f13671a;
                int i15 = sura.f13672b;
                AbstractC0405x.x(cVar.f23655d, null, new p218w3.b(cVar, i15, null == true ? 1 : 0, i10), 3);
                k0 k0Var = cVar.f23656e;
                z3.d dVar = new z3.d(i14, i15);
                k0Var.getClass();
                k0Var.n(null, dVar);
                return;
            case 5:
                y yVar2 = (y) this.f2335t;
                Runnable runnable2 = (Runnable) this.f2334s;
                yVar2.getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                    yVar2.b();
                }
            case 6:
                p100j8.n nVar = (p100j8.n) this.f2334s;
                I8.b bVar = (I8.b) this.f2335t;
                if (nVar.f18818b != p100j8.n.f18816d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (nVar) {
                    aVar = nVar.f18817a;
                    nVar.f18817a = null;
                    nVar.f18818b = bVar;
                    break;
                }
                aVar.e(bVar);
                return;
            case 7:
                a();
                return;
            case 8:
                p109k8.a aVar2 = (p109k8.a) this.f2335t;
                Runnable runnable3 = (Runnable) this.f2334s;
                Process.setThreadPriority(aVar2.f19036c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f19037d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable3.run();
                return;
            case 9:
                Callable callable = (Callable) this.f2334s;
                p109k8.h hVar = (p109k8.h) ((Z0.B) this.f2335t).f10875s;
                try {
                    hVar.j(callable.call());
                    return;
                } catch (Exception e10) {
                    hVar.k(e10);
                    return;
                }
            case 10:
                N7.f.c((p131n0.c) this.f2334s, (LongSparseArray) this.f2335t);
                return;
            case 11:
                ((p160p8.m) this.f2334s).c((String) this.f2335t, Boolean.FALSE);
                return;
            case 12:
                p160p8.r rVar = (p160p8.r) this.f2334s;
                Exception exc = (Exception) this.f2335t;
                Map map = Collections.EMPTY_MAP;
                p160p8.m mVar = rVar.g;
                Thread threadCurrentThread = Thread.currentThread();
                mVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                p160p8.t tVar = mVar.f21100n;
                if (tVar == null || !tVar.f21137e.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strE = mVar.e();
                    if (strE == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    p178r8.c cVar2 = new p178r8.c(strE, j, map);
                    m1 m1Var = mVar.f21099m;
                    m1Var.getClass();
                    String strConcat = "Persisting non-fatal event for session ".concat(strE);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    m1Var.h(exc, threadCurrentThread, "error", cVar2, false);
                    return;
                }
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                p219w4.g gVar = p219w4.g.f23723r;
                p219w4.g gVar2 = p219w4.g.f23724s;
                p246z4.g gVar3 = (p246z4.g) this.f2334s;
                AyahAudioService ayahAudioService = (AyahAudioService) this.f2335t;
                if (gVar3 instanceof p246z4.b) {
                    AyahAudioService.a(ayahAudioService, ((p246z4.b) gVar3).f24810a);
                    return;
                }
                if (gVar3 instanceof p246z4.e) {
                    boolean z10 = AyahAudioService.f13735O;
                    ayahAudioService.h();
                    return;
                }
                if (gVar3 instanceof p246z4.c) {
                    boolean z11 = AyahAudioService.f13735O;
                    ayahAudioService.k(5);
                    android.support.v4.media.session.i iVar = ayahAudioService.f13736A;
                    if (iVar == null) {
                        p251z9.j.k("serviceHandler");
                        throw null;
                    }
                    iVar.removeMessages(2);
                    p219w4.f fVar = ayahAudioService.f13738C;
                    if (fVar == null) {
                        p251z9.j.k("audioPlayer");
                        throw null;
                    }
                    int i16 = ((p246z4.c) gVar3).f24812a;
                    p219w4.g gVar4 = (p219w4.g) fVar.f23717c.getValue();
                    if (gVar4 == gVar2 || gVar4 == gVar || (mediaPlayer2 = fVar.g) == null) {
                        return;
                    }
                    mediaPlayer2.seekTo(i16);
                    return;
                }
                if (!(gVar3 instanceof p246z4.d)) {
                    if (!(gVar3 instanceof p246z4.f)) {
                        throw new A6.a();
                    }
                    boolean z12 = AyahAudioService.f13735O;
                    ayahAudioService.m(2);
                    return;
                }
                boolean z13 = AyahAudioService.f13735O;
                ayahAudioService.k(10);
                android.support.v4.media.session.i iVar2 = ayahAudioService.f13736A;
                if (iVar2 == null) {
                    p251z9.j.k("serviceHandler");
                    throw null;
                }
                iVar2.removeMessages(2);
                p219w4.f fVar2 = ayahAudioService.f13738C;
                if (fVar2 == null) {
                    p251z9.j.k("audioPlayer");
                    throw null;
                }
                int i17 = ((p246z4.d) gVar3).f24814a;
                p219w4.g gVar5 = (p219w4.g) fVar2.f23717c.getValue();
                if (gVar5 == gVar2 || gVar5 == gVar || (mediaPlayer = fVar2.g) == null) {
                    return;
                }
                mediaPlayer.seekTo(i17);
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                AyahAudioService ayahAudioService2 = (AyahAudioService) this.f2334s;
                p219w4.e eVar = (p219w4.e) this.f2335t;
                boolean z14 = AyahAudioService.f13735O;
                if (eVar instanceof p219w4.a) {
                    ayahAudioService2.h();
                    return;
                }
                if (!(eVar instanceof p219w4.b)) {
                    if (eVar instanceof p219w4.c) {
                        return;
                    }
                    if (!(eVar instanceof p219w4.d)) {
                        throw new A6.a();
                    }
                    ayahAudioService2.m(2);
                    ayahAudioService2.j();
                    return;
                }
                android.support.v4.media.session.i iVar3 = ayahAudioService2.f13736A;
                if (iVar3 == null) {
                    p251z9.j.k("serviceHandler");
                    throw null;
                }
                iVar3.removeMessages(2);
                if (ayahAudioService2.f13739D) {
                    return;
                }
                C0280d0 c0280d0B = ayahAudioService2.b();
                p065g3.c cVarC = c0280d0B.c();
                p246z4.a aVar3 = (p246z4.a) ((k0) c0280d0B.g).getValue();
                p175r4.a aVar4 = (p175r4.a) ((k0) c0280d0B.f4067f).getValue();
                if (cVarC != null && aVar3 != null && aVar4 != null) {
                    c0280d0B.b(cVarC, aVar4, aVar3);
                    return;
                }
                k0 k0Var2 = (k0) c0280d0B.f4066e;
                p246z4.e eVar2 = new p246z4.e(System.currentTimeMillis());
                k0Var2.getClass();
                k0Var2.n(null, eVar2);
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                AyahAudioService ayahAudioService3 = (AyahAudioService) this.f2334s;
                p219w4.g gVar6 = (p219w4.g) this.f2335t;
                boolean z15 = AyahAudioService.f13735O;
                int iOrdinal = gVar6.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        android.support.v4.media.session.r rVar2 = ayahAudioService3.f13754y;
                        if (rVar2 == null) {
                            p251z9.j.k("mediaSession");
                            throw null;
                        }
                        ((android.support.v4.media.session.m) rVar2.f11364s).f11353a.setActive(true);
                        Iterator it = ((ArrayList) rVar2.f11366u).iterator();
                        if (it.hasNext()) {
                            throw p245z2.a.z(it);
                        }
                        jVar = new p110k9.j(1, 8);
                    } else if (iOrdinal == 2) {
                        AyahAudioService.f13735O = true;
                        jVar2 = new p110k9.j(2, 3);
                    } else {
                        if (iOrdinal != 3 && iOrdinal != 4) {
                            throw new A6.a();
                        }
                        ayahAudioService3.i();
                        jVar2 = new p110k9.j(3, 2);
                    }
                    int iIntValue = ((Number) jVar2.f19077r).intValue();
                    ayahAudioService3.k(((Number) jVar2.f19078s).intValue());
                    ayahAudioService3.m(iIntValue);
                    return;
                }
                ayahAudioService3.d();
                jVar = new p110k9.j(0, 1);
                jVar2 = jVar;
                int iIntValue2 = ((Number) jVar2.f19077r).intValue();
                ayahAudioService3.k(((Number) jVar2.f19078s).intValue());
                ayahAudioService3.m(iIntValue2);
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                w8.c cVar3 = (w8.c) this.f2334s;
                CountDownLatch countDownLatch = (CountDownLatch) this.f2335t;
                try {
                    E6.v.a().f1969d.c(((E6.j) cVar3.f23807h.f1960b).b(B6.c.f646t), 1);
                    break;
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 17:
                p239y6.a aVar5 = (p239y6.a) this.f2334s;
                MenuItem menuItem = (MenuItem) this.f2335t;
                aVar5.f24653e = true;
                View actionView = menuItem.getActionView();
                SearchView searchView = actionView instanceof SearchView ? (SearchView) actionView : null;
                if (searchView != null) {
                    searchView.setQuery((CharSequence) aVar5.f24649a.invoke(), false);
                    ((SearchView.SearchAutoComplete) searchView.findViewById(R.id.search_src_text)).selectAll();
                    return;
                }
                return;
            case 18:
                ((SearchView) this.f2334s).setQueryHint((SpannableString) this.f2335t);
                return;
            default:
                ((p244z1.a) this.f2334s).k((Typeface) this.f2335t);
                return;
        }
    }

    public /* synthetic */ x(Object obj, Runnable runnable, int i10) {
        this.f2333r = i10;
        this.f2335t = obj;
        this.f2334s = runnable;
    }

    public /* synthetic */ x(p160p8.r rVar, Exception exc) {
        this.f2333r = 12;
        Map map = Collections.EMPTY_MAP;
        this.f2334s = rVar;
        this.f2335t = exc;
    }
}
